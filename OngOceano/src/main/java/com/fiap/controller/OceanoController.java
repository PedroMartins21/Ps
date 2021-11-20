package com.fiap.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fiap.OceanoDto.*;
import com.fip.service.*;
import com.fiap.model.*;
@RestController
public class OceanoController {
	private OceanoService os;
	
	@GetMapping("Get-QuimicaOceano")
	public ResponseEntity<List<OceanoModel>> GetQuimicaOceano(@RequestBody @Valid String nome){
		OceanoModel oc = new OceanoModel();
		List<OceanoModel> oceano = (List<OceanoModel>) os.getQuimicaOceano(nome);
		return new ResponseEntity<>(oceano, HttpStatus.OK);
	}
}
