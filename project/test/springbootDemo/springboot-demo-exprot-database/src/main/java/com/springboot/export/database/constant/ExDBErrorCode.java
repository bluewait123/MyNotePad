package com.springboot.export.database.constant;

import com.springboot.demo.constant.SystemFlag;
import lombok.Getter;

/**
 * 错误码定义
 * @author w
 */
@Getter
public enum ExDBErrorCode {

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

    ExDBErrorCode(String errorCode,String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.systemFlag = SystemFlag.EXPROT_DATABASE;
    }
}
