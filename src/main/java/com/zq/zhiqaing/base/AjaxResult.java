package com.zq.zhiqaing.base;


import lombok.Data;

import java.io.Serializable;

import static javax.security.auth.callback.ConfirmationCallback.OK;

/**
 * 操作消息提醒
 *
 * @author ruoyi
 */
@Data
public class AjaxResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code;


    private String msg;

    private T data;

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public AjaxResult() {
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     */
    public AjaxResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     * @param data 数据对象
     */
    public AjaxResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static <T> AjaxResult<T> ok() {
        return new AjaxResult<>(200, "操作成功");
    }
    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static <T> AjaxResult<T> ok(String msg) {
        return ok(msg, null);
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static <T> AjaxResult<T> ok(T data) {
        return AjaxResult.ok("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static <T> AjaxResult<T> ok(String msg, T data) {
        return new AjaxResult<>(200, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @return
     */
    public static <T> AjaxResult<T> error() {
        return AjaxResult.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static <T> AjaxResult<T> error(String msg) {
        return AjaxResult.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static <T> AjaxResult<T> error(String msg, T data) {
        return new AjaxResult<>(444, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg  返回内容
     * @return 警告消息
     */
    public static <T> AjaxResult<T> restResult(int code, String msg, T data) {
        return new AjaxResult<>(code, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg  返回内容
     * @return 警告消息
     */
    public static <T> AjaxResult<T> restResult(int code, String msg) {
        return new AjaxResult<>(code, msg, null);
    }
}
