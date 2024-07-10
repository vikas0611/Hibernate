package com.jsp.hibernate_simple_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.jsp.hibernate_simple_project.dto.Product;

public class GetProductByIdController {
	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("ansari").createEntityManager();		
		
		
		Product p = em.find(Product.class, 178);
		if(p!=null) {
			System.out.println(p);
			
			
		}else {
			System.out.println("given id not found");
			
		}
	}

}
