package de.fraunhofer.iem.basics.equality.withEqualsAndHashCode;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = (result + ((name == null) ? 0 : name.hashCode())) * prime;
        result = (result + ((address == null) ? 0 : address.hashCode())) * prime;
        result = (result + Integer.hashCode(age)) * prime;
        result = (result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode())) * prime;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)     //Referential equality
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Person other = (Person) obj;

        if (this.name.equals(other.name)) {
            if (this.address.equals(other.address)) {
                if (this.age == other.age) {
                    return this.mobileNumber.equals(other.mobileNumber);
                }
            }
        }

        return false;
    }
}
