package epam_coe_programs;
import java.util.*;
public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input seconds: ");
        int seconds=sc.nextInt();
        int S=seconds%60;
        int H=seconds/60;
        int M=H%60;
        H=H/60;
        System.out.println(H +":"+ M +":"+ S);
	}

}
