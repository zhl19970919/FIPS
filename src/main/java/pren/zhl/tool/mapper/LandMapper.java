package pren.zhl.tool.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import pren.zhl.tool.dto.LandDTO;
import pren.zhl.tool.entity.Land;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhl
 * @since 2020-10-16
 */
public interface LandMapper extends BaseMapper<Land> {
    Page<LandDTO> getLandDTOList (Page<LandDTO> page);

}
