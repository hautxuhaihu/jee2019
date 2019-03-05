gitee.com企业中有文档   
每天刚开始工作git pull
### 用Struts2实现登录页面
MVC    
V:login.jsp login_suc.jsp,login_fail.jsp
check.jsp逻辑判断    
接收值：变量名和文本框名字一致    
No result defined for action controller.CheckLogin and result fail   
没有定义fail对应的页面   
#### 具体过程
```
form action="checkLogin"
  username
  pass
  
  
  CheckLogin
  username,pass/setter,getter
  String execute{
     if return "suc"
	 else return "fail"
  }
  struts.xml
  <action name="checkLogin" class="controller.CheckLogin">
    <result name="suc"></result>
	<result name="fail"></result>
  </action>
```
### 验证
```
  @Override public void validate
  
  addFieldError(文本框的名字，错误信息)
 ```
 ### 结果类型
 redirect，怎么取值
 <s:property value="username"/>
 java.util.Map session
 put(key,value),remove(key)
 ### 怎么注销?
 需要一个action,然后remove   
  s:if
  
  ### 怎么把文本框值提交给一个对象
  Stu(username,pass)
 
 