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
@TableName("tool_land_crops")
@ApiModel(value="LandCrops对象", description="")
public class LandCrops implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "土地_农作物ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long landId;

    private Long cropsId;

    @ApiModelProperty(value = "农作物使用数量")
    private Integer useAmonut;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime created;

    @ApiModelProperty(value = "创建人")
    private String creator;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime edited;

    @ApiModelProperty(value = "修改人")
    private String editor;

    @ApiModelProperty(value = "逻辑删除:0=未删除,1=已删除")
    private Boolean deleted;


}
