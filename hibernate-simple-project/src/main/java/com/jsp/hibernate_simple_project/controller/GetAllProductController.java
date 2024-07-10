package com.jsp.hibernate_simple_project.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_simple_project.dto.Product;

public class GetAllProductController {
	
	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("ansari").createEntityManager();
		 
		Query query= em.createQuery(" from Product"); // will read the query not execute it
		
		List<Product> products=query.getResultList(); 
		
		for(Product product : products) {
			
			System.out.println(product);
		}
		
	}

}
