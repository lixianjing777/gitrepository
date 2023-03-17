package com.fred.paper.Controller;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.fred.paper.entity.CarName;
import lombok.extern.slf4j.Slf4j;

@Slf4j                     //这里运用到了观察者模式
public class base extends AnalysisEventListener<CarName> {

    /**
     * 这个每一条数据解析都会来调用
     */
    @Override
    public void invoke(CarName data, AnalysisContext context) {
        log.info("解析到一条数据:{}", data);//每监听到一行就调用一次

    }

    /**
     * 所有数据解析完成了 都会来调用
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("所有数据解析完成！");//最后执行收尾工作
    }
}
