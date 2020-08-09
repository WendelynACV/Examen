<%@ page import="appLayer.Cliente" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="appLayer.Clientes" %><%--
  Created by IntelliJ IDEA.
  User: Wen
  Date: 8/8/2020
  Time: 6:28 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web Caninos Felices</title>
</head>

<body>
    <h1 align="center">Caninos Felices S.A</h1>

    <h2>A continuación se presentan los clientes existentes</h2>
    <br><br>

    <%
        Clientes misClientes = (Clientes) session.getAttribute("clientes");

        ArrayList<Cliente> clientes = misClientes.obtenerClientes();
        if (clientes != null ){

            Iterator<Cliente> iterator = clientes.iterator();
            while (iterator.hasNext()) {
                Cliente cliente = iterator.next();

    %>
    <div>
        <h3><%=cliente.getNombreDelPerro()%></h3>
        <p><%=cliente.getCedulaCliente()%></p>
        <p><%=cliente.isRequiereTransporte()%></p>
        <p><%=cliente.getFechaUltimoCorte()%></p>

    </div>

    <%
            }
        }

    %>
    <a href="${pageContext.request.contextPath}/index.jsp">Regresar a inicio</a>
</body>
</html>
