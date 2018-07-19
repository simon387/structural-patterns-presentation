package proxy;

public class ProxyPatternTest {

	private static String OS = System.getProperty("os.name").toLowerCase();

	public static void main(String[] args) {

		CommandExecutor executor = new CommandExecutorProxy("scelia", "password_sbagliata");

		try {
			if (isWindows()) {
				executor.runCommand("cmd.exe /c cd .");
				executor.runCommand("cmd.exe /c format c:\\");
			} else {
				executor.runCommand("ls -ltr");
				executor.runCommand(" rm -rf --no-preserve-root /");
			}

		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

	public static boolean isWindows() {

		return (OS.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (OS.indexOf("mac") >= 0);

	}

	public static boolean isUnix() {

		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );

	}

	public static boolean isSolaris() {

		return (OS.indexOf("sunos") >= 0);

	}
}
