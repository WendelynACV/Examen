<%--
  Created by IntelliJ IDEA.
  User: Wen
  Date: 8/8/2020
  Time: 6:18 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>

<body>
    <h1 align="center">Caninos Felices S.A</h1>

    <br><br>
    <h2>Bienvenido, por favor acontinuación registrar cliente:</h2>
    <br><br>

    <h1 align="center">Caninos Felices S.A</h1>

    <br><br>
    <h2>Por favor registrese</h2>
    <br><br>
    <form action="${pageContext.request.contextPath}/registrarCliente" method="post" enctype="multipart/form-data">

        Nombre del Perro: <input maxlength="120" align="center" type="text" name="nombreDelPerro" width="30" required/><br><br>
        Cedula del Cliente: <input maxlength="12" type="text" name="cedula" width="25" pattern="[0][1-9]-?\d{4}-?\d{4}|(3(?:-))((?:[0-9]{3}-))((?:[0-9]{6}$))" required/> (para cédula de identidad el formato es: '0#-####-####' y para jurídica: '3-###-######') <br><br>
        Raza del Perro: <input maxlength="50" align="center" type="text" name="razaDelPerro" width="30" required/><br>
        Alergias: <input maxlength="50" align="center" type="text" name="alergias" width="30" required/><br>
        <input align="center" type="submit" value="Registrar"/>
        <br><br>
    </form>

    <p style="color: red;">${msgDeError}</p>


    <a href="${pageContext.request.contextPath}/index.jsp">Regresar a inicio</a>
</body>
</html>
