package com.qimu.qiapicommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * API通用应用程序
 */
//@SpringBootApplication
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class QiApiCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(QiApiCommonApplication.class, args);
    }

}
