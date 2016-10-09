package pokerExceptions;
import pokerBase.Deck;
import pokerBase.Hand;
import pokerEnums.eHandExceptionType;

public class DeckException extends Exception{
	
	private int size;
	
	public DeckException(int size){
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

}
