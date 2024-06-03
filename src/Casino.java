public class Casino {
    public Card aceHearts;
    public Card[] Deck;
    public Card parkingLot;
    public int counter;
    public int randInt;
    public Player[] players;
    public Player dealer;
    public int counter2=2;

    public static void main(String[] args) {
        Casino vegas = new Casino();
        System.out.println("welcome to vegas!");
    }

    public Casino() {
        // aceHearts = new Card(1,1);
        // aceHearts.printInfo();
        Deck = new Card[52];
        //use a loop to fill each individual element in the array
        for (int k = 0; k < 4; k = k + 1) {//outer loop will change suitNum
            for (int i = 1; i < 14; i = i + 1) {//inner loop changes cardNum
                Deck[counter] = new Card(i, k);
                counter = counter + 1;
            }

            players = new Player[3];
            dealer = new Player(0);
            for(int i=0; i<3; i=i+1){
                players[i]=new Player(i+1);
            }

        }
        System.out.println("Our OG deck is below: ");
        for (int i = 0; i < 52; i = i + 1) {
            Deck[i].printInfo();
        }
        System.out.println();
        System.out.println();
        System.out.println("Our Shuffled deck is below: ");
        shuffle();
        for (int i = 0; i < 52; i = i + 1) {
            Deck[i].printInfo();
        }
        for (int i=0; i<3; i=i+1){
            players[i]=new Player(i+1);
        }

        deal();
        dealer.printInfo();

        for (int i=0; i<3; i++){
            players[i].printInfo();
        }



    }

    public void shuffle(){
        //Can you switch Deck [0] and Deck [1]?
        //SO Deck[0] after shuffling is a 2 of Spades
        parkingLot=Deck[0];
        Deck[0]=Deck[1];
        Deck[1]=parkingLot;
        //how can I do this 52 times
        for(int x=0; x<52; x=x+1){
           randInt=(int)(Math.random()*52);
           parkingLot=Deck[x];
           Deck[x]=Deck[randInt];
           Deck[randInt]=parkingLot;
        }
    }
    public void deal(){
        dealer.hand[0]=Deck[0];
        dealer.hand[1]=Deck[1];

        for(int x=0; x<players.length; x++){
            for(int y=0; y<players[x].hand.length; y++){
                players[x].hand[y] = Deck[counter2];
                counter2=counter2+1;
            }
        }
    }
    // how to refer to a single player from my players array?
    // players[2].printInfo();
    // how tot refer to the 0th card of the hand of the 0th player?
    // players[0].hand[0]


}
