<%--
  Created by IntelliJ IDEA.
  User: sunyun
  Date: 2020/8/5
  Time: 8:04 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1 align="center">学生注册</h1>
    <form action="reg" method="post">
        <table border="0" align="center">
            <tr>
                <td>id</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td><input type="submit" value="注册学生"></td>
                <td colspan="2"><input type="reset" value="重置"></td>
            </tr>

        </table>
    </form>
</body>
</html>
