package facade;
import java.util.List;
import java.util.Optional;

import Model.Cliente;

public interface ICliente {
	
	public List<Cliente>Encontrar();
	public Optional<Cliente>getOne(Integer Iden);
	public Cliente findById(Integer Iden);
	public void create(Cliente cliente);
	public void update(Cliente cliente);
	public void delete(Cliente cliente);
 }
