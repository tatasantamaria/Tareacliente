package Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import Facadeimp.ClienteDao;
import Model.Cliente;



@Controller
public class ClienteController {
	@Autowired
	public ClienteDao cliedao;
	
	@RequestMapping({"/Clienteweb", "/"})
	public String ListCliente(Model model){
		
		model.addAttribute("Cliente", cliedao.Encontrar());
	  
		return "Clienteweb";
	}

	@RequestMapping({"/getOne"})
	@ResponseBody
	public Optional<Cliente> getOne(Integer Iden){
		return cliedao.getOne(Iden);
	}
	
	@PostMapping({"/ClienteCrear"})
    public String create(Cliente cliente) {
    cliedao.create(cliente);
    return "redirect:/Clienteweb";
	}
	
	@RequestMapping(value="/ClienteUpdate", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Cliente cliente) {
		cliedao.update(cliente);
		return "redirect:/Clienteweb";
	}
	  
	@RequestMapping(value="/ClienteDelete", method = {RequestMethod.PUT, RequestMethod.GET})
	public String delete(Integer Iden) {
		
		Cliente clie = cliedao.findById(Iden);
		clie.setEst("Inactivo");
		
	  this.cliedao.delete(clie);
	  return "redirect:/Clienteweb";
	}
}



