package controller;


import com.opensymphony.xwork2.ActionSupport;
import lombok.*;

public class XmlValidation extends ActionSupport {
  @Getter @Setter
  private int test_int;
  @Getter
  private int minValue=5;
}
