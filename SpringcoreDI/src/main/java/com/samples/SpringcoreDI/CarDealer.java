package com.samples.SpringcoreDI;

import java.util.Set;

public class CarDealer {
	private String name;
	private Set<String> Companies;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getCompanies() {
		return Companies;
	}
	public void setCompanies(Set<String> companies) {
		Companies = companies;
	}
	@Override
	public String toString() {
		return "CarDealer [name=" + name + ", Companies=" + Companies + "]";
	}
	
}
