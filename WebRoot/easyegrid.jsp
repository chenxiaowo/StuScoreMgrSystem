<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>jQuery EasyUI</title>
	<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
  	<script src="jquery-easyui-1.5.2/jquery.min.js" type="text/javascript"></script>
  	<script src="jquery-easyui-1.5.2/jquery.easyui.min.js" type="text/javascript"></script>
  	<link href="jquery-easyui-1.5.2/themes/icon.css" rel="stylesheet" type="text/css" />
  	<link href="jquery-easyui-1.5.2/themes/default/easyui.css" rel="stylesheet" type="text/css" />
  	 <script src="jquery-easyui-1.5.2/custom/jquery.edatagrid.js"></script>
  	<script src="jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
 	
	<script type="text/javascript">
		$(function(){
			$('#tt').edatagrid({
			});
		});
	</script>
</head>
<body>
	<h1>Editable DataGrid</h1>
	<div style="margin-bottom:10px">
		<a href="#" onclick="javascript:$('#tt').edatagrid('addRow')">AddRow</a>
		<a href="#" onclick="javascript:$('#tt').edatagrid('saveRow')">SaveRow</a>
		<a href="#" onclick="javascript:$('#tt').edatagrid('cancelRow')">CancelRow</a>
		<a href="#" onclick="javascript:$('#tt').edatagrid('destroyRow')">destroyRow</a>
	</div>
	<table id="tt" style="width:600px;height:200px"
			title="Editable DataGrid"
			url="datagrid_data.json"
			singleSelect="true">
		<thead>
			<tr>
				<th field="itemid" width="100" editor="{type:'validatebox',options:{required:true}}">Item ID</th>
				<th field="productid" width="100" editor="text">Product ID</th>
				<th field="listprice" width="100" align="right" editor="{type:'numberbox',options:{precision:1}}">List Price</th>
				<th field="unitcost" width="100" align="right" editor="numberbox">Unit Cost</th>
				<th field="attr1" width="150" editor="text">Attribute</th>
			</tr>
		</thead>
	</table>
</body>
</html>