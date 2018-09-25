package com.test.springcloud.client.controller;


import com.github.pagehelper.Page;
import com.test.springcloud.client.entity.User;
import com.test.springcloud.client.service.UserService;
import com.test.springcloud.client.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(value = "HelloController", description = "Say Hello接口")
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;
    @Autowired
    private UserService userService;

    @ApiOperation(value="Hello", notes="用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名", required = true ,dataType = "string")
    })
    @RequestMapping(value = "/hi",method = {RequestMethod.POST,RequestMethod.GET})
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @ApiOperation(value="Hello", notes="获取用户分页列表接口")
    @RequestMapping(value = "/getUserInfo",method = {RequestMethod.POST,RequestMethod.GET})
    public List<User> getUserInfo() {
        List<User> user = userService.getUserInfo();
        System.out.println(user.toString());
        return user;
    }

    @ApiOperation(value="Hello", notes="添加用户接口")
    @ResponseBody
    @RequestMapping(value = "/addUserInfo",method = {RequestMethod.POST,RequestMethod.GET})
    public String addUserInfo(@RequestBody UserVO userVO) {
        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        userService.insert(user);
        return "success:"+user.toString();
    }
}
