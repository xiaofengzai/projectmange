package com.xhxk.projectmange.controller;

import com.xhxk.projectmange.common.InvokeResult;
import com.xhxk.projectmange.model.SysUser;
import com.xhxk.projectmange.service.UserService;
import com.xhxk.projectmange.view.CreateUserViewModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "/api/user")
public class UserController extends BaseController{
    @Autowired
    private UserService userService;
    @ApiOperation(value = "添加用户")
    @PostMapping(value = "add")
    public InvokeResult addUser(@RequestBody @Validated CreateUserViewModel request, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            handleBindingResult(bindingResult);
        SysUser sysUser=new SysUser();
        BeanUtils.copyProperties(request,sysUser);
        userService.save(sysUser);
        return InvokeResult.succeeded();
    }

}
