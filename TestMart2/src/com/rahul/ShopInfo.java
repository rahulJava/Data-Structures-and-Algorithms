package com.rahul;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


@WebService
@SOAPBinding(style=Style.RPC,use=Use.LITERAL)
public class ShopInfo {
	@WebMethod
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName="lookupinput") String props)
	{
		String response="Invalid Property";
		if("shopName".equals(props))
		{
			 response= "Test Mart";
		}
		else if ("since".equals(props))
		{
			response ="since 2012";
		}
		return response;
	}
	@WebMethod
	public List<String> getProductCategories()
	{
		List<String> categories = new ArrayList<>();
		categories.add("book");
		categories.add("music");
		categories.add("movies");
		return categories;
		
	}

}
