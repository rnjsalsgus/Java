package chapter15.Quiz;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1,true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num=num;
		this.isKwang=isKwang;
	}
	public boolean equals(Object obj) {
			SutdaCard card=(SutdaCard) obj;
			return num==card.num&&isKwang==card.isKwang; 
	}

	@Override
	public String toString() {
		return num+(isKwang ? "K":"");
	}
	
	
}
