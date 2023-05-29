<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>お問い合わせフォーム</h1>
<form action="contact" method="post">
<p>氏名</p>
<input type="text" name="name" required="required">
<p>会社</p>
<input type="text" name="campany">
<p>メールアドレス</p>
<input type="text" name="mail" required="required">
<p>お問い合わせ内容</p>
<textarea name="inquiry" cols="30" rows="5" required="required"></textarea>
<p>メルマガ種類</p>
<p><input type="checkbox" name="merumaga" value="総合案内">総合案内</p>
<p><input type="checkbox" name="merumaga" value="セミナー案内">セミナー案内</p>
<p><input type="checkbox" name="merumaga" value="求人採用情報">求人採用情報</p>
<p>資料請求希望</p>
<input type="radio" name="siryou" value="yes">Yes
<input type="radio" name="siryou" value="no">No

<p><input type="submit" value="確定"></p>

</form>
</body>
</html>