
package Acciones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Connection.Conecction;
import java.awt.HeadlessException;
import java.sql.SQLException;

/**
 *
 * @author telmex
 */
public class eliminar {
    
     private final Conecction c = new Conecction();
    
    Statement st; //Para uso de sentencia Sql
    Connection conexion;
    
    public void eliminarClientes(int ID_cliente)
    {
        try{
            st=conexion.createStatement();
            String sql= "Delete from cliente where id_cliente = '"+ID_cliente+"' ";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Eliminacion fallida");
        }
    }
    
     public void eliminarproveedor(int idp)
    {
          try {
            Connection conexiion = c.conectar();
            st=conexiion.createStatement();
            String sql= "DELETE FROM proveedor WHERE id_proveedor ="+idp+";";
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
            //mensajes de eliminacion
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }
    
