package entities;

public class FisicPeoples extends Peoples{
	
	private Double valueHospital;
	
	public FisicPeoples() {
		super();
	}
	
	public FisicPeoples(String name, Double valueYear, Double valueHospital) {
		super(name, valueYear);
		this.valueHospital = valueHospital;
	}
	
	public Double getValueHospital() {
		return valueHospital;
	}
	
	public void setValueHospital(Double value) {
		this.valueHospital = value;
	}
	
	@Override
	public Double impost() {
		if (getValueYear() < 20000) {
			return getValueYear() * 0.15 - valueHospital * 0.5;
		}else {
			return getValueYear() * 0.25 - valueHospital * 0.5;
		}
	}
	
	
}
