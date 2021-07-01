package org.lc.test;

import org.lc.annotation.ExcelColumn;
import org.lc.annotation.ExcelDynamicModel;
import org.lc.annotation.ExcelFunction;
import org.lc.annotation.ExcelModel;
import org.lc.constant.Function;

import java.util.ArrayList;
import java.util.List;

@ExcelModel(template = "模板", sheet = "数据列表", header = 3)
public class A {
    @ExcelColumn(column = "编号")
    @ExcelFunction(function = Function.COUNTA)
    private Long id;
    @ExcelColumn(column = "姓名")
    private String name;
    @ExcelDynamicModel(subclass = ArrayList.class)
    private List<B> hobbies;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<B> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<B> hobbies) {
        this.hobbies = hobbies;
    }
}