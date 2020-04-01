package com.scl.vo;

import com.scl.constant.ResultState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @package: com.scl.vo
 * @author: chenglu
 * @create: 2020/4/1
 * Description:   响应视图类
 * 数据格式
 * {
 * "code": 0,
 * "msg": "",
 * "count": 1000,
 * "data": [{}, {}]
 * }
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo<T> {
    private int code;

    private String msg;
    /** 查询总记录数*/
    private Long count;
    /** 查询数据*/
    private T data;

    public ResultVo(ResultState resultState,Long count, T data) {
        this(resultState.getCode(),
                resultState.getMsg(),
                count,
                data);
    }
    public ResultVo(ResultState resultState, T data) {
        this(resultState.getCode(),
                resultState.getMsg(),
                100L,
                data);
    }


}
