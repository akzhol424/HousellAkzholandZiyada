import java.io.Serializable;
public class Person implements Serializable {
    private Integer id;
    private String name;
    private String surname;
    private String region;
    private String city;
    private String street;
    private String type;
    private String number;
    private String area;
    private String rooms;
    private String mobile;

    public Person() {
    }

    public Person(Integer id, String name, String surname, String region, String city, String street, String type, String number, String area, String rooms, String mobile) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.region = region;
        this.city = city;
        this.street = street;
        this.type = type;
        this.number = number;
        this.area = area;
        this.rooms = rooms;
        this.mobile = mobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return id + name + surname + region + city + street + type + number + area + rooms + mobile;
    }
}
