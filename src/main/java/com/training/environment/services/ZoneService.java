package com.training.environment.services;

import com.training.environment.dto.ZoneDto;

import java.util.List;
import java.util.concurrent.Future;

public interface ZoneService {
    Future<Integer> add(ZoneDto input);
    void addMany(List<ZoneDto> inputs);
    void update(Integer id, ZoneDto input);
    void delete(Integer id);
    Future<ZoneDto> getById(Integer id);
    Future<List<ZoneDto>> get(Integer pageNum, Integer pageSize, String keyword);
    Future<Long> count(String keyword);
}
