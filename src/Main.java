public class Main {
    public static void main(String[] args) {
        DatabaseController dbController = DatabaseController.getInstance();

        System.out.println(dbController.addClient());
        System.out.println(dbController.getDatabaseUrl());
    }
}