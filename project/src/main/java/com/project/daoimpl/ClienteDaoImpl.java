package com.project.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.project.dao.ClienteDao;
import com.project.entity.Cliente;

public class ClienteDaoImpl implements ClienteDao{

	@Override
	public List<Cliente> getAll() {
		Cliente c1 = new Cliente(1,"Mario","MARIO");
		Cliente c2 = new Cliente(2,"Franco","FRANCO");
		Cliente c3 = new Cliente(3,"Giose","GIOSE");
		List <Cliente> lista = new ArrayList<Cliente>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		return lista;
	}

	
}
