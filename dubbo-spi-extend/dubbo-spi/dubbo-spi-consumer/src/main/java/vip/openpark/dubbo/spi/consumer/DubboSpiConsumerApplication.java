package vip.openpark.dubbo.spi.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author anthony
 * @version 2024/7/25
 * @since 2024/7/25 10:39
 */
@EnableDubbo
@SpringBootApplication
public class DubboSpiConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboSpiConsumerApplication.class, args);
    }
}