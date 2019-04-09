package dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
@Slf4j
@Component
public class StuDAOImp implements StuDAO {
  String url = "jdbc:hsqldb:hsql://localhost";
  String driver = "org.hsqldb.jdbcDriver";
  String user="sa";
  String pass="";
  @Cacheable("allStus")
  @Override
  public boolean check(String username, String pass1) throws Exception {
    boolean isSuc=false;
    logger.info("query db ");
    Class.forName(driver);
    String sql="select * from stu where username=? and pass=?";
    try (Connection con = DriverManager.getConnection(url, user, pass);
         PreparedStatement pstmt=con.prepareStatement(sql)){
      pstmt.setString(1,username);
      pstmt.setString(2,pass1);
      try(ResultSet rs=pstmt.executeQuery()){
        isSuc=rs.next();
      }
    }
    return isSuc;
  }
}
