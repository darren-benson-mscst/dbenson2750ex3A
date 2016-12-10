package dbenson2750ex3a_UI;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import dbenson2750ex3a_domain.Assignment;
import dbenson2750ex3a_domain.Course;
import dbenson2750ex3a_domain.CourseGrade;
import dbenson2750ex3a_domain.Department;
import dbenson2750ex3a_domain.Person;
import dbenson2750ex3a_domain.School;
import dbenson2750ex3a_domain.Section;
import dbenson2750ex3a_domain.Student;
import dbenson2750ex3a_domain.Term;

public class Main {

	public static void main(String[] args) {
		
		School school = new School("Southeast Tech");
		
		System.out.println("School: " + school.getName() + "\n");
		
		// ================= Add terms =================
		
		school.newTerm(20161, "2015 Summer");
		school.newTerm(20163, "2015 Fall");
		school.newTerm(20165, "2016 Spring");
		school.newTerm(20171, "2016 Summer");
		school.newTerm(20173, "2016 Fall");
		school.newTerm(20175, "2017 Spring");
		
		System.out.println("Terms:");
		ArrayList<Term> terms = school.getTerms();		
		
		for (Term t : terms){
			System.out.println("    " + t.toString());
		}
		
		// ================= Add departments =================
        school.newDepartment("ACCT", "Accounting");
        school.newDepartment("ADMS", "Administative Support");
        school.newDepartment("COMC", "Computer Careers");
        school.newDepartment("COMP", "Gen Ed Computers");
        
        System.out.println("Departments:");
        ArrayList<Department> departments = school.getDepartments();
        for (Department d : departments) {
            System.out.println("   " + d.toString());  
        }
        
        // ================= Add students =================
        school.newStudent(100001, new Person("Student", "One"));
        school.newStudent(100002, new Person("Student", "Two"));
        school.newStudent(100003, new Person("Student", "Three"));
        school.newStudent(100004, new Person("Student", "Four"));
        school.newStudent(100005, new Person("Student", "Five"));
        school.newStudent(100006, new Person("Student", "Six"));
        
        
        System.out.println("Students:");
        ArrayList<Person> people = school.getPersons();
        for (Person p : people) {
            Student s = p.getStudent();
            System.out.println("   " + s.toString());  
        }
        
     // ================= Add courses =================
        Department department;
        department = school.getDepartment("ACCT");
        department.newCourse("1210", "Principles of Bookkeeping I", 2);
        department.newCourse("1218", "Spreadsheet Concepts and Applications", 3);
        department.newCourse("1231", "Database Concepts and Applications", 3);
        department.newCourse("2210", "Principles of Accounting I", 4);

        department = school.getDepartment("ADMS");
        department.newCourse("1417", "Word Processing I", 2);
        department.newCourse("1425", "Desktop Publishing with Publisher", 2);
        department.newCourse("1452", "Electronic Presentations", 2);

        department = school.getDepartment("COMC");
        department.newCourse("1714", "Microsoft Access", 3);
        department.newCourse("1741", "Web Design with Expression Web", 3);
        department.newCourse("2722", "Database Design and Management with SQL", 3);
        department.newCourse("2730", "Intro to Visual Basic.Net", 3);
        department.newCourse("2733", "Web Client Scripting", 3);
        department.newCourse("2740", "Intro to Java, C, C#, C++ Programming", 3);
        department.newCourse("2742", "Java, C#, C++ Programming II", 3);

        department = school.getDepartment("COMP");
        department.newCourse("1510", "Computer Basics", 3);
        department.newCourse("2515", "Computers: Issues and Applications", 3);
        department.newCourse("2520", "Graphic Design I", 3);
        
        // Display Courses
        System.out.println("\nCourses:");
        departments = school.getDepartments();
        for (Department d : departments) {
            System.out.println("\n   " + d.toString());           
            ArrayList<Course> courses = d.getCourses();
            for (Course c : courses) {
                System.out.println("      " + c.toString());    
            }
        }
        
        // ================= Add sections =================
        department = school.getDepartment("COMC");
        Term term = school.getTerm(20163);    

        Course course = department.getCourse("1714");
        course.newSection(term, 101, 30);
        course.newSection(term, 102, 30);
        course = department.getCourse("1741");
        course.newSection(term, 103, 30);
        course.newSection(term, 104, 30);

        term = school.getTerm(20165);    
        course = department.getCourse("2722");
        course.newSection(term, 201, 30);
        course.newSection(term, 202, 30);
        course = department.getCourse("2733");
        course.newSection(term, 203, 30);
        course.newSection(term, 204, 30);

        term = school.getTerm(20173);    
        course = department.getCourse("1714");
        course.newSection(term, 401, 30);
        course.newSection(term, 402, 30);
        course = department.getCourse("1741");
        course.newSection(term, 403, 30);
        course.newSection(term, 404, 30);

        term = school.getTerm(20175);    
        course = department.getCourse("2722");
        course.newSection(term, 501, 30);
        course.newSection(term, 502, 30);
        course = department.getCourse("2742");
        course.newSection(term, 503, 30);
        course.newSection(term, 504, 30);
        
        // Display Sections
        System.out.println("\nSections:");
        departments = school.getDepartments();
        for (Department d : departments) {
            ArrayList<Course> courses = d.getCourses();
            for (Course c : courses) {
                ArrayList<Section> sections = c.getSections();
                if (!sections.isEmpty()) {
                    System.out.println(
                        c.getDepartment().getId() +
                        c.getCourseNumber() + " " +
                        c.getCourseName());
                }
                for (Section s : sections) {
                    System.out.println("   " + s.toString());
                }
            }
        }
        
     // ============ Add assignments, course grades, & students ===========
        department = school.getDepartment("COMC");
        course = department.getCourse("1714");
        term = school.getTerm(20163);
        Section section = course.getSection(101, term);          
        section.newAssignment(1, 'A', "D2L Discussion: Introduction",
                new GregorianCalendar(), 10);
        section.newAssignment(1, 'B', "p01-64 Chapter 1 Tutorial",
                new GregorianCalendar(), 30);
        section.newAssignment(1, 'C', "p65Ch1 Apply Your Knowledge",
                new GregorianCalendar(), 10);

        Student student = school.getStudent(100001);
        section.newCourseGrade(student, 'Z');

        student = school.getStudent(100002);
        section.newCourseGrade(student, 'Z');
        
        student = school.getStudent(100003);
        section.newCourseGrade(student, 'Z');

        section = course.getSection(102, term);                  
        section.newAssignment(1, 'A', "p01-64 Chapter 1 Tutorial",
                new GregorianCalendar(), 30);
        section.newAssignment(1, 'B', "p65 Ch1 Apply Your Knowledge",
                new GregorianCalendar(), 10);
        section.newAssignment(1, 'C', "p67-68 Ch1 In the Lab 1",
                new GregorianCalendar(), 10);

        student = school.getStudent(100003);
        section.newCourseGrade(student, 'Z');

        student = school.getStudent(100004);
        section.newCourseGrade(student, 'Z');
        
        student = school.getStudent(100005);
        section.newCourseGrade(student, 'Z');
        
        // Display Sections with assignments
        System.out.println("\nSections:");
        departments = school.getDepartments();
        for (Department d : departments) {
            ArrayList<Course> courses = d.getCourses();
            for (Course c : courses) {
                ArrayList<Section> sections = c.getSections();
                for (Section s : sections) {
                    ArrayList<Assignment> assignments = s.getAssignments();
                    if (!assignments.isEmpty()) {
                        System.out.println(
                            c.getDepartment().getId() +
                            c.getCourseNumber() + " " +
                            c.getCourseName());
                        System.out.println("   " + s.toString());
                    }
                    for (Assignment a : assignments) {
                        System.out.println("      " + a.toString());
                    }
                    ArrayList<CourseGrade> courseGrades = s.getCourseGrades();
                    for (CourseGrade cg : courseGrades) {
                        System.out.println("      " + cg.toString());
                    }
                }
            }
        }
	}

}
