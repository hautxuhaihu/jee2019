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
from list
<s:action name="findSheng" executeResult="false" var="findSheng"/>
<s:url var="findShiUrl" action="findShi"/>
<sj:accordion id="accordion1" href="%{findShiUrl}"
              list="#findSheng.shengs" listKey="region_name" listValue="region_code"
              paramKeys="sheng" paramValues="region_code" heightStyle="content"
              active="false"
              openOnMouseover="true"
              collapsible="true"
/>
</body>
</html>