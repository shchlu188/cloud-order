package com.scl.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @package: com.scl.constant
 * @author: chenglu
 * @create: 2020/4/1
 * Description:  响应状态码
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ResultState {
    SUCCESS(200,"success");
    private int code;
    private String msg;





}
