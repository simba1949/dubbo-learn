package vip.openpark.nacos.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import vip.openpark.base.IHelloService;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 9:03 PM
 */
@DubboService(group = "nacos", version = "1.0.0")
public class HelloServiceImpl implements IHelloService {
	@Override
	public String hello(String name) {
		return "[nacos-provider] hello " + name;
	}
}