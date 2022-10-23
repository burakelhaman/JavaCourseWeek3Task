package oop.dataAccess;

import oop.entities.Category;
import oop.entities.Course;
import oop.entities.Educator;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void addEducatorDao(Educator educator) {
		System.out.println("JDBC ile Öğretmen Eklendi : " + educator.getName());

	}

	@Override
	public void addCourseDao(Course course) {
		System.out.println("JDBC ile Kurs Eklendi : " + course.getName());

	}

	@Override
	public void addCategoryDao(Category category) {
		System.out.println("JDBC ile Kategori Eklendi : " + category.getName());

	}

}
