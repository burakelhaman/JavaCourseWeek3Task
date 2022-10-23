package oop.dataAccess;

import oop.entities.Category;
import oop.entities.Course;
import oop.entities.Educator;

public interface ICourseDao {
	void addEducatorDao(Educator educator);

	void addCourseDao(Course course);

	void addCategoryDao(Category category);
}
