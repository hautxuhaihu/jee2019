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
<div id="uploadRes">
  <s:form id="uploadForm" name="uploadForm" enctype="multipart/form-data" action="fileUploadByAjax">
    <s:file name="upload"></s:file>
    <sj:submit id="uploadBtn" targets="uploadRes" indicator="indicator"/>
  </s:form>
  <img id="indicator" style="display: none" src="../indicator.gif" alt="loading..."/>
</div>
</body>
</html>