
public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Cart anOrder = new Cart();
          DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.5f);
         anOrder.addDigitalVideoDisc(dvd1);
          DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars","Science fiction","George Lucas",87,24.95f);
          anOrder.addDigitalVideoDisc(dvd2);
          DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",19.5f);
          
          anOrder.addDigitalVideoDisc(dvd3);
          System.out.print("Total cost is:  ");
          System.out.println(anOrder.TotalCost());
          anOrder.removeDigitalVideoDisc( dvd1);
          System.out.print("Total cost is:  ");
          System.out.println(anOrder.TotalCost());
	}

}
