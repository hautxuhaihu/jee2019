package demo;

import domain.Stu;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJdbcTest {
  JdbcTemplate jdbcTemplate;
  @Autowired
  public void setJdbcTemplate(DataSource dataSource){
    jdbcTemplate=new JdbcTemplate(dataSource);
  }

  @Test
  public void testGetAll(){
    List<Stu> stus=jdbcTemplate.query("select * from stu",
        new BeanPropertyRowMapper<>(Stu.class));
    log.debug("{}",stus);
  }
  @Test
  public void testGetAllBySelfMapper(){
    List<Stu> stus=jdbcTemplate.query("select * from stu",
        new RowMapper<Stu>() {
          @Override
          public Stu mapRow(ResultSet rs, int rowNum) throws SQLException {
            Stu stu=new Stu();
            stu.setUsername(rs.getString("username"));
            stu.setJava(rs.getDouble("java"));
            return stu;
          }
        });
    log.debug("{}",stus);
    assertTrue(stus.size()>0);
  }
  @Test
  public void testGetAllByMap(){
    List<Map<String,Object>> stus=jdbcTemplate.queryForList("select * from stu");
    log.debug("{}",stus);
  }

}
