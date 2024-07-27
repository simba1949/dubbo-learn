package vip.openpark.base;

import jakarta.validation.constraints.NotNull;
import vip.openpark.base.request.AccountAddDTO;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 10:59
 */
public interface IAccountFacade {
    /**
     * 添加账户
     * 如果外层没有 @NotNull 校验，dubbo 不会校验
     *
     * @param accountAddDTO 添加账号参数
     * @return 添加结果
     */
    boolean add(@NotNull(message = "添加账号参数不能为空") AccountAddDTO accountAddDTO);
}