package vip.openpark.dubbo.spi.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import vip.openpark.base.IHelloService;

/**
 * 使用 {@link @DubboService(filter = "logFilter")} 指定使用的 filter
 *
 * @author anthony
 * @version 2024/7/25
 * @since 2024/7/25 10:23
 */
@DubboService(group = "dubbo-spi-provider", version = "1.0.0", filter = "logFilter")
public class HelloServiceImpl implements IHelloService {
    @Override
    public String hello(String name) {
        return "[dubbo-spi-provider] hello " + name;
    }
}