package com.sinobest.framework.mvctest.service.impl;

import com.sinobest.framework.base.service.impl.BaseServiceImpl;
import com.sinobest.framework.mvctest.dao.TestDao;
import com.sinobest.framework.mvctest.domain.TestTable;
import com.sinobest.framework.mvctest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/11/6 0006.
 *
 * Test表操作的Service
 */
@Service("testService")
public class TestServiceImpl extends BaseServiceImpl<TestTable> implements TestService {

    @Qualifier("testDao")
    @Autowired
    private TestDao testDao;

    @Override
    public List getAllEntity(String tableName)
    {
        return testDao.getAllEntity(tableName);
    }

    /*@Qualifier("testDaoImpl")
    @Autowired
    private TestDao testDao;

    @Override
    public List getAllEntity(String tableName)
    {
        return testDao.getAllEntity(tableName);
    }*/
}
