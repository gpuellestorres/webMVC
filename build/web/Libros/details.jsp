<%@page import="Model.libro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Details</title>
    </head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">    

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
    <%
        libro Libro = libro.obtener(Integer.parseInt(request.getParameter("id")));
    
    %>
    
    <body>
        <div class="container">
            <div class="col-md-4 col-md-offset-1">
                <div class="page-header">
                <h3>Detalles de Libro</h3>
                </div>
            Título: <%=Libro.titulo%>
            <br />
            Autor: <%=Libro.autor%>
            <br />
            Año: <%=Libro.año%>
            <br />
            Editorial: <%=Libro.editorial%>
            <div class="modal-footer">
                <a href="index.jsp">Volver</a>
            </div>
        </div>
    </body>
</html>
