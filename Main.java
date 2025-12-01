import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try (Connection connexion = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/testdb",
                "postgres",
                "ton_mot_de_passe")) {
            System.out.println("Connexion réussie !");
        } catch (Exception e) {
            System.out.println("Erreur de connexion.");
        }
    }
}
