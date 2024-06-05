public class DatabaseController {
    private static DatabaseController DatabaseControllerInstance = null;

    private DatabaseController(){
        this.DatabaseControllerInstance = this;
    };

    static DatabaseController getInstance(){
        if (DatabaseControllerInstance == null){
            return new DatabaseController();
        }
        return DatabaseControllerInstance;
    }

    String getDatabaseUrl(){
        return "jdbc:mysql://localhost:3306/";
    }

    String addClient(){
        return "dodano klienta";
    }

    String getClients(){
        return "wszyscy klienci w bazie";
    }
}
