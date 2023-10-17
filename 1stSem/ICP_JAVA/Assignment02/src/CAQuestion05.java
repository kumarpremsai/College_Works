
class CAQuestion05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int min = Math.min(a,Math.min(b, c));
		int max = Math.max(a,Math.max(b, c));
		int mid = (a+b+c)-(max+min);
		System.out.println("Max value is "+max);
		System.out.println("Mid value is "+mid);
		System.out.println("Min value is "+min);
		
	}

}
