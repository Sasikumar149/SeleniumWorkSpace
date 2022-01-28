package JustForFun;

public class ToPerformCalculation extends RemoteCalculator{

	public static void main(String[] args) {
		 RemoteCalculator MethodRoute = new RemoteCalculator();
		 System.out.println(MethodRoute.add(10,30));
		 System.out.println(MethodRoute.add(10,30,40,50));
		 System.out.println(MethodRoute.add(10,30,20));
		 System.out.println(MethodRoute.sub(70,30,20));
		 System.out.println(MethodRoute.sub(30,20));
		 

	}

}
