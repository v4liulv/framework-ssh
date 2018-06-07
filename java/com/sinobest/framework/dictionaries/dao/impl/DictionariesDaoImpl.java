package com.sinobest.framework.dictionaries.mvc.dao.impl;

import com.sinobest.framework.base.dao.impl.BaseDaoImpl;
import com.sinobest.framework.dictionaries.mvc.dao.DictionariesDao;
import com.sinobest.framework.dictionaries.mvc.domain.Dictionaries;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liulv
 * @date 2018/1/3
 */
@Transactional(value = "transactionManagerOracle")
@Repository(value = "DictionariesDao")
public class DictionariesDaoImpl extends BaseDaoImpl<Dictionaries> implements DictionariesDao {
}
