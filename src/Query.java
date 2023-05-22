import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {
    //fields per la connessione al database

    private static final String URL = "";
    private static final String USER = "";
    private static final String PASS = "";

    //query create
//gestisci eccezioni dove opportuno
    public void queryCreateTableAntipasti() throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        System.out.println("Query eseguita correttamente");
        String queryCreate = """
                CREATE TABLE if not exists Antipasti(
                	id int auto_increment primary key,
                	name varchar(255),
                	price double,
                	isOutMenu boolean,
                    isCold boolean,
                    isFried boolean
                );""";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(queryCreate);

        stmt.close();
    }

    public void queryCreateTablePrimoPiatto() throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        String queryCreate = """
                CREATE TABLE if not exists PrimoPiatto(
                	id int auto_increment primary key,
                	name varchar(255),
                	price double,
                	isOutMenu boolean,
                	isIntegral boolean,
                	isGlutenFree boolean
                );""";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(queryCreate);
        System.out.println("Query eseguita correttamente");

        stmt.close();
    }

    public void queryCreateTableSecondiPiatti() throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        String queryCreate = """
                CREATE TABLE if not exists SecondiPiatti(
                	id int auto_increment primary key,
                	name varchar(255),
                	price double,
                	isOutMenu boolean,
                    hasSideDish boolean
                );""";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(queryCreate);
        System.out.println("Query eseguita correttamente");

        stmt.close();
    }

    public void queryCreateTableDolci() throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        System.out.println("Query eseguita correttamente");
        String queryCreate = """
                CREATE TABLE if not exists Dolci(
                	id int auto_increment primary key,
                	name varchar(255),
                	price double,
                	isOutMenu boolean,
                    isSugarFree boolean,
                    isLactoseFree boolean
                );""";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(queryCreate);

        stmt.close();
    }

    public void queryCreateTableBevande() throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        System.out.println("Query eseguita correttamente");
        String queryCreate = """
                CREATE TABLE if not exists Bevande(
                	id int auto_increment primary key,
                	name varchar(255),
                	price double,
                	isOutMenu boolean,
                    isCold boolean,
                    isHomeMade boolean,
                    isAlcoholic boolean
                );""";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(queryCreate);

        stmt.close();
    }

    public void queryInsertIntoAntipasti(String name, Double price, boolean isOutMenu, boolean isCold, boolean isFried) throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        String queryInsert=""
                + "insert into antipasti (name, price, isOutMenu, isCold, isFried) "
                + "values('"+name+"', "+price+"," +isOutMenu+","+ isCold+","+isFried+");";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(queryInsert);
        System.out.println("Query eseguita correttamente");

        stmt.close();
    }
}
