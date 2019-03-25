package controller;


import com.opensymphony.xwork2.ActionSupport;
import domain.Stu;
import lombok.*;

public class XmlValidation extends ActionSupport {
  @Getter @Setter
  private int test_int;
  @Getter
  private int minValue=5;
  @Getter @Setter
  private String test_requiredstring;
  @Getter @Setter
  private String test_stringlength;
  @Getter @Setter
  private String test_email;
  @Getter @Setter
  private Stu stu;

}