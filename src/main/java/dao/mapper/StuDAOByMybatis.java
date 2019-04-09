package dao.mapper;

import domain.Stu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StuDAOByMybatis {
  @Select("select * from stu")
  List<Stu> getAll();

  @Select("select * from stu where id=#{id}")
  Stu findById(@Param("id") long id);

  @Insert("insert into stu(username,java,math,os)" +
      "values(#{stu.username},#{stu.java},#{stu.math},#{stu.os})")
  @Options(useGeneratedKeys = true,keyProperty = "stu.id")
  int add(@Param("stu")Stu stu);

  @Update("update stu set username=#{stu.username},os=#{stu.os}," +
      "java=#{stu.java},math=#{stu.math} where id=#{stu.id}")
  int update(@Param("stu") Stu stu);
  @Delete("delete from stu where id=#{id}")
  int delById(@Param("id") long id);
}
