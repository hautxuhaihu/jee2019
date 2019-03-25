<%--
  Created by IntelliJ IDEA.
  User: ljc
  Date: 2019/2/24
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>wel,struts2</title>
</head>
<body leftmargin="30px" topmargin="30px">
<s:debug/>
Struts2+Spring(Spring Boot)+MyBatis+Redis+JQuery
<hr width="30%" align="left" style="border:1px solid green"/>
<h3>入门</h3>
<a href="login.jsp">login</a>
<a href="login_s2.jsp">struts2实现的login(标签、校验、数据库)</a>
<a href="login_s2_obj.jsp">用Stu接收值</a>
<br>
<a href="login_s2_i18n.jsp">login i18n</a>
<br>
<s:url var="showLocsUrl" action="showLocs"/>
<a href="${showLocsUrl}">显示所有语言地区</a>
<hr width="30%" align="left" style="border:1px solid purple"/>
<h3>命名空间互相访问</h3>
<s:url var="root2Default" action="default" namespace="/"/>
<a href="${root2Default}">/访问默认</a>
<s:url var="root2Cnhn" action="sub" namespace="/"/>
<a href="${root2Cnhn}">/访问/cn/hn</a>
<br>
<s:url var="cnhn2Default" action="default" namespace="/cn/hn"/>
<a href="${cnhn2Default}">/cn/hn访问默认</a>
<s:url var="cnhn2Root" action="root" namespace="/cn/hn"/>
<a href="${cnhn2Root}">/cn/hn访问/</a>
<hr width="30%" align="left" style="border:1px solid red"/>
<h3>拦截器</h3>
<a href="myAction">设置日期</a>
<a href="interceptor_input.jsp">通过文本框为赋值</a>

</body>
</html>
