package vip.openpark.base.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author anthony
 * @version 2024/7/27
 * @since 2024/7/27 11:00
 */
@Getter
@Setter
@Builder
public class AccountAddDTO implements Serializable {
    private static final long serialVersionUID = 8237635042039472647L;

    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;

    @NotNull(message = "年龄不能为空")
    private Integer age;
    private String mobile;
}