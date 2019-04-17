package demo;

import com.github.pagehelper.PageInfo;
import dao.mapper.StuDAOByMybatis;
import domain.Stu;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.StuPageService;

import java.util.List;

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

  @Autowired
  StuDAOByMybatis dao;

  //没有缓存，dao中方法运行正确，有缓存后，运行不正确
  @Repeat(2)
  @Test
  public void testInDao() {
    int total = dao.total();
    List<Stu> stus = dao.getAllByPageNumSize(2, 3);
    log.debug("stus->{}", stus);
    PageInfo res = PageInfo.of(stus);
    log.debug("PageInfo->{}", res);
    assertEquals(total, res.getTotal());
    assertEquals(2, res.getPageNum());
  }
}