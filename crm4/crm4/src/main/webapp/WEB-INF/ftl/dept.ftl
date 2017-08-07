<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
	</head>
	<body>
		<h1>部门信息</h1>
		<hr>
		<table>
			<tr>
				<th>编号</th>
				<th>名称</th>
				<th>所在地</th>
				<th>操作</th>
			</tr>
			<#list deptList as dept>
			<tr>
				<td>${dept.no}</td>
				<td>${dept.name}</td>
				<td>${dept.location}</td>
				<td>
					<a href="del?no=${dept.no}">删除</a>
				</td>
			</tr>
			</#list>
		</table>
		<a href="to_add">新增部门</a>
	</body>
</html>