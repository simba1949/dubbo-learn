package vip.openpark.nacos.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 9:00 PM
 */
@EnableDubbo
@SpringBootApplication
public class NacosConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(NacosConsumerApplication.class, args);
	}
}