package vip.openpark.practice.provider.service.group;

import org.apache.dubbo.config.annotation.DubboService;
import vip.openpark.base.IHelloFacade;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 10:14
 */
@DubboService(group = "group-b")
public class HelloBFacadeImpl implements IHelloFacade {
    @Override
    public String hello(String name) {
        return "[group-b] hello " + name;
    }
}