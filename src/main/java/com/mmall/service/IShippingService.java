package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Shipping;

import java.util.Map;

public interface IShippingService {

    ServerResponse<Map> add(Integer userId, Shipping shipping);

    ServerResponse delete(Integer userId,Integer shippingId);

    ServerResponse<Map> update(Integer userId,Shipping shipping);

    ServerResponse<Shipping> search(Integer userId,Integer shippingId);

    ServerResponse<PageInfo> list(Integer userId, Integer pageNum, Integer pageSize);
}
