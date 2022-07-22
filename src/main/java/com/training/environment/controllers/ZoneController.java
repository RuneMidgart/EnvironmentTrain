package com.training.environment.controllers;

import com.training.environment.dto.ZoneDto;
import com.training.environment.services.impls.ZoneServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.Future;

@Api(tags = "空间区域接口")
@RestController
@RequestMapping("zone")
public class ZoneController {
    final ZoneServiceImpl service;

    public ZoneController(ZoneServiceImpl service){
        this.service = service;
    }

    /**
     * 批量查询
     * @param pageNum 分页页数
     * @param pageSize 分页每页记录数
     * @param keyword 关键词(用于Name字段过滤)
     * @return 符合分页过滤条件的空间区域
     */
    @ApiOperation("批量查询")
    @GetMapping("")
    public Future<List<ZoneDto>> Get(Integer pageNum, Integer pageSize, String keyword){
        return service.get(pageNum, pageSize, keyword);
    }

    /**
     * 按照Id查询
     * @param id 空间区域Id
     * @return 空间区域展示模型
     */
    @ApiOperation("按照Id查询")
    @GetMapping("/{id}")
    public Future<ZoneDto> GetById(@PathVariable Integer id){
        return service.getById(id);
    }

    /**
     * 技术查询
     * @param keyword 关键词(用于Name字段过滤)
     * @return 符合过滤条件的空间区域计数
     */
    @ApiOperation("计数查询")
    @GetMapping("/count")
    public Future<Long> Count(String keyword){
        return service.count(keyword);
    }

    /**
     * 新增一个空间区域
     * @param input 空间区域输入模型
     * @return 空间区域展示模型
     */
    @ApiOperation("新增一个空间区域")
    @PostMapping("")
    public Future<Integer> Post(@RequestBody ZoneDto input){
        return service.add(input);
    }

    /**
     * 批量新增空间区域
     * @param inputs 批量的空间区域输入模型
     */
    @ApiOperation("批量新增空间区域")
    @PostMapping("/many")
    public void PostMany(@RequestBody List<ZoneDto> inputs){
        service.addMany(inputs);
    }

    /**
     * 按照Id更新一个空间区域
     * @param id 空间区域Id
     * @param input 空间区域的输入模型
     */
    @ApiOperation("按照Id更新一个空间区域")
    @PutMapping("")
    public void Update(Integer id, @RequestBody ZoneDto input){
        service.update(id, input);
    }

    /**
     * 按照Id删除一个空间区域
     * @param id 空间区域Id
     */
    @ApiOperation("按照Id删除一个空间区域")
    @DeleteMapping("")
    public void Delete(Integer id){
        service.delete(id);
    }
}
