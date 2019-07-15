package com.sp.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author ZhPJ
 * @Date 2019/7/15 001517:28
 * @Version 1.0
 * @Description:
 */
@Data
public class Bplan {

    private String id;
    // 股票id
    private String gId;
    // 成交量
    private String volume;
    // 成交额
    private String turnover;
    // 振幅
    private String amplitude;
    // 最小价格
    private BigDecimal minPrice ;
    // 最大价格
    private BigDecimal maxPrice ;
    // 收盘
    private BigDecimal closeQuotation;
    // 开盘
    private BigDecimal openingQuotation;
    // 时间
    private Date gDate;

}
