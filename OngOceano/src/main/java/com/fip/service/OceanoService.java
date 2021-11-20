package com.fip.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fiap.model.*;
import com.fiap.repository.OceanoRepository;

import antlr.collections.List;
@Service
public class OceanoService {
	
	@Autowired 
	private OceanoRepository ocr;
	
	@SuppressWarnings("finally")
	public String getOceanoId(String nome) {
		OceanoModel om = new OceanoModel();
		try {
			om.setId(ocr.getIdOceano(om.getNome()));
			
		}
		catch (Exception ex)
		{ 
			throw new Exception("Não foi possivel identificar um Oceano com esse nome!");
		}
		finally 
		{
			return om.getId();
		}
		
		
	}
	@SuppressWarnings("finally")
	public OceanoModel getQuimicaOceano(String nome) {
		OceanoModel om = new OceanoModel();
		try {
			String id = getOceanoId(nome);
			om = ocr.getQuimicaOceano(id);
		}catch (Exception ex) {
			throw new Exception("Nao foi possivel encontrar as informações desse oceano");
		}finally {
			return om;
		}
	}
		
}
