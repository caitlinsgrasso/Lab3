package pokerEnums;

public enum eHandExceptionType {
	
	TieHand {
		@Override
		public String toString() {
			return "It was a tie hand.";
		}
	},
	
	ShortHand {
		public String toString(){
			return "The hand doesn't have enough cards.";
		}
	}
	
	
}
