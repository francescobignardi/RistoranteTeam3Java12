import java.sql.*;

public class Query {
    //fields per la connessione al database

    private static final String URL = "jdbc:mysql://localhost:3306/ristorante";
    private static final String USER = "root";
    private static final String PASS = "";

    //query create
//gestisci eccezioni dove opportuno
    public void queryCreateTableAntipasti() throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
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

        System.out.println("Query eseguita correttamente");
        stmt.close();
        conn.close();
    }

    public void queryCreateTablePrimiPiatti() throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        String queryCreate = """
                CREATE TABLE if not exists PrimiPiatti(
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
        conn.close();
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
        conn.close();
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
        conn.close();
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
        conn.close();
    }
    //TODO RIFORMATTARE E RIMODULARE CON SWITCH E PreparedStatement
    public void queryInsertIntoAntipasti(String name, Double price, boolean isOutMenu, boolean isCold, boolean isFried) throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        String queryInsert=""
                + "insert into Antipasti (name, price, isOutMenu, isCold, isFried) "
                + "values('"+name+"', "+price+"," +isOutMenu+","+ isCold+","+isFried+");";


        Statement stmt = conn.createStatement();
        stmt.executeUpdate(queryInsert);
        System.out.println("Query eseguita correttamente");

        stmt.close();
        conn.close();
    }
    public void queryInsertIntoPrimiPiatti(String name, Double price, boolean isOutMenu, boolean isIntegral, boolean isGlutenFree) throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        String queryInsert=""
                + "insert into PrimiPiatti (name, price, isOutMenu, isIntegral, isGlutenFree) "
                + "values('"+name+"', "+price+"," +isOutMenu+","+ isIntegral+","+isGlutenFree+");";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(queryInsert);
        System.out.println("Query eseguita correttamente");

        stmt.close();
    }
    public void queryInsertIntoSecondiPiatti(String name, Double price, boolean isOutMenu, boolean hasSideDish) throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        String queryInsert=""
                + "insert into SecondiPiatti (name, price, isOutMenu, hasSideDish) "
                + "values('"+name+"', "+price+"," +isOutMenu+","+ hasSideDish+");";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(queryInsert);
        System.out.println("Query eseguita correttamente");

        stmt.close();
    }
    public void queryInsertIntoDolci(String name, Double price, boolean isOutMenu, boolean isSugarFree, boolean isLactoseFree) throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        String queryInsert=""
                + "insert into Dolci (name, price, isOutMenu, isSugarFree, isLactoseFree) "
                + "values('"+name+"', "+price+"," +isOutMenu+","+isSugarFree +","+isLactoseFree+");";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(queryInsert);
        System.out.println("Query eseguita correttamente");

        stmt.close();
    }
    public void queryInsertIntoBevande(String name, Double price, boolean isOutMenu, boolean isCold, boolean isHomeMade, boolean isAlcoholic) throws SQLException {

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        //Inserire la sintassi della query e dare nome appropriato
        String queryInsert=""
                + "insert into Bevande (name, price, isOutMenu, isCold, isHomeMade, isAlcoholic) "
                + "values('"+name+"', "+price+"," +isOutMenu+","+ isCold+","+isHomeMade+","+isAlcoholic+");";

        Statement stmt = conn.createStatement();
        stmt.executeUpdate(queryInsert);
        System.out.println("Query eseguita correttamente");

        stmt.close();
    }
}
