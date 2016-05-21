<%-- 
    Document   : Libros
    Created on : May 20, 2016, 8:27:05 PM
    Author     : Guillermo
--%>

<%@page import="Model.libro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html">
        <meta charset="UTF-8">
        <title>Mis Libros</title>
    </head>
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">    

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

    <% ArrayList<libro> Todos = libro.todos(); %>
    
    <body>
        <div class="container">
            <div class="page-header">
                <h2>Mis Libros</h2>
            </div>
            <a href="Create.jsp">Crear Nuevo</a>
            <br /> <br /> 
            <div class="table-responsive">
                <table class="table table-condensed table-striped table-bordered">
                    <thead>
                        <tr>
                            <th class="text-center">Título</th>
                            <th class="text-center">Autor</th>
                            <th class="col-md-3 text-center"></th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for(int i=0;i<Todos.size();i++)
                        {
                            %>
                            <tr>
                                <td class="text-center"><%=Todos.get(i).titulo %></td>
                                <td class="text-center"><%=Todos.get(i).autor %></td>
                                <td class="text-center">
                                    <a href="edit.jsp?id=<%=Todos.get(i).ID%>" >Editar</a> |
                                    <a href="details.jsp?id=<%=Todos.get(i).ID%>" >Detalles</a> |
                                    <a href="delete.jsp?id=<%=Todos.get(i).ID%>" >Eliminar</a>
                                </td>
                            </tr>
                        <%} %>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
