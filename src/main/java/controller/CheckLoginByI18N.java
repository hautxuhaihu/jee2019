package controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.StuDAO;
import dao.StuDAOImp;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CheckLoginByI18N extends ActionSupport {
  private final static Logger logger= LoggerFactory.getLogger(CheckLoginByI18N.class);
  @Getter @Setter
  private String username, pass;//变量名和文本框名字一样
  @Getter @Setter
  private String type;


  @Getter @Setter
  int age;
  @Override
  public void validate() {
    if (username.isEmpty()) {
      addFieldError("username", getText("username.empty"));
    }
    if (pass.isEmpty()) {
      addFieldError("pass", "没有输入密码");
    }
    //todo
    if(age<0){
      addFieldError("age",getText("age.illegal",new String[]{""+age}));
    }
  }

  @Override
  public String execute() {
    //System.out.printf("%s,%s%n", username, pass);
    logger.debug("username is {},pass is {}",username,pass);
    if (username.equalsIgnoreCase("admin")) {
      return type;
    } else {
      return "fail";
    }
  }
}

