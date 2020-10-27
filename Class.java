package schoolManagement;

public class Class {

	private String courseName;
	private int duration;
	private Instructor instructor;
	
	public Class(String courseName, int duration, Instructor instructor) {
		setCourseName(courseName);
		setDuration(duration);
		this.instructor = instructor;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	public void setCourseName(String courseName) {
		if (!courseName.isEmpty() && !courseName.equalsIgnoreCase(null)) {
			this.courseName = courseName;
		} else {
			this.courseName = "Uknown";
		}
	}
	
	public void setDuration(int duration) {
		if (duration < 4) {
			this.duration = 4;
		} else {
			this.duration = duration;
		}
	}
	
}
