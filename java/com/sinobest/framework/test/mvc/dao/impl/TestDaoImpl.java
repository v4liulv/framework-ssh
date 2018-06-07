package com.sinobest.framework.test.mvc.dao.impl;

import com.sinobest.framework.base.dao.impl.BaseDaoImpl;
import com.sinobest.framework.test.mvc.dao.TestDao;
import com.sinobest.framework.test.mvc.domain.SshTest;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/11/6 0006.
 */
@Transactional(value = "transactionManagerOracle")
@Repository(value = "testDao")
public class TestDaoImpl extends BaseDaoImpl<SshTest> implements TestDao {

}
