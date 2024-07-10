package com.jsp.hibernate_simple_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_simple_project.dto.Product;

public class DeleteProductByIdController {

	
	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("ansari").createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Product product = em.find(Product.class, 0);
		
		if (product!=null) {
			
			et.begin();
			em.remove(product);
			et.commit();
			System.out.println("id deleted");
		}else {
			System.out.println("id not found");
		}
		
		
	}
}
