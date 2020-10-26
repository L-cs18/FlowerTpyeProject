package com.swjd.service;

import com.swjd.bean.Flower;

import java.util.List;

public interface FlowerService {
    /*查询全部*/
    public abstract List<Flower> getAll();
    /*条件查询*/
    public abstract List<Flower> getType(String typename);
    /*新增*/
    public abstract int addFlower(Flower flower);
}
