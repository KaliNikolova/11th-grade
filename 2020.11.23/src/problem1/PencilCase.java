package problem1;

import java.util.ArrayList;
import java.util.List;

public class PencilCase {

	private List<Pen> pens = new ArrayList<Pen>();
	private List<Pencil> pencils= new ArrayList<Pencil>();
	
	public PencilCase(List<Pen> pens,List<Pencil> pencils) {
		this.pens = pens;
		this.pencils = pencils;
	}
	public PencilCase() {
		
	}
	
	public void addPen(Pen pen) {
		pens.add(pen);
	}
	public void addPen(String color) {
		Pen pen = new Pen(color);
		pens.add(pen);
	}
	public void addPencil(Pencil pencil) {
		pencils.add(pencil);
	}
	public void addPencil(String color, String hardness) {
		Pencil pencil = new Pencil(color, hardness);
		pencils.add(pencil);
	}
	
	public void removePen(Pen pen) {
		for(Pen penFromPencilCase: pens) {
			if(penFromPencilCase==pen) pens.remove(penFromPencilCase);
		}
	}
	public void removePencil(Pencil pencil) {
				pencils.remove(pencil);
	}
	
	public int getNumberOfPens() {
		return pens.size();
	}
	public int getNumberOfPencils() {
		return pencils.size();
	}
	
	public boolean isMediumPencil() {
		for(Pencil pencil: pencils) {
			if(pencil.isMedium()) return true;
		}
		return false;
	}
	public boolean isHardPencil() {
		for(Pencil pencil: pencils) {
			if(pencil.isHard()) return true;
		}
		return false;
	}
	public boolean isSoftPencil() {
		for(Pencil pencil: pencils) {
			if(pencil.isSoft()) return true;
		}
		return false;
	}
	public boolean isPenColor(String color) {
		for(Pen pen: pens) {
			if(color.equals(pen.getColor())) return true;
		}
		return false;
	}
	public boolean isPencilColor (String color) {
		for(Pencil pencil: pencils) {
			if(color.equals(pencil.getColor())) return true;
		}
		return false;
	}
}
