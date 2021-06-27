package problem2;

public class Teacher {

	private String name;
	private String[] subjects = new String[5];
	
	public Teacher() {
		
	}
	public Teacher(String name) {
		this.name = name;
	}
	public Teacher(String name, String[] subjects) {
		this.name = name;
		for(int i=0;i<Math.min(subjects.length,this.subjects.length);i++) {
			this.subjects[i] = new String();
			this.subjects[i]=subjects[i];
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		for(int i=0;i<Math.min(subjects.length,this.subjects.length);i++) {
			this.subjects[i] = new String();
			this.subjects[i]=subjects[i];
		}
	}
	public Team createTeam(String teamName) {
		Team team = new Team(teamName, this);
		return team;
	}

}
