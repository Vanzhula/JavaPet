public class Players {
    public static void main(String[] args) {

        String players[] = new String[4];
           int totalPlayers = players.length;
           int counter;
                players[0] = "David";
                players[1] = "Daniel";
                players[2] = "Anna";
                players[3] = "Gregory";
        String theWinner = players[1];
        for (counter=0; counter <totalPlayers; counter++){
            String thePlayer = players[counter];
        System.out.println("Поздравляем, " + theWinner + "!");
    }
}

