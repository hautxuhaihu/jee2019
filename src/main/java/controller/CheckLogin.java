package controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.StuDAO;
import dao.StuDAOImp;

import java.util.Map;

public class CheckLogin extends ActionSupport {
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

  @Override
  public void validate() {
    if (username.isEmpty()) {
      addFieldError("username", "û�������û���");
    }
    if (pass.isEmpty()) {
      addFieldError("pass", "û����������");
    }
  }

  @Override
  public String execute() {
    System.out.printf("%s,%s%n", username, pass);
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

