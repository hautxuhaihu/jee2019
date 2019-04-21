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

public class CheckLoginByAjax extends ActionSupport {
  private final static Logger logger = LoggerFactory.getLogger(CheckLoginByAjax.class);
  private String username, pass;//���������ı�������һ��
  //setter getter

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  @Getter
  @Setter
  int age;

  @Override
  public void validate() {
    if (username.isEmpty()) {
      addFieldError("username", getText("username.empty"));
    }
    if (pass.isEmpty()) {
      addFieldError("pass", "û����������");
    }
    //todo
    if (age < 0) {
      addFieldError("age", getText("age.illegal", new String[]{"" + age}));
    }
  }

  @Override
  public String execute() {
    //System.out.printf("%s,%s%n", username, pass);
    logger.debug("username is {},pass is {}", username, pass);
    if (username.equalsIgnoreCase("admin")) {
      Map session = ActionContext.getContext().getSession();
      session.put("username", username);
      return "suc";
    } else {
      return "fail";
    }
  }

  public String checkInDb() throws Exception {
    StuDAO dao = new StuDAOImp();
    boolean isSuc = dao.check(username, pass);
    if (isSuc) return "suc";
    else return "fail";
  }
}

