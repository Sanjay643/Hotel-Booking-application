import java.awt.List;
import java.util.LinkedList;
import java.util.Scanner;

public class HotelBooking  {
	
	public static String bookHotel(double money,int days,int rating)
	{
		
		for(int iterator =0;iterator<6;iterator++)
		{
			HotelDetail hotel=(HotelDetail) list.get(iterator);			
			//int star = list.get(iterator).star;
			double cost = hotel.totalCost(hotel.cost, days, hotel.offer);
			if((rating==hotel.star) && (money>=cost)) {
				return String.format("Hotel Booked for %d days in %d star Hotel %s for the cost of %.2f",days,hotel.star,hotel.name,cost);
				}
			
			
		}
		return "Sorry! you dont have sufficient amount to book any hotel";
		
	}
	
	
	
	
	

	static LinkedList list = new LinkedList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner scan = new Scanner(System.in);
		HotelDetail park = new HotelDetail("The park",5,90,20,2);
		HotelDetail hyaat = new HotelDetail("Hotel Hyaat",5,82,12,3);
		HotelDetail raddisson = new HotelDetail("Raddisson",3,60,18,3);
		HotelDetail raintree = new HotelDetail("Rain Tree",3,58,15,2);
		HotelDetail accord = new HotelDetail("Accord",1,41.35f,11.8f,3);
		HotelDetail fortune = new HotelDetail("Fortune",1,43,14.8f,4);
		list.add(park);
		list.add(hyaat);
		list.add(raddisson);
		list.add(raintree);
		list.add(accord);
		list.add(fortune);
		

		double money;
		int days;
		int rating;
		System.out.println("Enter you money you have:");
		money = scan.nextDouble();
		System.out.println("Enter how many days you are going to stay:");
		days = scan.nextInt();
		System.out.println("Enter the rating on which you needed the hotel:");
		rating = scan.nextInt();
		if(!(rating==1 || rating==3 || rating==5))
		{
			System.out.println("Please enter the rating as 5,3,1:");
			rating=scan.nextInt();
		}
		System.out.println(bookHotel(money,days,rating));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}

/*output

Enter you money you have:
150
Enter how many days you are going to stay:
3
Enter the rating on which you needed the hotel:
2
Please enter the rating as 5,3,1:
3
Hotel Booked for 3 days in 3 star Hotel Rain Tree for the cost of 147.90

Enter you money you have:

250
Enter how many days you are going to stay:
4
Enter the rating on which you needed the hotel:
5
Sorry! you dont have sufficient amount to book any hotel

Enter you money you have:
100
Enter how many days you are going to stay:
3
Enter the rating on which you needed the hotel:
1
Sorry! you dont have sufficient amount to book any hotel

Enter you money you have:
250
Enter how many days you are going to stay:
4
Enter the rating on which you needed the hotel:
3
Hotel Booked for 4 days in 3 star Hotel Raddisson for the cost of 196.80

Enter you money you have:
300
Enter how many days you are going to stay:
3
Enter the rating on which you needed the hotel:
3
Hotel Booked for 3 days in 3 star Hotel Raddisson for the cost of 180.00


Enter you money you have:
300
Enter how many days you are going to stay:
4
Enter the rating on which you needed the hotel:
5
Hotel Booked for 4 days in 5 star Hotel The park for the cost of 288.00


*/



