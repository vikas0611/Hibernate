package com.jsp.hibernate_simple_project.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_simple_project.dto.Product;

public class ProductInsertController {

	public static void main(String[] args) {
		
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ansari");
	
	EntityManager em =emf.createEntityManager();
	
	EntityTransaction et = em.getTransaction();
	
	Product product = new Product (185, "bike", "blue", LocalDate.parse("2024-06-05"), LocalDate.parse("2025-01-15"), 6420000);
	
	
	et.begin();
	em.persist(product);
	et.commit();
	
	}
}
