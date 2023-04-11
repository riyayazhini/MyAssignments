package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("19 inches");
	}

	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.computerModel();
		dt.desktopSize();
	}

}
