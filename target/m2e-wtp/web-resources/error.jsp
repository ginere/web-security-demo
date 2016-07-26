<%@page extends="security.web.servlet.Jsp" 
   isErrorPage="true" 
%><%!
private static final void displayException(Throwable e, javax.servlet.jsp.JspWriter out) throws java.io.IOException {
	if (e == null) {
		return;
	}
	displayException(org.apache.commons.lang.exception.ExceptionUtils.getCause(e), out);	
	
	out.println("<tr><td>&nbsp;</td></tr>"); // empty line between error boxes
	out.println("<tr>"); 
	out.println("<td class=\"tableBorder\">");
	out.println("<TABLE width=\"100%\" cellpadding=\"2\" cellspacing=\"1\" align=\"center\">");
	out.println("<TBODY>");
	out.println("<TR class=\"TableLine1\">");
	out.println("<TD width=\"10%\" class=\"FormLabel\"><b>Message</b></TD>");
	out.println("<TD width=\"90%\" class=\"FormInput\"><pre>" + html(e.getMessage()) + "</pre></TD>");
	out.println("</TR>");
	out.println("<TR class=\"TableLine1\">");
	out.println("<TD width=\"10%\" class=\"FormLabel\"><b>Type</b></TD>");
	out.println("<TD width=\"90%\" class=\"FormInput\">" + e.getClass().getName() + "</TD>");
	out.println("</TR>");
	out.println("<TR class=\"TableLine1\">");
	out.println("<TD width=\"10%\" nowrap class=\"FormLabel\"><b>Stack trace</b></TD>");
	out.println("<TD width=\"90%\" class=\"FormInput\"><pre>" + html(org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(e)) + "</pre></TD>");
	out.println("</TR>");
	out.println("</TBODY>");
	out.println("</TABLE>");
	out.println("</td>");
	out.println("</tr>");
	
}
%><html>
<head><title>${pageContext.errorData.statusCode} <%= request.getAttribute("javax.servlet.error.message") %></title></head>
<body bgcolor="white">
&nbsp;<p>
<center><h1>${pageContext.errorData.statusCode} <%= request.getAttribute("javax.servlet.error.message") %></h1></center>
<hr><center>HAL 2000</center>
</body>
</html>
<!-- a padding to disable MSIE and Chrome friendly error page -->
<!-- a padding to disable MSIE and Chrome friendly error page -->
<!-- a padding to disable MSIE and Chrome friendly error page -->
<!-- a padding to disable MSIE and Chrome friendly error page -->
<!-- a padding to disable MSIE and Chrome friendly error page -->
<!-- a padding to disable MSIE and Chrome friendly error page -->
<%
if (exception != null) { 
   displayException(exception, out);
}%>
