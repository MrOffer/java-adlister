import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;
public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUsername(),
                    Config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Ad> all() {
        List<Ad> output = new ArrayList<>();

        String query = "Select * FROM ads";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                output.add(
                        new Ad(
                                rs.getLong("id"),
                                rs.getLong("userId"),
                                rs.getString("title"),
                                rs.getString("description")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return output;
    }


    @Override
    public void insert(Ad ad) {
        try {
            Statement statement = connection.createStatement();
            String insertQuery = String.format("INSERT INTO ads (title, description) VALUES ('%s', '%s')");
            statement.executeUpdate(insertQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

