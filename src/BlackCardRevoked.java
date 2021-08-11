import java.util.*;

/**
 *  Overview of Black Card Revoked
 *
 *  Black Card Revoked is a fun game full of questions that give a sense
 *  of nostalgia over the group! This game also celebrates American black
 *  culture, while invoking hilarious debates. Be careful that you don't
 *  give the wrong answer, or you may get your black card revoked!
 */

public class BlackCardRevoked
{
    static int numPlayers = 0;
    static ArrayList<Questions> query = new ArrayList<>();

    public static void main (String[] args){

        String playGame;
        String addQuestions;

        Scanner input = new Scanner(System.in);

        //Defines the ArrayList playerList
        ArrayList<Player> playerList = new ArrayList<>();

        //Initializes the Player class in order to use in loop
        Player player;

        /* Greets the user and ask if they would like to play game */
        System.out.println("Hello! Welcome to Black Card Revoked.");
        System.out.println(" Please enter 'yes' or 'no' if you are ready to play: ");
        playGame = input.nextLine();

        //Display Menu
        System.out.println("1\t Game Rules");
        System.out.println("2\t Add Questions");
        System.out.println("3\t Start Game");
        System.out.println("4\t Exit");

        System.out.println("Please enter your choice: ");

        //Get user's choice
        int choice = input.nextInt();

        //Display the Menu options
        switch (choice) {
            case 1 -> {
                System.out.println(" ----Black Card Revoked Game Rules ----");
                System.out.println();
                System.out.println(" OBJECT OF BLACK CARD REVOKED: ");
                System.out.println("""
                         The objective of Black Card Revoked\s
                         is to not lose all ten of your points.\s
                         The first player to lose all ten points\s
                         is the loser!\s
                        """);
                System.out.println(" NUMBER OF PLAYERS: 3 to 6 Players \n");
                System.out.println(" MATERIALS: 54 Question Cards, 15 Answer Cards \n");
                System.out.println(" TYPE OF GAME: PARTY CARD GAME \n");
                System.out.println(" AUDIENCE: 13+ \n");
                System.out.println(" SETUP \n ");
                System.out.println("""
                         To begin setup, give each player response cards. Each\s
                         player should have four response cards A, B, C, and D in\s
                         their hand. The Question Cards are then shuffled displayed\s
                         randomly for each player to make their response (A, B, C, or D).\s
                        """);
                System.out.println(" GAMEPLAY \n");
                System.out.println("""
                         Each card will determine if the answer has a correct answer or\s
                         if the majority will rule. Players have six (6) to ten (10)\s
                         seconds to decide on an answer. The players will then be prompted\s
                         to reveal their answers at once.\s
                        """);
                System.out.println("""
                        MAJORITY WINS:\s
                        Determined by the answer selected by the majority of players\s
                        (4 Players, 3 say 'A' then 'A' wins).\s

                        If there is a tie, the game randomly makes the call on which\s
                        answer wins.""".indent(1));
                System.out.println("""
                        \s
                         If the card has a correct answer, the players who chose the\s
                         wrong answer lose a point. Players begin the game with ten\s
                         (10) points.\s
                        """);
                System.out.println(" END OF GAME \n");
                System.out.println("""
                         The game comes to an end when a player loses all ten points!\s
                         This player instantly gets their Black Card Revoked and they\s
                         are the loser!\s
                        """);
            }
            case 2 -> { //Questions for Black Card Revoked
                System.out.println("Before we begin the game, would the user like to " +
                        "add questions? Enter yes or no.");

                do {
                    addQuestions = input.nextLine();
                    AddQuestions(query);

                    for (Questions questions : query) {
                        System.out.println(questions.getQuestion());
                    }
                }
                while (addQuestions.equals("yes"));

                String q1 = """
                        Who is Oprah Winfrey's Best Friend?
                        (a)Gayle King
                        (b)Tyler Perry
                        (c)Stedman Graham
                        (d)Cicely Tyson
                        """;

                String q2 = """
                        According to Kanye, who doesn't have the answers?
                        (a)Taylor Swift
                        (b)Beck
                        (c)Jay-Z
                        (d)Sway
                        """;

                String q3 = """
                        Which song is a staple at the family cookout?
                        (a)'Never Too Much' - Luther Vandross
                        (b)'Before I Let Go' - MAZE
                        (c)'Candy' - Cameo
                        (d)'Outstanding' - Gap Band
                        """;

                String q4 = """
                        What might Momma say you need in order to get some McDonald's?
                        (a)A Job
                        (b)A Clue\s
                        (c)Good Grades
                        (d)McDonald's Money
                        """;

                String q5 = """
                        If Young Metro don't trust you, what might Future do?
                        (a)Call the Police
                        (b)Shoot you
                        (c)Fight you
                        (d)Beat you
                        """;

                String q6 = """
                        You witness a fight. What do you do next?(a)Call the Police
                        (b)Film it with your camera.
                        (c)Break it up
                        (d)Yell...
                        """;

                String q7 = """
                        Who has the best biscuit?(a)Popeye's
                        (b)Red Lobster
                        (c)KFC
                        (d)Churches
                        """;

                String q8 = """
                        How long should a woman tolerate her man's successful rap career?(a)'til death do them part
                        (b)'til they have kids
                        (c)'till bill collectors start calling
                        (d)'til he has a side baby
                        """;

                String q9 = """
                        You know an older black couple is in love when they?(a)wear matching outfits
                        (b)go out to line dance
                        (c)make it more than 30 years
                        (d)sleep in the same bedroom
                        """;

                //Adds the questions q1, q2...qn into the list query, with the Questions class as its type
                query.add(new Questions(q1, "a"));
                query.add(new Questions(q2, "d"));
                query.add(new Questions(q3, "b"));
                query.add(new Questions(q4, "d"));
                query.add(new Questions(q5, "b"));
                query.add(new Questions(q6, "majority rule"));
                query.add(new Questions(q7, "majority rule"));
                query.add(new Questions(q8, "majority rule"));
                query.add(new Questions(q9, "majority rule"));
            }
            case 3 -> System.out.println(" Good Luck");
            case 4 -> System.exit(0);
            default -> System.out.println("Invalid choice");
        }//end switch

        //Begins the game if the user entered yes
        while(playGame.equals("yes") || playGame.equals("y") || playGame.equals("Yes")){

            System.out.println("Please enter the number of players playing the game. Number of players " +
                    "can only be within the range of 3 - 6 players per round. ");
            numPlayers = input.nextInt();
            input.nextLine();

            //Checks if the number of players is greater than 6
            while(numPlayers < 3 || numPlayers > 6){

                System.out.println("Please enter a number that is in the range of 3 - 6");
                System.out.println("You can not have less than 3 players or more than 6 players");
                numPlayers = input.nextInt();
                input.nextLine();
            }

            //Collects all the participating player's names
            for(int count = 1; count <= numPlayers; count++)
            {
                //Instantiates the player object
                player = new Player();
                System.out.println("Hello player " + count + ", please enter your name: ");   //Prompts user to enter name
                player.setPlayer(input.nextLine());

                //Adds the player's entry into the player list
                playerList.add(player);
            }
            System.out.println("Participants in the game: ");

            for (Player value : playerList) {
                System.out.println(value.getPlayer());
            }

            Collections.shuffle(query);

            takeTest(query, playerList);

            //Prompts the user if they would like to play again
            System.out.println("Would you like to continue playing another round? Enter 'yes' or 'no' ");
            playGame = input.nextLine();
        }

        System.out.println("Thank you for playing!!");
    }

    private static void AddQuestions(ArrayList<Questions> query) {

        Scanner key = new Scanner(System.in);

        int numQuestions;

        System.out.println("How many questions do you want to add?");
        numQuestions = key.nextInt();

        String q;
        String choice1, choice2, choice3, choice4;
        String answer;
        Questions[]questions = new Questions[numQuestions];

        for(int count = 0; count < numQuestions; count++) {
            System.out.println("Please enter question number " + (count + 1) + ".");

            //Added nextLine statement to get line before input. Then set question string equal to the question
            key.nextLine();
            q = key.nextLine();

            System.out.println("Please enter your first choice\n(a)");
            choice1 = key.nextLine();

            System.out.println("Please enter your second choice\n(b)");
            choice2 = key.nextLine();

            System.out.println("Please enter your third choice\n(c)");
            choice3 = key.nextLine();

            System.out.println("Please enter your fourth choice\n(d)");
            choice4 = key.nextLine();

            //print statement to check question plus choices in correct format
            String full = ((Arrays.toString(questions)) + "\n(a) " + choice1 + "\n(b) " + choice2 + "\n(c) " + choice3 + "\n(d) " + choice4);
            System.out.println(full);

            System.out.println("Which letter is the answer?");
            answer = key.nextLine();

            questions[count] = new Questions(full, answer);
            System.out.println(full + "  answer:" + answer);

            query.add(questions[count]);
        }
    }

    //Allows users to answer the questions from Black Card Revoked
    public static void takeTest(ArrayList<Questions> query, ArrayList<Player> playerList) {
        String answer;         //For the user to store their answer
        int score = 10;
        int highScore = 0;
        String winner = " ";

        Scanner answerInput = new Scanner(System.in);

        for (int count = 0; count < numPlayers; count++) {

            //Prints out a question from the question list
            System.out.println(query.get(count).getQuestion());

            //Traverse the query list to show the player the questions
            for (int j = 0; j < numPlayers; j++) {

                //Allows user to enter in their answer
                System.out.println("Hello player " + playerList.get(j).getPlayer() + ", please enter your answer below: ");
                answer = answerInput.nextLine();

                //Checks if the answer is correct
                if (answer.equals(query.get(count).getAnswer())) {
                    playerList.get(j).score += 1;                 //Increments the score by one point if the user gets the answer correct
                    score = playerList.get(j).score;
                    playerList.get(j).setScore(score);            //Sets the score of the player
                } else {
                    playerList.get(j).score -= 1;
                    score = playerList.get(j).score;
                    playerList.get(j).setScore(score);
                }
            }

            System.out.println("The answer for this question is: " + query.get(count).getAnswer());
        }

        System.out.println("Stats for this round: ");

        //Prints the players names and score for this round
        playerList.forEach(System.out::println);

        //Checks for the highest score
        if (highScore > score) {
            highScore = score;
            System.out.println(playerList.get(highScore).getScore());
            winner = playerList.get(highScore).getPlayer();                //Saves the player with the highest score in the winner variable
        }


        //Prints the winner
        System.out.println("Congrats " + winner + ", you won this round!");
    }
}
