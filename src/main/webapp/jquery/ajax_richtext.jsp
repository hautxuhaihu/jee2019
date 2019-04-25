<%--
  Created by IntelliJ IDEA.
  User: qiaoyu
  Date: 2019/4/17
  Time: 10:37  
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjr" uri="/struts-jquery-richtext-tags"%>
<html>
<head>
  <title>Title</title>
  <s:head/>
  <sj:head/>
</head>
<body leftmargin="30px" topmargin="30px">
<hr>
<h3>提交form</h3>

<s:form id="loginTag" action="checkLogin">
  <sjr:ckeditor
      id="richtextEditor"
      name="echo"
      rows="10"
      cols="80"
      width="730"
      height="250"/>
  <s:submit/>
</s:form>
</body>
</html>