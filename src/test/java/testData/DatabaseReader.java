package testData;

import java.sql.*;

public class DatabaseReader {

    public DatabaseReader() throws SQLException {
    }

    public void databaseConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root","");
        if(connection.isClosed()){
            System.out.println("Not connected to the Database");
        }
        else{
            System.out.println("connected to the database");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employees where employee_id = 102");

            while (resultSet.next()){
                System.out.println("first_name");
                System.out.println("Last_name");
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        DatabaseReader data = new DatabaseReader();
        data.databaseConnection();
    }
}

