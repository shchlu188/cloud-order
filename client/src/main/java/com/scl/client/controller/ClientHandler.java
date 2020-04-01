package com.scl.client.controller;

import com.scl.client.domain.Menu;
import com.scl.client.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @package: com.scl.client.controller
 * @author: chenglu
 * @create: 2020/4/1
 * Description:
 */
@RestController
@RequestMapping("/client")
public class ClientHandler {
    @Resource
    private MenuService menuService;
    @GetMapping("/list/{index}/{limit}")
    public List<Menu> listAll(@PathVariable("index") @NotBlank int index,
                              @PathVariable("limit") @NotBlank int limit){
        if (limit < 1){
            throw new IllegalArgumentException("总条数不能为负数");
        }
        return menuService.findAll(index,limit);
    }

}
