package controller;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class MyAction extends ActionSupport {
  @Setter @Getter
  Date date;
  @Getter @Setter
  String name;

}
