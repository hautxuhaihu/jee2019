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
    <td>action
      <s:iterator value="stus" var="stu">
  <tr>
    <td><s:property value="#stu.id"/>
    <td><s:property value="#stu.username"/>
    <td><s:property value="#stu.java"/>
    <td><s:property value="#stu.os"/>
    <td><s:property value="#stu.math"/>
    <td>
  <s:url var="editUrl" action="stu_edit">
    <s:param name="id" value="#stu.id"/>
  </s:url>
      <a href="${editUrl}">edit</a>
      <s:url var="delUrl" action="stu_del">
        <s:param name="id" value="#stu.id"/>
      </s:url>
      <a href="${delUrl}" onclick="return toDel(<s:property value='#stu.id'/>);">del</a>
      </s:iterator>
      <script>
          function toDel(id) {
              return confirm("是否真的删除学号为" + id + "的信息?");
          }
      </script>
</body>
</html>