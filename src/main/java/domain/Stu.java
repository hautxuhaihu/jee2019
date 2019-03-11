package domain;

import lombok.Getter;
import lombok.Setter;

public class Stu {
  @Getter @Setter
  private long id;
  @Getter @Setter
  private String username, pass;
  @Getter @Setter
  private double java, math, os;

  public Stu() {
  }

  @Override
  public String toString() {
    return "Stu{" +
        "id=" + id +
        ", username='" + username + '\'' +
        ", pass='" + pass + '\'' +
        ", java=" + java +
        ", math=" + math +
        ", os=" + os +
        '}';
  }


}
