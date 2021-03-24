package com.wanmo.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.wanmo.mybatisplus.mapper")
public class MybatisplusApplication {
	public static void main(String[] args) {
		SpringApplication.run(MybatisplusApplication.class, args);
	}

}
