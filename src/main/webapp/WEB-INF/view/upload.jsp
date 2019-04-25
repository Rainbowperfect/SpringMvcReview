<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="/upload/file.shtml" method="post" enctype="multipart/form-data">

        <input type="file" name="image">
        <button>提交</button>
    </form>
    <img alt="" src="">
</body>
</html>
