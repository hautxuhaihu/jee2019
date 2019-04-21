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
<s:url var="privateUrl" action="private" namespace="/sec"/>
<a href="${privateUrl}">没有登录不能访问</a>
<br>
<hr width="30%" align="left" style="border:1px solid red"/>
<h3>异常处理</h3>
<a href="exDemo">ex demo</a>
<hr width="30%" align="left" style="border:1px solid red"/>
<h3>xml中进行校验</h3>
<a href="validation_input.jsp">xml校验</a>
<hr width="30%" align="left" style="border:1px solid red"/>
<h3>上传下载</h3>
<a href="upload.jsp">upload</a>
<hr width="30%" align="left" style="border:1px solid red"/>
<h3>jdbc</h3>
<s:url var="listUrl" action="stu_list"/>
<a href="${listUrl}">stu list</a>
<s:url var="listByPageUrl" action="stu_list_page"/>
<a href="${listByPageUrl}">stu list by page</a>
<hr width="30%" align="left" style="border:1px solid red"/>
<h3>ajax</h3>
<s:url var="jsonDemoUrl" action="jsonDemo"/>
<a href="${jsonDemoUrl}">jsonDmeo</a><br>
<a href="jquery/ajax_a.jsp">sj:a</a><br>
<a href="jquery/ajax_login.jsp">sj:a submit</a><br>
<a href="jquery/ajax_div.jsp">sj:div 异步加载内容</a><br>
<a href="jquery/ajax_submit.jsp">sj:div 异步提交</a><br>
<a href="jquery/ajax_dialog.jsp">sj:dialog 显示对话框（本地或远程、自动打开或监听事件打开）</a><br>
<a href="jquery/ajax_autocompleter.jsp">sj:autocompleter 自动完成</a><br>
</html>
