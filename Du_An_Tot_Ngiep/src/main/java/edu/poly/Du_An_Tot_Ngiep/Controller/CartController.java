package edu.poly.Du_An_Tot_Ngiep.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.poly.Du_An_Tot_Ngiep.Service.CartService;

@Controller
public class CartController {

	@Autowired
	CartService cart;

	@RequestMapping("/cart/add/{id}")
	public String add(@PathVariable("id") Integer id) {
		return "index";
	}

	@RequestMapping("/cart/remove/{id}")
	public String remove(@PathVariable("id") Integer id) {
		return "redirect:/product/list";
	}

}
