package vip.openpark.practice.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 10:09
 */
@EnableDubbo
@SpringBootApplication
public class PracticeProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(PracticeProviderApplication.class, args);
    }
}