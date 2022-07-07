package com.project.controller;
import com.project.entity.Cliente;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.project.daoimpl.*;
@Controller
public class HelloController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "HELLO WORLD!!!";
	}
	
	@RequestMapping(value="/getAllClienti",method=RequestMethod.GET)
	@ResponseBody 
	public List<Cliente> getAllClienti(){
		ClienteDaoImpl dao = new ClienteDaoImpl();
		return dao.getAll();
	}
}
