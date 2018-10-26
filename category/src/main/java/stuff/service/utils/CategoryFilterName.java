package stuff.service.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import stuff.service.domain.Category;

@Component
public class CategoryFilterName {
	public List<Category> filter(List<Category> categories, String s, Boolean caseSensitive) {
		List<Category> result = new ArrayList<Category>();
		for (int i = 0; i < categories.size(); i++) {
			Category c = categories.get(i);
			String name = c.getCategoryName();
			if(!caseSensitive) {
				name = name.toLowerCase();
			}
			if (name.contains(s)) {
				result.add(categories.get(i));
			}
		}
		return result;
	}
}
