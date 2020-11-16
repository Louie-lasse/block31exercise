package animalshelter;

/**
 * Created by Niklas on 2016-02-07.
 */
public class ShelterError {

    public static void main(String[] args){
        Shelter<Cat> catShelter = new Shelter<>();
        Dog badBoyRex = new Dog();
        Shelter<Animal> animalShelter = new Shelter<>();
        animalShelter.putAnimal( new Dog() );
        animalShelter.putAnimal( new Cat() );
        Animal a = animalShelter.adoptAnimal();
        System.out.println(a.speak());

        catShelter.putAnimal(badBoyRex);
        System.out.println("Who let the dogs out?!?");
    }
}
