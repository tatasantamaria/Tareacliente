package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}