<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>修改成绩</title>
		<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
		<script src="jquery-easyui-1.5.2/jquery.min.js" type="text/javascript">
</script>
		<script src="jquery-easyui-1.5.2/jquery.easyui.min.js"
			type="text/javascript">
</script>
		<link href="jquery-easyui-1.5.2/themes/icon.css" rel="stylesheet"
			type="text/css" />
		<link href="jquery-easyui-1.5.2/themes/default/easyui.css"
			rel="stylesheet" type="text/css" />
		<script src="jquery-easyui-1.5.2/custom/jquery.edatagrid.js">
</script>
		<script src="jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"
			type="text/javascript">
</script>

		<script type="text/javascript">
$(function(){
			$('#tt').edatagrid({
				url: 'json.action',
				saveUrl:'xgcj.action',
				updateUrl:'xgcj.action'
			});
		});
		
		
	</script>
	</head>
	<body>
		
		<h3>
			修改成绩
		</h3>
		
		<!-- url="json.action" -->
		<table id="tt" style="width: 800px; height: 210px"
			title="修改成绩"  singleSelect="true">
			<thead>
				<tr>
					<th field="xh" width="120" editor="text">
						学号
					</th>
					<th field="vxm" width="120" editor="text">
						姓名
					</th>
					<th field="kch" width="120" editor="text">
						课程号
					</th>
					<th field="vkcm" width="130" editor="text">
						课程名
					</th>
					<th field="xf" width="110" editor="text">
						学分
					</th>
					<th field="cj" width="110" editor="text">
						成绩
					</th>
				</tr>
			</thead>
		</table>
		<div style="margin-bottom: 10px;margin-left: 65%">
			<a href="#" onclick="javascript:$('#tt').edatagrid('saveRow')">提交</a>
		</div>
	</body>
</html>