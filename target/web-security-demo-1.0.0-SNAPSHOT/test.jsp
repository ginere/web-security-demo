<%@page  extends="security.web.servlet.Jsp" 
import="security.demo.ligne.*" %>

<%
   Ligne ligne=Ligne.get();
   if (ligne != null) {
%>

Code: <%=html(ligne.code) %></p>
name: <%=html(ligne.name) %></p>
description: <%=html(ligne.description) %></p>
date: <%=date(ligne.date) %></p>
number: <%=html(ligne.number) %></p>
percent: <%=html(ligne.percent) %>%</p>
<% } else { %>
Empty ligne
<% } %>


<form action="/web-security-demo/s/ModifyLigne">

name:<textarea name="name"></textarea></p>
code:<textarea name="code"></textarea></p>
description:<textarea name="description"></textarea></p>
date:<textarea name="date"></textarea></p>
number:<textarea name="number"></textarea></p>
double:<textarea name="percent"></textarea></p>

<input type="submit" name="OK" value="Sumit">
</form>
