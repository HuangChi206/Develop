package com.hc.spring6.auto.controller;

import com.hc.spring6.auto.service.UserService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author HuangChi
 * @since 2024/2/20
 */

@Slf4j
@Setter
public class UserController {

    private UserService userService;

    public void add() {
        log.info("UserController.add() execute...");
        userService.add();
    }
}
