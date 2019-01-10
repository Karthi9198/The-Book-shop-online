package com.niit.bookshopbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.bookshopbackend.dao.CategoryDAO;
import com.niit.bookshopbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO; 

	private Category category;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.bookshopbackend");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	
/*	@Test
	public void testAddCategory() {
		
		category=new Category();
		
		category.setName("Novels");
		category.setDescription("Description forNovels");
		category.setImageURL("CAT_3.png");
		
		assertEquals("Successfully added a category in a table",true,categoryDAO.add(category));
		
	}*/
	
	/*@Test
	public void testGetCategory() {
		
		category=categoryDAO.get(3);
		assertEquals("Successfully fetched a single category from table","Novels",category.getName());
		
	}*/
	
	/*@Test
	public void testUpdateCategory() {
		
		category=categoryDAO.get(2);
		category.setName("Engg. Books");
		assertEquals("Successfully updated a single category in table",true,categoryDAO.update(category));	
	}*/
	/*@Test
	public void testDeleteCategory() {
		
		category=categoryDAO.get(2);
		
		assertEquals("Successfully delete single category in table",true,categoryDAO.delete(category));
	
	}*/
	/*@Test
	public void testListCategory() {
		
		assertEquals("Successfully fetched list of category in table",2,categoryDAO.list().size());
	
	}*/
	
	@Test
	public void testCRUDCategory() {
	
		//add operation
		category=new Category();
		
		category.setName("Comic Books");
		category.setDescription("Description for Comic books");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully added a category in a table",true,categoryDAO.add(category));
		
		category=new Category();
		
		category.setName("Engineering Books");
		category.setDescription("Description for Engineering books");
		category.setImageURL("CAT_2.png");
		
		assertEquals("Successfully added a category in a table",true,categoryDAO.add(category));
		
		//fetching and updating category
		category=categoryDAO.get(2);
		category.setName("Engg. Books");
		assertEquals("Successfully added a category in a table",true,categoryDAO.update(category));
	
		//delete category
		assertEquals("Successfully deleted a category in a table",true,categoryDAO.delete(category));
		//fetching list
		assertEquals("Successfully fetched list of category in table",1,categoryDAO.list().size());
		
	
	}

}
