<%--
  Created by IntelliJ IDEA.
  User: LOVE
  Date: 2020/10/21
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<h2 align="center"><font color=red>用户登录页面</font></h2>
<form action="/" method="post">
    <table align="center" border="1">
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="userName" id="userName"></td>
        </tr>
        <tr>
            <td>密&nbsp;&nbsp;码:</td>
            <td><input type="text" name="password" id="password"></td>
        </tr>
        <tr>
            <td><input  type="" value="登录" name="login" id="text2"></td>
            <td><input type="reset" value="重置" name="reset"></td>
        </tr>
    </table>
    <p align="center"><a href="registered.jsp" color=blue>注册用户</a></p>
</form>
</body>

<script src="../js/jquery-3.5.1.js"></script>
<script>
    $("#text2").click(function(){
        $.ajax({
            url:"/login",    //请求的url地址
            dataType:"json",   //返回格式为json
            async:true,//请求是否异步，默认为异步，这也是ajax重要特性
            data:{"userName":$('#userName').val(),"password":$('#password').val()},    //参数值
            type:"post",   //请求方式
            beforeSend:function(){
                //请求前的处理
                alert(11111)
            },
            success:function(req){
                //请求成功时处理
                alert("成功")
            },
            complete:function(){
                //请求完成的处理
                alert(2222)
            },
            error:function(){
                //请求出错处理
                alert(3333)
            }
        });
    });


</script>
</html>
