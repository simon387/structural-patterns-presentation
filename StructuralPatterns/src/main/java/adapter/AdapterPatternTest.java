package adapter;

public class AdapterPatternTest {

	public static void main(String[] args) {

		SocketAdapter sockAdapter = new SocketClassAdapterImpl();

		Volt v3 = getVolt(sockAdapter, 3);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v240 = getVolt(sockAdapter, 120);
		System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
		System.out.println("v240 volts using Class Adapter=" + v240.getVolts());
	}

	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
			case 3:
				return sockAdapter.get3Volt();
			case 12:
				return sockAdapter.get12Volt();
			case 120:
				return sockAdapter.get240Volt();
			default:
				return sockAdapter.get240Volt();
		}
	}
}
