import java.util.Scanner;
class CubeRoot 
{
	public static void main(String[] args) 
	{
	Scanner z=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=z.nextInt();
	double i=1;
	double t=0.001;
	while((i*i*i)<=n)
	{
	i++;
	}
	i--;//for perfect cuberoot
	while((i*i*i)<n)
	{
	i+=t;
	}//for decimal cuberoot
	System.out.println(i);
	}
}

