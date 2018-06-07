package com.sinobest.framework.mvctest.controller;

import com.sinobest.framework.base.service.BaseService;
import com.sinobest.framework.domain.BGxkshSjfx;
import com.sinobest.framework.mvctest.model.TestTable;
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
@RequestMapping("/user/")
public class TestController {

    //@Resource(name="testService")
    @Resource(name="baseService")
    //private TestService testService;
    private BaseService<TestTable> testBaseService;

    @Resource(name="baseService")
    private BaseService<BGxkshSjfx> bGxkshGnzypzbBaseService;

    @RequestMapping("adds")
    public String toAddUser(List<TestTable> tests){
        TestTable test = new TestTable();
        test.setName("liulv1");
        TestTable test1 = new TestTable();
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
        TestTable test = testBaseService.getById(id);
        System.out.println("Test=============" + test.getName());
        return "main";
    }

    @RequestMapping("getAll")
    public String getAllUser(HttpServletRequest request){
        String tableName = "Test";
         List<TestTable> tests = testBaseService.getAllEntity(tableName);
        String name = tests.get(0).getName();
        System.out.println("get All name " + name);
        //request.setAttribute("testList", testService.getAllEntity(tableName));
        return "main";
    }

    @RequestMapping("getAllBGxkshGnzypzb")
    public String getAllBGxkshGnzypzb(HttpServletRequest request){
        String tableName = "BGxkshGnzypzb";
        List<BGxkshSjfx> tests = bGxkshGnzypzbBaseService.getAllEntity(tableName);
        String name = tests.get(0).getSystemid();
        System.out.println("get All name " + name);
        //request.setAttribute("testList", testService.getAllEntity(tableName));
        return "main";
    }

    @RequestMapping("save")
    public String saveUser(){
        TestTable test = new TestTable();
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
