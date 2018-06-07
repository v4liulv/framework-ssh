package com.sinobest.framework.utils;

import com.sinobest.framework.base.service.BaseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by liulv on 2017/7/13 0013.
 *
 * ssh的本地化 工具类， 不能进行容器进行获取数据库连接的处理
 */
public class FrmeworkUtil<T> {

    private ApplicationContext init(){
        String paths[] = {"spring-jdbc-service.xml"};
//这个xml文件是Spring配置beans的文件，顺带一提，路径 在整个应用的根目录
        return new ClassPathXmlApplicationContext(paths);
    }

    //初始化获取jdbcService
    public JdbcService<T> jdbcService(){
        return new JdbcService<T>().getInstance(init());
    }

    public List<T> getEntityListByHql(String hql, Object... params){
        String paths[] = {"spring-hibernate.xml", "spring.xml"};
        //这个xml文件是Spring配置beans的文件，顺带一提，路径 在整个应用的根目录
        ApplicationContext ctx = new ClassPathXmlApplicationContext(paths);
        BaseService<?> baseService = (BaseService<?>) ctx.getBean("baseService");
        return (List<T>) baseService.getByHQL(hql, params);
    }


    public static void main(String[] args) {
        /*BGxkshSjfx bGxkshGnzypzb = (BGxkshSjfx) new FrmeworkUtil<BGxkshSjfx>().getEntityListByHql("0401");
        System.out.println(String.valueOf(bGxkshGnzypzb));*/
    }

}
