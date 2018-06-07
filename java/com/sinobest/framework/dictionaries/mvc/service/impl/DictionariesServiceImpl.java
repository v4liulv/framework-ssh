package com.sinobest.framework.dictionaries.mvc.service.impl;

import com.sinobest.framework.base.service.impl.BaseServiceImpl;
import com.sinobest.framework.dictionaries.mvc.dao.DictionariesDao;
import com.sinobest.framework.dictionaries.mvc.domain.Dictionaries;
import com.sinobest.framework.dictionaries.mvc.service.DictionariesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author liulv
 * @date 2018/1/3
 */
@Service("DictionariesService")
public class DictionariesServiceImpl extends BaseServiceImpl<Dictionaries> implements DictionariesService {
    @Qualifier("DictionariesDao")
    @Autowired
    private DictionariesDao dictionariesDao;
}
