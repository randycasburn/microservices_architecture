package stuff.service.utils;

import java.util.Comparator;

import org.springframework.stereotype.Component;

import stuff.service.domain.Category;

@Component("reverseCategoryComparatorById")
public class ReverseCategoryComparatorById implements Comparator<Category> {
	@Override
	public int compare(Category c1, Category c2) {
		return (int) (c2.getId() - c1.getId());
	}
}
