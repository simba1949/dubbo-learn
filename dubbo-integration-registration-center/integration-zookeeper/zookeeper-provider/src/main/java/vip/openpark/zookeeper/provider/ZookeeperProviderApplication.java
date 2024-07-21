package vip.openpark.zookeeper.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 8:52 PM
 */
@EnableDubbo
@SpringBootApplication
public class ZookeeperProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZookeeperProviderApplication.class, args);
	}
}