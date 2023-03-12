<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.gasystem.practice.member.model.vo.Member"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

	Member loginUser = (Member)session.getAttribute("loginUser");
	String alertMsg = (String)session.getAttribute("alertMsg");

%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>

        div{
            box-sizing: border-box;
            /* border: 1px solid black; */
        }
        
        #loginBox {
			background-color: lightgray;
			border-radius: 30px;
			width: 300px;
			height: 200px;
			margin: auto;
        }

		.loginTable {
			margin-left: auto;
			margin-right: auto;
			margin-top: auto;
			margin-bottom: auto;
			width: 300px;
			height: 200px;
		}

    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
    
    <div id="loginBox">

		<% if(loginUser == null) { %>
	        <form action="login.me" method="post">
	
				<table class="loginTable">
	                <tr>
	                    <th>아이디: </th>
	                    <td><input type="text" name="memberId" required></td>
	                </tr>
	                <tr>
	                    <th>비밀번호: </th>
	                    <td><input type="password" name="memberPwd" required></td>
	                </tr>
	                <tr>
	                    <th align="center"><button type="submit">로그인</button></th>
	                    <td align="center"><button onclick="location.href='joinForm.me'">회원가입</button></td>
	                </tr>
	                <tr>
	                	<th colspan="2">
	                		<c:if test="${empty alertMsg}">
	                			<c:out value="" />
	                		</c:if>
	                		<c:if test="${not empty alertMsg}">
	                			<c:out value="${alertMsg }" />
	                		</c:if>
	                	</th>
	                </tr>
	            </table>
	
	
	        </form>
        <% } else { %>
        
        <div>
			<table class="loginTable">
        		<tr>
        			<th><p><%= alertMsg %></p></th>
        		</tr>
        		<tr>
        			<th><p><%= loginUser.getMemberName()%>님</p></th>
        		</tr>
        		<tr>
        			<th><button onclick="location.href='logout.me'">로그아웃</button></th>
        		</tr>
        	</table>
        </div>
        
        <% } %>

    </div>

</body>
</html>