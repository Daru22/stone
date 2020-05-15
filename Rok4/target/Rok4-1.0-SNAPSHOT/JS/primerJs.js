(function(){
    
var check=document.getElementById("checkmenu");
function coc(){
check.checked=false;};
function coc1(){
check.checked=false;};
function coc2(){
check.checked=false;};
//preventdefault
var link = document.getElementById("inicio");
link.addEventListener("click",coc,false);
var link = document.getElementById("productos");
link.addEventListener("click",coc1,false);
var link = document.getElementById("contactenos");
link.addEventListener("click",coc2,false);

}())