package demo;

import dao.StuDAOImp;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class CacheTest {
  @Autowired  StuDAOImp dao;
  @Test
  public void testCache()throws Exception{
    dao.check("test","123");
    dao.check("test","123");
  }
}
