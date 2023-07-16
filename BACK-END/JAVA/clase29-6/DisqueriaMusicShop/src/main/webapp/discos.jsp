<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/e3a8addbfe.js" crossorigin="anonymous"></script>
        <title>Disqueria</title>
        
    </head>
    <body>
        
        <jsp:include page="WEB-INF/paginas/comunes/cabecera.jsp"/>
        
        <jsp:include page="WEB-INF/paginas/comunes/botonesNavegacion.jsp"/>
        
        <jsp:include page="WEB-INF/paginas/operaciones/listarDiscos.jsp"/>
        
        <jsp:include page="WEB-INF/paginas/comunes/pieDePagina.jsp"/>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
    </body>
    
</html>
