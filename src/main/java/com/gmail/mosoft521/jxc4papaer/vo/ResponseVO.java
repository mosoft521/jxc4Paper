package com.gmail.mosoft521.jxc4papaer.vo;

/**
 * 后台响应对象
 */
public class ResponseVO {
    private boolean success;
    private String msg;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResponseVO() {
    }

    public ResponseVO(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

}
