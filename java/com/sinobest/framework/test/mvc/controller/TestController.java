package com.sinobest.framework.test.mvc.controller;

import com.sinobest.framework.base.service.BaseService;
import com.sinobest.framework.test.mvc.domain.SshTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2016/11/6 0006.
 *
 * Cotroller /csv/相关调用
 */
@Controller
@RequestMapping("/test/")
public class TestController {

    //@Resource(name="testService")
    @Resource(name="baseService")
    //private TestService testService;
    private BaseService<SshTest> testBaseService;

    @RequestMapping("adds")
    public String toAddUser(List<SshTest> tests){
        SshTest test = new SshTest();
        test.setName("liulv1");
        SshTest test1 = new SshTest();
        test1.setName("liulv2");
        tests.add(test);
        tests.add(test1);
//        testService.save(tests);
        //service.save(tests);
        return "redirect:/main";
    }

    @RequestMapping("get")
    public String getUserById(){
        String id = "4028a3815d323d61015d325a1d8f0000";
        //request.setAttribute("testList", testService.getAllEntity(tableName));
        SshTest test = testBaseService.getById(id);
        System.out.println("Test=============" + test.getName());
        return "main";
    }

    @RequestMapping("getAll")
    public String getAllUser(HttpServletRequest request){
        String tableName = "SshTest";
         List<SshTest> tests = testBaseService.getAllEntity(tableName);
        String name = tests.get(0).getName();
        System.out.println("get All name " + name);
        //request.setAttribute("testList", testService.getAllEntity(tableName));
        return "main";
    }

    @RequestMapping("save")
    public String saveUser(){
        SshTest test = new SshTest();
        test.setName("liulv111111122221111312");
//        request.setAttribute("test", testService.save(test));
        testBaseService.save(test);
        return "main";
    }

    @RequestMapping("delete")
    public String deleteUser(){
        String id = "1";
//        request.setAttribute("test", testService.save(test));
        testBaseService.delete(id);
        return "main";
    }



}
