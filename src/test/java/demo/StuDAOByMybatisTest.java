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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
  @Test
  public void testAdd()  {
    Stu stu=new Stu();
    stu.setUsername("test-1");
    stu.setJava(90);stu.setMath(91);stu.setOs(92);
    int row=dao.add(stu);
    assertTrue(row>0);
    log.debug("new id {}",stu.getId());
  }

  @Test
  public void testUpdate(){
   //update
    Stu stu=dao.findById(8L);
    String newName="java-2";
    stu.setUsername(newName);
    dao.update(stu);
    //assertEquals
    Stu newStu=dao.findById(8L);
    assertEquals(newStu.getUsername(),newName);
  }
  @Test
  public void testDelById(){
    int row=dao.delById(7L);
    log.debug("del res:{}",row);
  }

}
