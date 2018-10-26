package stuff.service.utils;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import stuff.service.domain.Category;

@Component("categorySorter")
public class CategorySorter {
	@Autowired
	ReverseCategoryComparatorById reversingComparator;
	@Autowired
	CategoryComparatorByName categoryComparatorByName;

	public List<Category> reverseSortById(List<Category> categories) {
		Collections.sort(categories, reversingComparator);
		return categories;
	}
	
	public List<Category> sortByName(List<Category> categories) {
		Collections.sort(categories, categoryComparatorByName);
		return categories;
	}
	

}
