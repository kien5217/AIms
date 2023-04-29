
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
		
		item_ordered[qtyOrdered] = disc;
		qtyOrdered ++;
		System.out.println("This disc has been added");
	}
		
}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if ( qtyOrdered == 0 ) {
			System.out.println("The cart is empty");
		}
		else {
			for(int i=0;i<qtyOrdered;i++) {
				if( item_ordered[i] == disc  ) {
					for(int j=i;j<qtyOrdered;j++) {
						item_ordered[j] = item_ordered[j+1];
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