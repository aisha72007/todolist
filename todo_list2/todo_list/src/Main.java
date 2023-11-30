import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);
    static Scanner reader2 = new Scanner(System.in);
    static Random rand = new Random();

    static String n;
    static int l;
    static int a;
    public static void main(String[] args) {

        int whichtask = rand.nextInt(4);

        System.out.println("Enter how many member do you want: ");

        Todo doit = new Tasks();
        FamilyMember familyMember = new FamilyMember();
        Tasks alltasks = new Tasks();
        int addMember = reader.nextInt();
        FamilyMember[] addNewMember = new FamilyMember[addMember];


        for (int i = 0; i < addNewMember.length; i++) {

            System.out.println("Enter your name: ");
            n = reader2.nextLine();
            System.out.println("Enter which level are you in family!");
            System.out.println("1) Father, 2) Mother, 3) Oldest Siblings, 4) Middlest Siblings, 5) Smallest Siblings");
            l = reader.nextInt();
            switch (l){
                case 1:
                    System.out.println("Father");
                    break;
                case 2:
                    System.out.println("Mother");
                    break;
                case 3:
                    System.out.println("Oldest Siblings");
                    break;
                case 4:
                    System.out.println("Middlest Siblings");
                    break;
                case 5:
                    System.out.println("Smallest Siblings");
                    break;
            }
            System.out.println("Enter your old: ");
            a = reader.nextInt();
            alltasks.allTasks();
            familyMember.newFamilyMember(n, l, a);
        }


        switch(whichtask + 1) {

            case 1:
                doit.cleanbedroom();
                break;
            case 2:
                doit.cleanKitchen();
                break;
            case 3:
                doit.cleanBathroom();
                break;
            case 4:
                doit.cleanLivingroom();
                break;
            default:
                System.out.println("False!");
        }
    }
}