package com.scl.menu.mapper;

import com.scl.menu.domain.Type;
import org.aspectj.weaver.ast.Var;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created with IntelliJ IDEA.
 * @package: com.scl.menu.mapper
 * @author: chenglu
 * @create: 2020/4/1
 * Description: 
 */
public interface TypeMapper extends Mapper<Type> {
    /**
     * 根据id查找type
     * @param id
     * @return
     */
    Type selectById(Long id);
}