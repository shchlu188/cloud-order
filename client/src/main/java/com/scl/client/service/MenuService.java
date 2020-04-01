package com.scl.client.service;

import org.springframework.cloud.openfeign.FeignClient;

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


}
