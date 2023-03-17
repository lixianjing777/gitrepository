package com.fred.paper;


import com.alibaba.excel.EasyExcel;
import com.fred.paper.Controller.base;
import com.fred.paper.entity.CarName;
import org.junit.Test;

import java.util.ArrayList;

public class xmlTest {

    @Test
    public void test1(){

        ArrayList<CarName> result=new ArrayList<>();

        String file1 = "C:\\Users\\Administrator\\Desktop\\找工作\\三百云\\三百云-2023春-Java招聘题目\\上机题-车型名称映射\\车型名称映射.xlsx";
        // 这里默认读取第一个sheet
        EasyExcel.read(file1, CarName.class, new base()).sheet().doRead();
    }

}
