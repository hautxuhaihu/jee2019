package dao;

import com.sun.corba.se.impl.orb.PrefixParserData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StuDAOImp implements StuDAO {
  String user="sa";
  String pass="";
  String url="";
  String driver="";
  @Override
  public boolean check(String username, String pass1) throws Exception {
    boolean isSuc=false;
    Class.forName(driver);
    String sql="select * from stu where username=? and pass=?";
    try(Connection con= DriverManager.getConnection(url,user,pass);
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
