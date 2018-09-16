package wendingmachine;
import java.util.Scanner;
public class wendingmachine {
	Scanner s=new Scanner(System.in);

	public int check(int p,int ta)
	{
		if(ta>=p)
		{
		  System.out.println("Collect Change "+(p-ta));
      	  java.lang.System.exit(0);
      	  return 1;
		}
		else 
		{   
            wendingmachine wm=new wendingmachine();
			int option=wm.change(p,ta);
			return option;
		}
	}
	public int change(int p,int ta)
	{
		int o;
		System.out.println("Amount Insufficient\n");
		System.out.println("Select any one of the options\n");
  	    System.out.println("1)Please Insert "+(p-ta)+" more");
  	    System.out.println("2)EXIT\n");
  	    o=s.nextInt();
  	    switch(o)
  	    {
  	     case 1:System.out.println((p-ta)+" amount inserted.\n");
  	            ta=p;
  	            break;
  	     case 2:System.out.println("Collect amount "+ta);
  	            java.lang.System.exit(0);
  	            break;
  	     default:System.out.println("Please enter  valid option\n");
  	             break;     
  	    }
  	    return 1;
	}
	public static void main(String[] args){
		wendingmachine wm=new wendingmachine();
		int n,c,ta=0,p=0,r,option,t;
		int[] m= {1,2,3,4,5,6,7,8,9};
		System.out.println("Enter number of Note\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Insert Note "+(i+1)+":");
			m[i]=sc.nextInt();
			if(m[i]==10 || m[i]==20 || m[i]==50 || m[i]==100 || m[i]==200 || m[i]==500 || m[i]==2000)
			 ta=ta+m[i];
			else
			{
			 System.out.println("Invalid Note\n");
			 System.out.println("Insert another Note\n");
			 i--;
			}
		}
		while(true)
		{
		 System.out.println("DRINKS\n");
		 System.out.println("1)Coca Cola-₹30");
		 System.out.println("2)Thumbs Up-₹40");
		 System.out.println("3)Pepsi-₹40");
		 System.out.println("4)Sprite-₹30");
		 System.out.println("5)Maaza-₹20");
		 System.out.println("6)7Up-₹20");
		 System.out.println("7)Limca-₹20");
		 System.out.println("\n\nEnter Choice\n");
		 c=sc.nextInt();
		 switch(c)
		 {
		  case 1: p=30;
		          System.out.println("\nCoca Cola\n");
		          break;
		  case 2: p=40;
                  System.out.println("\nThumbs Up\n");
                  break;
		  case 3: p=40;
                  System.out.println("\nPepsi\n");
                  break; 
		  case 4: p=30;
                  System.out.println("\nSprite\n");
                  break;        
		  case 5: p=20;
                  System.out.println("\nMazaa\n");
                  break;   
		  case 6: p=20;
                  System.out.println("\n7Up\n");
                  break;
		  case 7: p=20;
                  System.out.println("\nLimca\n");
                  break;
          default:System.out.println("Invalid Option.\nPlease choose again.\n");
                  break;
		 }
		 t=wm.check(p,ta);
		 if(t==1)
		 {
			 switch(c)
			 {
			  case 1: System.out.println("\nCollect Coca Cola\n");
			          java.lang.System.exit(0);
			  case 2: System.out.println("\nCollect Thumbs Up\n");
			          java.lang.System.exit(0);
			  case 3: System.out.println("\nCollect Pepsi\n");
			          java.lang.System.exit(0); 
			  case 4: System.out.println("\nCollect Sprite\n");
			          java.lang.System.exit(0);
			  case 5: System.out.println("\nCollect Mazaa\n");
			          java.lang.System.exit(0);   
			  case 6: System.out.println("\nCollect 7Up\n");
			          java.lang.System.exit(0);
			  case 7: System.out.println("\nCollect Limca\n");
			          java.lang.System.exit(0);
			 }
		 }
	    }
    }
}
