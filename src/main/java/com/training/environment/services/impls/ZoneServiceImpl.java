package com.training.environment.services.impls;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.training.environment.dao.ZoneMapper;
import com.training.environment.dto.ZoneDto;
import com.training.environment.po.Zone;
import com.training.environment.po.ZoneExample;
import com.training.environment.services.ZoneService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

@Service
@Async
public class ZoneServiceImpl implements ZoneService {
    final ZoneMapper zone;

    public ZoneServiceImpl(ZoneMapper zone) {
        this.zone = zone;
    }

    @Override
    public Future<Integer> add(ZoneDto input) {
        return AsyncResult.forValue(zone.insertSelective(input.generatePo()));
    }

    @Override
    public void addMany(List<ZoneDto> inputs) {
        zone.insertMany(inputs.stream().map(ZoneDto::generatePo).collect(Collectors.toList()));
    }

    @Override
    public void update(Integer id, ZoneDto input) {
        Zone po = input.generatePo();
        po.setId(id);
        zone.updateByPrimaryKey(po);
    }

    @Override
    public void delete(Integer id) {
        zone.deleteByPrimaryKey(id);
    }

    @Override
    public Future<ZoneDto> getById(Integer id) {
        ZoneDto dto = new ZoneDto();
        dto.importPo(zone.selectByPrimaryKey(id));
        return AsyncResult.forValue(dto);
    }

    @Override
    public Future<List<ZoneDto>> get(Integer pageNum, Integer pageSize, String keyword) {
        if (pageSize != null && pageNum != null)
            PageHelper.startPage(pageNum, pageSize);
        ZoneExample example = new ZoneExample();
        if (StringUtil.isNotEmpty(keyword))
            example.createCriteria().andNameLike("%" + keyword + "%");
        List<Zone> zones = zone.selectByExample(example);
        return AsyncResult.forValue(zones.stream().map(x -> {
            ZoneDto dto = new ZoneDto();
            dto.importPo(x);
            return dto;
        }).collect(Collectors.toList()));
    }

    @Override
    public Future<Long> count(String keyword) {
        ZoneExample example = new ZoneExample();
        if (StringUtil.isNotEmpty(keyword))
            example.createCriteria().andNameLike("%" + keyword + "%");
        return AsyncResult.forValue(zone.countByExample(example));
    }
}
