package truper.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import truper.demo.entity.Client;
import truper.demo.repository.ClientRepository;
import truper.demo.service.ClientService;

public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

}
