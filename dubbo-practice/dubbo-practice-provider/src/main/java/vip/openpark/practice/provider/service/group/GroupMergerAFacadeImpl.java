package vip.openpark.practice.provider.service.group;

import org.apache.dubbo.config.annotation.DubboService;
import vip.openpark.base.IGroupMergerFacade;

import java.util.List;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 10:25
 */
@DubboService(group = "group-a")
public class GroupMergerAFacadeImpl implements IGroupMergerFacade {
    @Override
    public List<String> fetchMenu(Long accountId) {
        return List.of("菜单A");
    }
}