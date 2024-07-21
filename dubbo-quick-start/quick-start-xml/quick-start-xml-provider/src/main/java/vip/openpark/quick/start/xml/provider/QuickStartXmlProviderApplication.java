package vip.openpark.quick.start.xml.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 3:11 PM
 */
public class QuickStartXmlProviderApplication {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
		// 启动 spring 容器
		context.start();

		System.out.println("[基于 spring-context XML] 服务端启动完成");

		// to hang up main thread
		new CountDownLatch(1).await();
	}
}