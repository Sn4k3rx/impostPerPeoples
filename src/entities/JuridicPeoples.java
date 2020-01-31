package entities;

public class JuridicPeoples extends Peoples{
	
	private Integer numberEmployee;
	
	public JuridicPeoples() {
		super();
	}
	
	public JuridicPeoples(String name, Double valueYear, int number) {
		super(name, valueYear);
		this.numberEmployee = number;
	}
	
	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public Double impost() {
		if (getValueYear() > 10) {
			return getValueYear() * 0.14;
		}else {
			return getValueYear() * 0.16;
		}
	}
}
