package com.company;

public class Person {
    String name ;
    int age;
    Car car;
   Pet [] array;
    Person (String name, int age, Car car, Pet [] array ) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.array = array;
              }

              Person(String name) {
        this.name = name;
              }

              public void getInfo () {
                  System.out.println( "name "+ name+ ", age " + age + "  машина " + car.model+car.color+ " год выпуска " + car.god);
              }
}
