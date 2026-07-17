package org.example.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;      // 状态码：200成功，500失败
    private String message;    // 提示信息
    private Object data;       // 返回的数据

    /**
     * 成功响应（带数据）
     */
    public static Result success(Object data) {
        return new Result(200, "操作成功", data);
    }

    /**
     * 成功响应（不带数据）
     */
    public static Result success() {
        return new Result(200, "操作成功", null);
    }

    /**
     * 失败响应
     */
    public static Result error(String message) {
        return new Result(500, message, null);
    }
}