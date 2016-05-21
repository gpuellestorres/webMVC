package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermo
 */
public class libro {
    public int libroID;
    public String titulo;
    public String autor;
    public int año;
    public String editorial;
    public int ID;
    
    public static ArrayList<libro> todos()
    {
        ArrayList<libro> retorno = new ArrayList<libro>();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://l6075v0r5s.database.windows.net:1433;database=Libros;user=pdBD@l6075v0r5s;password=Puntodesa2015*;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;useUnicode=true;characterEncoding=UTF-8";
            Connection con = DriverManager.getConnection(connectionUrl);
            String SQL;
            SQL = "SELECT * from mis_libros";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                libro nuevo = new libro();
                
                 nuevo.titulo = rs.getString(1);
                 nuevo.autor = rs.getString(2);
                 nuevo.año = rs.getInt(3);
                 nuevo.editorial = rs.getString(4);
                 nuevo.ID = rs.getInt(5);
                 
                 retorno.add(nuevo);
            }
        }catch(ClassNotFoundException | SQLException e){
            libro nuevo = new libro();
            nuevo.titulo = e.toString();
            retorno.add(nuevo);
        }
        
        return retorno;
    }
    
    public static void agregar(libro nuevo) throws SQLException, ClassNotFoundException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://l6075v0r5s.database.windows.net:1433;database=Libros;user=pdBD@l6075v0r5s;password=Puntodesa2015*;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;useUnicode=true;characterEncoding=UTF-8";
        Connection con = DriverManager.getConnection(connectionUrl);
        String SQL = "INSERT INTO mis_libros(titulo, autor, anio, editorial) VALUES('"+nuevo.titulo
                +"','"+ nuevo.autor
                +"','"+ nuevo.año
                +"','"+ nuevo.editorial
                +"')";
        Statement stmt = con.createStatement();
        stmt.execute(SQL);
    }
    
    public static libro obtener(int id) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://l6075v0r5s.database.windows.net:1433;database=Libros;user=pdBD@l6075v0r5s;password=Puntodesa2015*;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;useUnicode=true;characterEncoding=UTF-8";
        Connection con = DriverManager.getConnection(connectionUrl);
        String SQL = "SELECT * FROM mis_libros WHERE ID='"+ id +"'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(SQL);

        libro nuevo = new libro();
        
        while (rs.next()) {
             nuevo.titulo = rs.getString(1);
             nuevo.autor = rs.getString(2);
             nuevo.año = rs.getInt(3);
             nuevo.editorial = rs.getString(4);
             nuevo.ID = rs.getInt(5);
        }
        
        return nuevo;
    }
    
    public static void editar(libro Libro) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://l6075v0r5s.database.windows.net:1433;database=Libros;user=pdBD@l6075v0r5s;password=Puntodesa2015*;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;useUnicode=true;characterEncoding=UTF-8";
        Connection con = DriverManager.getConnection(connectionUrl);
        String SQL = "UPDATE mis_libros SET titulo='"+Libro.titulo
                +"', autor='"+ Libro.autor
                +"', anio='"+ Libro.año
                +"', editorial='"+ Libro.editorial
                +"' WHERE ID='"+Libro.ID+"'";
        Statement stmt = con.createStatement();
        stmt.execute(SQL);
    }

    public static void eliminar(int id) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://l6075v0r5s.database.windows.net:1433;database=Libros;user=pdBD@l6075v0r5s;password=Puntodesa2015*;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;useUnicode=true;characterEncoding=UTF-8";
        Connection con = DriverManager.getConnection(connectionUrl);
        String SQL = "DELETE FROM mis_libros WHERE ID='"+id+"'";
        Statement stmt = con.createStatement();
        stmt.execute(SQL);
    }
}
