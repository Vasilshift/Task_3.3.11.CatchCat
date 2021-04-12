//Создайте класс Cat и класс Dog.
//        В классе Cat должен быть метод sayHello(), который выводит в консоль "Мяу!",
//        аналогично с собакой, но выводит "Гав!".
//        Так же, у собаки должен быть метод catchCat (поймать кошку),
//        который принимает кошку и дальше делает следующее:
//        1) выводит в консоль сообщение "Кошка поймана"
//        2) У собаки, которая поймала кошку должен быть вызван метод sayHello()
//        3) У кошки, которую поймала собака должен быть вызван метод sayHello()

//Вопрос: как метод будет принимать кошку? она же объект?
// Где делать метод Main?
public class program {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.sayHello();
        dog.sayHello();
        dog.catchCat(cat);

    }
    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");

        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            sayHello();
            cat.sayHello();
        }
    }


}
