package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import java.lang.reflect.InvocationTargetException;

import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerExceptions.DeckException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerEnums.eHandExceptionType;

import pokerExceptions.HandException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerEnums.eHandExceptionType;

import pokerExceptions.HandException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerEnums.eHandExceptionType;

import pokerExceptions.HandException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerEnums.eHandExceptionType;

import pokerExceptions.HandException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerEnums.eHandExceptionType;

import pokerExceptions.HandException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerEnums.eHandExceptionType;

import pokerExceptions.HandException;
import java.lang.reflect.InvocationTargetException;
import pokerExceptions.HandException;
import pokerExceptions.DeckException;


public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();

	//default deck does not have jokers
	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if ((eSuit != eSuit.JOKER) && (eRank != eRank.JOKER)){
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				}
			}
			 
		}
		Collections.shuffle(deckCards);
	}
	
	public Deck(int NbrOfJokers) {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if ((eSuit != eSuit.JOKER) && (eRank != eRank.JOKER)){
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				}
			}
			 
		}
		for (int jokers = 1; jokers<=NbrOfJokers; jokers++){
			deckCards.add(new Card(eSuit.JOKER, eRank.JOKER, iCardNbr++));
		}
		Collections.shuffle(deckCards);
	}
	
	ArrayList<Card> getDeck(){
		return deckCards;
	}
	
	public Deck(int NbrOfJokers, ArrayList<Card> Wilds) {
		this (NbrOfJokers);
		for (Card deckCard : deckCards)
		{
			for (Card wildCard: Wilds)
			{
				if ((deckCard.geteSuit() == wildCard.geteSuit()) && (deckCard.geteRank() == wildCard.geteRank()))
						{
							deckCard.isbWild();
						}					
			}
		}
		Collections.shuffle(deckCards);
	}
	
	public Card Draw() throws Exception{
		int size = deckCards.size();
		if (size<=0){
			throw new DeckException(size);
		}
		return deckCards.remove(0);
	}
}
