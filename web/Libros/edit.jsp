<%@page import="Model.libro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit</title>
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
            <div class="col-md-10 col-md-offset-1">
                <div class="page-header">
                <h3>Editar Libro</h3>
                </div>
            <form  action="/webMVC/editarLibro" method="post">
                <input type="text" class="form-control hidden" id="id" name="id" value="<%=Libro.ID%>" required>
                <div class="form-group">
                  <label class="control-label col-md-2">Título</label>
                  <div class="col-md-4">
                    <input type="text" class="form-control" id="titulo" name="titulo" value="<%=Libro.titulo%>" required>
                  </div>
                  <label class="control-label col-md-2">Autor</label>
                  <div class="col-md-4">
                    <input type="text" class="form-control" id="autor" name="autor" value="<%=Libro.autor%>" required>
                  </div>
                </div>
                <div class="clearfix"></div>
                <br>
                <div class="form-group">
                  <label class="control-label col-md-2">Año</label>
                  <div class="col-md-4">
                    <input type="text" class="form-control" id="anio" name="anio" value="<%=Libro.año%>" required>
                  </div>
                  <label class="control-label col-md-2">Editorial</label>
                  <div class="col-md-4">
                    <input type="text" class="form-control" id="editorial" name="editorial" value="<%=Libro.editorial%>" required">
                  </div>
                </div>
                <div class="clearfix"></div>
                <br>
                <div class="modal-footer">
                    <a href="index.jsp">Volver</a> | 
                    <button type="submit" class="btn btn-lg btn-primary">Guardar</button>
                </div>
          </form>
            </div>
            <div class="clearfix"></div>
        </div>
    </body>
</html>
