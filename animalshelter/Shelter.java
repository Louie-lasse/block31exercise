package animalshelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter<A> {
    private List<A> animals;
    Shelter(){
        animals = new ArrayList<>();
    }

    public A adoptAnimal(){
        return animals.remove(0);
    }

    public void putAnimal(A animal){
        animals.add(animal);
    }
}
