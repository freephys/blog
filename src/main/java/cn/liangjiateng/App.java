package cn.liangjiateng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


/**
 * Created by Jiateng on 5/28/18.
 */
@SpringBootApplication
@EnableCaching
@MapperScan("cn.liangjiateng.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
