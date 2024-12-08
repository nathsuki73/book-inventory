package classes;

import java.util.Scanner;

public class Login {
    
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";
    
    int selected = 0;
    
    public String username;
    public String password;
    public boolean isValid;
    public Login() {

        while (true) {
            clearConsole();
            this.ShowLoginUi();
            boolean proceedLogin = this.ConfirmLogin();
            if (proceedLogin) {
                // Proceed to login
                System.out.println("Logging in...");
                break;
            }
        }
    }

    public void ShowLoginUi() {

        System.out.println("====================================");
        System.out.println("              Login                 ");
        System.out.println("------------------------------------");
        username = getInput(ANSI_GREEN + "Username: " + ANSI_RESET);
        password = getInput(ANSI_GREEN + "Password: " + ANSI_RESET);
        

    }

    private boolean ConfirmLogin() {
        System.out.println("\nProceed with this login?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        System.out.println("\nPrompt: ");
        selected = Integer.parseInt(getInput(""));

        if (selected == 1) {
            isValid = true;
        } else {
            isValid = false;
            
        }

        return isValid;
    }

    private String getInput(String prompt) {
        @SuppressWarnings("resource")

        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private void clearConsole() {
        System.out.print("\033\143");

    }
    
}
