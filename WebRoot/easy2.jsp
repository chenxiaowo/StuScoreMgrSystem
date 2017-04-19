<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="content-type" content="text/html;charset=UTF-8" />
  	<script src="jquery-easyui-1.5.2/jquery.min.js" type="text/javascript"></script>
  	<script src="jquery-easyui-1.5.2/jquery.easyui.min.js" type="text/javascript"></script>
  	<link href="jquery-easyui-1.5.2/themes/icon.css" rel="stylesheet" type="text/css" />
  	<link href="jquery-easyui-1.5.2/themes/default/easyui.css" rel="stylesheet" type="text/css" />
  	 <script src="jquery-easyui-1.5.2/custom/jquery.edatagrid.js"></script>
  	<script src="jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
 	 <script>
  $(document).ready(function() {
    alert('hh');
      fLoadTable();
      show();
    
  });
  function show()
  {
  		

    });
  }
  
  function fLoadTable(){
        $('#dg').edatagrid({
		url: 'json.action',
		saveUrl: '',
		updateUrl: '',
		destroyUrl: ''
});
}
 
</script>
 
  </head>
  
  <body>
  	
  	<table id="dg" title="My Users" style="width:550px;height:250px"
		toolbar="#toolbar" idField="xh"
		rownumbers="true" fitColumns="true" singleSelect="true">
	<thead>
		<tr>
			<th field="xh" width="50" editor="text">xh</th>
			<th field="vxm" width="50" editor="{type:'text'}">vxm</th>
			<th field="kch" width="50" editor="{type:'text'}">kch</th>
			<th field="vkcm" width="50" editor="{type:'text'}">vkcm</th>
			<th field="xf" width="50" editor="{type:'text'}">xf</th>
			<th field="cj" width="50" editor="{type:'text'}">cj</th>
		</tr>
	</thead>
</table>
<div id="toolbar">
	<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:$('#dg').edatagrid('addRow')">New</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="javascript:$('#dg').edatagrid('destroyRow')">Destroy</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:$('#dg').edatagrid('saveRow')">Save</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="javascript:$('#dg').edatagrid('cancelRow')">Cancel</a>
</div>
  		
  	</table>
   
  </body>  
</html>