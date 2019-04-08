package demo.spring.xmljava;

import domain.Stu;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hello")
@ToString
public class HelloWorld {
  @Getter
  @Setter
  String msg;
  @Autowired
  @Getter @Setter
  Stu stu;
}
