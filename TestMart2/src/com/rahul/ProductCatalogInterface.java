package com.rahul;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;



import com.rahul.model.products;

@WebService(name="TestMartCatalog123_1", portName="TestMartCatalogPort1234",targetNamespace="http://www.foodsdestination.com")
@SOAPBinding(style = Style.RPC)
public interface ProductCatalogInterface {

	
	@WebMethod(action="fetch_categories",operationName="fetchCategories")
	public abstract ArrayList<String> getProductService();

	@WebMethod()
	public abstract ArrayList<String> getProducts(String category);

	@WebMethod()
	public abstract boolean addProduct(String category, String product);

	@WebMethod()
	@WebResult(name="products")
	public abstract ArrayList<products> getProductSv2(String category);

}