class Dog {

int size;
String name;

void bark() {
if (size > 60) {
	System.out.println(name + " says Woof! Woof!");
}
else if (size > 15 ) {
	System.out.println(name + " says Ruff! Ruff!");
}
else  {
	System.out.println(name + " says yip! yip!");
}

}

}
