package controller;

import com.opensymphony.xwork2.ActionSupport;

public class CheckLogin extends ActionSupport {
  private String username, pass;//变量名和文本框名字一样
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
  public String execute() {
    System.out.printf("%s,%s%n", username, pass);
    if (username.equalsIgnoreCase("admin")) {
      return "suc";
    } else {
      return "fail";
    }
  }
}

