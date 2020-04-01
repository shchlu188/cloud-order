package com.scl.client.service;

import com.scl.client.domain.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 *
 * @package: com.scl.client.service
 * @author: chenglu
 * @create: 2020/4/1
 * Description:
 */
@FeignClient(value="menu")
public interface MenuService {
    @GetMapping("/menu/list/{index}/{limit}")
    public List<Menu> findAll(@PathVariable("index") int index,
                              @PathVariable("limit") int limit);
}
