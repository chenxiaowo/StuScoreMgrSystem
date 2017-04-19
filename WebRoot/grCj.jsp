<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<html>
  <head>
   
  </head>
  
  <body>

<h2>信息</h2>

	
	<div style="margin-left: 10%">
		
		<table border="1">
	 <s:iterator value="#session.vgrcjs" id="cjb" status="status">
		<tr>
			
			<td><s:property value="#cjb.id.xh"/></td>
			<td><s:property value="#cjb.vxm"/></td>
			<td><s:property value="#cjb.id.kch"/></td>
			<td><s:property value="#cjb.vkcm"/></td>
			<td><s:property value="#cjb.cj"/></td>
			<td><s:property value="#cjb.xf"/></td>
			
			
		</tr>
		</s:iterator>
	</table>
		
		
	</div>
	
	

  </body>
</html>