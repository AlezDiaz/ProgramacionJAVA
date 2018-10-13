//Linea de comentario
/*Muchas lineas de comentario*/


// Option 1: Asignar la funcion pero no digitar los parentesis()

window.onload = function() {
	var btn = document.getElementById("btnGrabar");
	
	var btnDisenio = document.getElementById("btnCambiarDisenio");
	
	btn.addEventListener("click", grabarFormulario, false);	
	btnDisenio.addEventListener("click", function(){
		
		document.getElementById("txtCodigo").style = "background:yellow;"
		document.getElementById("txtNombre").style = "background:green;font-weight:bold;"

	}, false);
}


/* Option 2: Utilizar una funciona anonima que invoque a mi funcion creada
var btn = document.getElementById("btnGrabar");
btn.addEventListener("click", function() { grabarFormulario(); }, false);	
*/

function grabarFormulario(){
	var codigo = document.getElementById("txtCodigo").value;
	var nombre = document.getElementById("txtNombre").value;
	var apellido = document.getElementById("txtApellidos").value;
	
	if (confirm("Esta seguro que desea grabar la info?")) {
		alert("Gracias por confiar en nosotros");
	} else {
		
	}
}





