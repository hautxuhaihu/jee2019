<%--
  Created by IntelliJ IDEA.
  User: qiaoyu
  Date: 2019/3/3
  Time: 20:29  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>login s2 suc</title>
</head>
<body leftmargin="30px" topmargin="30px">
<s:debug/>
login s2 suc
username:<s:property value="username"/><br>
session:<s:property value="#session.username"/>
<br>
<a href="logout.action">logout</a>
</body>
</html>
