package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wtime on 2017-02-21. 오후 1:28
 * org.zerock.controller / Web03
 * It's now or never!
 */

@Controller
public class UserController {

//    @RequestMapping(value = "/shop-ui-login")
//    public String login() {
//
//        return "shop-ui-login";
//    }

    @RequestMapping(value = "/shop-ui-login")
    public void login() {

    }

    @RequestMapping(value = "/login_success")
    public void login_success() {

    }

    @RequestMapping(value = "/login_duplicate")
    public void login_duplicate() {

    }

    @RequestMapping(value = "/logout")
    public void logout() {

    }

}
