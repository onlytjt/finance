/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 十神
 * @version $Id: HelloController.java, v 0.1 2018年02月09日 下午9:41 tianjiatian Exp $
 */

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "index.html";
    }

}