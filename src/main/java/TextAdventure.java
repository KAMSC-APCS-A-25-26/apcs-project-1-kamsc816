/*
This game is called TGL Too Slow, and it follows the journey of a runner. 
The runner can increase in speed and stamina and gain/lose energy to help on the quest to win a state championship. 
To play, answer the questions with the input examples provided to make your decision. 
Good luck!
*/
import java.util.Scanner;
import java.util.Random;

public class TextAdventure {
    public static void main(String[] args) {
        //Scanner and Random (Random used for speed and stamina increase)
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        //All the variables
        String gender;
        double speed = 0;
        double stamina = 0;
        double energy = 5;
        int couch = 0;
        int day = 11;
        int count = 0;
        int win = 0;
        int difficulty = 15;
        int challenge = 30;
        int redo;
        int run = 1;

        //This is the for loop for the program, this makes it so it runs until the user wants to stop.
        for (int i = 0; i < run; i++) {
            //ASCII Art
            System.out.println("        ,----,              ,--,                   ,----,                                                                       \n" +
                    "      ,/   .`|           ,---.'|                 ,/   .`|                                                                       \n" +
                    "    ,`   .'  : ,----..   |   | :               ,`   .'  :                            .--.--.     ,--,                           \n" +
                    "  ;    ;     //   /   \\  :   : |             ;    ;     /                           /  /    '. ,--.'|                           \n" +
                    ".'___,/    ,'|   :     : |   ' :           .'___,/    ,'  ,---.     ,---.          |  :  /`. / |  | :     ,---.           .---. \n" +
                    "|    :     | .   |  ;. / ;   ; '           |    :     |  '   ,'\\   '   ,'\\         ;  |  |--`  :  : '    '   ,'\\         /. ./| \n" +
                    ";    |.';  ; .   ; /--`  '   | |__         ;    |.';  ; /   /   | /   /   |        |  :  ;_    |  ' |   /   /   |     .-'-. ' | \n" +
                    "`----'  |  | ;   | ;  __ |   | :.'|        `----'  |  |.   ; ,. :.   ; ,. :         \\  \\    `. '  | |  .   ; ,. :    /___/ \\: | \n" +
                    "    '   :  ; |   : |.' .''   :    ;            '   :  ;'   | |: :'   | |: :          `----.   \\|  | :  '   | |: : .-'.. '   ' . \n" +
                    "    |   |  ' .   | '_.' :|   |  ./             |   |  ''   | .; :'   | .; :          __ \\  \\  |'  : |__'   | .; :/___/ \\:     ' \n" +
                    "    '   :  | '   ; : \\  |;   : ;               '   :  ||   :    ||   :    |         /  /`--'  /|  | '.'|   :    |.   \\  ' .\\    \n" +
                    "    ;   |.'  '   | '/  .'|   ,/                ;   |.'  \\   \\  /  \\   \\  /         '--'.     / ;  :    ;\\   \\  /  \\   \\   ' \\ | \n" +
                    "    '---'    |   :    /  '---'                 '---'     `----'    `----'            `--'---'  |  ,   /  `----'    \\   \\  |--\"  \n" +
                    "              \\   \\ .'                                                                          ---`-'              \\   \\ |     \n" +
                    "               `---`                                                                                                 '---\"      \n" +
                    "                                                                                                                                ");
            //Opening Scene
            System.out.println("\n\n\n\nWelcome to TGL Too Slow, where you will go on the journey of a lifetime: from a slow skinny cross country runner to a\nstate champion.");
            
            // Gender input
            do {
                System.out.print("Are you a boy or a girl? (b/g): ");
                gender = sc.nextLine().trim().toLowerCase();
            } while (!gender.equals("b") && !gender.equals("g"));

            // ASCII runner Art
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⣶⡿⠡⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡎⢳⠤⠃⠀⠀⢠⣤⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡰⢉⣩⠑⠑⢉⠶⢀⠀⠀⢈⣽⠁⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⢀⡴⣁⠩⠚⣿⣶⣁⠀⢀⣞⠢⣠⠊⠇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⢇⢱⠀⠀⣴⡌⠡⢊⠝⠈⠒⠇⠜⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠈⡾⠄⢠⣿⠃⠄⢾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠊⢸⣧⣴⣶⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⡟⠟⠃⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠟⠀⡨⠋⠉⠓⠧⢤⡀⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⡠⠖⢅⠔⠉⠀⠀⠀⠀⠀⠜⠛⡜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⡔⢁⠔⠁⠀⠀⠀⠀⠀⠀⡼⢀⠌⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⢀⡤⠾⡔⠁⠀⠀⠀⠀⠀⠀⠀⣰⢡⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⢻⢸⠃⠀⠀⠀⠀⠀⠀⠀⠘⠤⡙⠆⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠤⠤⠤⠤⠬⠮⠆⠄⢀⡀⠤⠤⠤⠀⠀⠀⠈⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀\n" +
                    "⣿⣯⣯⣝⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");

            System.out.println("\nYour stamina and speed levels begin at 0. Your energy starts at 5.");
            System.out.println("As you choose workouts and food, your stats will change. Let's begin! Eating will increase energy, while running will decrease. Running increases stamina, workouts increase speed.");
            System.out.println("You have 10 days until the state championship race");
            //ASCII Art for the first Race.
            System.out.println("\n______                 __   \n" +
                    "| ___ \\               /  |  \n" +
                    "| |_/ /__ _  ___ ___  `| |  \n" +
                    "|    // _` |/ __/ _ \\  | |  \n" +
                    "| |\\ \\ (_| | (_|  __/ _| |_ \n" +
                    "\\_| \\_\\__,_|\\___\\___| \\___/ \n");
            System.out.println("You are at the starting line for the regular season race...");
            System.out.println("You finish the race in last place, with a time of 47 minutes, 12 seconds. Congratulations! Time to lock in.");

            // Day loop (Loops for ten days, until it moves on to the state championship)
            while (day > 0) {
                count++;
                day -= 1;
                //This is the racer score, it will increase when speed and stamina increase.
                double racer = ((speed + stamina) * (2.0 / 3.0)) + (energy / 2.0);

                System.out.println("\nDays until State Championship Race: " + day);
                //Scene 2, choice 2
                System.out.println("You wake up and get out of bed. You walk downstairs and open the fridge. It's empty. \nLooks like you have go grocery shopping!");
                System.out.println("Do you want to (1) run to the store or (2) drive to the store?");
                int shop = sc.nextInt();

                if (shop == 1) {
                    energy -= 1;
                    stamina += 0.5;
                    System.out.println("You used one energy to get to the store. Your stamina increased by 0.5");
                }
                if (shop==2){
                    System.out.println("You drove to the store. Nothing changed");
                }
                //Scene 3, choice 3
                System.out.println("You have two options to buy for your meal. Would you like to have (1) an energy drink, which will increase \nyour energy by 1, or (2) a salad, which will increase your speed by 0.1");
                int food = sc.nextInt();
                if (food == 1) {
                    energy += 1;
                    System.out.println("Your energy is now " + energy);
                } else if (food == 2) {
                    speed += 0.1;
                    System.out.println("Good choice, you just got faster. Your speed is now " + speed);
                }
                //Scene 4, choice 4
                System.out.println("Do you want to do a (1) workout (increase speed) or (2) a long run (increase stamina) or (3) sit on the couch and do nothing");
                int workoutChoice = sc.nextInt();
                if (workoutChoice == 1) {
                    int speedIncrease = random.nextInt(2) + 1;
                    speed += speedIncrease;
                    System.out.println("Your speed has increased by " + speedIncrease);
                }
                //Scene 5, choice 5
                if (workoutChoice == 2) {
                    System.out.println("Do you want to run for (1) 6 miles (-1 energy) or (2) 13 miles(-2 energy): ");
                    int mileage = sc.nextInt();
                    if (mileage == 1) {
                        stamina += 1;
                        System.out.println("Your stamina has increased by 1. It is now " + stamina);
                        energy -= 1;
                    } else {
                        int staminaIncrease = random.nextInt(3) + 1;
                        stamina += staminaIncrease;
                        System.out.println("Your stamina has increased by " + staminaIncrease + ". It is now " + stamina);
                        energy -= 2;
                    }
                } else if (workoutChoice == 3) {
                    couch += 1;
                }
                //Scene 6, choice 6
                System.out.println("You go home, stretch, and start to relax. You can choose to (1) eat some chicken and rice to increase energy, (2) do a recovery run to increase stamina, or (3), sit on the couch and watch tv");
                int postWorkout = sc.nextInt();
                if (postWorkout == 1) {
                    energy += 1;
                    System.out.println("Your energy is " + energy);
                } else if (postWorkout == 2) {
                    stamina += 0.5;
                    System.out.println("Your stamina is " + stamina);
                } else {
                    couch += 2;
                }
                //Scene 7, choice 7
                System.out.println("After a long day, you have been productive. Good work. Hopefully it will pay off.");
                System.out.println("Energy: " + energy);
                System.out.println("Stamina: " + stamina);
                System.out.println("Speed: " + speed);

                // Race section
                System.out.println("Race " + count);
                System.out.println("What is your race strategy? (1) Go out fast, (2) Pace yourself, (3) Stick with leader");
                int everyDayRace = sc.nextInt();

                if (racer > difficulty) {
                    win++;
                    System.out.println("You win the race! Your win count is now " + win);
                } else {
                    System.out.println("You lose the race. Try again tomorrow.");
                }

                difficulty -= 3;
                //Losing the game scene
                if (energy <= 0) {
                    System.out.println("Sorry. You ran out of energy. Try and play again.");
                    return;
                }
            }

            // Championship
            //Scene 8
            System.out.println("Today is the State Championship race.");
            //Scene 9, choice 8
            System.out.println("Good luck! You have a conversation with your coach. You have the important decision. \nWhat are you going to have for breakfast? \nWhat is your prerace meal?");
            System.out.println("Do you want (1) a banana, (2), an energy drink, or (3), nothing at all");
            int stateChip = sc.nextInt();
            if (stateChip == 1) {
                System.out.println("Good choice, that is a healthy suggestion for a prerace meal.\nYou increased your energy by 2 with this meal");
                stamina += 2;
            } else if (stateChip == 2) {
                System.out.println("Not a great choice, while it will give energy it does not sit well in your stomach. \nYou lost 1 stamina and gained 0.5 energy.");
                stamina -= 1;
                energy += 0.5;
            } else if (stateChip == 3) {
                System.out.println("What a stupid choice. You lose 3 energy");
                energy -= 3;
            }
            //Secret ending scene
            if (couch>8) {
                            System.out.println("You put comfort over hard work. You win the secret game. Congratulations!!! Play again? (1) yes, (2) no");
                            redo = sc.nextInt();
                            if (redo == 1) {
                                i = -1;
                                continue;
                            } else {
                                return;
                            }
            }
            //Scene 10, choice 9
            System.out.println("It is the start of the race...");
            System.out.println("Two miles in, there is a big hill coming up. Do you speed up and pass people? (1) yes (2) no");
            int hill = sc.nextInt();
            double racer = ((speed + stamina) * (2.0 / 3.0)) + (energy / 2.0);
            if (hill == 1) {
                System.out.println("You sprint up the hill. That means you lose 1 energy, but your overall increases by 1.");
                energy -= 1;
                racer += 1;
            } else {
                System.out.println("You decide to stay the same pace. You feel much better. Nothing happens to your stats");
            }

            System.out.println("In the final mile, you are close to the top 3 people...");
            System.out.println("With .5 miles left, do you want to start your kick? (1) yes (2) no");
            int kick = sc.nextInt();
    
            if (racer > challenge) {
                if (kick == 1 && speed >= 7) {
                    //Ending 1 (WIN)
                    System.out.println("CONGRATULATIONS!!!!!!!!\nYOU WIN THE STATE CHAMPIONSHIP WITH A TIME OF 14:53. This is awesome. You have a bright future ahead of you.\nYou feel great. You have won. You thank your friends and family, and hoist the trophy.\nAll your work has paid off.\nYou, the Ginger Lightning, are the champion. Be proud.\nPlay again? (1)yes (2)no");
                    redo = sc.nextInt();
                    if (redo == 1) {
                        i = -1;
                        continue;
                    } else {
                        return;
                    }
                } else if (kick == 1 && speed < 7) {
                    //Ending 2(Loss)
                    System.out.println("You kick, but it isn't fast enough. I'm sorry, you lose the race. You come in second. Nice try! Play again? (1)yes (2)no");
                    redo = sc.nextInt();
                    if (redo == 1) {
                        i = -1;
                        continue;
                    } else {
                        return;
                    }
                } else if (kick == 2 && stamina > 7) {
                    //Ending 3 (WIN)
                    System.out.println("You are able to win even without the kick. CONGRATULATIONS!!!!!!!! YOU WIN THE STATE CHAMPIONSHIP!! Play again? (1)yes (2)no");
                    redo = sc.nextInt();
                    if (redo == 1) {
                        i = -1;
                        continue;
                    } else {
                        return;
                    }
                } else {
                    //Ending 4 (Loss)
                    System.out.println("Sorry, you lost the race. Play again? (1) yes, (2) no");
                    redo = sc.nextInt();
                    if (redo == 1) {
                        i = -1;
                        continue;
                    } else {
                        return;
                    }
                }
            } else {
                //Ending 5 (Loss)
                System.out.println("Sorry, you lost the race. Play again? (1) yes, (2) no");
                redo = sc.nextInt();
                if (redo == 1) {
                    i = -1;
                    continue;
                } else {
                    return;
                }
            }

        }
    }
}

