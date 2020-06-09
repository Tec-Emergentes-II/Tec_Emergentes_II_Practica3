<%-- 
    Author     : Eva Carmen Huaylliri Ajata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica N° 3</title>
    </head>
    <body bgcolor="yellow">
    <center>
    <center><h1>Inscripcion en curso</h1></center>
    <br> <br>
    <form action="curso" method="post">
    <label>Nombres: </label>
    <input type="text" name="nombre" required>
    <br><br>
    <label>Apellidos: </label>
    <input type="text" name="apellidos" required>
    <br><br>
    <label>Curso: </label>
    <select name="curso" required>
        <option value=""></option>
        <option value="Ingenieria de Sistemas I">Ingenieria de Sistemas I</option>
        <option value="Inv. operativa I">Inv. Operativa I</option>
        <option value="Tec. Emergentes II">Tec. Emergentes II</option>
        <option value="Taller de Grado I">Taller de Grado I</option>
        <option value="Inteligencia Artificial II">Inteligencia Artificial II</option>
    </select>
    <br><br>
    <input type="submit">
    </form>
    </center>
    </body>
</html>
