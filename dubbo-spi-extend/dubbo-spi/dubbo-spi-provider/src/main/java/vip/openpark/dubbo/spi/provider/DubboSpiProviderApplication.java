package vip.openpark.dubbo.spi.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * dubbo spi 核心类：{@link org.apache.dubbo.common.extension.ExtensionLoader}
 * 入口
 * 1. {@link org.apache.dubbo.common.extension.ExtensionLoader#getExtension(String, boolean)}
 * 2. {@link org.apache.dubbo.common.extension.ExtensionLoader#getAdaptiveExtension()}
 * 3. {@link org.apache.dubbo.common.extension.ExtensionLoader#getActivateExtension(org.apache.dubbo.common.URL, String[], String)}
 *
 * @author anthony
 * @version 7/22/2024
 * @since 7/22/2024 11:31 PM
 */
@EnableDubbo
@SpringBootApplication
public class DubboSpiProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboSpiProviderApplication.class, args);
	}
}