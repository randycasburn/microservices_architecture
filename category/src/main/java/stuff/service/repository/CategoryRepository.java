package stuff.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import stuff.service.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {}
