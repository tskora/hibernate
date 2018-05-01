import java.util.Set;

public class Teacher {

	private long id;
	
	private String name;
	
	private String subject;
	
	private Set<SchoolClass> schoolClasses;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Set<SchoolClass> getSchoolClasses() {
		return schoolClasses;
	}

	public void setSchoolClasses(Set<SchoolClass> schoolClasses) {
		this.schoolClasses = schoolClasses;
	}

	public String toString() {
		return "Teacher "+name+" (Subject: "+subject+")";
	}
}
