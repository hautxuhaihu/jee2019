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
<s:url var="stu_list" action="stu_list"/>
<s:url var="findSheng" action="findSheng"/>
<sj:accordion id="accordion1">
  <sj:accordionItem id="item1" title="static">
    centos,redis
  </sj:accordionItem>
  <sj:accordionItem id="item2" title="sj:div jsp">
    <sj:div href="ajax_a.jsp"/>
  </sj:accordionItem>
  <sj:accordionItem id="item3" title="sj:div 延迟加载action" onClickTopics="loadDiv">
    <sj:div id="sheng" href="%{findSheng}" deferredLoading="true" reloadTopics="loadDiv"/>
  </sj:accordionItem>

</sj:accordion>
</body>
</html>