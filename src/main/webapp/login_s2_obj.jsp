<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>login</title>
  <s:head/>
</head>
<body leftmargin="30px" topmargin="30px">
用对象接收值
<s:form name="loginTag" action="checkLoginByObj">
  <s:textfield name="stu.username" label="username" requiredLabel="true"/>
  <s:password name="stu.pass" label="pass" labelposition="top"/>
  <s:submit/>
</s:form>
</body>
</html>
