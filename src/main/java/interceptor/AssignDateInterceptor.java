package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import controller.MyAction;

import java.util.Date;

public class AssignDateInterceptor extends AbstractInterceptor {
  @Override
  public String intercept(ActionInvocation invocation) throws Exception {
    MyAction action=(MyAction)invocation.getAction();
    action.setDate(new Date());
    return null;
  }
}
