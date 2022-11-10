package Facadeimp;

import java.util.List;
import java.util.Optional;
import javax.management.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Cliente;
import Repository.ClienteRepository;
import facade.ICliente;


@Service
public class ClienteDao implements ICliente{

	@Autowired
	private ClienteRepository clierepo;
	
	
	@Override
	public List<Cliente> Encontrar() {
		
		//Query nativeQuery = createNativeQuery("SELECT id, name, email FROM user ORDER BY email DESC");
		
		return clierepo.findAll();
	}

	@Override
	public Optional<Cliente> getOne(Integer Iden) {
		return clierepo.findById(Iden);
	}

	@Override
	public Cliente findById(Integer Iden) {
		
		return clierepo.getReferenceById(Iden);
	}

	@Override
	public void create(Cliente cliente) {
		this.clierepo.save(cliente);
		
	}

	@Override
	public void update(Cliente cliente) {
		this.clierepo.save(cliente);
		
	}

	@Override
	public void delete(Cliente cliente) {
		Cliente clie = clierepo.getById(cliente.getIden());
		this.clierepo.save(clie);
		
	}

}

	
	
	
	
	
	

