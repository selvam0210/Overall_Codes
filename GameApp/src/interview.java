import java.util.*;
public class interview {
	public static void main(String[] args) {
		int count=0;
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		
			System.out.println(n+ " is Prime");
		else 
			System.out.println(n+ " is not Prime");
	}

}
