package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Task one
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);

        // Task two
        dog = dog + 4;
        cat = cat + 4;
        paper =paper + 4;
        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);

        // Task three
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper =paper - 7639;
        System.out.println("Dog = " + dog);
        System.out.println("Cat = " + cat);
        System.out.println("Paper = " + paper);

        // Task four
        var friend = 19;
        System.out.println("Friend = " + friend);
        friend = friend * 2;
        System.out.println("Friend = " + friend);
        friend = friend / 7;
        System.out.println("Friend = " + friend);

        // Task five
        var frog = 3.5;
        System.out.println("Frog = " + frog);
        frog = frog * 10;
        System.out.println("Frog = " + frog);
        frog = frog / 3.5;
        System.out.println("Frog = " + frog);
        frog = frog + 4;
        System.out.println("Frog = " + frog);

        // Task six
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var boxersWeightSum = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Boxers weight sum = " + boxersWeightSum);
        var boxersWeightSubtraction = firstBoxerWeight - secondBoxerWeight;
        System.out.println("Boxers weight subtraction = " + boxersWeightSubtraction);

        // Task seven
        var boxerWeightModulo = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Boxers weight modulo = " + boxerWeightModulo);

        // Task eight
        var totalHoursAmount = 640;
        var hoursPerEmployee = 8;
        var totalEmployeeAmount = totalHoursAmount / hoursPerEmployee;
        System.out.println("Всего работников в компании - " + totalEmployeeAmount + " человек");
        var newEmployeeAmount =totalEmployeeAmount + 94;
        var newTotalHoursAmount = newEmployeeAmount * 8;
        System.out.println("Если в компании работает " + newEmployeeAmount + " человек, то всего " + newTotalHoursAmount + " часов работы может быть поделено между сотрудниками");

    }
}

