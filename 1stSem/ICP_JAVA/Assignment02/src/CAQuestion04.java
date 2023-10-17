
 class CAQuestion04 {
	 public static void main(String[] args) {
		 int a = Integer.parseInt(args[0]);
		 double t =Math.toRadians(a);
		 double b = Math.cos(5*t);
		 double c = Math.sinh(7*t);
		 double sum = b+c;
		 System.out.println("Sum of the equation is "+sum);
	 }

}
