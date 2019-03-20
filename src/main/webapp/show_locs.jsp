<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>login</title>
</head>
<body leftmargin="30px" topmargin="30px">
Locale[] <s:select list="locs"/>
    <br>
Map:<s:select list="locsMap" listValue="value" listKey="key"/>
</body>
</html>
