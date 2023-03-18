package com.github.ridglef.usersim.types;

import com.github.ridglef.usersim.Enums.Gender;

public class Person {
    public final com.github.ridglef.usersim.Enums.Gender Gender;
    public final FirstName FirstName;
    public final LastName Lastname;

    public Person(Gender gender, com.github.ridglef.usersim.types.FirstName firstName, LastName lastname) {
        Gender = gender;
        FirstName = firstName;
        Lastname = lastname;
    }
}
