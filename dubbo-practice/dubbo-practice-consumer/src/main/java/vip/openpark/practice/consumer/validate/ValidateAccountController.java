package vip.openpark.practice.consumer.validate;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import vip.openpark.base.IAccountFacade;
import vip.openpark.base.request.AccountAddDTO;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 11:09
 */
@Slf4j
@RestController
@RequestMapping("validate")
public class ValidateAccountController {
    /**
     * 客户端校验
     * hibernate-validator 版本 <=6.x，请将 validation 参数声明为 true；
     * 若使用 hibernate-validator >=7.x 版本，请将 validation 参数声明为 jvalidationNew；
     */
    @DubboReference(validation = "jvalidationNew")
    private IAccountFacade accountFacade;

    @GetMapping("add")
    public Boolean add() {
        AccountAddDTO normalAccount =
            AccountAddDTO.builder()
                .username("李白")
                .password("LiBai")
                .age(18)
                .mobile("1312345678").build();
        boolean result4Normal = accountFacade.add(normalAccount);
        log.info("result4Normal: {}", result4Normal);

        AccountAddDTO abnormalAccount = AccountAddDTO.builder().build();
        boolean result4Abnormal = accountFacade.add(abnormalAccount);
        log.info("result4Abnormal: {}", result4Abnormal);

        boolean result4Null = accountFacade.add(null);
        log.info("result4Null: {}", result4Null);
        return true;
    }
}