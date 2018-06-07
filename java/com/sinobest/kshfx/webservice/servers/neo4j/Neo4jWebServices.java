package com.sinobest.kshfx.webservice.servers.neo4j;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by liulv on 2017/6/23.
 *
 * 用于Neo4j数据写入相关的webService接口
 */
@WebService
public interface Neo4jWebServices
{
    @WebMethod
    public Integer createNodesOfPerson(String personsQqbw);

    @WebMethod
    public String queryNeo4jProvideTheInterfaces(String queryCypher);

}
