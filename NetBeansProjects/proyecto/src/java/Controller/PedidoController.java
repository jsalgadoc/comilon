/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
//STEP 1. Import required packages
import java.sql.*;
import Model.Conexion;
import Model.Pedido;
public class PedidoController {
   public String obtenerPedidos(){
        Conexion con = new Conexion();
        Connection rescon = con.Conectar(); 
        String tipoPedido = "";
        try {
            Statement st;
            ResultSet rs = null;
            //String sql = "exec LISTARPEDIDO;";
            CallableStatement cStmt = rescon.prepareCall("{call LISTARPEDIDO(?, ?, ?, ?, ?, ?, ?, ?)}");
           
            cStmt.registerOutParameter(1, java.sql.Types.NUMERIC);
            cStmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            cStmt.registerOutParameter(3, java.sql.Types.DATE);
            cStmt.registerOutParameter(4, java.sql.Types.NUMERIC);
            cStmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            cStmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            cStmt.registerOutParameter(7, java.sql.Types.VARCHAR);
            cStmt.registerOutParameter(8, java.sql.Types.CLOB);
            
            cStmt.executeUpdate(); 
            int id = cStmt.getInt(1);
            tipoPedido = cStmt.getNString(2);
            System.err.println(tipoPedido);
            //rs=rescon.createStatement().executeQuery(sql);
            
            //Pedido pedido = new Pedido();
            

        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            con=null;
        }
        
        return tipoPedido;
   }
   
}
