public class PhonebookProfileCreator implements Profiles {

    private String firstName;
    private String lastName;
    private String age;
    private String phoneNumber;
    private String city;
    private String zipCode;
    private String county;
    private String streetName;
    private String streetNumber;

    @Override
    public String toString() {
        return
                "Name: " + firstName + "\n" +
                "lastName: " + lastName + "\n" +
                "age: " + age + "\n" +
                "phoneNumber: " + phoneNumber + "\n" +
                "city: " + city + "\n" +
                "zipCode: " + zipCode + "\n" +
                "county: " + county + "\n" +
                "streetName: " + streetName + "\n" +
                "streetNumber: " + streetNumber;
    }

    @Override
    public String getFirstname() {
        return this.firstName;
    }

    @Override
    public String getLastname() {
        return this.lastName;
    }

    @Override
    public String getAge() {
        return this.age;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public String getZipcode() {
        return this.zipCode;
    }

    @Override
    public String getCounty() {
        return this.county;
    }

    @Override
    public String getStreetName() {
        return this.streetName;
    }

    @Override
    public String getStreetNumber() {
        return this.streetNumber;
    }

    @Override
    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void setZipcode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }



}
