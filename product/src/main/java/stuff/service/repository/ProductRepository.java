package stuff.service.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import stuff.service.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
}
