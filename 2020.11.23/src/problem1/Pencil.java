package problem1;

public class Pencil {

private String color="";
private String hardness="";

	
	public Pencil(String color, String hardness) {
		this.color = color;
		this.hardness = hardness;
	}
	public String getColor() {
		return color;
	}
	public String getHardness() {
		return hardness;
	}
	
	public boolean isMedium() {
		if(hardness=="HB"||hardness=="F") return true;
		return false;
	}
	public boolean isHard() {
		if(hardness.charAt(hardness.length()-1)=='H') return true;
		return false;
	}
	public boolean isSoft() {
		if(!isMedium() && !isHard()) return true;
		return false;
	}
}
