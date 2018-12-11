package com.xhxk.projectmange.view;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel
public class CreateUserViewModel {
    @ApiModelProperty(value = "用户名称")
    @NotBlank(message = "用户名不允许为空")
    private String username;
    @NotBlank(message = "用户昵称不允许为空")
    @ApiModelProperty(value = "昵称")
    private String nickname;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @NotBlank(message = "联系方式不允许为空")
    @ApiModelProperty(value = "联系方式")
    private String phone;
}
