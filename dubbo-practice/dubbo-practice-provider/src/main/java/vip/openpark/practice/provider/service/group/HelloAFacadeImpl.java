package vip.openpark.practice.provider.service.group;

import org.apache.dubbo.config.annotation.DubboService;
import vip.openpark.base.IHelloFacade;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 10:11
 */
@DubboService(group = "group-a")
public class HelloAFacadeImpl implements IHelloFacade {
    @Override
    public String hello(String name) {
        return "[group-a] hello " + name;
    }
}