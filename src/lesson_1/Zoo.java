package lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T> {

    private final List<T> animals;

    public Zoo() {
        this.animals = new ArrayList<>();

    }

    public boolean encage (T animal) {
       return animals.add(animal);
    }
    public T release (T animal){
        if (animals.contains(animal)) {
            animals.remove(animal);
            return animal;
        }

        return null;
    }
}
