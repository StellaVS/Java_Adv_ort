package parcer_SAX_16;

public class Students {
	private String _login;
	private String _faculty;
	private String _name;
	private String _phone;
	private Addresses _address;

	public String getLogin() {
		return _login;
	}

	public void setLogin(String login) {
		_login = login;
	}

	public String getFaculty() {
		return _faculty;
	}

	public void setFaculty(String faculty) {
		_faculty = faculty;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public Addresses getAddress() {
		return _address;
	}

	public void setAddress(Addresses address) {
		_address = address;
	}

	@Override
	public String toString() {
		return "Students [ " + getLogin() + "," + getFaculty() + "," + getName()
				+ "," + getPhone() + "," + getAddress() + "]";
	}

}
