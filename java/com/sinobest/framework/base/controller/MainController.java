package com.sinobest.framework.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.URISyntaxException;

/**
 * Created by Administrator on 2016/11/4 0004.
 * <p>
 * Controller  示例调用
 */
@Controller
public class MainController
{
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main() throws URISyntaxException {
        return "main";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main_1()
    {
        return "main";
    }

    @RequestMapping(value = "/main/", method = RequestMethod.GET)
    public String main_2()
    {
        return "main";
    }

}
