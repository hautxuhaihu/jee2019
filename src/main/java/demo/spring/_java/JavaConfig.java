package demo.spring._java;

import domain.Stu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
  @Bean
  public Stu stu(){
    Stu stu=new Stu();
    stu.setUsername("spring javaconfig");
    return stu;
  }
  @Bean public HelloWorld hello(){
    HelloWorld hello=new HelloWorld();
    hello.setMsg("spring javaconfig");
    hello.setStu(stu());
    return hello;
  }
}
