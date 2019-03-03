<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>login</title>
</head>
<body leftmargin="30px" topmargin="30px">
<form action="checkLogin">
  username:<input type="text" name="username"/><br>
  pass:<input type="password" name="pass"/><br>
  <input type="submit"/>
</form>
用Struts2标签实现登录
<s:form name="loginTag" action="checkLogin">
  <s:textfield name="username" label="username"/>
  <s:password name="pass" label="pass"/>
  <s:submit/>
</s:form>
</body>
</html>
