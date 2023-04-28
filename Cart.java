
public class Cart {
	public static final int MAX_ORDER_NUMBER = 20;
	private DigitalVideoDisc item_ordered[] = new DigitalVideoDisc [MAX_ORDER_NUMBER];
	private int qtyOrdered;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 20)
		{
			System.out.println("The cart is full");
		}
		else {
		
		item_ordered[qtyOrdered-1] = disc;
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
					for(int j=i;j<qtyOrdered-1;j++) {
						item_ordered[j] = item_ordered[j+1];
					}
					break;
				}
			}
			qtyOrdered --;
		}
	}
}