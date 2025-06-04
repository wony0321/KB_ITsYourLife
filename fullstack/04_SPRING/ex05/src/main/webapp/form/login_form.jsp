<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
  <meta charset="UTF-8">
</head>
<body>
<form action="/login" method="post">
  <fieldset>
    <legend>로그인 폼</legend>
    <ul>
      <li>아이디 <input type="text" name="userid"></li>
      <li>비밀번호 <input type="password" name="passwd"></li>
      <li><input type="submit" value="전송"></li>
    </ul>
  </fieldset>
</form>
</body>
</html>
