package com.samples.S05InterfaceInjection.DAO.impl;

import com.samples.S05InterfaceInjection.DAO.OrderDAO;

public class OrderDAOImplv2 implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("create order in oracle db.........");
	}

}