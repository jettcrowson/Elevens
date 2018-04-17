Board
Deck
Discard Deck


1) Create a game
2) Make sure there are at least 9 cards left in the deck
3) If so draw 9 cards, otherwise, draw however many cards are left
4) Look for a Queen, King, and Jack and if found, replace them with 3 new cards
5) Look for a pair of cards that add up to 11, if found, replace them with 2 new cards
6) If nothing is able to be replaced on the last turn, the game is lost
7) Repeat steps 2-6 until game is lost or no cards are left on the board
8) If this step is reached and there are no cards left, game is won

yes

dealMyCards is called in the constuctor and in the new game method

anotherPlayIsPossible(), isLegal()

0,1,3,6,7

for(Integer i : cIndexes){
    System.out.println(board.cards[i]);
}

anotherPlayIsPossible()
needs to find out what cards are on the board and where

All 3: Decks of cards, similar structure, win requirements
Different: what the cards need to add up to, similar functions that have slightly different inner workings

Values are passed to the constructor and becuase the board is the superclass all the instance variables will be initialized correctly

abstract: isLegal(), anotherPlayPossible()
yes, all other methods are the exact same for all the games, or individual to the various games
