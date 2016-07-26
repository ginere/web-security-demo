<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%
   Date date=new Date();

   String format="dd/MM/yyyy HH:mm:ss ZZZZ";
   SimpleDateFormat sdf=new SimpleDateFormat(format);

   String dateString=sdf.format(date);

%>
<html>
<header>
	<link rel="stylesheet" href="http://localhost/appCore/touch/resources/css/apple.css" type="text/css">
	<script type="text/javascript" src="http://localhost/appCore/touch/sencha-touch-debug.js"></script>	



<script type="text/javascript">
	
new Ext.Application({
        launch: function() {
            new Ext.Panel({
                fullscreen: true,
                html: 'Hello World!'
            });
			//			var stringData = "{date: 'Friday 03rd of August 2007 02:47:09 PM'}";
			//var stringData = "{date: '<%= dateString %>'}";
			// var stringData = "{ date : '07/10/2011 10:28:40 GMT+0200'}";


			try {

				

				var date = Date.parseDate("<%= dateString %>", "d/m/Y H:i:s O");
				alert('Decode of stringData OK jsonData.date = ' + date.format("H:i:s"));


				date = Date.parseDate("07/10/2011 11:03:01 +0300", "d/m/Y H:i:s O");
				alert('Decode of stringData OK jsonData.date = ' + date.format("H:i:s"));

				date = Date.parseDate("07/10/2011 11:03:01 +0400", "d/m/Y H:i:s O");
				alert('Decode of stringData OK jsonData.date = ' + date.format("H:i:s"));



			} catch (err) {
				alert('Could not decode ' + stringData +' err:'+err);
			}
        }
    });	   


</script>

</header>
	<body>
	   Date Format: <%= dateString %>
	</body>
<html>
