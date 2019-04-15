package controller;

import dao.mapper.StuDAOByMybatis;
import domain.Stu;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

public class StuAction {
  @Setter @Getter
  Stu stu;
  @Setter @Getter
  long id;
  @Autowired
  @Setter @Getter
  StuDAOByMybatis dao;
  @Setter @Getter
  List<Stu> stus;
  public String list(){
    stus=dao.getAll();
    return SUCCESS;
  }
  public String edit(){
    stu=dao.findById(id);
    return SUCCESS;
  }
  public String add(){
    int row=dao.add(stu);
    return row>0?SUCCESS:ERROR;
  }
  public String update(){
    int row=dao.update(stu);
    return row>0?SUCCESS:ERROR;
  }
  public String del(){
    int row=dao.delById(id);
    return row>0?SUCCESS:ERROR;
  }
}
