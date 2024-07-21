package vip.openpark.quick.start.api.provider.service;

import vip.openpark.base.IHelloService;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 2:51 PM
 */
public class HelloServiceImpl implements IHelloService {
	@Override
	public String hello(String name) {
		return "[quick-start-api-provider] Hello, " + name;
	}
}