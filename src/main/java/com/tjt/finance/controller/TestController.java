/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.tjt.finance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 十神
 * @version $Id: TestController.java, v 0.1 2018年02月09日 下午9:44 tianjiatian Exp $
 */

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}