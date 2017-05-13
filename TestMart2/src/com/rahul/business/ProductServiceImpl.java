package com.rahul.business;

import java.util.ArrayList;
import java.util.List;

import com.rahul.model.products;

public class ProductServiceImpl {
	
	private ArrayList<String> booklist = new ArrayList<>();
	private ArrayList<String> movies = new ArrayList<>();
	private ArrayList<String> music =new ArrayList<>();
	public ArrayList<String> getProductCategories()
	{
		ArrayList<String> categories = new ArrayList<>();
		categories.add("book");
		categories.add("music");
		categories.add("movies");
		return categories;
		
	}
	public ProductServiceImpl()
	{
		booklist.add("Inferno");
		booklist.add("Game of thrones");
		booklist.add("Joyland");
		
		music.add("chak de india");
		music.add("chandni chowk to china");
		music.add("dilbar");
		
		movies.add("nayak");
		movies.add("ishaqzade");
	
	}
	
	public ArrayList<String> getProducts(String category)
	{
		switch(category.toLowerCase())
		{
		case "book" :
			return booklist;
		case "music":
			return music;
		case"movies":
			return movies;
		}
		return null;
		}
	
	public boolean addProductCategory(String category,String product)
	
	{
		switch(category.toLowerCase())
		{
		case "book":
			 booklist.add(product);
			 break;
			
		case "movies":
			 movies.add(product);
			 break;
			
		case"music":
			 music.add(product);
			break;
		default:
				return false;				
		}
			return true;
	}
	public ArrayList<products> getProductsv2() {
		
		ArrayList<products> productList = new ArrayList<>();
		productList.add(new products("Java Brains", "1234", "10000000.00"));
		productList.add(new products("Webservices", "1564", "10998"));
		return productList;
		
	}
	}



 