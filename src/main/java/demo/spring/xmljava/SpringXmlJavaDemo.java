package demo.spring.xmljava;

import demo.spring.xmljava.HelloWorld;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Slf4j
public class SpringXmlJavaDemo {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:demo/spring-xmljava.xml");
    HelloWorld hello=ctx.getBean("hello", HelloWorld.class);
    logger.debug("{}",hello);
    ctx.registerShutdownHook();
  }
}
