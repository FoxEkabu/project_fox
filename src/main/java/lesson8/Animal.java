package lesson8;

public class Animal {
    private String kidAnimal;


    public Animal(String kidAnimal) {
        this.kidAnimal = kidAnimal;

    }

    public String getKidAnimal() {
        return kidAnimal;
    }

    public String toString() {
        return "Animal{" +
                "kidAnimal='" + kidAnimal +
                '}';
    }
// метод voice
public void voice() {
  //      if (this instanceof Dog) {
  //        System.out.println("cобака лает");
  //      } else if (this instanceof Cat) {
  //         System.out.println("кошка мяукает");
  //      }
  //      if (this instanceof Mouse) {
   //         System.out.println("мышь пищит");
   //     }
 }
}
