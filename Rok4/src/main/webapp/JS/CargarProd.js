(function(){
cargarProductos();
}());
function funcionCallback()
{
	if( ajax.readyState == 4 )
	{
		if( ajax.status == 200 )
		{
			
			let datos=JSON.parse(this.responseText)
                        console.log(datos);
		}
	}
}

function cargarProductos()
{
	
		ajax = new XMLHttpRequest(); // No Internet Explorer
	// Almacenamos en el control al funcion que se invocara cuando la peticion
	// cambie de estado	
	ajax.onreadystatechange = funcionCallback;
	// Enviamos la peticion
	ajax.open( "GET", "gsonProductos", true );
	ajax.send();
}

