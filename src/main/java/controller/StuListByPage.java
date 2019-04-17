package controller;

import com.github.pagehelper.PageInfo;
import com.opensymphony.xwork2.ActionSupport;
import dao.mapper.StuDAOByMybatis;
import domain.Stu;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StuListByPage extends ActionSupport {
  @Setter @Getter
  int pageNum=1;
  @Setter @Getter
  int pageSize=2;
  @Setter @Getter @Autowired
  StuDAOByMybatis dao;
  @Setter @Getter
  PageInfo res;//list,navigatepageNums
  public String execute(){
    List<Stu> stus=dao.getAllByPageNumSize(pageNum,pageSize);
    res=PageInfo.of(stus);
    return SUCCESS;
  }
}
