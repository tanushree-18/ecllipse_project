package epam_coe;
import java.io.*;
public class VideoLauncher{

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean flag=true;
		VideoStore v=new VideoStore();
		do
		{
			System.out.println("MAIN MENU");
			System.out.println("1.Add Videos : ");
			System.out.println("2.Check Out Video : ");
			System.out.println("3.Return Video : ");
			System.out.println("4.Recieve Rating : ");
			System.out.println("5.List Inventory : ");
			System.out.println("6.Exit : ");
			System.out.println("Enter your choice (1..6): ");
			int n=Integer.parseInt(br.readLine());
			String name=new String();
			int r=0;
			switch(n)
			{
			case 1:System.out.println("Enter the name of the video you want to add : ");
			      name=br.readLine();
			      v.addVideo(name);break;
			case 2:System.out.println("Enter the name of the video you want to checkout : ");
                   name=br.readLine();
                   v.doCheckout(name);break;
			case 3:System.out.println("Enter the name of the video you want to Return: ");
			       name=br.readLine();
			       v.doReturn(name);break;
			case 4:System.out.println("Enter the name of the video you want to Rate: ");
			       name=br.readLine();
			       System.out.println("Enter the rating for this video: ");
			       r=Integer.parseInt(br.readLine());
			       v.recieveRating(name, r);break;
			case 5:v.listInventory();break;
			case 6:flag=false;			
			}
		}while(flag);
       System.out.println("Exciting...!! Thanks for using the application.");
	}

}
