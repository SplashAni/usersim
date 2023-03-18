package com.github.ridglef.usersim;

import com.github.ridglef.usersim.Enums.Animal;
import com.github.ridglef.usersim.Enums.Gender;
import com.github.ridglef.usersim.types.FirstName;
import com.github.ridglef.usersim.types.IpAdress;
import com.github.ridglef.usersim.types.LastName;
import com.github.ridglef.usersim.types.Person;

import java.util.Random;

public class Protocol {
    public static Random random = new Random();

    public static Animal generateAnimal() {
        Animal[] animals = Animal.values();
        return animals[random.nextInt(animals.length)];
    }

    public static IpAdress generateIP(){
        return new IpAdress(randomNum(1,255),randomNum(1,255),randomNum(1,255),randomNum(1,255));
    }
    public static Person generatePerson(){
            Gender[] genders = Gender.values();
            Gender g = genders[random.nextInt(genders.length)];
            String firstname = "";
            if (g.equals(Gender.male)){firstname = ArrayLists.FirstNamesMale.get(random.nextInt(ArrayLists.FirstNamesMale.size()));} else {firstname = ArrayLists.FirstNamesFemale.get(random.nextInt(ArrayLists.FirstNamesFemale.size()));}

        return new Person(
                g,
               new FirstName(firstname),
                new LastName(ArrayLists.LastNames.get(random.nextInt(ArrayLists.LastNames.size())))
        );
    }


    private static int randomNum(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
