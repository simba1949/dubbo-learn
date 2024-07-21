package vip.openpark.quick.start.api.provider;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import vip.openpark.base.IHelloService;
import vip.openpark.quick.start.api.provider.service.HelloServiceImpl;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 2:54 PM
 */
public class QuickStartApiProviderApplication {
	public static void main(String[] args) {
		// 基于 ServiceConfig 定义了发布的服务信息，包括接口的信息以及对应的实现类对象;
		ServiceConfig<IHelloService> serviceConfig = new ServiceConfig<>();
		serviceConfig.setInterface(IHelloService.class); // 设置接口
		serviceConfig.setRef(new HelloServiceImpl()); // 配置实现

		// 配置 Dubbo 启动器，传入了应用名，注册中心地址，协议的信息以及服务的信息等。
		DubboBootstrap.getInstance()
				.application("quick-start-api-provider") // 设置应用名称
				.registry(new RegistryConfig("zookeeper://192.168.0.111:2181")) // 设置配置配置中心
				.protocol(new ProtocolConfig("dubbo", -1)) // 设置协议和端口
				.service(serviceConfig)
				.start()
				.await();
	}
}