package com.scl.menu.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.scl.menu.mapper.MenuMapper;
import com.scl.menu.service.MenuService;
/**
 * Created with IntelliJ IDEA.
 * @package: com.scl.menu.service.impl
 * @author: chenglu
 * @create: 2020/4/1
 * Description: 
 */
@Service
public class MenuServiceImpl implements MenuService{

    @Resource
    private MenuMapper menuMapper;

}
