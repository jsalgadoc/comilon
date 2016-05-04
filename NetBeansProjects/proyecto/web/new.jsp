<%-- 
    Document   : newjsp
    Created on : 03-may-2016, 20:29:38
    Author     : John
--%>
<%@page import="java.sql.Connection"%>
<%@page import="Controller.PedidoController"%>
<%@page import="Model.Pedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            PedidoController pedidoCon = new PedidoController();
            //Pedido pedido = new Pedido();
            //pedido = pedidoCon.obtenerPedidos();
            
            %>
            <h1><% 
                String tipoPedido = pedidoCon.obtenerPedidos(); 
            %></h1>
    </body>
</html>
