package vip.openpark.zookeeper.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import vip.openpark.base.IHelloFacade;

/**
 * @author anthony
 * @version 7/21/2024
 * @since 7/21/2024 8:53 PM
 */
@DubboService(group = "zookeeper", version = "1.0.0")
public class HelloFacadeImpl implements IHelloFacade {
	@Override
	public String hello(String name) {
		return "[zookeeper-provider] Hello " + name;
	}
}