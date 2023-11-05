package pl.javastart.task;

public class Address {

    private String city;
    private String street;
    private String houseNumber;
    private String flatNumber;

    public Address(String city, String street, String houseNumber, String flatNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    private String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    private String getStreet() {
        return street;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    private String getHouseNumber() {
        return houseNumber;
    }

    private void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    private String getFlatNumber() {
        return flatNumber;
    }

    private void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    protected String printAddressDetails() {
        return "Miasto: " + city + ", Ulica: " + street + " " + houseNumber + "/" + flatNumber;
    }
}
