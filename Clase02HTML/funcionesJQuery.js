$(document).ready(()=>{
	$('[data-toggle="popover"]').popover()

	$("#btnGrabar").click(grabarFormulario);
	$("#btnCambiarDisenio").click(()=>{
		$("#txtCodigo").css("background", "yellow");
		$("#txtNombre").css("background", "green");
	});
	
	$("#btnOcultar").click(()=>{ $("#contenedorFormulario").toggle("slow"); });
});

function grabarFormulario(){
	var codigo = $("#txtCodigo").val();
	var nombre = $("#txtNombre").val();
	var apellido = $("#txtApellidos").val();
	if (confirm("Esta seguro que desea grabar la info?")) {
		alert("Gracias por confiar en nosotros");
	}
}

