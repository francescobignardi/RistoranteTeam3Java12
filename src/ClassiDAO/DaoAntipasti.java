package ClassiDAO;

import portate.Antipasti;
import portate.SecondiPiatti;

import java.sql.*;

public class DaoAntipasti {
    private static final String URL = "jdbc:mysql://localhost:3306/ristorante";
    private static final String USER = "root";
    private static final String PASS = "";

    public void queryCreateTableAntipasti(String nomeTabella) {
        try {

            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            //Inserire la sintassi della query e dare nome appropriato
            String queryCreate =
                    "CREATE TABLE if not exists " + nomeTabella + "(" +
                            "id int auto_increment primary key," +
                            "name varchar(255)," +
                            "price double," +
                            "isOutMenu boolean," +
                            "isCold boolean," +
                            "isFried boolean" +
                            ");";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(queryCreate);

            System.out.println("Query eseguita correttamente");
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Problema nella creazione della tabella " + nomeTabella);
            e.printStackTrace();
        }
    }

    public void insertAntipasti(Antipasti antipasti, String nomeTabella) {

        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            Statement statement = conn.createStatement();

            String insertQuery = "INSERT INTO " + nomeTabella +
                    " (name, price, isOutMenu, isCold, isFried) VALUES ('" +
                    antipasti.getName() + "', " + antipasti.getPrice() + ", " + antipasti.isOutMenu() + ", " +
                    antipasti.isCold() + ", " + antipasti.isFried() + ");";

            statement.executeUpdate(insertQuery);
            statement.close();
            conn.close();

            System.out.println("Insert effettuata con successo");
        } catch (Exception e) {
            System.out.println("Insert non riuscita");
            e.printStackTrace();
        }
    }

    public void printTable(String nomeTabella) {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM " + nomeTabella);
            ResultSetMetaData metaData = rs.getMetaData();
            int counter = metaData.getColumnCount();

            //per stampare le colonne
            for (int i = 1; i <= counter; i++) {
                System.out.print(metaData.getColumnName(i) + "\t");
            }
            System.out.println();

            //per stampare le righe
            while (rs.next()) {
                for (int i = 1; i <= counter; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateTable(Antipasti antipasti, int id, String nomeTabella) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            Statement statement = conn.createStatement();

            String updateQuery = "UPDATE " + nomeTabella +
                    " SET name='" + antipasti.getName() +
                    " ',price= " + antipasti.getPrice() +
                    ", isOutMenu= " + antipasti.isOutMenu() +
                    ", isCold= " + antipasti.isCold() +
                    ", isFried= " + antipasti.isFried() +
                    " WHERE id=" + id + ";";

            statement.executeUpdate(updateQuery);
            statement.close();
            conn.close();
            System.out.println("Tabella " + nomeTabella + " aggiornata");

        } catch (Exception e) {
            System.out.println("Errore durante l'aggiornamento della tabella");
            e.printStackTrace();
        }
    }

    public void deleteTableRow(int id, String nomeTabella) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            Statement statement = conn.createStatement();
            String deleteQuery =
                    "DELETE FROM " + nomeTabella +
                            " WHERE ID = " + id + " ;";

            statement.executeUpdate(deleteQuery);
            statement.close();
            conn.close();

            System.out.println("Delete eseguito con successo");

        } catch (Exception e) {
            System.out.println("Problema nell'eliminazione della riga con id " + id + " nella tabella  " + nomeTabella);
            e.printStackTrace();
        }
    }
}
