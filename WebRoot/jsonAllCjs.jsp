<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>test</title>
  <link rel="stylesheet" href="css/classic.css" type="text/css"></link>
  </head>
  
  <body>
  
  <script src="js/jquery.min.js"></script>
<script src="js/jquery.columns.min.js">
</script>
  <br/>
  <br/>
  <div id="columns" style="width:800px;height:210px"></div>
  
  <script>
  $(document).ready(function() {
    
     $.ajax({

        url:'json.action',

        dataType: 'json', 

        success: function(json) { 

            $('#columns').columns({data:json});

        }

    }); 
    
  });
  
 
</script>
  	
  </body>
</html>