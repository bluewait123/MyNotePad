package com.springboot.demo.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 系统标识定义
 * @author w
 */
@AllArgsConstructor
@Getter
public enum SystemFlag {

    SYSTEM_CORE("SYSTEM","系统内置"),
    EXPROT_DATABASE("EXPROT_DATABASE","导出数据库信息系统"),

    ;

    private String systemCode;
    private String systemName;
}
