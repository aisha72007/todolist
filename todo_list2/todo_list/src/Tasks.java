import java.util.Random;

public class Tasks implements Todo{
    static Random randomname = new Random();
    static String nameRandom = randomname.toString();

    public void allTasks(){
        Main.n = nameRandom;
        cleanKitchen();
        cleanBathroom();
        cleanLivingroom();
        cleanbedroom();
    }

    @Override
    public void cleanKitchen() {
        System.out.println(nameRandom + " You will clean the kitchen");
    }

    @Override
    public void cleanBathroom() {
        System.out.println(nameRandom + " You will clean the Bathroom");
    }

    @Override
    public void cleanLivingroom() {
        System.out.println(nameRandom + " You will clean the living room");
    }

    @Override
    public void cleanbedroom() {
        System.out.println(nameRandom + " You will clean the Bedroom");
    }


}
