package com.sinobest.framework.webservice.client;

import com.sinobest.framework.util.webservice.RPCInvokingWebServiceUtil;
import org.junit.Test;

/**
 * Created by liulv on 2017/6/22.
 * 客户端 示例
 */
public class TestClient {

    public static void main(String[] args) {
        String address = "http://192.168.1.110:8081/services/test?wsdl";
        String namespaceURI = "http://impl.test.servers.webservice.framework.sinobest.com/";
        String localName = "sayHello";
        Object[] opAddEntryArgs = {"liulv"};
        String result = RPCInvokingWebServiceUtil.invokingWebService(address, namespaceURI, localName, opAddEntryArgs);
        System.out.println(result);
    }

    @Test
    public void ryxxcxWsTest(){
        String address = "http://192.168.1.110:8081/services/test?wsdl";
        String namespaceURI = "http://impl.test.servers.webservice.framework.sinobest.com/";
        String localName = "sayHello";
        Object[] opAddEntryArgs = {"522324"};
        String result = RPCInvokingWebServiceUtil.invokingWebService(address, namespaceURI, localName, opAddEntryArgs);
        System.out.println(result);
    }
}
