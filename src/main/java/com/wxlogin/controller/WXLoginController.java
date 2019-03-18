package com.wxlogin.controller;

import com.wxlogin.common.HttpCilentUtil;
import com.wxlogin.common.MessageUtil;
import org.apache.http.client.utils.HttpClientUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @program:
 * @description:
 * @author: SY_zheng
 * @create: 2019-03-17
 */
@RestController
public class WXLoginController {

    @PostMapping("/wxlogin")
    public MessageUtil wxLogin(String code) {
//https://api.weixin.qq.com/sns/jscode2session?
// appid=APPID&
// secret=SECRET&
// js_code=JSCODE&
// grant_type=authorization_code
        String url = "https://api.weixin.qq.com/sns/jscode2session";

        Map<String, String> param = new HashMap<>();
        param.put("appid", "小程序appid");
        param.put("secret", "小程序密钥");
        param.put("js_code", code);
        param.put("grant_type", "authorization_code");

        String wxResult = HttpCilentUtil.doGet(url, param);
        return MessageUtil.ok();
    }
}
