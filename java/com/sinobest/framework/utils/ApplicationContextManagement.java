package com.sinobest.framework.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Administrator on 2017/7/13 0013.
 */
public class ApplicationContextManagement implements ApplicationContextAware{
    private static ApplicationContext appContext;

    public static void init(ApplicationContext appContext){
        ApplicationContextManagement.appContext = appContext;
    }

    public static ApplicationContext getApplicationContext(){
        return appContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.appContext = applicationContext;
    }
}
