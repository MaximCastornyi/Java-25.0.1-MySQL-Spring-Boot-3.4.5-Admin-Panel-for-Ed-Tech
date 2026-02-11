package com.edtechadmin.edtech_admin;

import com.edtechadmin.edtech_admin.dao.*;
import com.edtechadmin.edtech_admin.entity.Course;
import com.edtechadmin.edtech_admin.entity.Instructor;
import com.edtechadmin.edtech_admin.entity.Student;
import com.edtechadmin.edtech_admin.entity.User;
import com.edtechadmin.edtech_admin.service.*;
import com.edtechadmin.edtech_admin.utility.OperationUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class EdtechAdminApplication  implements CommandLineRunner {


	@Autowired
	private UserDao userDao;
	@Autowired
	private CourseDao courseDao;
	@Autowired
	private InstructorDao instructorDao;
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private RoleDao roleDao;

	public static void main(String[] args) {
		SpringApplication.run(EdtechAdminApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
        //OperationUtility.usersOperations(userDao);
        //OperationUtility.rolesOperations(roleDao);
        //OperationUtility.assignRolesToUsers(userDao, roleDao);
        //OperationUtility.instructorsOperations(userDao, instructorDao, roleDao);
        //OperationUtility.studentsOperations(userDao, studentDao, roleDao);
		//OperationUtility.coursesOperations(courseDao, instructorDao, studentDao);
	}


	public static final String ADMIN = "Admin";
	public static final String INSTRUCTOR = "Instructor";
	public static final String STUDENT = "Student";

//	@Bean
//	CommandLineRunner start(UserService userService, RoleService roleService, StudentService studentService, InstructorService instructorService, CourseService courseService) {
//		return args -> {
//			User user1 = userService.createUser("user1@gmail.com", "pass1");
//			User user2 = userService.createUser("user2@gmail.com", "pass2");
//
//			roleService.createRole(ADMIN);
//			roleService.createRole(INSTRUCTOR);
//			roleService.createRole(STUDENT);
//
//			userService.assignRoleToUser(user1.getEmail(), ADMIN);
//			userService.assignRoleToUser(user1.getEmail(), INSTRUCTOR);
//			userService.assignRoleToUser(user2.getEmail(), STUDENT);
//
//			Instructor instructor1 = instructorService.createInstructor("instructor1FN", "instructor1LN", "Experienced Instructor", "instructorUser1@gmail.com", "pass1");
//			Instructor instructor2 = instructorService.createInstructor("instructor2FN", "instructor2LN", "Senior Instructor", "instructorUser2@gmail.com", "pass2");
//
//			Student student1 = studentService.createStudent("std1FN", "std1LN", "beginner", "stdUser1@gmail.com", "pass1");
//			Student student2 = studentService.createStudent("std2FN", "std2LN", "master degree", "stdUser2@gmail.com", "pass2");
//
//			Course course1 = courseService.createCourse("Spring Service", "2 Hours", "Master Spring Service", instructor1.getInstructorId());
//			Course course2 = courseService.createCourse("Spring Data JPA", "4 Hours", "Introduction to JPA", instructor2.getInstructorId());
//
//			courseService.assignStudentToCourse(course1.getCourseId(), student1.getStudentId());
//			courseService.assignStudentToCourse(course2.getCourseId(), student2.getStudentId());
//		};
//	}

//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}

}
