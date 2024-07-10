package com.jsp.hibernate_simple_project.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_simple_project.dto.Product;

public class UpdateProductByIdController {
	
	public static void main(String[] args) {
		
		 EntityManager em = Persistence.createEntityManagerFactory("ansari").createEntityManager();
		 
		 EntityTransaction et = em.getTransaction();
		 
		 Product p = em.find(Product.class, 12);
		 
		 
		 if (p!=null) {
			 p.setPrice(2000);
			 p.setName("fan");
				et.begin();
				em.merge(p);
				et.commit();
				System.out.println("id updated");
			}else {
				System.out.println("id not update");
			}
			
		 
		
	}

}
