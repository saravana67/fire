package org.computer;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("38");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopSize();
		d.computerModel();
	}
	

}
