package com.niit.bookshopbackend.dao;

import java.util.List;

import com.niit.bookshopbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
}
