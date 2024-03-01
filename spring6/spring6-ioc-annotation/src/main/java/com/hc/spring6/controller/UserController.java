package com.hc.spring6.controller;

import com.hc.spring6.entity.User;
import com.hc.spring6.service.UserService;
import org.springframework.stereotype.Controller;

/**
 * @author HuangChi
 * @since 2024/2/21
 */

@Controller
// @Controller通常作用在控制层（controller层），用于将控制层的类标识为Spring中的Bean，其功能与@Component相同。
public class UserController {

    /* 1、字段注入
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;*/

    // ******************************************************

    /* 2、set注入
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    // ******************************************************

    /* 3、形参注入
    private final UserService userService;

    public UserController(@Autowired  UserService userService) {
        this.userService = userService;
    }*/

    // ******************************************************

    // 4、构造器注入
    private final UserService userService;

    // 注：当有参构造只有一个时，@Autowired注解可以省略。
    // @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String addUser(User user) {
        return userService.addUser(user);
    }

}
