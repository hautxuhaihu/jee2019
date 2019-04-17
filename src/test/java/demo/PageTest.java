package demo;

import com.github.pagehelper.PageInfo;
import domain.Stu;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.StuPageService;

import static org.junit.Assert.assertEquals;

/**
 * 测试通过StuDAOByMatis分页和通过StuPageSerivce分页
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PageTest {

  @Autowired
  StuPageService service;

  @Repeat(2)
  @Test
  public void testInService() {
    PageInfo<Stu> stus = service.findByPage(2, 3);
    log.debug("{}", stus);
    assertEquals(2, stus.getPageNum());
  }
}