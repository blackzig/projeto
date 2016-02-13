/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvc.projeto.model;

public enum TipoImovel {

	APARTAMENTO("Apartamento"),
	TERRENO("Terreno"),
	CASA("Casa"),
	COMODO_COMERCIAL("Cômodo comercial");
	
	private final String descricao;
	
	TipoImovel(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
}