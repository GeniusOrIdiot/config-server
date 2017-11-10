package com.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2017-present, Demart Corporation.
 * All rights reserved.
 * <p>
 * Created by MDMORY on 2017/11/10.
 * </p>
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/hello")
    public String hello() {
        return foo;
    }
}
