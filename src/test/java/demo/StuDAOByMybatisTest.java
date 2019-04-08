package demo;

import dao.mapper.StuDAOByMybatis;
import domain.Stu;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StuDAOByMybatisTest {
  @Autowired
  StuDAOByMybatis dao;

  @Test
  public void testGetAll(){
    List<Stu> stus=dao.getAll();
    log.debug("{}",stus);
  }
}
