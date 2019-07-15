package com.sp;

import com.sp.dao.SpDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ZhPJ
 * @Date 2019/7/15 001510:23
 * @Version 1.0
 * @Description:
 */
@SpringBootApplication
@MapperScan(basePackageClasses = {SpDao.class})
public class SpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpApplication.class, args);
    }

}
