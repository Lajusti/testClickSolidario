package com.stockcrowd.testClickSolidario.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stockcrowd.testClickSolidario.service.ShopService;

@Controller
public class ShopController {

	@Autowired
	private ShopService service;
	
	@GetMapping(value = "/materialize")
	public String getCartMaterialize() {
		return "materialize";
	}
	
	@GetMapping(value = "/bootstrap")
	public String getCartBootstrap() {
		return "bootstrap";	
	}
	
	@GetMapping(value = "/hidden")
	public String getHidden() {
		return "hidden";
	}
	
	@GetMapping(value = "/plain")
	public String getPlain() {
		return "plain";
	}
	
	@PostMapping(value = "/validate")
	public ModelAndView validateShop(@RequestParam Integer value, @RequestParam String idDonation) {
		ModelAndView mav = new ModelAndView("validate");
		if (!"".equals(idDonation))
			try {				
				JSONObject response = service.doPostToStockCrowd(idDonation);				
				mav.addObject("code", response.get("code"));
				mav.addObject("message", response.get("message"));
			} catch (Exception e) {
				mav.addObject("error", e.getMessage());				
				e.printStackTrace();
			}						
		return mav;
	}
	
}
