package com.scl.client.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @package: com.scl.client.domain
 * @author: chenglu
 * @create: 2020/4/1
 * Description:
 */
@Data
public class Menu implements Serializable {
    private Integer id;

    private String name;

    private Double price;

    private String flavor;

    private Integer tid;

    private static final long serialVersionUID = 1L;
}