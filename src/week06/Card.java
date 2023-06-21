package week06;

public class Card {

String name;
String rank;
int value;

		
public Card(String name, String rank, int value) {
	this.name = name;
	this.rank = rank;
	this.value = value;
}

public String getRank() {
	return rank;
}

public void setRank(String rank) {
	this.rank = rank;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public void describe() {
	System.out.println(this.name + " of " + this.value);
	}
}
