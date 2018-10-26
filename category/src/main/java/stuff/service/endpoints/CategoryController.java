package stuff.service.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import stuff.service.domain.Category;
import stuff.service.repository.CategoryRepository;

@RestController
public class CategoryController {

	@Autowired
	CategoryRepository repo;
	
	@GetMapping(value= {"/", "/categories"})
	Iterable<Category> findAll() {
		Iterable<Category> categories = this.repo.findAll();
		return categories;
	}

}
