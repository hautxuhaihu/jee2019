package demo.spring.xml;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Slf4j
public class SpringXmlDemo {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:demo/spring/xml/spring-xml.xml");
    HelloWorld hello=ctx.getBean("hello",HelloWorld.class);
    logger.debug("{}",hello.getMsg());
    ctx.registerShutdownHook();
  }
}
