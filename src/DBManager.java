import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");///
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/person?useUnicode=true&serverTimezone=UTC","root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPerson(Person person){
        try{

            PreparedStatement statement = connection.prepareStatement("" +
                    "INSERT INTO info (id, name, surname, region, city, street, type, number, area, rooms, mobile) " +
                    "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            );
            statement.setString(1, person.getName());
            statement.setString(2, person.getSurname());
            statement.setString(3, person.getRegion());
            statement.setString(4, person.getCity());
            statement.setString(5, person.getStreet());
            statement.setString(6, person.getType());
            statement.setString(7, person.getNumber());
            statement.setString(8, person.getArea());
            statement.setString(9, person.getRooms());
            statement.setString(10, person.getMobile());

            statement.executeUpdate();// Insert, Delete, Update

            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Person> getAllPeople(){
        ArrayList<Person> personList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM info");
            ResultSet resultSet = statement.executeQuery();/// Select

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String region = resultSet.getString("region");
                String city = resultSet.getString("city");
                String street = resultSet.getString("street");
                String type = resultSet.getString("type");
                String number = resultSet.getString("number");
                String area = resultSet.getString("area");
                String rooms = resultSet.getString("rooms");
                String mobile = resultSet.getString("mobile");


                personList.add(new Person(id, name, surname, region, city, street, type, number, area, rooms, mobile));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return personList;
    }
    //// CRUD: Create(Insert into), Read(Select), Update, Delete
}

