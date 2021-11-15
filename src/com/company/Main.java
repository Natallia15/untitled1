package com.company;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Lada ", "синий", 2010);
        Car car1 = new Car("Bobick ", "жёлтый", 2011);
        Car car2 = new Car("BMW ", "белый", 2015);
        Car car3 = new Car("RENO", "красный", 1999);
        Car car4 = new Car("Mustang", "чёрный", 2020);

        Pet pet = new Pet("Кот", "Барсик", 14, 7);
        Pet pet1 = new Pet("Собака", "Бобик", 1, 12);
        Pet pet2 = new Pet("Хомяк", "Хома", 2, 1);
        Pet pet3 = new Pet("Кролик", "Зюзя", 1, 2);

        Person person = new Person("Jon", 10, car, new Pet[]{pet, pet1});
        Person person1 = new Person("Nina", 45, car1);
        Person person2 = new Person("Zopa", 80, car3);
        Person person3 = new Person("Zanuda", 18, car2);
        Person person4 = new Person("Masha", 118, car4);

        person.getInfo();
        person1.getInfo();
        person2.getInfo();
        person3.getInfo();
        person4.getInfo();

        System.out.println(car.speed);
        car.gas();
        System.out.println(car.speed);
        car.breaK();
        System.out.println(car.speed);
        //car.getInfo();
        //car1.getInfo();

        Person[] array = {person, person1, person3, person2, person4};
        int novaya = 0;
        String name1 = "";
        for (int i = 1; i < array.length; i++) {
            if (array[i].car.god > novaya) {
                novaya = array[i].car.god;
                name1 = array[i].name;
            }
        }
        System.out.println("Имеет самую новую машину " + name1);


    }
}
