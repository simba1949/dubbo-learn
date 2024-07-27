package vip.openpark.practice.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 10:07
 */
@EnableDubbo
@SpringBootApplication
public class PracticeConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PracticeConsumerApplication.class, args);
    }
}