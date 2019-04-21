package dao.mapper;

import domain.Region;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Mapper
public interface RegionDAO {
  @Cacheable("regions")
  @Select("select * from region where parent_region_code=#{parent_region_code}")
  List<Region> getAll(String region_code);

  @Cacheable("regions")
  @Select("select * from region where region_name like concat('%',#{term},'%')")
  List<Region> findByName(@Param("term") String term);
}
