package com.coder.dream.service.checkandnotcheck;

import com.alibaba.dubbo.config.annotation.Reference;
import com.google.inject.Singleton;

/**
 * Created by konghang on 2017/1/19.
 */
@Singleton
public class NotCheckService {

    @Reference(version = "1", check = false)
    private RefereceNotCheckService refereceNotCheckService;

    public void test(){
        System.out.println("this is not check service : " + refereceNotCheckService);
    }
}
