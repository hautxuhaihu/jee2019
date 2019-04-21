<%--
  Created by IntelliJ IDEA.
  User: qiaoyu
  Date: 2019/4/17
  Time: 10:37  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<html>
<head>
  <title>Title</title>
  <s:head/>
  <sj:head/>
</head>
<body leftmargin="30px" topmargin="30px">
<div id="formRes">
  <h3>提交form</h3>
  <s:form id="loginTag" action="checkLoginByAjax">
    <s:textfield name="username" label="username" requiredLabel="true"/>
    <s:password name="pass" label="pass"/>
  </s:form>
  <sj:a formIds="loginTag" targets="formRes" button="true">submit form</sj:a>
</div>
</body>
</html>