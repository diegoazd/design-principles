package mx.com.kubo.bloaters;

public class Address {
    private String street;
    private String numberInt;
    private String numberExt;
    private String postalCode;
    private String colony;
    private String city;
    private String state;
    private String country;

    public Address(String street, String numberInt, String numberExt,
                   String postalCode, String colony, String city,
                   String state, String country) {
        this.street = street;
        this.numberInt = numberInt;
        this.numberExt = numberExt;
        this.postalCode = postalCode;
        this.colony = colony;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public boolean isValid() {
        return !isEmptyField(street) &&
               !isEmptyField(numberInt) &&
                !isEmptyField(numberExt) &&
                !isEmptyField(postalCode) &&
                !isEmptyField(colony) &&
                !isEmptyField(city) &&
                !isEmptyField(state) &&
                !isEmptyField(country);

    }

    private boolean isEmptyField(String field) {
        return (field == null || field.isEmpty());
    }
}
