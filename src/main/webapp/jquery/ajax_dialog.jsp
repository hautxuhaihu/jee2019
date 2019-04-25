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
<s:url var="findShengUrl" action="findSheng"/>
<h3>单击后才加载</h3>
<sj:dialog id="stuListDlg" href="%{stuListUrl}" modal="true" autoOpen="false" openTopics="openDlg" title="stu list"/>
<sj:a id="openDlg" onClickTopics="openDlg" button="true">open stuListDlg</sj:a>
<sj:a id="openDlg2" openDialog="stuListDlg" button="true">openDialog中指定</sj:a>

<h3>通过sj:a为sj:dialog指定href</h3>
<sj:dialog id="hrefDlg" autoOpen="false" modal="true"/>
<sj:a id="stuListBtn" openDialog="hrefDlg" openDialogTitle="stu list" href="%{stuListUrl}"
      button="true">指定dialog打开stu list</sj:a>
<sj:a id="regionListBtn" openDialog="hrefDlg" openDialogTitle="省" href="%{findShengUrl}"
      button="true">指定dialog显示所有省</sj:a>
</body>
</html>