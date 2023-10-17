
 class CAQuestion07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		boolean a =( x<(y*z))|| (y<(x*z)) || (z<(x*y));
		System.out.println(a);
	}

}
