package com.wxlogin.common;

import sun.plugin2.message.Message;

/**
 * @program:
 * @description:
 * @author: SY_zheng
 * @create: 2019-03-18
 */
public class MessageUtil {

    private Integer status;

    private String msg;

    private Object data;

    // 不使用
    private String ok;

    public static MessageUtil build(Integer status, String msg, Object data) {
        return new MessageUtil(status, msg, data);
    }

    public static MessageUtil ok(Object data) {
        return new MessageUtil(data);
    }

    public static MessageUtil ok() {
        return new MessageUtil(null);
    }

    public static MessageUtil errorMsg(String msg) {
        return new MessageUtil(500, msg, null);
    }

    public static MessageUtil errorMap(Object data) {
        return new MessageUtil(501, "error", data);
    }

    public static MessageUtil errorTokenMsg(String msg) {
        return new MessageUtil(502, msg, null);
    }

    public static MessageUtil errorException(String msg) {
        return new MessageUtil(555, msg, null);
    }

    public MessageUtil() {}

    public MessageUtil(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public MessageUtil(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }



    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }
}
