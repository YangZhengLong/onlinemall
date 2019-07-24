package com.mmall.common;

/**
 * @ClassName ResponseCode
 * @Description ResponseCode
 * @Author Yang Zhenglong
 * @Date 2019/7/22 15:00
 * @Vesion 1.0
 */
public enum ResponseCode {

    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_LOGIN");

    private final int code;
    private final String desc;

    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }

    public String getDesc(){
        return desc;
    }
}
