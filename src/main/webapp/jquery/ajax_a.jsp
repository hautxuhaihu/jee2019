<%--
  Created by IntelliJ IDEA.
  User: qiaoyu
  Date: 2019/4/17
  Time: 10:37  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<head>
  <title>Title</title>
  <s:head/>
  <sj:head/>
</head>
<body leftmargin="30px" topmargin="30px">
<div id="result1"></div>
<div id="result2"></div>
<s:url var="stuListUrl" action="stu_list"/>
<sj:a href="%{stuListUrl}" targes="result1,result2" button="true">show stu list</sj:a>
</body>
</html>
s