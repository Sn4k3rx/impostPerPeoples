package entities;

public abstract class Peoples {
	
	private String name;
	private Double valueYear;
	
	public Peoples() {
		
	}
	
	public Peoples(String name, Double valueYear) {
		this.name = name;
		this.valueYear = valueYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValueYear() {
		return valueYear;
	}

	public void setValueYear(Double valueYear) {
		this.valueYear = valueYear;
	}
	
	public abstract Double impost();
	
}
