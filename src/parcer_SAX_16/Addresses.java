package parcer_SAX_16;

public class Addresses {
	private String _country;
    private String _city;
    private String _street;

    public String getCountry() {
        return _country;
    }
    public void setCountry(String country) {
        _country = country;
    }
    public String getCity() {
        return _city;
    }
    public void setCity(String city) {
        _city = city;
    }
    public String getStreet() {
        return _street;
    }
    public void setStreet(String street) {
        _street = street;
    }
    @Override
    public String toString() {
        return "Address [Country " + getCountry() + ", City "
                + getCity() + ", getStreet " + getStreet() + "]";
    }

}
