package dao.mapper;

import domain.Stu;
import org.apache.ibatis.annotations.*;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Mapper
public interface StuDAOByMybatis {
  @Cacheable("allStus")
  @Select("select * from stu")
  List<Stu> getAll();

  //@Cacheable(value = "allStus:page")
  @Select("select * from stu")
  List<Stu> getAllByPageNumSize(@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);

  @Cacheable("allStus")
  @Select("select * from stu where id=#{id}")
  Stu findById(@Param("id") long id);

  @CacheEvict(value = "allStus",allEntries = true)
  @Insert("insert into stu(username,java,math,os)" +
      "values(#{stu.username},#{stu.java},#{stu.math},#{stu.os})")
  @Options(useGeneratedKeys = true,keyProperty = "stu.id")
  int add(@Param("stu")Stu stu);

  @CacheEvict(value = "allStus",allEntries = true)
  @Update("update stu set username=#{stu.username},os=#{stu.os}," +
      "java=#{stu.java},math=#{stu.math} where id=#{stu.id}")
  int update(@Param("stu") Stu stu);

  @CacheEvict(value = "allStus",allEntries = true)
  @Delete("delete from stu where id=#{id}")
  int delById(@Param("id") long id);

  @Select("select count(*) from stu")
  int total();
}
