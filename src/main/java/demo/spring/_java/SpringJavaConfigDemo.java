package demo.spring._java;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class SpringJavaConfigDemo {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
    HelloWorld hello=ctx.getBean("hello",HelloWorld.class);
    logger.debug("{}",hello);
    ctx.registerShutdownHook();
  }
}
