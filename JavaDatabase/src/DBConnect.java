import java.sql.*;

public class DBConnect {
    public static void main(String[] args) throws SQLException {
        Connection connect = null;
      //  connect.setAutoCommit(false); preparedStatement.close();
        String sql = "SELECT * FROM employees";
        String insert1 = "INSERT INTO employees (id,name, position, salary) VALUES ('51','Ali Desidero', 'Asistant Manager', '7499')";
        String insert2 = "INSERT INTO employees(id,name, position, salary) VALUES ('52','Malvina Klamp','VP', '6599')";
        String insert3 = "INSERT INTO employees (id,name, position, salary) VALUES ('53','Mehmet Ali Birand','Journalist', '7255')";
        String insert4 = "INSERT INTO employees (id,name, position, salary) VALUES ('54','Müslüm Gürses','Software Engineer', '7300')";
        String insert5 = "INSERT INTO employees (id,name, position, salary) VALUES ('55','Osman Pamukoğlu','Marketing Manager', '6555')";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/odev", "root", "mysql");
            System.out.println("Database Connected");
            Statement statement = connect.createStatement();
            statement.executeUpdate(insert1);
            statement.executeUpdate(insert2);
            statement.executeUpdate(insert3);
            statement.executeUpdate(insert4);
            statement.executeUpdate(insert5);

            //statment update kullanımı
            statement.executeUpdate("UPDATE employees SET name = 'Mert Pehlivan' WHERE id = 1");


            //PreparedStatement kullanımı
            PreparedStatement preparedStatement = connect.prepareStatement("INSERT INTO employees (id,name, position, salary) VALUES (?, ?, ?, ?)");
            preparedStatement.setInt(1, 56);
            preparedStatement.setString(2, "Hüseyin Avni Aker");
            preparedStatement.setString(3, "Machine Learning Engineer");
            preparedStatement.setInt(4, 7000);
            preparedStatement.executeUpdate();
            preparedStatement.executeUpdate("UPDATE employees SET name = 'Cira Isaac' WHERE id = 49");
            preparedStatement.executeUpdate("DELETE FROM employees WHERE id = 20");



            ResultSet data = statement.executeQuery(sql);
            while (data.next()) {
                System.out.println(data.getInt("id") + " " + data.getString("name") + " " + data.getString("position") + " " + data.getInt("salary"));
            }
            statement.close();
            preparedStatement.close();
            connect.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
