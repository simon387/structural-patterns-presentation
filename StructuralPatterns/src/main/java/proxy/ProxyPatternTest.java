package proxy;

public class ProxyPatternTest {

	public static void main(String[] args) {

		CommandExecutor executor = new CommandExecutorProxy("scelia", "password_sbagliata");

		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf --no-preserve-root /");
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}
