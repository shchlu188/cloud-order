package com.scl.menu.controller;

import com.scl.constant.ResultState;
import com.scl.menu.domain.Menu;
import com.scl.menu.mapper.MenuMapper;
import com.scl.menu.service.MenuService;
import com.scl.vo.ResultVo;
import org.springframework.cloud.context.restart.RestartEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @package: com.scl.menu.controller
 * @author: chenglu
 * @create: 2020/4/1
 * Description:
 */
@RestController
@RequestMapping("/menu")
public class MenuController {
    /**
     * 方便，采用mapper接口
     */
    @Resource
    private MenuMapper menuMapper;
    @Resource
    private MenuService menuService;

    @GetMapping("/list/{index}/{limit}")
    public ResultVo findAll(@PathVariable("index") int index,
                            @PathVariable("limit") int limit) {

        return new ResultVo(ResultState.SUCCESS,menuMapper.countMenu() ,menuMapper.findAll(index, limit));
    }


}
