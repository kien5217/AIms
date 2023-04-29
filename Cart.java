package week2;

public class Cart {
	public static final int MAX_ORDER_NUMBER = 20;
	private DigitalVideoDisc item_ordered[] = new DigitalVideoDisc [MAX_ORDER_NUMBER];
	private int qtyOrdered=0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 20)
		{
			System.out.println("The cart is full");
		}
		else {
		
		item_ordered[qtyOrdered] = new DigitalVideoDisc(disc.getTitle(), disc.getCategory(), 
                disc.getDirector(), disc.getLength(), disc.getCost());
		qtyOrdered ++;
		System.out.println("This disc has been added");
	}
		
}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if ( qtyOrdered == 0 ) {
			System.out.println("The cart is empty");
		}
		else {
			for( int i =0;i<qtyOrdered;i++) {
				
			
			if((item_ordered[i].getTitle() == disc.getTitle()) && (item_ordered[i].getCost() == disc.getCost()) && (item_ordered[i].getDirector() == disc.getDirector()) && (item_ordered[i].getCategory() == disc.getCategory()) && (item_ordered[i].getLength() == disc.getLength()) ) {
			      for(int j=i; j < qtyOrdered - 1;j++) {
			    	  item_ordered[j] = new DigitalVideoDisc(item_ordered[j + 1].getTitle(), item_ordered[j + 1].getCategory(), 
                              item_ordered[j + 1].getDirector(), item_ordered[j + 1].getLength(), 
                              item_ordered[j + 1].getCost());
			      }
			}	
			}
			qtyOrdered --;
		}		
	}
	
	public float total = 0;
	public float TotalCost() {
		for(int i=0;i<qtyOrdered;i++) {
			total = total + item_ordered[i].getCost();
		
		
		
	}
		return total;
	}
}
