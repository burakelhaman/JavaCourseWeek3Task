package oop;

import oop.bussiness.CourseManager;
import oop.core.logging.DatabaseLogger;
import oop.core.logging.FileLogger;
import oop.core.logging.Logger;
import oop.core.logging.MailLogger;
import oop.dataAccess.JdbcCourseDao;
import oop.entities.Category;
import oop.entities.Course;
import oop.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		Educator educator = new Educator("25", "Engin Demiroğ");
		Course course = new Course("36", "Java Programlama", 1);
		Category category = new Category("9", "Web Programlama");

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
		courseManager.addEducator(educator);
		courseManager.addCourse(course);
		courseManager.addCategory(category);
	}

}
