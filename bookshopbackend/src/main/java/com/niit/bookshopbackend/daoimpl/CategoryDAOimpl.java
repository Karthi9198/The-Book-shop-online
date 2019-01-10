package com.niit.bookshopbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.bookshopbackend.dao.CategoryDAO;
import com.niit.bookshopbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	private static List<Category> categories=new ArrayList<>();
	
	static {
		
		Category category=new Category();
		//adding first category
		category.setId(1);
		category.setName("Comic Books");
		category.setDescription("This is the description of the book");
		category.setImageURL("CAT_1.png");

		categories.add(category);
		
		//second category
		category=new Category();
		category.setId(2);
		category.setName("Engineering Books");
		category.setDescription("This is the description of the Engineering books");
		category.setImageURL("CAT_2.png");

		categories.add(category);
		
		//third category
				category=new Category();
				category.setId(3);
				category.setName("Novels");
				category.setDescription("This is the description of the Novels");
				category.setImageURL("CAT_3.png");

				categories.add(category);
	}
	
	@Override
	public List<Category> list() {
	
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhanced for loop
		for(Category category:categories) {
			if(category.getId()==id) return category;
		}
		
		return null;
	}

}
