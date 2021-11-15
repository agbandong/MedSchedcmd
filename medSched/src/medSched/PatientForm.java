package medSched;

public class PatientForm {
	
	private int id;
	private int priority;
	private String name;
	
	public PatientForm(int id,int priority, String name) {
		super();
		this.id = id;
		this.priority = priority;
		this.name = name;
	}
	
	public PatientForm() {
	}

	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
