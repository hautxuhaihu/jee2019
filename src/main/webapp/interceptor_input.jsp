<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>login</title>
  <s:head/>
</head>
<body leftmargin="30px" topmargin="30px">
myActionNoParams:
<s:form name="interceptroDemo" action="myActionNoParams">
  <s:textfield name="name"/>
  <s:submit/>
</s:form>
myActionWithParams
<s:form name="interceptroDemo2" action="myActionWithParams">
  <s:textfield name="name"/>
  <s:submit/>
</s:form>

</html>
