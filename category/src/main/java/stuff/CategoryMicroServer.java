package stuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import stuff.service.repository.CategoryRepository;
import stuff.service.utils.CategoryFilterName;
import stuff.service.utils.CategorySorter;

@SpringBootApplication
public class CategoryMicroServer implements CommandLineRunner {
	
	@Autowired
	CategoryRepository repo;
	@Autowired
	CategorySorter categorySorter;
	@Autowired
	CategoryFilterName categoryFilterName;

	public static void main(String[] args) {
		SpringApplication.run(CategoryMicroServer.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/*		
		List<Category> categories = this.repo.getAll();
		
		for(int i = 0; i < categories.size(); i++) {
			System.out.println(categories.get(i));
		}
		System.out.println("\n");
		
		List<Category> reversed = categorySorter.reverseSortById(categories);
		
		for(int i = 0; i < reversed.size(); i++) {
			System.out.println(reversed.get(i));
		}
		System.out.println("\n");
		
		List<Category> byName = categorySorter.sortByName(categories);
		
		for(int i = 0; i < byName.size(); i++) {
			System.out.println(byName.get(i));
		}
		System.out.println("\n");
		
		List<Category> filterName = categoryFilterName.filter(categories, "C", true);
		
		for(int i = 0; i < filterName.size(); i++) {
			System.out.println(filterName.get(i));
		}
		System.out.println("\n");
*/	}
	
}
