/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.21
 * Generated at: 2016-07-26 15:50:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends security.web.servlet.Jsp
    implements org.apache.jasper.runtime.JspSourceDependent {


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

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    java.lang.Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus(javax.servlet.http.HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("<head><title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.errorData.statusCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.print( request.getAttribute("javax.servlet.error.message") );
      out.write("</title></head>\n");
      out.write("<body bgcolor=\"white\">\n");
      out.write("&nbsp;<p>\n");
      out.write("<center><h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.errorData.statusCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(' ');
      out.print( request.getAttribute("javax.servlet.error.message") );
      out.write("</h1></center>\n");
      out.write("<hr><center>HAL 2000</center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<!-- a padding to disable MSIE and Chrome friendly error page -->\n");
      out.write("<!-- a padding to disable MSIE and Chrome friendly error page -->\n");
      out.write("<!-- a padding to disable MSIE and Chrome friendly error page -->\n");
      out.write("<!-- a padding to disable MSIE and Chrome friendly error page -->\n");
      out.write("<!-- a padding to disable MSIE and Chrome friendly error page -->\n");
      out.write("<!-- a padding to disable MSIE and Chrome friendly error page -->\n");

if (exception != null) { 
   displayException(exception, out);
}
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}