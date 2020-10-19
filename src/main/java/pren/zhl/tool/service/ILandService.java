package pren.zhl.tool.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import pren.zhl.tool.dto.AccountDTO;
import pren.zhl.tool.dto.LandDTO;
import pren.zhl.tool.entity.Land;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhl
 * @since 2020-10-16
 */
public interface ILandService extends IService<Land> {

    /**
     * 土地主页（分页）
     * @param page
     * @return
     */
    Page<LandDTO> getLandDTOList (Page<LandDTO> page);

    Boolean delete(Long id);

    Boolean batchDelete(List<Long> ids);

}
