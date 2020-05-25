(function(){

function autocomplete(inp, arr,hidd) {
  
  /*la función autocompletar toma dos argumentos,
  el elemento de campo de texto y una matriz de posibles valores autocompletados:*/
  var currentFocus;
  /*ejecutar una función cuando alguien escribe en el campo de texto:*/
  inp.addEventListener("input", function(e) {
      var a, b, i,indice,sum1, val = this.value;
      /*cerrar cualquier lista ya abierta de valores autocompletados*/
      closeAllLists();
      if (!val) { hidd.value="";return false;}
      currentFocus = -1;
      /*crear un elemento DIV que contendrá los elementos (valores):*/
      a = document.createElement("DIV");
      a.setAttribute("id", this.id + "autocomplete-list");
      a.setAttribute("class", "autocomplete-items");
      /*Añada el elemento DIV como hijo del contenedor de autocompletado.:*/
      this.parentNode.appendChild(a);
      /*para cada elemento de la matriz...*/
      for (i = 0; i < arr.length; i++) {
        /*compruebe si el elemento comienza con las mismas letras que el valor del campo de texto:*/
        let valor=arr[i].value;
        let identificador=arr[i].id;
        if (valor.toUpperCase().indexOf(val.toUpperCase()) !==-1 ) {
          /*crear un elemento DIV para cada elemento coincidente:*/
          b = document.createElement("DIV");
          indice=valor.toUpperCase().indexOf(val.toUpperCase());
          sum1=indice+val.length;
          /*pon las letras a juego en negrita:*/
          b.innerHTML = valor.substr(0,indice)+"<span>"+valor.substr(indice,val.length)+"</span>"+valor.substr(sum1);
          /*inserte un campo de entrada que contendrá el valor del elemento de matriz actual:*/
          b.innerHTML += "<input type='hidden' value='" + valor + "' id='" + identificador + "'>";
          /*ejecutar una función cuando alguien hace clic en el valor del elemento (elemento DIV):*/
              b.addEventListener("click", function(e) {
              /*inserte el valor para el campo de texto de autocompletar:*/
              inp.value = this.getElementsByTagName("input")[0].value;
              hidd.value = this.getElementsByTagName("input")[0].id;
              
              /*cierra la lista de valores autocompletados,
              (o cualquier otra lista abierta de valores autocompletados:*/
              closeAllLists();
          });
          a.appendChild(b);
        }else{
            hidd.value="";
        }
      }
  });
  /*ejecutar una función presiona una tecla en el teclado:*/
  inp.addEventListener("keydown", function(e) {
      var x = document.getElementById(this.id + "autocomplete-list");
      if (x) x = x.getElementsByTagName("div");
      if (e.keyCode == 40) {
        /*Si se presiona la tecla de flecha ABAJO,
        aumentar la variable currentFocus:*/
        currentFocus++;
        /*y hacer que el elemento actual sea más visible:*/
        addActive(x);
      } else if (e.keyCode == 38) { //up
        /*Si se presiona la tecla de flecha ARRIBA,
        disminuir la variable currentFocus:*/
        currentFocus--;
        /*yy hacer que el elemento actual sea más visible:*/
        addActive(x);
      } else if (e.keyCode == 13) {
        /*Si se presiona la tecla ENTER, evite que se envíe el formulario,*/
        e.preventDefault();
        if (currentFocus > -1) {
          /*y simule un clic en el elemento "activo":*/
          if (x) x[currentFocus].click();
        }
      }
  });
  function addActive(x) {
    /*una función para clasificar un elemento como "activo":*/
    if (!x) return false;
    /*comience eliminando la clase "activa" en todos los elementos:*/
    removeActive(x);
    if (currentFocus >= x.length) currentFocus = 0;
    if (currentFocus < 0) currentFocus = (x.length - 1);
    /*Agregar la clase "autocompletar-activo": */
    x[currentFocus].classList.add("autocomplete-active");
  }
  function removeActive(x) {
    /*una función para eliminar la clase "activa" de todos los elementos de autocompletar:*/
    for (var i = 0; i < x.length; i++) {
      x[i].classList.remove("autocomplete-active");
    }
  }
  function closeAllLists(elmnt) {
    /*cerrar todas las listas de autocompletar en el documento,
    excepto el que pasó como argumento:*/
    var x = document.getElementsByClassName("autocomplete-items");
    for (var i = 0; i < x.length; i++) {
      if (elmnt != x[i] && elmnt != inp) {
      x[i].parentNode.removeChild(x[i]);
    }
  }
}
/*ejecutar una función cuando alguien hace clic en el documento:*/
document.addEventListener("click", function (e) {
    closeAllLists(e.target);
});
} 

let cuadro = document.getElementById("tbox22");
let hid22 = document.getElementById("hid22");
let arreglo = document.querySelectorAll(".item");
autocomplete(cuadro,arreglo,hid22);
}())