<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>访问成功</title>
</head>
<body>
It's running page !

<form action="/item/add.shtml" method="post">
    <div>
        商品标题:<input type="text" name="title" />
    </div>
    <div>
        商品价格:<input type="text" name="price" />
    </div>
    <div>
        分类编号:<input type="text" name="itemCat.id" />
    </div>
    <div>
        分类名字:<input type="text" name="itemCat.name" />
    </div>

    <button type="submit">保存</button>
</form>

</body>
</html>
