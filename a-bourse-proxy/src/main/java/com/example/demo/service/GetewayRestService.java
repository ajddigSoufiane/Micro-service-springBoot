package com.example.demo.service;

import java.util.Collection;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
 

@RestController
public class GetewayRestService {
/*	@Autowired
	private RestTemplate rt;
	*/
	
	/*@RequestMapping(value="/names")
	public Collection<Ste> stes(){
		ParameterizedTypeReference<Resources<Ste>> reptype=new ParameterizedTypeReference<Resources<Ste>>() {
		};
		return rt.exchange("http://ste-service/stes", HttpMethod.GET
				, null, reptype).getBody().getContent();
	}*/
}

class Ste{
	private Long id; 
	private String nomSociete;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomSociete() {
		return nomSociete;
	}
	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}
	
}