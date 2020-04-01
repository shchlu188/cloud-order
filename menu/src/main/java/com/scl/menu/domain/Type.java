package com.scl.menu.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

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