<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>login</title>
  <s:head/>
</head>
<body leftmargin="30px" topmargin="30px">
<form action="checkLogin">
  username:<input type="text" name="username"/><br>
  pass:<input type="password" name="pass"/><br>
  <input type="submit"/>
</form>
用Struts2标签实现登录
<s:form name="loginTag" action="checkLogin">
  <s:textfield name="username" label="username" requiredLabel="true"/>
  <s:password name="pass" label="pass" labelposition="top"/>
  <s:submit/>
</s:form>
check in db
<s:form name="loginTag" action="checkLoginInDb">
  <s:textfield name="username" label="username" requiredLabel="true"/>
  <s:password name="pass" label="pass"/>
  <s:submit/>
</s:form>
</body>
</html>
