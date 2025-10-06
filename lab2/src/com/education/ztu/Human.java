package com.education.ztu;

interface Human {
    void sayName();

    void sayAge();

    void sayLocation();

    void sayGender();

    default void whoIAm() {
        System.out.println("Human.");
    }
}

