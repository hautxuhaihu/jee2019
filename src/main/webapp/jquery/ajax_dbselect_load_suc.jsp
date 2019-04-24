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
<s:debug/>
<s:if test="sheng.equals('-1')">
  没有选择省
</s:if>
<s:else>
  <s:iterator value="res">
    <s:property value="region_name"/><br>
  </s:iterator>
</s:else>
</body>
</html>