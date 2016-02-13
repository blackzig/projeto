/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvc.projeto.dto;

/**
 *
 * @author Michel A. Medeiros
 */
public class Company {
    
	private String name;
	private long employees;
	private String headoffice;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getEmployees() {
		return employees;
	}
	public void setEmployees(Long employees) {
		this.employees = employees;
	}
	public String getHeadoffice() {
		return headoffice;
	}
	public void setHeadoffice(String headoffice) {
		this.headoffice = headoffice;
	}  
}
