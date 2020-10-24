package pren.zhl.tool.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import pren.zhl.tool.dto.LandDTO;
import pren.zhl.tool.entity.Land;
import pren.zhl.tool.mapper.LandMapper;
import pren.zhl.tool.service.ILandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhl
 * @since 2020-10-16
 */
@Service
public class LandServiceImpl extends ServiceImpl<LandMapper, Land> implements ILandService {

    @Override
    public  Page<LandDTO> getLandDTOList (Page<LandDTO> page){
        return baseMapper.getLandDTOList(page);
    }

    @Override
    public Boolean delete(Long id) {
        Land land = baseMapper.selectById(id);
        if (land != null) {
            if (land.getTotal() != land.getSurplus()) {
                return false;
            }else {
                land.setDeleted(true);
                baseMapper.updateById(land);
                return true;
            }
        } else
            return false;
    }

    @Override
    public Boolean batchDelete(List<Long> ids){
        for (int i = 0; i < ids.size(); i++) {
            Land land = new Land();
            land.setDeleted(true);
            land.setId(ids.get(i));
            try{
                baseMapper.updateById(land);
            }catch (Exception e){
                log.error("更新失败",e);
                return false;
            }
        }
        return true;
    }
}
