<%@include file="templates/header.jsp" %>
<%@include file="templates/menu.jsp" %>

<div class="row">
    <div class="col s12 m4 offset-l3">
        
        <div class="card">
        <div class="card-image">
          <img src="images/programar2.jpg">
          <span class="card-title">Ingresar</span>
        </div>
        <div class="card-content">
          
            <form method="post" action="control.do">
            <div class="input-field col s12">
                <input placeholder="RUT" id="rut" type="text" class="validate" name="rut">
                <label for="rut">RUT</label>
            </div>
            <div class="input-field col s12">
                <input placeholder="Clave" id="clave" type="password" class="validate" name="clave">
                <label for="clave">Clave</label>
            </div>
             <div>
            <button type="submit" class="waves-effect waves-light btn right" name="btn" value="ingresar">Ingresar</button>
            </div>
            <div class="row">
                ${requestScope.msg}
            </div>
        </form>
            
        </div>
        
      </div>
        
        
        
    </div>
</div>