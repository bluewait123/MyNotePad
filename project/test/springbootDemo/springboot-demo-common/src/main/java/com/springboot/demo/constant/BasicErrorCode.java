package com.springboot.demo.constant;

import lombok.Getter;

/**
 * 基础错误码定义
 * @author w
 */
@Getter
public enum BasicErrorCode {

    TRANSACTION_SUCCESS("0","交易成功"),
    TRANSACTION_FAIL("999999","交易失败"),

    ;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * 系统标识
     */
    private SystemFlag systemFlag;

    BasicErrorCode(String errorCode,String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.systemFlag = SystemFlag.SYSTEM_CORE;
    }
}
