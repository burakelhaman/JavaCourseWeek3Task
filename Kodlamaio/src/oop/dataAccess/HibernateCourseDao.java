package oop.dataAccess;

import oop.entities.Category;
import oop.entities.Course;
import oop.entities.Educator;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void addEducatorDao(Educator educator) {
		System.out.println("Hibernate ile Öğretmen Eklendi : " + educator.getName());

	}

	@Override
	public void addCourseDao(Course course) {
		System.out.println("Hibernate ile Kurs Eklendi : " + course.getName());

	}

	@Override
	public void addCategoryDao(Category category) {
		System.out.println("Hibernate ile Kategori Eklendi : " + category.getName());

	}

}
