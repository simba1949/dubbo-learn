package top.simba1949;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import top.simba1949.facade.IDubboService;
import top.simba1949.service.impl.DubboServiceImpl;

import java.io.IOException;

/**
 * @author Anthony
 * @date 2020/7/31 18:58
 */
public class Application {
    public static void main(String[] args) throws IOException {
        // 服务实现
        IDubboService dubboService = new DubboServiceImpl();

        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("dubbo-demo-api-provider");

        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setProtocol("zookeeper");
        registry.setAddress("127.0.0.1");
        registry.setPort(2181);

        // 服务提供者协议配置
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
        protocol.setPort(20880);
        protocol.setThreads(200);

        // 注意：ServiceConfig为重对象，内部封装了与注册中心的连接，以及开启服务端口

        // 服务提供者暴露服务配置
        // 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
        ServiceConfig<IDubboService> service = new ServiceConfig<IDubboService>();
        service.setApplication(application);
        // 多个注册中心可以用setRegistries()
        service.setRegistry(registry);
        // 多个协议可以用setProtocols()
        service.setProtocol(protocol);
        service.setInterface(IDubboService.class);
        service.setRef(dubboService);
        service.setVersion("1.0.0");

        // 暴露及注册服务
        service.export();
        System.in.read();
    }
}
