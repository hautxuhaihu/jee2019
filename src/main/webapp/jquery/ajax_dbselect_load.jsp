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
  <title>dbselect</title>
  <s:head/>
  <sj:head/>
</head>
<body leftmargin="30px" topmargin="30px">
<s:url var="findShengUrl" action="findSheng"/>
<s:url var="findShiUrl" action="findShi"/>
<s:url var="findShiOrXianUrl" action="findShiOrXian"/>
<s:form id="dbSelectForm">
  <sj:select id="shengSel" name="sheng" href="%{findShengUrl}"
             onChangeTopics="reloadShi"
             list="shengs" listKey="region_code" listValue="region_name"
             headerKey="-1" headerValue="please select"/>
  <sj:select id="shiSel" name="shi" href="%{findShiUrl}"
             onChangeTopics="reloadXian" reloadTopics="reloadShi" onSuccessTopics="reloadXianAfterSuc"
             list="shis" listKey="region_code" listValue="region_name"
             headerKey="-1" headerValue="please select"/>
</s:form>
<sj:div id="loadShiOrXian" href="%{findShiOrXian}" formIds="dbSelectForm" deferredLoading="true"
        reloadTopics="reloadXian,reloadXianAfterSuc"/>
</body>
</html>