package com.swjd.service;

import com.swjd.bean.Flower;
import com.swjd.mapper.FlowerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlowerServiceImlp implements FlowerService{
    @Autowired
    FlowerMapper flowerMapper;

    @Override
    public List<Flower> getAll() {
        return flowerMapper.selectAll();
    }

    @Override
    public List<Flower> getType(String typename) {
        return flowerMapper.selectType(typename);
    }

    @Override
    public int addFlower(Flower flower) {
        return flowerMapper.insertFlower(flower);
    }
}
