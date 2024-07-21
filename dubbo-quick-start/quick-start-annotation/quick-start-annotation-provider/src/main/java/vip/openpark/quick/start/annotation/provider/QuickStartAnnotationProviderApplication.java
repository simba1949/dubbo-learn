package vip.openpark.quick.start.annotation.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 3:38 PM
 */
@EnableDubbo // 启动 dubbo
@SpringBootApplication
public class QuickStartAnnotationProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(QuickStartAnnotationProviderApplication.class, args);
	}
}