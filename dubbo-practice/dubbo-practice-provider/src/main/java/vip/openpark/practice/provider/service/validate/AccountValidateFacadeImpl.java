package vip.openpark.practice.provider.service.validate;

import org.apache.dubbo.config.annotation.DubboService;
import vip.openpark.base.IAccountFacade;
import vip.openpark.base.request.AccountAddDTO;

/**
 * 服务端校验
 * hibernate-validator 版本 <=6.x，请将 validation 参数声明为 true；
 * 若使用 hibernate-validator >=7.x 版本，请将 validation 参数声明为 jvalidationNew；
 *
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 11:07
 */
@DubboService(validation = "jvalidationNew")
public class AccountValidateFacadeImpl implements IAccountFacade {
    @Override
    public boolean add(AccountAddDTO accountAddDTO) {
        return null != accountAddDTO;
    }
}