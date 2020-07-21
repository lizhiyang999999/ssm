package cn.itcast.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class AccountMapperTest {

    @Autowired
    AccountMapper mapper;

    @Test
    public void transferIn(){
        mapper.transferIn("aaa",200);
    }

    @Test
    public void transferOut(){
        mapper.transferIn("bbb",200);
    }
}
