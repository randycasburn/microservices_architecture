package stuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import stuff.service.repository.ProductRepository;

@SpringBootApplication
public class ProductMicroServer{
	
	@Autowired
	ProductRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(ProductMicroServer.class, args);
	}
}
