package com.samples.S05InterfaceInjection.DAO.impl;

import com.samples.S05InterfaceInjection.DAO.OrderDAO;

public class OrderDAOImpl implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("create order in mysql db...........");
	}

}