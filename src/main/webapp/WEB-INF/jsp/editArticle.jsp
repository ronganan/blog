<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>

<div style="margin:0px auto; width:500px">

<form action="updateArticle" method="post">

title: <input name="title" value="${a.title}"> <br>

<input name="id" type="hidden" value="${a.id}">
<button type="submit">提交</button>

</form>
</div>