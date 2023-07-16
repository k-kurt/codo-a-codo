<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value="es_AR"/>
<section id="libros">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de Discos</h4>
                    </div>
                    
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Nombre</th>
                                <th>Autor</th>
                                <th>Canciones</th>
                                <th>Precio</th>
                                <th>-</th>
                            </tr>
                        </thead>
                        
                        <tbody>
                            <c:forEach var="disco" items="${discos}" varStatus="status">
                                <tr>
                                    <td>${status.count}</td>
                                    <td>${disco.nombre}</td>
                                    <td>${disco.autor}</td>
                                    <td>${disco.cantCanciones}</td>
                                    <td><fmt:formatNumber value="${disco.precio}" type="currency"/></td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/servletControlador?accion=editar&id=${disco.id}" class="btn btn-secondary">
                                            <i class=" fas fa-angle-double-right"></i>
                                            Editar
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>  
            </div>
            
            <div class="col-md-3">
                <div class="card text-center bg-danger text-white mb-3">
                    <div class="card-body">
                        <h3>Cantidad de Discos</h3>
                        <h4 class="display-4">
                            <i class="fas fa-users"></i>
                            ${cantidadDiscos}
                        </h4>
                    </div>
                </div>
                
                <div class="card text-center bg-success text-white mb-3">
                    <div class="card-body">
                        <h3>Precio total</h3>
                        <h4 class="display-4">
                            <i class="fas fa-users"></i>
                            <fmt:formatNumber value="${precioTotal}" type="currency"/>
                        </h4>
                    </div>
                </div>
            </div>
            
        </div>
    </div>
</section>
<jsp:include page="/WEB-INF/paginas/operaciones/agregarDisco.jsp"/>                
                     