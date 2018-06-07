package com.sinobest.framework.test;

import com.sinobest.framework.utils.JdbcService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Types;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/12 0012.
 *
 * 提供无法使用 中间件服务 的ssh调用使用
 */
public class JDBCTest {

    private ApplicationContext init(){
        //String paths[] = {"spring-hibernate.xml", "spring.xml"};
        String paths[] = {"spring-jdbc-service.xml"};
//这个xml文件是Spring配置beans的文件，顺带一提，路径 在整个应用的根目录
        return new ClassPathXmlApplicationContext(paths);
    }

   // @org.junit.Test
    public void mainTest(){
//这个xml文件是Spring配置beans的文件，顺带一提，路径 在整个应用的根目录
        ApplicationContext ctx = init();
//        BaseService<Test> baseService = (BaseService<Test>) ctx.getBean("baseService");
      /*  BaseService<Test> baseService = (BaseService<Test>) ctx.getBean("appJdbcService");
        String hql  = "from Test";
        List<Test> tests = baseService.getByHQL(hql);
        for(Test bGxkshGnzypzb : tests){
            System.out.println(bGxkshGnzypzb.getId());
        }*/
//myBeanImpl是在Spring中注册的MyBean实现类的name或id
    }

    @org.junit.Test
    public void JdbcServiceTest1(){
        ApplicationContext context = init();
        JdbcService jdbcService = new JdbcService().getInstance(context);

        String sql = "select ID,NAME from Test where id = ?";
        String id = "1";
        List<Map<String, Object>> list = jdbcService.getJdbcTemplate().queryForList(sql,new Object[]{id}, new int[] {Types.VARCHAR });
        for(Map<String, Object> line : list){
            System.out.println(line.get("ID") + ":" + line.get("NAME"));
        }
    }

    //@org.junit.Test
    public void JdbcServiceTest2(){
        ApplicationContext context = init();
        JdbcService jdbcService = new JdbcService().getInstance(context);

        String sql = "select ID,NAME from Test where id = ? and name = ? ";
        String id = "4028a3815d323d61015d325a1d8f0000";
        String name = "liulv111111122221111312";
        List<Map<String, Object>> list = jdbcService.getJdbcTemplate().queryForList(sql,new Object[]{id, name}, new int[] {Types.VARCHAR, Types.VARCHAR});
        for(Map<String, Object> line : list){
            System.out.println(line.get("ID") + ":" + line.get("NAME"));
        }
    }


}
