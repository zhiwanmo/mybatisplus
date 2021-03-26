package com.wanmo.mybatisplus.common;

public class Result {

    private int success;
    private String info;
    private Object data;

    public Result() {
    }

    public Result(int success, String info) {
        this.success = success;
        this.info = info;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result fail() {
        return new Result(0, "失败");
    }

    public static Result fail(Exception e) {
        Result fail = fail();
        fail.setData(e.getMessage());
        return fail;
    }

    public static Result ok() {
        return new Result(1, "成功");
    }

    public static Result ok(Object data) {
        Result ok = ok();
        ok.setData(data);
        return ok;
    }
}
