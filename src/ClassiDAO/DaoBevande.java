package ClassiDAO;

import portate.Antipasti;
import portate.Bevande;

import java.sql.*;

public class DaoBevande {
    private static final String URL = "jdbc:mysql://localhost:3306/ristorante";
    private static final String USER = "root";
    private static final String PASS = "";

    public void createTable(String nomeTabella) {
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
                            "isHomeMade boolean," +
                            "isAlcoholic boolean" +
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

    public void insert(Bevande bevande, String nomeTabella) {

        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            Statement statement = conn.createStatement();

            String insertQuery = "INSERT INTO " + nomeTabella +
                    " (name, price, isOutMenu, isCold, isHomeMade, isAlcoholic) VALUES ('" +
                    bevande.getName() + "', " + bevande.getPrice() + ", " + bevande.isOutMenu() + ", " +
                    bevande.isCold() + ", " + bevande.isHomeMade() + ", " + bevande.isAlcoholic() + ");";

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
