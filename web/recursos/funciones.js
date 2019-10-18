/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Validar el formulario - AE - NL
function validarFormulario(forma) {

    //Validar usuario
    var usuario = forma.usuario.value;
    if (usuario === "")
    {
        alert("Debe proporcionar un nombre de usuario");
        return false;
    }

    //Validar password
    var password = forma.password.value;
    if (password === "")
    {
        alert("Introduzca su contraseña");
        return false;
    }
    else
    {
        if(password.length < 8)
        {
            alert("Debe proporcionar una contraseña de al menos 8 caracteres");
            return false;
        }
    }

    //Validar tecnologias
    var tecnologias = forma.tecnologias;
    var checkSeleccionado = false;

    //Revisar que este seleccionada al menos una tecnologia    
    for (i = 0; i<tecnologias.length; i++) 
    {
        if (tecnologias[i].checked) 
        {
            checkSeleccionado = true;
        }
    }    
    if(checkSeleccionado === false)
    {
        alert("Debe seleccionar al menos 1 tecnologia");
        return false;
    }
    
    //Validar genero
    var genero = forma.genero;
    var seleccionGenero = false;
    
    for (i = 0; i<genero.length; i++)
    {
        if (genero[i].checked)
        {
            seleccionGenero = true;
        }
    }
    if (seleccionGenero === false)
    {
        alert("Debe seleccionar su genero");
        return false;
    }
    
    //Validar Ocupacion
    var ocupacion = forma.ocupacion;
    if(ocupacion.value==="")
    {
        alert("Debera seleccionar una ocupacion");
        return false;
    }
    
    alert("Enviando formulario...");
    return true;
}

function validarFormularioRegistro(forma){
     //Validar usuario
    var usuario = forma.usuario.value;
    if (usuario === "")
    {
        alert("Debe proporcionar un nombre de usuario");
        return false;
    }

    //Validar password
    var password = forma.password.value;
    if (password === "")
    {
        alert("Introduzca su contraseña");
        return false;
    }
    else
    {
        if(password.length < 8)
        {
            alert("Debe proporcionar una contraseña de al menos 8 caracteres");
            return false;
        }
    }
     
    alert("Enviando formulario...");
    return true;

}