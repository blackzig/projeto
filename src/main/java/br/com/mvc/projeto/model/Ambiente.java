/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvc.projeto.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Ambiente implements Serializable {
	
	private Integer quartos;
	private Integer garagens;
	private Integer salas;
	private Integer banheiros;

	public Integer getQuartos() {
		return quartos;
	}

	public void setQuartos(Integer quartos) {
		this.quartos = quartos;
	}

	public Integer getGaragens() {
		return garagens;
	}

	public void setGaragens(Integer garagens) {
		this.garagens = garagens;
	}

	public Integer getSalas() {
		return salas;
	}

	public void setSalas(Integer salas) {
		this.salas = salas;
	}

	public Integer getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(Integer banheiros) {
		this.banheiros = banheiros;
	}
}