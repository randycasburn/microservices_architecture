package stuff.service.utils;

import java.util.Comparator;

import org.springframework.stereotype.Component;

import stuff.service.domain.Category;

@Component
public class CategoryComparatorByName implements Comparator<Category> {
	@Override
	public int compare(Category c1, Category c2) {
		return c1.getCategoryName().compareTo(c2.getCategoryName());
	}
}