package controller;

import com.opensymphony.xwork2.ActionSupport;
import domain.Stu;

public class CheckLoginByObj extends ActionSupport {
  private Stu stu;

  public Stu getStu() {
    return stu;
  }

  public void setStu(Stu stu) {
    this.stu = stu;
  }
  //校验
  @Override public void validate(){
    if(stu.getUsername().isEmpty()){
      addFieldError("stu.username","用户名为空");
    }
  }

  public String execute() {
    if (stu.getUsername().equalsIgnoreCase("admin")) {
      return SUCCESS;
    } else
      return "fail";
  }
}
