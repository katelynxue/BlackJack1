public class Casino {
    public Card aceHearts;
    public Card[] Deck;
    public Card parkingLot;
    public int counter;

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
    }
    public void shuffle(){
        //Can you switch Deck [0] and Deck [1]?
        //SO Deck[0] after shuffling is a 2 of Spades
        parkingLot=Deck[0];
        Deck[0]=Deck[1];
        Deck[1]=parkingLot;
        //how can I do this 52 times
        for(){
            parkingLot=Deck[];
        }
    }
}
