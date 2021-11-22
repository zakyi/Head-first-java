class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] copyForm = {
			"1", "2", "3", "4"
		};

		String[] copyTo = new String[2];
		System.arraycopy(copyForm, 2, copyTo, 0, 2);
		for (String number  : copyTo) {
			System.out.print(number + " ");
		}
	}
}