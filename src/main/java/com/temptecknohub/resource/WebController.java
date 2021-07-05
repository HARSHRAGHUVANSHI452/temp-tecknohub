package com.temptecknohub.resource;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Controller
public class WebController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@PostMapping("/payment")
	@ResponseBody
	public String payment(@RequestBody Map<String, Object> data) throws RazorpayException {
		RazorpayClient razorpayClient = new RazorpayClient("key_id", "key_secret");

		JSONObject options = new JSONObject();
		options.put("amount", 50000);
		options.put("currency", "INR");
		options.put("receipt", "txn_123456");

		Order order = razorpayClient.Orders.create(options);

		return order.toString();
	}
}
