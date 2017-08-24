package com.stockcrowd.testClickSolidario.service.impl;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import com.stockcrowd.testClickSolidario.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {
	
	@Override
	@SuppressWarnings("unchecked")
	public JSONObject doPostToStockCrowd(String idDonation) throws Exception {
		String uri = "https://develop.stockcrowd.com/api/cs/donation/" + idDonation;
		URL url = new URL(uri);
		JSONObject request = new JSONObject();
		request.put("amount", 1);
		request.put("name", "Alejandro");
		request.put("lastname", "Lajusticia");
		request.put("email", "alejandro.lajusticia@stockcrowd.com");
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setRequestProperty("username", "sergi.pallares@hotmail.com");
		connection.setRequestProperty("token", "qwerty");
		connection.setDoOutput(true);
		connection.setDoInput(true);
		
		OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());				
		wr.write(request.toString());
		wr.flush();
		wr.close();
						
		JSONParser jsonParser = new JSONParser();
		return (JSONObject) jsonParser.parse(
				new InputStreamReader(connection.getInputStream(), "UTF-8"));
		
	}

}
