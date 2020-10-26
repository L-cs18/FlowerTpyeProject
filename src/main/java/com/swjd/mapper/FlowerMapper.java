package com.swjd.mapper;

import com.swjd.bean.Flower;

import java.util.List;

public interface FlowerMapper {
    /*查询全部*/
    public abstract List<Flower> selectAll();
    /*条件查询*/
    public abstract List<Flower> selectType(String typename);
    /*新增*/
    public abstract int insertFlower(Flower flower);
}
