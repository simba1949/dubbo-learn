package vip.openpark.practice.provider.service.version;

import org.apache.dubbo.config.annotation.DubboService;
import vip.openpark.base.IHelloFacade;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 10:35
 */
@DubboService(version = "2.0.0")
public class HelloV2FacadeImpl implements IHelloFacade {
    @Override
    public String hello(String name) {
        return "[2.0.0] hello " + name;
    }
}