public class DetectarNumerosDuplicados {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 3, 7, 9, 8, 5, 2, 5 };

		// Compara cada posicion con las siguientes para detectar repeticiones.
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					System.out.println("Numero Repetido: " + nums[i]);
					break;
				}
			}
		}
	}
}
