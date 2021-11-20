package com.fiap.model;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document

public class OceanoModel {
	
	private String nome;
	@Id
	private String id;
	private Date data;
	private double ph;
	private String quimicaId;
	private double mediaPh = 8.1;
	private double variacaoPhOceano;
	private double difMedia;
}
