import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operationType;// ADD, LIST
    private Person person;
    private ArrayList<Person> people;

    public PackageData(String operationType, Person person) {
        this.operationType = operationType;
        this.person = person;
    }

    public PackageData(String operationType) {
        this.operationType = operationType;
    }

    public PackageData(ArrayList<Person> people) {
        this.people = people;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
}
