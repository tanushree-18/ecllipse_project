package epam_coe;
import java.util.*;
public class VideoStore {
	ArrayList<Video>store=new ArrayList<Video>();
	void addVideo(String name)
	{
		store.add(new Video(name));
		System.out.println("Video "+name+" added successfully.");
		
	}
	void doCheckout(String name)
	{
		for(int i=0;i<store.size();i++)
		{
		  if(store.get(i).getName().equals(name))
		  {
			store.get(i).doCheckout();  
		   System.out.println("Video "+name+"checked out successfully.");
		  }	
		 }
	}
	void doReturn(String name)
	{
		for(int i=0;i<store.size();i++)
		{
			if(store.get(i).getName().equals(name))
			{
			  store.get(i).doReturn(name);
		      System.out.println("Video "+name+"returned successfully");
			}
		}	
	}
	void recieveRating(String name,int rating)
	{
		for(int i=0;i<store.size();i++)
		{
		 if(store.get(i).getName().equals(name))	
		 {
		  store.get(i).recieveRating(rating);
		  System.out.println("Rating "+rating+" has been mapped to the Video "+name);
		}
		}
	}
	void listInventory()
	{
		System.out.println("---------------------------------------");
		System.out.println("Video Name  |  Checkout Status |  Rating");
		for(int i=0;i<store.size();i++)
		{
	      System.out.print(store.get(i).getName()+"      |       "+store.get(i).getCheckout()+"      |      "+store.get(i).getRating());;
		  System.out.println();
		}
		System.out.println("---------------------------------------");
	}
}
