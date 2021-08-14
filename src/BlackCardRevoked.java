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
                        After you stop and drop, what should you do next?
                        (a)Roll
                        (b)Put your hands up
                        (c)Shut em' down, open up shop
                        (d)Hand over your license and registration
                        """;

                String q7 = """
                        What might momma tell you before going into any store?
                        (a)Don't touch nothin'
                        (b)Don't ask for nothin'
                        (c)Don't look at nothin'
                        (d)All of the above
                        """;

                String q8 = """
                        What's the most liable to get you cussed out at the cookout?
                        (a)Mess up the potato salad
                        (b)Renege during spades
                        (c)Don't bring anything
                        (d)Walk in and not speak
                        """;

                String q9 = """
                        What does Beyonce carry in her bag?
                        (a)A bat
                        (b)Pepper Spray
                        (c)A slap for Jay-Z
                        (d)Hot Sauce
                        """;

                String q10 = """
                        Who claims they had the greatest comeback?
                        (a)Sza
                        (b)Rihanna
                        (c)Soulja Boy
                        (d)Tyga
                        """;

                String q11 = """
                        What does Beyonce carry in her bag?
                        (a)A bat
                        (b)Pepper Spray
                        (c)A slap for Jay-Z
                        (d)Hot Sauce
                        """;

                String q12 = """
                        What's one stereotypical thing that we secretly love?
                        (a)Strawberry Lemonade
                        (b)Grape Drink
                        (c)Fried Chicken
                        (d)Diabetes
                        """;

                String q13 = """
                        What does Beyonce carry in her bag?
                        (a)A bat
                        (b)Pepper Spray
                        (c)A slap for Jay-Z
                        (d)Hot Sauce
                        """;

                String q14 = """
                        What does it mean if your ear keeps itching?
                        (a)You need to wash
                        (b)Somebody is talking about you
                        (c)You need to see a doctor
                        (d)You're about to fall in love
                        """;

                String q15 = """
                        Which city was MLK Jr. killed?
                        (a)Memphis, TN
                        (b)Atlanta, GA
                        (c)Washington, DC
                        (d)Birmingham, AL
                        """;

                String q16 = """
                        In what year did Cash Money records take over?
                        (a)2001 - 2002
                        (b)1999 - 2000
                        (c)1997 - 1998
                        (d)2004 - 2005
                        """;

                String q17 = """
                        What does the word THOT mean?
                        (a)The Hoes of Tomorrow
                        (b)Temporary Hoe On Time
                        (c)That Hoe Over There
                        (d)It doesn't stand for anything
                        """;

                String q18 = """
                        What University did FLOTUS Michelle Obama attend for Undergrad?
                        (a)Howard
                        (b)Yale
                        (c)University of Chicago
                        (d)Princeton
                        """;

                String q19 = """
                        Who played Ricky in Boyz in the Hood?
                        (a)Morris Chestnut
                        (b)Ice Cube
                        (c)Tupac
                        (d)Cuba Gooding Jr.
                        """;

                String q20 = """
                        He need a slim fine woman with what?
                        (a)A car
                        (b)Some twerk with her
                        (c)Money
                        (d)Good Credit
                        """;

                String q21 = """
                        If you mix negro and creole, what do you get?
                        (a)A Bad Chick
                        (b)Hot Sauce in a Bag
                        (c)A Good Ass Halftime
                        (d)A Texas Bamma
                        """;

                String q22 = """
                        All my life I had to fight?
                        (a)"but I'll kill em dead befo Harpo beat me!"
                        (b)"and so I called the police"
                        (c)"for the coins"
                        (d)"PERIODT"
                        """;

                String q23 = """
                        A Scrub is a ....?
                        (a)A Cleaning Device
                        (b)A Guy That Can't Get No Love From Me
                        (c)An Outfit Worn by Doctors
                        (d)A Beauty Product
                        """;

                String q24 = """
                        How many fights did the Fresh Prince get into before \s
                        his mom got scared?\s
                        (a)1
                        (b)5
                        (c)2
                        (d)3
                        """;

                String q25 = """
                        What is something your momma told you to do hat she can do herself?
                        (a)Take the chicken out
                        (b)Turn off the light
                        (c)Watch her kids
                        (d)Go to the store
                        """;

                String q26 = """
                        Lil Duval said it best!
                        (a)Living my best life
                        (b)Get it Right
                        (c)Girls need love to
                        (d)I said what I said
                        """;

                String q27 = """
                        What Amendment abolished slavery?
                        (a)9th
                        (b)10th
                        (c)13th
                        (d)14th
                        """;
                String q28 = """
                        Who became the first black woman millionaire\s
                        and invented hair care products for black women?\s
                        (a)Madame C.J. Walker
                        (b)Maya Angelou
                        (c)Rosa Parks
                        (d)Dr. Carter G. Woodson
                        """;

                String q29 = """
                        Which historically black sorority was founded first?
                        (a)Delta Sigma Theta
                        (b)Zeta Phi Beta
                        (c)Alpha Kappa Alpha
                        (d)Sigma Gamma Rho
                        """;

                String q30 = """
                        What does it mean if she dreamt of fish last night?
                        (a)bad luck
                        (b)somebody pregnant
                        (c)somebody gettin married
                        (d)money
                        """;

                String q31 = """
                        Which character from Cooley High was a regular cast \s
                        member on a Different World??\s
                        (a)Tyrone
                        (b)Cochise
                        (c)Pooter
                        (d)Preach
                        """;

                String q32 = """
                        Before he was a member of the Nation of Islam, what was Malcolm X called?
                        (a)Young Slim
                        (b)Little Red
                        (c)Brotha Harlem
                        (d)Detroit Red
                        """;

                String q33 = """
                        This person was the first person to invent a clock in the United States that rung on the hour?
                        (a)Benjamin Banneker
                        (b)W.E.B. DuBois
                        (c)Denzel Washington
                        (d)Barack Obama
                        """;

                String q34 = """
                        First African-American to win Miss America?
                        (a)Tyra Banks
                        (b)Sanaa Lathan
                        (c)Naomi Campbell
                        (d)Vanessa Williams
                        """;


                String q35 = """
                        Jerome from the sitcom "Martin" is a playa from?
                        (a)Detroit
                        (b)Chicago
                        (c)The Himalayas
                        (d)Harlem
                        """;

                String q36 = """
                        When did the Saints win the Superbowl?
                        (a)2007
                        (b)2008
                        (c)2010
                        (d)2009
                        """;

                String q37 = """
                        In 'Just Wright', what team did Common play for?
                        (a)New York Knicks
                        (b)New Jersey Nets
                        (c)Philadelphia 76ers
                        (d)Boston Celtics
                        """;

                String q38 = """
                        What group sung "Breakin My Heart"?
                        (a)Mint Condition
                        (bTony, Toni, Tone
                        (c)Boyz II Men
                        (d)New Edition
                        """;

                String q39 = """
                        All fair in love and what?
                        (a)Money
                        (b)Family
                        (c)Football
                        (d)Basketball
                        """;

                String q40 = """
                        According to Snoop Dogg, who is his famous uncle?
                        (a)Charlie Wilson
                        (b)Smokey Robinson
                        (c)Muddy Waters
                        (d)Bobby Womack
                        """;

                String q41 = """
                        Finish the phrase: Beans, greens, potatoes, tomatoes...?
                        (a)burritos
                        (b)doritos
                        (c)let's cook
                        (d)you name it
                        """;

                String q42 = """
                        What is the name of Pam's twin cousin on the sitcom 'Martin'?
                        (a)Tammy
                        (b)Pamela
                        (c)Paula
                        (d)Tamera
                        """;

                String q43 = """
                        How old does a baby have to be for us to get their ears pierced?
                        (a)6 months
                        (b)16 years
                        (c)Grown
                        (d)Fresh out the womb
                        """;

                String q44 = """
                        Who's nickname was "Dragon Breath" on House Party?
                        (a)Chill
                        (b)Bilal
                        (c)Pee-Wee
                        (d)Kid
                        """;

                String q45 = """
                        What does Mary J. Blige not want in her dancery?
                        (a)drama
                        (b)gyrating
                        (c)perculatin'
                        (d)hateration
                        """;

                String q46 = """
                        He ran off on the plug twice, but you might find him at the Ritz Carlton:?
                        (a)Plies
                        (b)Yo Gotti
                        (c)Gucci Mane
                        (d)Future
                        """;

                String q47 = """
                        In 'Love Jones', his Brotha to the night and da Blues in Your Left Eye:\s?
                        (a)Larenz Tate
                        (b)Omar Epps
                        (c)Isaiah Washington
                        (d)Bill Bellamy
                        """;

                String q48 = """
                        Who's poor, black, and maybe even ugly, but dear God they still here?
                        (a)Nanny
                        (b)Pookie
                        (c)Reba
                        (d)Celie
                        """;

                String q49 = """
                        What did LL COOL J want his around the way girl to have?
                        (a)Diamond earrings
                        (b)Extensions in her hair
                        (c)A Chanel bag
                        (d)A big butt
                        """;

                String q50 = """
                        What do you eat on your grits?
                        (a)Cheese
                        (b)Salt & Pepper
                        (c)Sugar
                        (d)Butter
                        """;

                String q51 = """
                        Which movie did someone say, "Oh, now you're gonna shoot me in my pinkie toe?
                        (a)Shaft
                        (b)Harlem Nights
                        (c)The Color Purple
                        (d)Menace II Society
                        """;

                String q52 = """
                        In what year were public schools desegregated by the US Supreme Court?
                        (a)1954
                        (b)1960
                        (c)1973
                        (d)1982
                        """;

                String q53 = """
                        Which state was the home to "America's Black Wall Street" until 1921?
                        (a)Oklahoma
                        (b)Georgia
                        (c)New York
                        (d)North Carolina
                        """;

                String q54 = """
                        What does Mystical first ask you to do after you shake ya ass?
                        (a)Throw ya hands in the air
                        (b)Show what you workin' with
                        (c)Watch ya self
                        (d)Get low
                        """;
                
                //Adds the questions q1, q2...qn into the list query, with the Questions class as its type
                query.add(new Questions(q1, "a"));
                query.add(new Questions(q2, "d"));
                query.add(new Questions(q3, "b"));
                query.add(new Questions(q4, "d"));
                query.add(new Questions(q5, "b"));
                query.add(new Questions(q6, "c"));
                query.add(new Questions(q7, "d"));
                query.add(new Questions(q8, "d"));
                query.add(new Questions(q9, "d"));
                query.add(new Questions(q10, "d"));
                query.add(new Questions(q11, "d"));
                query.add(new Questions(q12, "c"));
                query.add(new Questions(q13, "d"));
                query.add(new Questions(q14, "b"));
                query.add(new Questions(q15, "a"));
                query.add(new Questions(q16, "b"));
                query.add(new Questions(q17, "a"));
                query.add(new Questions(q18, "d"));
                query.add(new Questions(q19, "a"));
                query.add(new Questions(q20, "b"));
                query.add(new Questions(q21, "d"));
                query.add(new Questions(q22, "a"));
                query.add(new Questions(q23, "b"));
                query.add(new Questions(q24, "a"));
                query.add(new Questions(q25, "b"));
                query.add(new Questions(q26, "b"));
                query.add(new Questions(q27, "c"));
                query.add(new Questions(q28, "a"));
                query.add(new Questions(q29, "c"));
                query.add(new Questions(q30, "b"));
                query.add(new Questions(q31, "d"));
                query.add(new Questions(q32, "d"));
                query.add(new Questions(q33, "b"));
                query.add(new Questions(q34, "d"));
                query.add(new Questions(q35, "c"));
                query.add(new Questions(q36, "c"));
                query.add(new Questions(q37, "b"));
                query.add(new Questions(q38, "a"));
                query.add(new Questions(q39, "d"));
                query.add(new Questions(q40, "a"));
                query.add(new Questions(q41, "d"));
                query.add(new Questions(q42, "a"));
                query.add(new Questions(q43, "d"));
                query.add(new Questions(q44, "b"));
                query.add(new Questions(q45, "d"));
                query.add(new Questions(q46, "a"));
                query.add(new Questions(q47, "a"));
                query.add(new Questions(q48, "d"));
                query.add(new Questions(q49, "b"));
                query.add(new Questions(q50, "a"));
                query.add(new Questions(q51, "b"));
                query.add(new Questions(q52, "a"));
                query.add(new Questions(q53, "a"));
                query.add(new Questions(q54, "c"));

            }
            case 3 -> System.out.println("Start Blackcard Revoked Game\n");

            case 4 -> System.exit(0);
            default -> System.out.println("Invalid choice");
        }//end switch

        //Begins the game if the user entered yes
        while(playGame.equals("yes") || playGame.equals("y") || playGame.equals("Yes"))
        {
            System.out.println("Please enter the number of players playing the game. Number of players " +
                    "can only be within the range of 3 - 6 players per round. ");
            numPlayers = input.nextInt();
            input.nextLine();

            //Checks if the number of players is greater than 6
            if(numPlayers < 3 || numPlayers > 6){

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

        String question;
        String choice1, choice2, choice3, choice4;
        String answer;
        Questions[] questions = new Questions[numQuestions];

        for(int count = 0; count < numQuestions; count++) {
            System.out.println("Please enter question number " + (count + 1) + ".");

            //Added nextLine statement to get line before input. Then set question string equal to the question
            key.nextLine();
            question = key.nextLine();

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

