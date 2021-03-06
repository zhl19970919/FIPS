package pren.zhl.tool.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("tool_plant")
@ApiModel(value="Plant对象", description="")
public class Plant implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "植株ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "组ID")
    private Long landCropsId;

    @ApiModelProperty(value = "X坐标")
    private Integer xAxis;

    @ApiModelProperty(value = "Y坐标")
    private Integer yAxis;

    @ApiModelProperty(value = "施肥次数")
    private Integer fertilizationTimes;

    @ApiModelProperty(value = "浇水次数")
    private Integer wateringTimes;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime created;

    @ApiModelProperty(value = "创建人")
    private String creator;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime edited;

    @ApiModelProperty(value = "修改人")
    private String editor;

    @ApiModelProperty(value = "逻辑删除:0=未删除,1=已删除  -1=已枯萎  2=已成熟")
    private Boolean deleted;


}
