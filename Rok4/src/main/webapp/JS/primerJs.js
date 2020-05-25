(function(){
      function mostrar(){
    console.log("gtgt");
}
 var check=document.getElementById("checkmenu");
 let lis=document.querySelectorAll(".menu .menu0");
 for (let i=0;i<lis.length; i++){
    lis[i].addEventListener("click",function(e){
       check.checked=false;
    })
}
   
}())