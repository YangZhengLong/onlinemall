package com.mmall.vo;

import org.omg.PortableInterceptor.INACTIVE;

import java.math.BigDecimal;

/**
 * @ClassName CartProductVo
 * @Description 结合了产品和购物车的一个抽象对象
 * @Author Yang Zhenglong
 * @Date 2019/7/25 12:25
 * @Vesion 1.0
 */
public class CartProductVo {

    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer quantity;
    private String productName;
    private String sunbTitle;
    private String productMainImage;
    private BigDecimal productPrice;
    private Integer productStatus;
    private BigDecimal productTotalPrice;
    private Integer productStock;
    private Integer productChedked; //此商品是否勾选

    private String limitQUantity;  //限制数量的返回结果

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSunbTitle() {
        return sunbTitle;
    }

    public void setSunbTitle(String sunbTitle) {
        this.sunbTitle = sunbTitle;
    }

    public String getProductMainImage() {
        return productMainImage;
    }

    public void setProductMainImage(String productMainImage) {
        this.productMainImage = productMainImage;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public BigDecimal getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(BigDecimal productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Integer getProductChedked() {
        return productChedked;
    }

    public void setProductChedked(Integer productChedked) {
        this.productChedked = productChedked;
    }

    public String getLimitQUantity() {
        return limitQUantity;
    }

    public void setLimitQUantity(String limitQUantity) {
        this.limitQUantity = limitQUantity;
    }
}
