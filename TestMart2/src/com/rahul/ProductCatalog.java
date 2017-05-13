package com.rahul;


import java.util.ArrayList;
import java.util.List;









import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;


import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.rahul.business.ProductServiceImpl;
import com.rahul.model.products;

@WebService(endpointInterface="com.rahul.ProductCatalogInterface",portName="TestMartCatalogPort1234",serviceName="TestMartService")

public class ProductCatalog implements ProductCatalogInterface
{
	ProductServiceImpl  productService = new ProductServiceImpl();
	/* (non-Javadoc)
	 * @see com.rahul.ProductCatalogInterface#getProductService()
	 */
	
	@Override
	public ArrayList<String> getProductService()
	 {
		 return productService.getProductCategories();
	 }
	/* (non-Javadoc)
	 * @see com.rahul.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	
	public ArrayList<String> getProducts (String category)
	{
		return productService.getProducts(category);
	}
	/* (non-Javadoc)
	 * @see com.rahul.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	
	public boolean addProduct(String category,String product)
	{
		return productService.addProductCategory(category, product);
	}
	/* (non-Javadoc)
	 * @see com.rahul.ProductCatalogInterface#getProductSv2(java.lang.String)
	 */
	@Override
	@WebResult(name="products")
	public ArrayList<products> getProductSv2(String category)
	 {
		 return productService.getProductsv2();
	 }
}
