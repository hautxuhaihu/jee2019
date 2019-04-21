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
<s:url var="findByTermUrl" action="findByTerm"/>
<s:form id="form1" name="form1" action="echo" method="post">
  <sj:autocompleter id="region" href="%{findByTermUrl}" list="res" listKey="region_code"
                    listValue="region_name"></sj:autocompleter>
  <sj:submit/>
</s:form>
</body>
</html>