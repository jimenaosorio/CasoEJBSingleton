<%@include file="templates/header.jsp" %>
<%@include file="templates/menu.jsp" %>

<div class="row">
    <div class="col s6 offset-s3 white">
        <form method="post" action="control.do">
            <div class="input-field col s12">
                <input placeholder="RUT" id="rut" type="text" class="validate" name="rut">
                <label for="rut">RUT</label>
            </div>
            <div class="input-field col s12">
                <input placeholder="Nombre" id="nombre" type="text" class="validate" name="nombre">
                <label for="nombre">Nombre</label>
            </div>
            <div class="input-field col s12">
                <input placeholder="Apellido" id="apellido" type="text" class="validate" name="apellido">
                <label for="apelllido">Apellido</label>
            </div>
            <div class="input-field col s12">
                <input placeholder="Correo" id="correo" type="text" class="validate" name="correo">
                <label for="correo">Correo</label>
            </div>
            <div class="input-field col s12">
                <input placeholder="Clave" id="clave" type="password" class="validate" name="clave">
                <label for="clave">Clave</label>
            </div>
            <div class="input-field col s12">
                <input placeholder="Confirme Clave" id="clave2" type="password" class="validate" name="clave2">
                <label for="clave2">Confirme Clave</label>
            </div>
            <div>
            <button type="submit" class="waves-effect waves-light btn right" name="btn" value="registro">Registrar</button>
            </div>
            <div class="row">
                ${requestScope.msg}
            </div>
                
        </form>
    </div>
</div>
<%@include file="templates/footer.jsp" %>

