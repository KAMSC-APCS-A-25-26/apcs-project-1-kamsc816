import java.util.Scanner;
import java.util.Random;

public class TextAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String gender;
        String boy = "b";
        double speed = 0;
        double stamina = 0;
        int energy = 5;
        int couch = 0;
        int day = 11;
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
        //Brief introduction to the game
        System.out.println("\n\n\n\nWelcome to TGL Too Slow, where you will go on the journey of a lifetime: from a slow skinny cross country runner to a\nstate champion.");

        //Reads in the user gender
        do {
            System.out.print("Are you a boy or a girl? (b/g): ");
            gender = sc.nextLine().trim().toLowerCase();
        } while (!gender.equals("b") && !gender.equals("g"));

        //ASCII Runner Art
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

        //Introduction
        System.out.println("\nYour stamina and speed levels begin at 0. Your energy starts at 5.");
        System.out.println("As you choose workouts and food, your stats will change. Let's begin! Eating will increase energy, while running will decrease. Running increases stamina, workouts increase speed.");
        System.out.println("You have 10 days until the state championship race");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("______                 __   \n" +
                "| ___ \\               /  |  \n" +
                "| |_/ /__ _  ___ ___  `| |  \n" +
                "|    // _` |/ __/ _ \\  | |  \n" +
                "| |\\ \\ (_| | (_|  __/ _| |_ \n" +
                "\\_| \\_\\__,_|\\___\\___| \\___/ \n" +
                "                            \n" +
                "                            ");
        System.out.println();
        System.out.println("You are at the starting line for the regular season race. The gun goes off. \n...\nYou start sprinting as fast as you can\n...\n...\nbut you are still in last place.\n...\n...\n...After mile 2 you are still in last. No runner is in sight, and they have begun to take down the course.\n...\n...\n...\n... You finish the race in last place, with a time of 47 minutes, 12 seconds. Congradulations! Time to lock in. ");

        //Day to day life
        while(day>0) {
            day -= 1;
            System.out.println("Days until State Championship Race: " + day + "\n\n\n");
            System.out.println("You wake up and get out of bed. You walk downstairs and open the fridge. It's empty. \nLooks like you have go grocery shopping!");
            System.out.println("Do you want to (1) run to the store or (2) drive to the store");

            //Reads if you want to run or drive to the store
            int shop = sc.nextInt();
            //Changes energy/stamina based on user decision
            if (shop == 1) {
                energy = energy - 1;
                stamina = stamina + 0.5;
                System.out.println("You used one energy to get to the store. Your stamina increased by 0.5");
            }
            System.out.println("You have two options to buy for your meal. Would you like to have (1) an energy drink, which will increase your energy by 1, or (2) a salad, which will increase your speed by 0.1");
            int food = sc.nextInt();
            if (food == 1) {
                energy += 1;
                System.out.println("Your energy is now " + energy);
            }
            if (food == 2) {
                speed += 0.1;
                System.out.println("Good choice, you just got faster. Your speed is now " + speed);
            }
            System.out.println("Do you want to do a (1) workout (increase speed) or (2) a long run (increase stamina) or (3) sit on the couch and do nothing");
            int workoutChoice = sc.nextInt();
            if (workoutChoice == 1) {
                int speedIncrease = random.nextInt(2 - 1 + 1) + 1;
                speed += speedIncrease;
                System.out.println("Your speed has increased by " + speed);
            }
            if (workoutChoice == 2) {
                System.out.println("Do you want to run for (1) 6 miles (-1 energy) or (2) 13 miles(-2 energy): ");
                int mileage = sc.nextInt();
                if (mileage == 1) {
                    stamina += 1;
                    System.out.println("Your stamina has increased by 1. It is now " + stamina);
                    energy -= 1;
                } else {
                    int staminaIncrease = random.nextInt(3 - 1 + 1) + 1;
                    stamina+=staminaIncrease;
                    System.out.println("Your stamina has increased by " + staminaIncrease + ". It is now " + stamina);
                    energy -= 2;
                }

            } else {
                couch += 1;
            }
            System.out.println("You go home, stretch, and start to relax. You can choose to (1) eat some chicken and rice to increase energy, (2) do a recovery run to increase stamina, or (3), sit on the couch and watch tv");
            int postWorkout = sc.nextInt();
            if(postWorkout==1){
                energy+=1;
                System.out.println("Your energy is " + energy);
            }
            if(postWorkout==2){
                stamina+=0.5;
                System.out.println("Your stamina is " + stamina);
            }
            else{
                couch +=2;
            }
            System.out.println("After a long day, you have been productive. Good work. Hopefully it will pay off. Your levels are now the following: ");
            System.out.println("Energy: " + energy);
            System.out.println("Stamina: " + stamina);
            System.out.println("Speed: " + speed);
        }

    }
}

