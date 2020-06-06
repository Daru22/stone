(function(){
    let menu1=document.querySelectorAll(".menu .menu1");
    for (let i=0;i<menu1.length; i++){
    menu1[i].addEventListener("click",function(e){
       let btn=e.target;
       if(btn.className==="menu1 activo"){
           removerActivo();
       }else{
           removerActivo();
        btn.classList.add("activo");   
       }
       

    })
}

function removerActivo(){
    for (let i=0;i<menu1.length; i++){
        menu1[i].classList.remove("activo")
    }
}
 var check=document.getElementById("checkmenu");
 let lis=document.querySelectorAll(".submenu1 li");
 for (let i=0;i<lis.length; i++){
    lis[i].addEventListener("click",function(e){
       check.checked=false;
       removerActivo();
    })
}


}())
