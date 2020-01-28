
public  class HotelDetail {
	 String name;
	 int star;
	 float cost;
	 float offer;
	 int offerdays;
	
	public HotelDetail(String name,int star,float cost,float offer,int offerdays)
	{
		this.name = name;
		this.star = star;
		this.cost = cost;
		this.offer = offer;
		this.offerdays = offerdays;
	}
	
	
	
	public  double totalCost(float cost,int days,float offer)
	{
		
		double newcost = cost*days;
		if(days>offerdays) {
		newcost = newcost-((newcost*offer)/100);}
		return newcost;
		
	}


}
