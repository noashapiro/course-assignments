import java.sql.*;

public class DBTest {
    private static final String USER_NAME = "XFjA4XJrNw";
    private static final String DATABASE_NAME = "XFjA4XJrNw";
    private static final String PASSWORD = "1MyvHdYTQv";
    private static final String PORT = "3306";
    private static final String SERVER = "remotemysql.com";

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://"+SERVER+":"+PORT, USER_NAME, PASSWORD);
        //createTable(con);

        //insertDogs(con, "Bel", 2,"King charles");
        //insertDogs(con, "Niki", 10,"Border kolie");
        //insertDogs(con, "Mika", 6,"Labrador");

        // updateDogAge(con,12,"Niki");

        //deleteDogByName(con, "Mika");

        getTableContent(con);

        con.close();
    }

    private static void createTable(Connection con) throws SQLException {
        String statementToExecute = "CREATE TABLE " + DATABASE_NAME + ".`dogs`(`name` VARCHAR(40) NOT NULL, `age` INT NOT NULL,`breed` VARCHAR(30) NOT NULL);";
        con.createStatement().execute(statementToExecute);
    }

    private static void insertDogs(Connection con, String name, int age, String breed) throws SQLException {
        String statementToExecute = "INSERT INTO " + DATABASE_NAME + ".dogs (`name`, `age`,`breed`) VALUES ('" + name + "', '" + age + "', '" + breed + "');";
        con.createStatement().execute(statementToExecute);
    }

    private static void updateDogAge(Connection con, int age, String name) throws SQLException {
        String statementToExecute = "UPDATE `" + DATABASE_NAME + "`.`dogs` SET `age`='"+age+"' WHERE `name`='"+name+"';";
        con.createStatement().executeUpdate(statementToExecute);
    }

    private static void deleteDogByName(Connection con, String name) throws SQLException {
        String statementToExecute = "DELETE FROM `" + DATABASE_NAME + "`.`dogs` WHERE `name`='"+name+"';";
        con.createStatement().execute(statementToExecute);
    }

    private static void getTableContent(Connection con) throws SQLException {
        String statementToExecute = "SELECT * FROM " + DATABASE_NAME + ".dogs;";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(statementToExecute);
        while(rs.next()){
            //Retrieve by column name
            String name = rs.getString("name");

            //Display values
            System.out.print(" Name: " + name);
        }
        rs.close();
    }

}
