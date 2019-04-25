<%--
  Created by IntelliJ IDEA.
  User: RainbowPerferct
  Date: 2019/3/2
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Item的页面</title>
</head>
<body>
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
</br>

<h3>测试数组</h3>
<form action="/item/delete.shtml" method="post">
    <table>
        <tr>
            <td>选择</td>
            <td>编号</td>
            <td>标题</td>
            <td>分类</td>
        </tr>
        <tr>
            <td>
                <input type="checkbox" value="1" name="ids" />
            </td>
            <td>1</td>
            <td>戴尔笔记本</td>
            <td>办公用品</td>
        </tr><tr>
        <td>
            <input type="checkbox" value="2" name="ids" />
        </td>
        <td>2</td>
        <td>华为手机</td>
        <td>通信</td>
    </tr><tr>
        <td>
            <input type="checkbox" value="3" name="ids" />
        </td>
        <td>3</td>
        <td>格力空调</td>
        <td>家用电器</td>
    </tr><tr>
        <td>
            <input type="checkbox" value="4" name="ids" />
        </td>
        <td>4</td>
        <td>海尔冰箱</td>
        <td>家用电器</td>
    </tr>
    </table>
    <button type="submit">删除选中商品</button>
</form>

<h3>List数据</h3>
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

    <div>
        1号店铺编号:<input type="text" name="shops[0].snum" /><br>
        1号店铺名称:<input type="text" name="shops[0].shopname" /><br>
    </div>
    <div>
        2号店铺编号:<input type="text" name="shops[1].snum" /><br>
        2号店铺名称:<input type="text" name="shops[1].shopname" /><br>
    </div>
    <div>
        3号店铺编号:<input type="text" name="shops[2].snum" /><br>
        3号店铺名称:<input type="text" name="shops[2].shopname" /><br>
    </div>

    <button type="submit">保存</button>
</form>

<h3>这是Model</h3>
<table>
    <tr>
        <td>选择</td>
        <td>编号</td>
        <td>标题</td>
        <td>价格</td>
    </tr>
    <c:forEach items="${items}" var="item">
        <tr>
            <td>
                <input type="checkbox" value="${item.id}" name="ids" />
            </td>
            <td>${item.id}</td>
            <td>${item.title}</td>
            <td>${item.price}</td>
        </tr>
    </c:forEach>
</table>



</html>
