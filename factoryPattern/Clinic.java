
//  Display number of lives if Cat is selected; breed if Dog is selected.
//  Alter the choice selection.  3 means Exit. Make the prompt infinite unless terminated by 3 (Exit).
//  Submit the your own version gitHub URL here.
import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.print("\nChoose your pet number: ");
        Integer choice = input.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet;

        switch(choice){
            case 1: pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                ((Dog) pet).setBreed("German Shepperd");

                break;
            case 2: pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
        }

        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());

        if (petFile.getPet() instanceof Dog) {
            Dog myDog = (Dog) petFile.getPet();
            System.out.println("Dog breed: " + myDog.getBreed());
        } else if (petFile.getPet() instanceof Cat) {
            Cat myCat = (Cat) petFile.getPet();
            System.out.println("Cat lives: " + myCat.getNoOfLives());
        }

        System.out.println("Communication sound: "+ petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play());

    }
}
