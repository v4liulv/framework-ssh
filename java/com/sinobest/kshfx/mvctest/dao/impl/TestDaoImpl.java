package com.sinobest.kshfx.mvctest.dao.impl;

import com.sinobest.framework.base.dao.impl.BaseDaoImpl;
import com.sinobest.kshfx.mvctest.dao.TestDao;
import com.sinobest.kshfx.mvctest.domain.TestTable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/11/6 0006.
 */
@Transactional
@Repository(value = "testDao")
public class TestDaoImpl extends BaseDaoImpl<TestTable> implements TestDao {

}
