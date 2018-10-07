package com.springboot.demo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 响应类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Response implements Serializable {
    private static final long serialVersionUID = 3233495112454356671L;

    /**
     * 响应码
     */
    private String respCode;

    /**
     * 响应信息
     */
    private String respMsg;
}
