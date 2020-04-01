package com.scl.client.controller;

import com.scl.client.domain.Menu;
import com.scl.client.service.MenuService;
import com.scl.constant.ResultState;
import com.scl.vo.ResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
@Controller
@RequestMapping("/client")
public class ClientHandler {
    @Resource
    private MenuService menuService;
    @GetMapping("/list")
    @ResponseBody
    public ResultVo<List<Menu>> listAll(@RequestParam("page") @NotBlank int page,
                            @RequestParam(value = "limit",defaultValue = "5") @NotBlank int limit){
        int index = (page-1)*limit;
        return menuService.findAll(index,limit);
    }


    @GetMapping("/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }

}
