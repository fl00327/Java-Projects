import java.util.ArrayList;
import java.util.List;

public class Game {
private String name = null;
private Genre genre  = null;
private List<Console> consoles = null;
private double price = 0;

public Game(String name,Genre genre,double price) {
	super();
	this.name = name;
	this.genre = genre;
	this.price = price;
	this.consoles = new ArrayList<Console>();
	
}

public String getName() {
	return this.name;
}

public String getGenre() {
	return 
}

public String getConsoles() {
	return this.consoles;
}

public double getPrice() {
	return this.price;
}

}
