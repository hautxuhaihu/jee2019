<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>login</title>
</head>
<body leftmargin="30px" topmargin="30px">
<s:form name="upload" action="upload" method="post" enctype="multipart/form-data">
    <s:file name="upload" label="upload"/>
    <s:submit/>
</s:form>
</body>
</html>
