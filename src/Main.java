class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle {
    private int numberOfSeats = 5;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void start() {
        System.out.println("Car engine started");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped");
    }
}

class Animal {
    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void makeNoise() {
        System.out.println("Some generic animal noise");
    }

    public void roam() {
        System.out.println("Animal is roaming");
    }
}

class Feline extends Animal {
    @Override
    public void roam() {
        System.out.println("Feline roaming silently");
    }
}

class Canine extends Animal {
    @Override
    public void roam() {
        System.out.println("Canine roaming in a pack");
    }
}

class Lion extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Roar");
    }
}

class Cat extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}

class Wolf extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Howl");
    }
}

class Dog extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== VEHICLE TEST ===");
        Car car = new Car();
        car.start();
        car.stop();
        System.out.println("Seats: " + car.getNumberOfSeats());

        System.out.println("\n=== ANIMAL TEST ===");
        Animal[] animals = {
                new Lion(),
                new Cat(),
                new Wolf(),
                new Dog()
        };

        for (Animal a : animals) {
            a.sleep();
            a.makeNoise();
            a.roam();
            System.out.println();
        }
    }
}
