package by.htp.springmvc.dao.domain;

public class Car extends BaseEntity {
	private static final long serialVersionUID = 3834942036631822516L;
	
	private String model;
	private String brand;
	
	public  Car() {
		super();
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	
	public Car(int id, String model, String brand) {
		super(id);
		this.brand = brand;
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", brand=" + brand + "]";
	}
	
	
}
