<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>check</title>
</head>
<body>
<%
    String username=request.getParameter("username");
    String pass=request.getParameter("pass");
    if(username.equalsIgnoreCase("admin")){
        request.getRequestDispatcher("login_suc.jsp").forward(request,response);
    }else
        response.sendRedirect("login_fail.jsp");


%>
</body>
</html>
