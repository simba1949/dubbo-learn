package vip.openpark.quick.start.xml.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import vip.openpark.base.IHelloService;

import java.util.Scanner;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 3:22 PM
 */
public class QuickStartXmlConsumerApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
		context.start();

		System.out.println("[基于 spring-context XML] 客户端启动完成");

		IHelloService helloService = (IHelloService) context.getBean("helloService");

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			// 读取控制台一行数据
			String msg = scanner.nextLine();
			String result = helloService.hello(msg);
			System.out.println(result);
		}
	}
}