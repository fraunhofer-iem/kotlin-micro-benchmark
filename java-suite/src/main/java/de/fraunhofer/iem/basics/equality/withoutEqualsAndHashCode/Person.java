package de.fraunhofer.iem.basics.equality.withoutEqualsAndHashCode;

/**
 * Helper class for equality example
 *
 * @author Ranjith Krishnamurthy
 */
public class Person {
    private String name;
    private String address;
    private int age;
    private String mobileNumber;

    public Person(String name, String address, int age, String mobileNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
