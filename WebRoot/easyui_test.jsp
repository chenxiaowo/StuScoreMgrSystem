<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <meta http-equiv="content-type" content="text/html;charset=UTF-8" />
  	<script src="jquery-easyui-1.5.2/jquery.min.js" type="text/javascript"></script>
  	<script src="jquery-easyui-1.5.2/jquery.easyui.min.js" type="text/javascript"></script>
 	<link href="jquery-easyui-1.5.2/themes/default/easyui.css" rel="stylesheet" type="text/css" />
  	<link href="jquery-easyui-1.5.2/themes/icon.css" rel="stylesheet" type="text/css" />
  	<script src="jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>
 
 	 <script>
  $(document).ready(function() {
    alert('hh');
      fLoadTable();
      show();
    
  });
  function show()
  {
  		$.ajax({

        url:'json.action',

        dataType: 'json', 

        success: function(data) { 

            $('#dg').datagrid('loadData',data)

        },
        error:function(xhr){
        	alert(xhr,status);
        }

    });
  }
  
  function fLoadTable(){
        $('#dg').datagrid({
             title: '用户列表',
            width: 700,
            height: 300,
           fitColumns: true,

//对应json数据中的每一列
           columns : [ [ { 
                 field : 'xh', //每一列的名字
                 width : '100', 
                 title:'xh',
                checkbox:true 
             },{ 
               field : 'vxm', 
               title : '姓名', 
               width : '100', 
               align : 'center' 
            }, { 
               field : 'kch', 
               title : '课程号', 
               width : '100', 
              align : 'center', 
           },{ 
               field : 'vkcm', 
               title : '课程名', 
               width : '100', 
               align : 'center', 
          },{ 
              field : 'xf', 
              title : '学分', 
              width : '100', 
              align : 'center', 
           },
           { 
              field : 'cj', 
              title : '成绩', 
              width : '100', 
              align : 'center', 
           }
        ] ],
     idField:'xh', 
     loadMsg:'Processing, please wait …', 
     pagination:true 
});
}
 
</script>
 
  </head>
  
  <body>
  	
  	<table id="dg" data-options="rownumbers:false,autoRowheight:false,pagination:true">
  		
  	</table>
   
  </body>  
</html>