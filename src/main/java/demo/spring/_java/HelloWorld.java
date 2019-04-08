package demo.spring._java;

import domain.Stu;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class HelloWorld {
  @Getter @Setter
  String msg;
  @Getter @Setter
  Stu stu;
}
