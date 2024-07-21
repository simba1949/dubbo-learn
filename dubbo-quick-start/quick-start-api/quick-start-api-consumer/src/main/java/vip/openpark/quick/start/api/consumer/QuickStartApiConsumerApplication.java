package vip.openpark.quick.start.api.consumer;

import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import vip.openpark.base.IHelloService;

import java.util.Scanner;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 2:57 PM
 */
public class QuickStartApiConsumerApplication {
	public static void main(String[] args) {
		// 基于 ReferenceConfig 定义了订阅的服务信息，包括接口的信息。
		ReferenceConfig<IHelloService> referenceConfig = new ReferenceConfig<>();
		referenceConfig.setInterface(IHelloService.class);

		// 配置 Dubbo 启动器，传入了应用名，注册中心地址，协议的信息以及服务的信息等。
		DubboBootstrap.getInstance()
				.application("quick-start-api-consumer")
				.registry(new RegistryConfig("zookeeper://192.168.0.111:2181"))
				.reference(referenceConfig);
		// 获取到动态代理的对象并进行调用。
		IHelloService helloService = referenceConfig.get();

		// 打印启动成功信息
		System.out.println("dubbo api 客户端启动成功");

		// 从控制台中读取数据
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String msg = scanner.nextLine();
			// 调用远程服务，获取结果
			String message = helloService.hello(msg);
			// 打印结果
			System.out.println("Receive result ======> " + message);
		}
	}
}