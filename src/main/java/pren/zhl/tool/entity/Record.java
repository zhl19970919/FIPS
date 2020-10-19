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
@TableName("tool_record")
@ApiModel(value="Record对象", description="")
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "日志ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "操作标志 0种植 1浇水 2施肥 3采摘 4枯萎")
    private Integer operateFlag;

    @ApiModelProperty(value = "日志内容")
    private String text;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime created;

    @ApiModelProperty(value = "创建人")
    private String creator;


}
