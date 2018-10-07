package com.springboot.demo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 请求类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Request implements Serializable {
    private static final long serialVersionUID = -402842539230375919L;

    /**
     * 交易码
     */
    private String tranCode;

}
