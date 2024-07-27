package vip.openpark.base;

import java.util.List;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 10:22
 */
public interface IGroupMergerFacade {
    /**
     * 获取菜单
     *
     * @param accountId 账号id
     * @return 菜单
     */
    List<String> fetchMenu(Long accountId);
}