package boletin32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class MetodosDB {
    
     static Connection conexion;
    static PreparedStatement st;
    static ResultSet resulado;
    static String url="jdbc:sqlite:D:\\NetBeansProjects\\BasesDeDatos\\Comercio.db";
    
     public static void connect(){
        try{
            conexion=DriverManager.getConnection(url);
            if(conexion!=null){
                System.out.println("conectado");
            }
        }catch(SQLException ex){
            System.out.println("Error al conectarse a la base.");
        }
    }

    public static void close(){
        try{
            conexion.close();
        }catch(SQLException ex){
            System.out.println("Error al cerrar la base");
        }
    }
    public static void createTablePrecio(){
        // SQL statement for creating a new table
        String sql="CREATE TABLE IF NOT EXISTS Precio (\n"
                +"	ref integer PRIMARY KEY,\n"
                +"	precio float NOT NULL \n"
                +");";

        try(Connection conn=DriverManager.getConnection(url);
                Statement stmt=conn.createStatement()){
            // create a new table
            stmt.execute(sql);
            System.out.println("Tabla Creada");
        }catch(SQLException e){
            System.out.println("Fallo en la creacion de la tabla");
            System.out.println(e.getMessage());
        }
    }
    public static void createTableProducto(){
        // SQL statement for creating a new table
        String sql="CREATE TABLE IF NOT EXISTS Producto (\n"
                +"	ref integer PRIMARY KEY,\n"
                +"      nombre string,\n"
                +"	precio string NOT NULL \n"
                +");";

        try(Connection conn=DriverManager.getConnection(url);
                Statement stmt=conn.createStatement()){
            // create a new table
            stmt.execute(sql);
            System.out.println("Tabla Creada");
        }catch(SQLException e){
            System.out.println("Fallo en la creacion de la tabla");
            System.out.println(e.getMessage());
        }
    }
    public static void createTableVentas(){
        // SQL statement for creating a new table
        String sql="CREATE TABLE IF NOT EXISTS Ventas (\n"
                +"	nventa integer PRIMARY KEY,\n"
                +"      nombre string,\n"
                +"	precio float NOT NULL \n"
                +");";

        try(Connection conn=DriverManager.getConnection(url);
                Statement stmt=conn.createStatement()){
            // create a new table
            stmt.execute(sql);
            System.out.println("Tabla Creada");
        }catch(SQLException e){
            System.out.println("Fallo en la creacion de la tabla");
            System.out.println(e.getMessage());
        }
    }
    public static void anadirPrecio(Precio[] precio){
        connect();

        try{
            for(int i=0; i<precio.length; i++){
                st=conexion.prepareStatement("insert into Precio values('"+precio[i].getReferenciaPrecio()+"'"
                        +","+"'"+precio[i].getPrecio()+"'"+");");
                st.execute();
            }
        }catch(SQLException ex){
            System.out.println("Error: "+ex.getMessage());
        }

        close();
    }

    public static void anadirProducto(Producto[] prod){
        connect();

        try{
            for(int i=0; i<prod.length; i++){
                st=conexion.prepareStatement("insert into Producto values('"+prod[i].getReferenciaProducto()+"'"
                        +","+"'"+prod[i].getNombreProducto()+"'"+","+"'"+prod[i].getReferenciaPrecio()+"'"+");");
                st.execute();
            }
        }catch(SQLException ex){
            System.out.println("Error: "+ex.getMessage());
        }

        close();
    }

    public static void anadirVentas(Precio[] ven){
        connect();

        try{
            for(int i=0; i<ven.length; i++){
                st=conexion.prepareStatement("insert into Ventas values('"+ven[i].getReferenciaPrecio()+"'"
                        +","+"'"+ven[i].getReferenciaPrecio()+"'"+","+"'"+ven[i].getReferenciaPrecio()+"'"+");");
                st.execute();
            }
        }catch(SQLException ex){
            System.out.println("Error: "+ex.getMessage());
        }

        close();
    }

    public static void anadirTicket(Ticket[] array_ticket){
        connect();
        try{
            for(int i=0;i<array_ticket.length;i++){
            st=conexion.prepareStatement("insert into Ticket values('"+array_ticket[i].getNumeroVenta()+"'"
                    +","+"'"+array_ticket[i].getNombre()+"'"
                    +","+"'"+array_ticket[i].getPrecioTotal()+"'"+");");
            st.execute();
            }
        }catch(SQLException ex){
            System.out.println("Error:"+ex.getMessage());
        }
        close();
    }

}
