package pren.zhl.tool.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import pren.zhl.tool.bean.Response;
import pren.zhl.tool.dto.AccountDTO;
import pren.zhl.tool.dto.LandDTO;
import pren.zhl.tool.entity.Land;
import pren.zhl.tool.service.ILandService;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhl
 * @since 2020-10-16
 */
@Api(value="土地controller",tags={"土地操作接口"})
@RestController
@RequestMapping("/tool/land")
public class LandController {

    @Resource
    private ILandService iLandService;

    @Resource
    private Response response;


    @RequiresPermissions("/tool/land")
    @ApiOperation("土地管理主页")
    @GetMapping
    public Response index(Page<LandDTO> page){
        Page<LandDTO> landDTOList = iLandService.getLandDTOList(page);
        if (landDTOList.getRecords() != null && landDTOList.getRecords().size() > 0)
            return response.success("获取土地列表成功",landDTOList);
        return response.failure("获取土地列表失败");
    }

    @RequiresPermissions("/tool/land/add")
    @ApiOperation(value = "增加土地")
    @PostMapping("/add")
    public Response add(Land land){
        if (iLandService.save(land))
            return response.success("新增土地成功");
        return response.failure("新增土地失败");
    }

    @RequiresPermissions("/tool/land/update")
    @ApiOperation(value = "修改土地")
    @PutMapping("/update")
    public Response update(Land land){
        if (iLandService.updateById(land))
            return response.success("修改土地成功");
        return response.failure("修改土地失败");
    }

    @RequiresPermissions("/tool/land/delete")
    @ApiOperation(value = "删除土地")
    @DeleteMapping("/{id}")
    public Response delete(@ApiParam(name = "id", value = "土地id", required = true) @PathVariable Long id){
        if (iLandService.delete(id))
            return response.success("删除土地成功");
        return response.failure("删除土地失败，土地上存在植株,请先删除所有植株");
    }

    @RequiresPermissions("/tool/land/delete")
    @ApiOperation(value = "批量删除土地")
    @DeleteMapping("/batchDelete")
    public Response batcDelete(@ApiParam(name = "ids", value = "权限ids", required = true) @RequestBody List<Long> ids){
        if (iLandService.batchDelete(ids))
            return response.success("");
        return response.failure("");
    }

}
