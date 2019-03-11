package demo;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
@Slf4j
public class LombokDemo {
  @Getter @Setter
  String username;

  @Test
  public void testLombok(){//tdd
    setUsername("lombok first");
    log.debug("{}",getUsername());
    Assert.assertEquals("lombok first",getUsername());
  }
}
