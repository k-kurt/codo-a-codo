<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/382381b436.js" crossorigin="anonymous"></script>
        <title>Editar Disco</title>

    </head>
    <body>

        <jsp:include page="../comunes/cabecera.jsp"/>
        <form action="${pageContext.request.contextPath}/servletControlador?accion=modificar&id=${disco.id}" method="POST" class="was-validated">
            <jsp:include page="../comunes/botonesNavegacionEditar.jsp"/>

            <section id="details">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar Disco</h4>
                                </div>
                                <div class="card-body">
                                    <div class="form-group">
                                        <label for="nombre">Titulo</label>
                                        <input type="text" class="form-control" name="nombre" value="${disco.nombre}" required/>
                                    </div>

                                    <div class="form-group">
                                        <label for="autor">Autor</label>
                                        <input type="text" class="form-control" name="autor" value="${disco.autor}" required/>
                                    </div>

                                    <div class="form-group">
                                        <label for="cantCanciones">Cantidad de Canciones</label>
                                        <input type="number" class="form-control" name="cantCanciones" value="${disco.cantCanciones}" required/>
                                    </div>

                                    <div class="form-gorup">
                                        <label for="precio">Precio</label>
                                        <input type="number" class="form-control" name="precio" value="${disco.precio}" required/>
                                    </div>

                                    <div class="form-group">
                                        <label for="copias">Copias</label>
                                        <input type="number" class="form-control" name="copias" value="${disco.copias}" required/>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

        </form>




        <jsp:include page="../comunes/pieDePagina.jsp"/>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
    </body>

</html>