package by.htp.springmvc.dao.domain;

public abstract class BaseEntity {
	private static final long serialVersionUID = -966558700808733981L;
	private int id;
	
	public BaseEntity() {
		super();
	}
	public BaseEntity(int id) {
		super();
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
