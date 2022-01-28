package JustForFun;

public class RemoteCalculator implements ToAddTheValues {

	@Override
	public int add(int... arr) {
		int sum = 0;
		for(int c : arr) {
			sum = sum + c;
		}
		return sum;
	}

	@Override
	public int sub(int... brr) {
		int sum = 0;
		for(int c : brr) {
			sum = sum - c;
		}
		return sum;
	}

}
