package jquery;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

public class Echo extends ActionSupport {
  @Getter
  @Setter
  long id;
}
