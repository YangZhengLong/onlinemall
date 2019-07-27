package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.vo.OrderVo;

public interface IOrderService {
    ServerResponse<OrderVo> createOrder(Integer userId, Integer shippingId);

    ServerResponse<String> cancel(Integer userId,Long orderNo);

    ServerResponse getOrderCartProduct(Integer userId);

    ServerResponse<OrderVo> detail(Integer userId,long orderNo);

    ServerResponse<PageInfo> getOrderList(Integer userId, Integer pageNum, Integer pageSize);

    //backend

    ServerResponse<PageInfo> manageList(Integer pageNum,Integer pageSize);

    ServerResponse<OrderVo> manageDetail(long orderNo);

    ServerResponse<PageInfo> manageSearch(long orderNo,Integer pageNum,Integer pageSize);

    ServerResponse manageSendGoods(long orderNo);
}
