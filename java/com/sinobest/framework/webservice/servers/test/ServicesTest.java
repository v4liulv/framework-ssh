package com.sinobest.framework.webservice.servers.test;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by liulv on 2017/6/23.
 *
 *
 */
@WebService
public interface ServicesTest
{
    @WebMethod
    public String sayHello(String name);

    @WebMethod
    public String sayHello1(String name);
}
