import java.util.Set;

public class SchoolClass implements java.io.Serializable {

	private long id;
	private int startYear;
	private int currentYear;
	private String profile;
	private Set<Student> students;
	private Set<Teacher> teachers;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	public String toString() {
		return "Class: " + profile + "\n\tStarted: " + getStartYear() + "\n\tCurrent year: " + getCurrentYear() + "";
	}
	
}