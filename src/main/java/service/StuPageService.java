package service;

import com.github.pagehelper.PageInfo;
import dao.mapper.StuDAOByMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StuPageService {
  @Autowired
  StuDAOByMybatis dao;
  @Cacheable("allStus")
  public PageInfo findByPage(int pageNum, int pageSize) {
    return PageInfo.of(dao.getAllByPageNumSize(pageNum, pageSize));
  }
}
