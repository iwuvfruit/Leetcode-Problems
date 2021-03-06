
public class GreedyAlgoQ3 {
	public static void main(String[] args) {
		
	}
	public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {
		if(intArray.length < 2) {
			throw new IllegalArgumentException("Getting the product requires at least two indicies");
		}
		int[] productsOfAllIntsExceptAtIndex = new int[intArray.length];
		int productSoFar = 1;
		for(int i = 0; i <intArray.length; i++) {
			productsOfAllIntsExceptAtIndex[i] = productSoFar;
			productSoFar *= intArray[i];
		}
		
		productSoFar = 1;
		for(int i = intArray.length -1; i >= 0; i--) {
			productsOfAllIntsExceptAtIndex[i] *= productSoFar;
			productSoFar *= intArray[i];

		}
		return productsOfAllIntsExceptAtIndex;
	}
}
