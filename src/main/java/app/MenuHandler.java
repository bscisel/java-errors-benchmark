package app;

public class MenuHandler {
    public static void main(String[] args) {
        int userChoice = 1;

        switch (userChoice){
            case 0:
                System.out.println("User 0");
                break;
            case 1:
                System.out.println("User 1");
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
