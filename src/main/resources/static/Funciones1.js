function valida(e){

                tecla = (document.all) ? e.keyCode : e.which;
                //Tecla de retroceso para borrar, siempre la permite
                if (tecla==8){
                  return true;
                }
                  
                // solo  numeros
                patron =/[0-9]/;
                tecla_final = String.fromCharCode(tecla);
                return patron.test(tecla_final);
            }
 
 function LETRAS(e){

                tecla = (document.all) ? e.keyCode : e.which;
                //Tecla de retroceso para borrar, siempre la permite
                if (tecla==8){
                  return true;
                }
                  
                patron =/[a-z-A-Z. ]/;
                tecla_final = String.fromCharCode(tecla);
                return patron.test(tecla_final);
            }
            
            function ValidarCampos(){

	if($("#IdenVal").val() == ''){
	  Swal.fire('Ingrese el numero de documento.','','warning');/*sucesss*/
	  return 0;
	}
	if($("#NombreVal").val() == ''){
	  Swal.fire('Ingrese los nombres.','','warning');/*sucesss*/
	  return 0;
	}
	if($("#ApellidoVal").val() == ''){
	  Swal.fire('Ingrese los apellidos.','','warning');/*sucesss*/
	  return 0;
	}
	if($("#CiudadVal").val() == ''){
	  Swal.fire('DIGITE LA CIUDAD.','','warning');/*sucesss*/
	  return 0;
	}
	if($("#MailVal").val() == ''){
	  Swal.fire('DIGITE EL MAIL.','','warning');/*sucesss*/
	  return 0;
	}else{
	var emailField = document.getElementById('MailVal');
	
	// Define our regular expression.
	var validEmail =  /^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/;

	// Using test we can check if the text match the pattern
	if(!validEmail.test(emailField.value)){
		
		    Swal.fire('El MAIL NO ES CORRECTO.','','warning');
		     return false;
	}
	}
	if($("#TelVal").val() == ''){
	  Swal.fire('DIGITE EL TELEFONO.','','warning');/*sucesss*/
	  return 0;
	}
	 
	$("#GuardarOri").trigger('click');
}
/*-----------------------------------------------------------------------------------------------------------*/

  function ValidarCampos1(){

	if($("#IdenVal1").val() == ''){
	  Swal.fire('Ingrese el numero de documento.','','warning');
	  return 0;
	}
	if($("#NombreVal1").val() == ''){
	  Swal.fire('Ingrese los nombres.','','warning');
	  return 0;
	}
	if($("#ApellidoVal1").val() == ''){
	  Swal.fire('Ingrese los apellidos.','','warning');
	  return 0;
	}
	if($("#CiudadVal1").val() == ''){
	  Swal.fire('DIGITE LA CIUDAD.','','warning');
	  return 0;
	}
	if($("#MailVal1").val() == ''){
	  Swal.fire('DIGITE EL MAIL.','','warning');
	  return 0;
	}else{
	var emailField = document.getElementById('MailVal1');
	
	// Define our regular expression.
	var validEmail =  /^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/;

	// Using test we can check if the text match the pattern
	if(!validEmail.test(emailField.value)){
		
		    Swal.fire('POR FAVOR DIGITE UN MAIL CORRECTO.','','warning');
		     return false;
	}
	}
	if($("#TelVal1").val() == ''){
	  Swal.fire('DIGITE EL TELEFONO.','','warning');
	  return 0;
	}
	 
	$("#GuardarOri1").trigger('click');
} 

/*-----------------------------------------------------------------------------------------------------------*/
 $('document').ready(function() {
	 
	 $('.table #update').on('click', function(event){
		 
		 event.preventDefault();
		  
		var href= $(this).attr('href');
		 
		 $.get(href, function(cliente, status){
			 
			 $('#IdenVal1').val(cliente.iden);
			 $('#NombreVal1').val(cliente.nom);
			 $('#ApellidoVal1').val(cliente.ape);
			 $('#fechaVal1').val(cliente.Fecha);
			 $('#CiudadVal1').val(cliente.ciu);
			 $('#MailVal1').val(cliente.mail);
			 $('#TelVal1').val(cliente.tel);
			 $('#ocuVal1').val(cliente.ocu);
			 $('#estVal1').val(cliente.est);
		 });
		 
		 $('#editModal').modal();
		 
	 });
	  });
	  
	  $('document').ready(function() { 
	 $('.table #updateButton').on('click', function(event){
		 
		 event.preventDefault();
		  
		 var href = $(this).attr('href');
		 	
		 $('#updateEstModal #delRef').attr('href', href);
		  $('#updateEstModal').modal();
	 });
	    });
