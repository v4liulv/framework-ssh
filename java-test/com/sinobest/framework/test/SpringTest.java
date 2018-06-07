package com.sinobest.framework.test;

import com.sinobest.framework.dictionaries.mvc.domain.Dictionaries;
import com.sinobest.framework.dictionaries.mvc.service.DictionariesService;
import com.sinobest.framework.test.mvc.domain.SshTest;
import com.sinobest.framework.test.mvc.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by liulv on 2017/6/5.
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
//加载配置文件
@ContextConfiguration(locations = {"classpath:spring-hibernate.xml","classpath:spring.xml" })
public class SpringTest {

    @Resource(name = "testService")
    private TestService testService;

    @Resource(name = "DictionariesService")
    private DictionariesService dictionariesService;

    @Test
    @Transactional
    @Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚
    public void testSave() {
        System.out.println("测试Spring整合Junit4进行单元测试");

        SshTest sshTest = new SshTest();
        sshTest.setName("liulv2");
        testService.save(sshTest);
    }

    @Test
    @Transactional
    public void dictionariesTest() {
        List<Dictionaries> bEDITOREDITList = dictionariesService.getByField("Dictionaries", "KIND", "ARTICLE_TYPE", "order by CODE");
    }
}
