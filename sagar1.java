class first {
	void func() {
		System.out.println("first function");
	}

	class second extends first {

		void func() {
			System.out.println("second function");
		}
	}

	class third extends second {

		void func() {
			System.out.println("third funchtion");
		}
	}

	public static void main(String args[]) {
		first obj = new first();
		obj.func();
	}
}