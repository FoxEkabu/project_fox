package lesson8;

public class AnimalsRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Овчарка");
        Dog dog2 = new Dog("Йоркширский терьер");

        Cat cat1 = new Cat("Персидская");
        Cat cat2 = new Cat("Сиамская");

        Mouse mouse1 = new Mouse("Полевая");
        Mouse mouse2 = new Mouse("Лесная");

      // помещаем объекты в массив и вызываем метод voice
        Animal[] animal = new Animal[]{dog1, dog2, cat1, cat2, mouse1, mouse2};
        for (Animal animalKid : animal) {
            System.out.print(animalKid.getKidAnimal() + " ");
            animalKid.voice(); 
    }

    }
}
