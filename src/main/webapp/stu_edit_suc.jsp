<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>stu edit</title>


</head>
<body leftmargin="30px" topmargin="30px">
<s:debug/>
<s:form id="updateForm" action="stu_update">
<s:hidden name="stu.id"/>
<s:textfield name="stu.username" label="username"/>
    <s:textfield name="stu.java" label="java"/>
    <s:textfield name="stu.os" label="os"/>
    <s:textfield name="stu.math" label="math"/>
<s:submit/>
</s:form>
</html>
