package com.rong.blog.web;

import com.alibaba.fastjson.JSONObject;
import com.rong.blog.mapper.UserMapper;
import com.rong.blog.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user", method=  RequestMethod.POST)
public class UserController {
    @Autowired
    private UserMapper userMapper;
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(value = "/login")
    public JSONObject login(@RequestParam(required = true, name="account") String account, @RequestParam(required = true, name="pwd") String pwd) throws Exception {
        JSONObject jo = new JSONObject();
        User user = userMapper.login(account);
        if (user != null) {
            if ( pwd.equals(user.getPwd())) {
                jo.put("status", "success");
                log.info("账号：" + account + "，登录成功");
            } else {
                jo.put("status", "密码错误,请重新输入！");
                log.info("账号：" + account + "，密码错误");
            }
        } else {
            jo.put("status", "账号不存在");
            log.info("账号：" + account + "，账号不存在");
        }
        return jo;
    }
}
