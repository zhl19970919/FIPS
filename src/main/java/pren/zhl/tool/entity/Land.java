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
@TableName("tool_land")
@ApiModel(value="Land对象", description="")
public class Land implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "土地ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "土地名称")
    private String landName;

    @ApiModelProperty(value = "总量")
    private Integer total;

    @ApiModelProperty(value = "剩余容量")
    private Integer surplus;

    @ApiModelProperty(value = "负责人")
    private String charge;

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
