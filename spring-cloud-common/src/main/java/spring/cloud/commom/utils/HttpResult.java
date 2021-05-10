package spring.cloud.commom.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 统一返回数据结构
 * @param <T>
 */
@Data
@AllArgsConstructor
public class HttpResult<T> {

    private int code;

    private String msg;

    private T result;

    public HttpResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
