package co.unbosque.clico4BackEndClientes.modelDao.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.unbosque.clico4BackEndClientes.model.Clientes;

public interface IClientesDao extends MongoRepository<Clientes, Long>{

}
