package com.sinobest.kshfx.webservice.servers.test.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.sinobest.kshfx.webservice.servers.test.ServicesTest;
import org.springframework.stereotype.Service;

/**
 * Created by liulv on 2017/6/22.
 *
 * JAX-WS方法发布WebService 示例  实现类
 */
/*@WebService(serviceName = "HelloWorldService", endpointInterface = "com.sinobest.com.sinobest.kshfx.webservice.servers.ServicesTest")*/
// 防止jdk版本问题
// spring注解使用
@Service("exampleService")
// webservice地址使用
@WebService
// 防止jdk版本问题
@SOAPBinding(style=Style.RPC)
public class ServicesTestImpl implements ServicesTest
{
    @Override
    public String sayHello(String name)
    {
        System.out.println("==============================" + name);
        return "Hello" + name;
    }

    @Override
    public String sayHello1(String name)
    {
        System.out.println("==============================" + name);
        return "Hello" + name;
    }
}
