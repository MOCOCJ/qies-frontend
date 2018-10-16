package moco.qiesfrontend.session;

/**
 * NoSession
 */
public class NoSession implements Session {

    @Override
    public TransactionQueue process(SessionManager manager, TransactionQueue queue) {
        Input input = manager.getInput();
        boolean run = true;
        String message = "You are not logged in, please log in before performing any other actions. (login)";
        String userInput;

        while (run) {
            userInput = input.takeInput(message);

            if (userInput.equals("login")) {
                run = false;
                logIn(manager);
            }
            message = "Invalid input. " + message;
        }

        return queue;
    }

    public boolean logIn(SessionManager manager) {

    }
}