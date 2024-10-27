package com.RajIt.BestStore.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.RajIt.BestStore.model.Product;
import com.RajIt.BestStore.services.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductsControler {
	 @Autowired
	 private ProductRepository productRepository;
	  
	 
	 @GetMapping({"","/"})
	 public String showProductsList( Model model) {
		 List<Product> products = productRepository.findAll();
		   model.addAttribute("products",products);
		    return "products/index";
		
	}

}
