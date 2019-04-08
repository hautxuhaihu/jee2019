package dao.mapper;

import domain.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StuDAOByMybatis {
  @Select("select * from stu")
   List<Stu> getAll();
  @Select("select * from stu where id=#{id}")
  Stu findById(@Param("id") long id);
}
