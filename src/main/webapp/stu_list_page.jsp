<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>stu</title>
</head>
<body leftmargin="30px" topmargin="30px">
<table>
  <tr>
    <td>id
    <td>username
    <td>java
    <td>os
    <td>math
      <s:iterator value="res.list" var="stu">
  <tr>
    <td><s:property value="#stu.id"/>
    <td><s:property value="#stu.username"/>
    <td><s:property value="#stu.java"/>
    <td><s:property value="#stu.os"/>
    <td><s:property value="#stu.math"/>
  </s:iterator>
</table>
<s:iterator value="res.navigatepageNums" var="row">
  <s:if test="res.pageNum==#row">
    <s:property value="#row"/>
  </s:if>
  <s:else>
    <a href="${pageContext.request.contextPath}/stu_list_page?pageNum=<s:property value='#row'/>">
      <s:property value="#row"/>
    </a>
  </s:else>
</s:iterator>
</body>
</html>