package com.stockcrowd.testClickSolidario.service;

import org.json.simple.JSONObject;

public interface ShopService {

	public JSONObject doPostToStockCrowd(String idDonation) throws Exception;
	
}
