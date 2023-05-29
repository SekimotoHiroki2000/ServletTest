<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>送信完了</h1
<p>下記の内容でお問い合わせが完了しました。</p>
氏名：<%= request.getParameter("name") %><br><br>
会社名：<%= request.getParameter("campany") %><br><br>
メールアドレス：<%= request.getParameter("mail") %><br><br>
問い合わせ内容：<br><%= request.getParameter("inquiry") %><br><br>
ご希望のメルマガ：<%= request.getAttribute("merumaga") %><br><br>
資料請求：希望しない

</body>
</html>