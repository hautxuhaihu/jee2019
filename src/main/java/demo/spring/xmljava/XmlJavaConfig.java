package demo.spring.xmljava;

import domain.Stu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class XmlJavaConfig {
  @Bean
  public Stu stu(){
    Stu stu=new Stu();
    stu.setUsername("spring xmljava");
    return stu;
  }
}
