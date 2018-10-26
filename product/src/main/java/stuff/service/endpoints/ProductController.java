package stuff.service.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import stuff.service.domain.Product;
import stuff.service.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository repo;

	@GetMapping(value= {"/", "/products"})
	Iterable<Product> findAll() {
		Iterable<Product> products = this.repo.findAll();
		return products;
	}

}
