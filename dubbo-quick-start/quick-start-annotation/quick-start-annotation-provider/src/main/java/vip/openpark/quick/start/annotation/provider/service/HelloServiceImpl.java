package vip.openpark.quick.start.annotation.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import vip.openpark.base.IHelloService;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 3:40 PM
 */
@DubboService
public class HelloServiceImpl implements IHelloService {
	@Override
	public String hello(String name) {
		return "[quick-start-annotation-provider] Hello, " + name;
	}
}