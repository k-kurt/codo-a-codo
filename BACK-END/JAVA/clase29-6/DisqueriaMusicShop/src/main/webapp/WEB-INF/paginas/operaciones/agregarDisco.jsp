<div class="modal fade" id="agregarDiscoModal" tabindex="-1" aria-labelledby="agregarDiscoModal" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Agregar Disco</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            
            <form action="${pageContext.request.contextPath}/servletControlador?accion=insertar" method="POST" class="was-validated">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="nombre">Titulo</label>
                        <input type="text" class="form-control" name="nombre" required/>
                    </div>
                    
                    <div class="form-group">
                        <label for="autor">Autor</label>
                        <input type="text" class="form-control" name="autor" required/>
                    </div>
                    
                    <div class="form-group">
                        <label for="cantCanciones">Cantidad de Canciones</label>
                        <input type="number" class="form-control" name="cantCanciones" required/>
                    </div>
                    
                    <div class="form-gorup">
                        <label for="precio">Precio</label>
                        <input type="number" class="form-control" name="precio" required/>
                    </div>
                    
                    <div class="form-group">
                        <label for="copias">Copias</label>
                        <input type="number" class="form-control" name="copias" required/>
                    </div>
                </div>
                
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">
                        Guardar
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>
