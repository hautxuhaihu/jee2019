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
  <title>sj:div 异步加载</title>
  <s:head/>
  <sj:head/>
</head>
<body leftmargin="30px" topmargin="30px">
<s:url var="stuListUrl" action="stu_list"/>
<sj:div id="stuListDiv" href="%{stuListUrl}"/>
<h3>单击后才加载</h3>
<sj:div id="loadAfterClick" href="%{stuListUrl}" deferredLoading="true" reloadTopics="reloadStuList"/>
<sj:a id="reloadBtn" onClickTopics="reloadStuList" button="true">reloadStuList</sj:a>
</body>
</html>