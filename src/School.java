import java.util.Set;

@SuppressWarnings("serial")
public class School implements java.io.Serializable {

	private long id;
	private String name;
	private String address;
	private Set<SchoolClass> schoolClasses;
	
	public School() {
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Set<SchoolClass> getSchoolClasses() {
		return schoolClasses;
	}

	public void setSchoolClasses(Set<SchoolClass> schoolClasses) {
		this.schoolClasses = schoolClasses;
	}
	
	public String toString() {
		return "School: " + getName() + " (" + getAddress() + ")";
	}


}
