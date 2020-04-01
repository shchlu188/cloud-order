package com.scl.client.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * @package: com.scl.menu.domain
 * @author: chenglu
 * @create: 2020/4/1
 * Description: 
 */
@Data
public class Type implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;
}