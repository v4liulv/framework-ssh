package com.sinobest.framework.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liulv
 * @date 2017/12/17
 *
 * 404界面
 */
@Controller
public class Web404Controller {

    @RequestMapping(value="/web/404", method = RequestMethod.GET)
    public String main() throws Exception {
        return "404";
    }
}
