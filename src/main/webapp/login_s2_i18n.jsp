<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>login</title>
  <s:head/>
</head>
<body leftmargin="30px" topmargin="30px">
i18n
<s:form name="loginTag" action="checkLoginByI18N">
  <s:textfield name="username" label="username" requiredLabel="true"/>
  <s:password name="pass" label="pass"/>
  <s:textfield name="age" label="age"/>
  <s:radio name="type" list="{'forward','redirect'}" value="'forward'"/>
  <s:submit/>
</s:form>
</body>
</html>
