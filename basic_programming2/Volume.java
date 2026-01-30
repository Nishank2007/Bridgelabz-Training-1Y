class Volume
{
	public static void main(String[] args)
	{
		int r = 6378;
		double pi = 3.14;
		double cubic_km = (4*pi*r*r*r)/3;
		double cubic_miles = cubic_km*1.6 ;
		System.out.println("Volume of Sphere in kilometer cube is: "+cubic_km);
		System.out.println("Volume of Sphere in mile cube is: "+cubic_miles);
	}
}