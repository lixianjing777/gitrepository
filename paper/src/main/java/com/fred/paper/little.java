package com.fred.paper;

import java.sql.Array;
import java.util.ArrayList;

public class little {
    public static void main(String[] args) {
        String str1="大众 探岳 2019款 330TSI 双离合 四驱 开疆版";
        //String str2="大众 探岳 2019款 探岳 330TSI 四驱豪华型 国V";
        String str2="大众 帕萨特新能源 2019款 帕萨特新能源 1.4T 混动豪华版";

//        ArrayList<Object> objects = new ArrayList<>();
//        objects.add(str1);
        ArrayList<Object> objects = new ArrayList<>();

        String[] strs1=str1.split(" ");
        String[] strs2=str2.split(" ");
        int size=strs2.length;

        int j=0;
        for(int i=0; i<strs1.length;i++){
           // System.out.println(strs[i]);
            if (str2.indexOf(strs1[i])>=0) {
                //System.out.println("包含: "+strs1[i]);
                objects.add(strs1);
                }


            j=objects.size();
            }
        System.out.println("总共的长度是："+objects.size());
        System.out.println("str2总长度是："+size);
        if(j>=size*0.7){
            System.out.println("半个符合");
            //如果出现一对多，说明存在差异化，则进行equals的判断


            //将符合的数据输出到excel表格中

        }


    }
}
