import java.util.ArrayList;
import java.util.List;

public class Order {
private int orderID = 0;
private List<Game> games = new ArrayList<Game>(20);

private Order(int orderID) {
	super();
	this.orderID = orderID;
	
	
}
public int getOrderID() {
	return this.orderID;
}
public void addGame(Game game) throws NullPointerException{
	if(game == null) {
		throw new NullPointerException("Game Should not be null");
	}
	game   
}
public double calculateTotalCost() {
double Totalcost = 0;
for(int i = 0; i < this.gamed i++) {
	Totalcost += this.game<
}
return Totalcost;
}


}
