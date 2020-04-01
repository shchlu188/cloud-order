package com.scl.menu.mapper;

import com.scl.menu.domain.Menu;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @package: com.scl.menu.mapper
 * @author: chenglu
 * @create: 2020/4/1
 * Description: 
 */
public interface MenuMapper extends Mapper<Menu> {
    /**
     * 分页查询
     * @param index
     * @param limit
     * @return
     */
    List<Menu> findAll(int index, int limit);

    /**
     * 查询总记录数
     * @return
     */
    Long countMenu();
}