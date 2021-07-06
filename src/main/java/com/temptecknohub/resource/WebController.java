package com.temptecknohub.resource;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.temptecknohub.model.Request;
import com.temptecknohub.repository.RequestRepository;

@Controller
public class WebController {

	@Autowired
	RequestRepository requestRepository;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@PostMapping("/create-order")
	@ResponseBody
	public String createOrder(@RequestBody Map<String, Object> data) throws RazorpayException {
		RazorpayClient razorpayClient = new RazorpayClient("rzp_test_fS3k81U9Notfcz", "OsoJQTEFAseTv5hDJ67eNoYn");

		System.out.println("Inside Create Order");

		JSONObject options = new JSONObject();
		options.put("amount", 50000);
		options.put("currency", "INR");
		options.put("receipt", "txn_123456");

		Order order = razorpayClient.Orders.create(options);

		return order.toString();
	}

	@PostMapping("/save-request")
	public String saveRequest(@RequestParam Map<String, String> data) {
		System.out.println(data);
		Request request = new Request(data.get("FirstName"), data.get("LastName"), data.get("Email"), data.get("City"),
				data.get("State"), data.get("PhoneNumber"), data.get("Description"));
		System.out.println(request);
		requestRepository.save(request);
		return "home";
	}
}
