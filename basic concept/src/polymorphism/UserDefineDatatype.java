package polymorphism;

public class UserDefineDatatype {
	String name;
	String id;
	Double height;

	public UserDefineDatatype(String name, String id, Double height) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
		this.height=height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Double getHeight() {
		return height;
	}

	

   public String toString() {

        return name+" "+id+" "+height;

}

}
