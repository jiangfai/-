<%@ page pageEncoding="utf-8"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<style>
			form label { display: inline-block; width: 100px; }
		</style>
	</head>
	<body>
		<h1>新增部门</h1>
		<hr>
		<p style="color:red;">${hint}</p>
		<form action="add" method="post">
			<div>
				<label for="no">部门编号: </label>
				<input id="no" type="number" name="no" required placeholder="请输入部门编号"> 
			</div>
			<div>
				<label for="name">部门名称: </label>
				<input id="name" type="text" name="name" required placeholder="请输入部门名称"> 
			</div>
			<div>
				<label for="location">部门所在地: </label>
				<input id="location" type="text" name="location"  required placeholder="请输入部门所在地"> 
			</div>
			<div>
				<input type="submit" value="确定">
			</div>
		</form>
		<a href="index">返回部门列表</a>
	</body>
</html>