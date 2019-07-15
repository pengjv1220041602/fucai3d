package com.sp.dao;

import com.sp.pojo.Bplan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author ZhPJ
 * @Date 2019/7/15 001510:09
 * @Version 1.0
 * @Description:
 */
@Mapper
public interface SpDao {

    String SELECT_BEAN = "SELECT id AS id, g_id AS gId, g_date AS gDate, opening_quotation AS openingQuotation, "
            + "close_quotation AS closeQuotation, max_price AS maxPrice, min_price AS minPrice,"
            + "volume AS volume, turnover AS turnover, amplitude AS amplitude ";

    String FROM_TABLE = "FROM t_zte_detail zte ";

    @Select(SELECT_BEAN + FROM_TABLE)
    List<Bplan> selectBplans();

}
