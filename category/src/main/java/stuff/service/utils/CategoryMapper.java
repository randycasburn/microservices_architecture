package stuff.service.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import stuff.service.domain.Category;

@Component
public class CategoryMapper implements RowMapper<Category> {

	@Override
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		Category c = new Category();
		c.setId(rs.getInt("id"));
		c.setCategoryName(rs.getString("CategoryName"));
		c.setDescription(rs.getString("Description"));
		return c;
	}
}