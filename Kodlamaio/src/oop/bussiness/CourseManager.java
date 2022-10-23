package oop.bussiness;

import java.util.ArrayList;
import java.util.List;
import oop.core.logging.Logger;
import oop.dataAccess.ICourseDao;
import oop.entities.Category;
import oop.entities.Course;
import oop.entities.Educator;

public class CourseManager {
	private ICourseDao courseDao;
	private Logger[] loggers;
	// Database'de data varmış gibi
	List<Course> courses = new ArrayList<>();
	List<Category> categories = new ArrayList<>();

	public CourseManager(ICourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void addEducator(Educator educator) {
		courseDao.addEducatorDao(educator);
		for (Logger logger : loggers) {
			logger.log(educator.getName());
		}
	}

	public void addCourse(Course course) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Kurs Fiyatı 0'dan Küçük Olamaz");
		} else if (courses.contains(course)) {
			throw new Exception("Farklı Bir Kurs Adı Giriniz!!");
		} else {
			courseDao.addCourseDao(course);
			for (Logger logger : loggers) {
				logger.log(course.getName());
			}
		}
	}

	public void addCategory(Category category) throws Exception {
		if (categories.contains(category)) {
			throw new Exception("Farklı Bir Kategori Adı Giriniz!!");
		} else {

			courseDao.addCategoryDao(category);
			for (Logger logger : loggers) {
				logger.log(category.getName());
			}
		}
	}
}
