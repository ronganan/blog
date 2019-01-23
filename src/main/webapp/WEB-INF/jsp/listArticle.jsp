<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div align="center">

</div>

<div style="width:500px;margin:20px auto;text-align: center">
    <table align='center' border='1' cellspacing='0'>
        <tr>
            <td>id</td>
            <td>title</td>
            <td>编辑</td>
            <td>删除</td>
        </tr>
        <c:forEach items="${page.list}" var="a" varStatus="st">
            <tr>
                <td>${a.id}</td>
                <td>${a.title}</td>
                <td><a href="editArticle?id=${a.id}">编辑</a></td>
                <td><a href="deleteArticle?id=${a.id}">删除</a></td>
            </tr>
        </c:forEach>

    </table>
    <br>
    <div>
                <a href="?start=1">[首  页]</a>
            <a href="?start=${page.pageNum-1}">[上一页]</a>
            <a href="?start=${page.pageNum+1}">[下一页]</a>
            <a href="?start=${page.pages}">[末  页]</a>
    </div>
    <br>
    <form action="addArticle" method="post">

    name: <input name="title"> <br>
    <button type="submit">提交</button>

    </form>
</div>