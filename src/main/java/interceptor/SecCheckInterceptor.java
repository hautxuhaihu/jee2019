package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import controller.MyAction;

import java.util.Date;
import java.util.Map;

public class SecCheckInterceptor extends AbstractInterceptor {
  @Override
  public String intercept(ActionInvocation invocation) throws Exception {
    Map session=invocation.getInvocationContext().getSession();
    if(!session.containsKey("username")) return "login";
    MyAction action=(MyAction)invocation.getAction();
    action.setDate(new Date());
    return invocation.invoke();
  }
}
