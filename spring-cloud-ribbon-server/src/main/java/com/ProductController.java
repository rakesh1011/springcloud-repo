package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.converters.Auto;

@RestController
public class ProductController {
@Autowired
Environment enviornment;

@GetMapping("/")
public String Index() {
return "Product App- Home page";

}

@GetMapping("/productBackend")
public String productBackend() {
	
	String serverPort= enviornment.getProperty("local.server.port");
	System.out.println("# # # Inside ProductController backend,Response From server1:::"+serverPort);
	return "Hello from ProductController-Backend,Host:localhost,port:"+serverPort;
}
}