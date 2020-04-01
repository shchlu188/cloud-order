package com.scl.menu.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @package: com.scl.menu.domain
 * @author: chenglu
 * @create: 2020/4/1
 * Description:
 */
@Data
@Table(name = "t_menu")
public class Menu implements Serializable {
    private Integer id;

    private String name;

    private Double price;

    private String flavor;

    private Type type;
    private static final long serialVersionUID = 1L;
}