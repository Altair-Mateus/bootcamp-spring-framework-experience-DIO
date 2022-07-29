import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnJDBC {

    public static void main(String[] args)
    {
        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one";
        String user = "dio";
        String password = "password";

        //  Construindo String de conexão
        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String connUrl = sb.toString();

        //  Conexão
        try(Connection conn = DriverManager.getConnection(connUrl, user, password))
        {
            System.out.println("Conexão ao banco MySQL bem sucedida");
        } catch (SQLException e) {
            System.out.println("Falha na conexão ao BD MySQL \n" + e);
        }


    }// Fim do metodo main
}
