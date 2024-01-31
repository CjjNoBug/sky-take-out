package com.sky.dto;

import lombok.Data;

import java.io.Serializable;
//DTO 数据传输对象，用于程序中各层传输数据
@Data
public class CategoryDTO implements Serializable {

    //主键
    private Long id;

    //类型 1 菜品分类 2 套餐分类
    private Integer type;

    //分类名称
    private String name;

    //排序
    private Integer sort;

}
