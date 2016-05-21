<%-- 
    Document   : index
    Created on : May 20, 2016, 9:00:09 PM
    Author     : Guillermo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            // New location to be redirected
            String site = new String("Libros");
            response.setStatus(response.SC_MOVED_TEMPORARILY);
            response.setHeader("Location", site); 
         %>
    </body>
</html>
