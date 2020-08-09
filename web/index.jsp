<%--
  Created by IntelliJ IDEA.
  User: Wen
  Date: 8/8/2020
  Time: 5:34 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web Caninos Felices</title>
  </head>

  <body>

  <h1 align="center">Caninos Felices S.A</h1>

  <div class="opcionARealizar" >
    <h3>¿YA ERES CLIENTE O DESEA REGISTRARSE? (Da click a uno de los botones)</h3>

    <button onclick="clientes()">Ingresar Pagina clientes</button>
    <button onclick="cliente()">Ingresar a Registrar</button>
    <br><br>

  </div>
  <br><br>

  <script>
    function clientes() {
      document.location.href ="${pageContext.request.contextPath}/clientes.jsp";
    }

    function cliente() {
      document.location.href ="${pageContext.request.contextPath}/registrar.jsp";
    }
  </script>

  <br><br>
  <footer>
    <p>Wendelyn Cordero</p>
  </footer>
  </body>
</html>
