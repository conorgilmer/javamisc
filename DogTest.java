class DogTest {

public static void main (String[] args) {

Dog aDog = new Dog();
aDog.size = 90;
aDog.name = "Harry";

Dog bDog = new Dog();
bDog.size = 20;
bDog.name = "Larry";

Dog cDog = new Dog();
cDog.size = 10;
cDog.name = "Barry";

bDog.bark();
cDog.bark();
aDog.bark();

}
}
