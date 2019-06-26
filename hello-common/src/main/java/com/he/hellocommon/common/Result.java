package com.he.hellocommon.common;


/**
 * 统一返回结果类
 */
public class Result {

    /**
     * 状态码：1成功，其他为失败
     */
    public int code;

    /**
     * 成功为success，其他为失败原因
     */
    public String message;

    /**
     * 数据结果集
     */
    public Object data;

    public Result(ResultConstant result) {
        this.code = result.getCode();
        this.message = result.getMessage();
    }
    public Result(ResultConstant result, Object data) {
        this.code = result.getCode();
        this.message = result.getMessage();
        this.data = data;
    }

    public static Result success(){
        return new Result(ResultConstant.SUCCESS);
    }

    public static Result success(Object data){
        return new Result(ResultConstant.SUCCESS,data);
    }

    public static Result fail(){
        return new Result(ResultConstant.FAIL);
    }

    public static Result fail(ResultConstant result){
        return new Result(result);
    }

    public static Result fail(ResultConstant result, Object data){
        return new Result(result,data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
