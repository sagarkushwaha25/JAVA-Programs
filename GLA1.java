class GLA1 {
	GLA1() {
		System.out.println("Non para cons.....");
	}

	GLA1(int a) {
		System.out.println("para cons....");
	}

	public static void main(String args[]) {
		GLA1 con1 = new GLA1(25);
		GLA1 con2 = new GLA1();
	}

}