<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>login</title>
    <s:head/>
</head>
<body leftmargin="30px" topmargin="30px">
<s:debug/>
<s:form name="validationDemo" action="validation">
    <s:textfield name="test_int" label="test_int([5,20]?)"/>
    <s:textfield name="test_requiredstring" label="test_requiredstring"/>
    <s:textfield name="test_stringlength" label="test_stringlength(>=3，123.*456)"/>
    <s:textfield name="test_email" label="test_email" type="email"/>
    <s:textfield name="stu.username" label="stu.username"/>
    <s:submit/>
</s:form>
</body>

</html>

