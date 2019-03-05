package controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport {
  public String execute() {
    ActionContext.getContext().getSession().remove("username");
    return SUCCESS;//"success"
  }
}
