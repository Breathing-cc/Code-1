import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        //1.注册Driver
        Class.forName("com.mysql.jdbc.Driver");
        //2.通过DriverManager获取数据库连接
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student?useSSL=false",
                "root",
                "13325508211c"
        );
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SHOW TABLES");
        while (resultSet.next()){
            //JDBC，是列从1开始的
            String tableName = resultSet.getString(1);
            System.out.println(tableName);
        }
        resultSet.close();

        // 关闭 statement
        statement.close();

        //最后关闭连接
        connection.close();
    }
}
