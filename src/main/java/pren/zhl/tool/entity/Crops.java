package pren.zhl.tool.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhl
 * @since 2020-10-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tool_crops")
@ApiModel(value="Crops对象", description="")
public class Crops implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "农作物ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "农作物名称")
    private String cropsName;

    @ApiModelProperty(value = "施肥间隔")
    private Integer fertilizationInterval;

    @ApiModelProperty(value = "施肥量/次")
    private Integer fertilizerAmount;

    @ApiModelProperty(value = "浇水间隔")
    private Integer wateringInterval;

    @ApiModelProperty(value = "成熟期")
    private LocalDate maturity;

    @ApiModelProperty(value = "枯萎期")
    private LocalDate withering;

    @ApiModelProperty(value = "适宜种植开始日期")
    private LocalDate suitableSdate;

    @ApiModelProperty(value = "适宜种植结束日期")
    private LocalDate suitableEdate;

    @ApiModelProperty(value = "仓储总量")
    private Integer totalAmount;

    @ApiModelProperty(value = "备注")
    private String remarks;


}
