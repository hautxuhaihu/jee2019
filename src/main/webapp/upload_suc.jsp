<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>login</title>
    <%
        String basePath=request.getScheme()+":"+request.getServerName()+":"+request.getServerPort()+"/"+request.getContextPath();
    %>
</head>
<body leftmargin="30px" topmargin="30px">
<s:debug/></body>
<a href="down.txt">href下载</a>
<a href="xml">从类路径下载xml</a>
<a href="txt">从网站下载txt</a>
<s:url var="downUrl" action="fileDown">
    <s:param name="uploadPath" value="uploadPath"/>
    <s:param name="uploadFileName" value="uploadFileName"/>
</s:url>
<a href="${downUrl}">下载上传的文件</a>
</html>
