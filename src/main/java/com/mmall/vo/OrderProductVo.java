package com.mmall.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName OrderProductVo
 * @Description OrderProductVo
 * @Author Yang Zhenglong
 * @Date 2019/7/27 12:14
 * @Vesion 1.0
 */
public class OrderProductVo {
    private List<OrderItemVo> orderItemVoList;
    private BigDecimal totalPrice;
    private String imageHost;

    public List<OrderItemVo> getOrderItemVoList() {
        return orderItemVoList;
    }

    public void setOrderItemVoList(List<OrderItemVo> orderItemVoList) {
        this.orderItemVoList = orderItemVoList;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
