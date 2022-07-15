import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BuildAnimal {

    public static void main(String[] args) throws IOException {

        ArrayList<Animal> animalList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isExit = true;

        while(isExit) {
            System.out.println("Введите команду add/list/exit: ");

            String str = reader.readLine().toUpperCase().trim();

            Commands c = Commands.valueOf(str);

            switch (c) {
                case ADD:
                    System.out.println("Введите тип животного которого будем создавать: ");
                    String typeAnimal = reader.readLine();

                    if(typeAnimal.equals("cat")){
                        Animal cat = new Cat();
                        animalCreate(cat,reader);
                        animalList.add(cat);
                        cat.say();
                    }else if(typeAnimal.equals("dog")){
                        Animal dog = new Dog();
                        animalCreate(dog,reader);
                        animalList.add(dog);
                        dog.say();
                    }else if(typeAnimal.equals("duck")){
                        Animal duck = new Duck();
                        animalCreate(duck,reader);
                        animalList.add(duck);
                        duck.say();
                    }
                    break;

                case LIST:
                    for (Animal a:animalList) {
                        System.out.println(a.toString());;
                    }
                    break;

                case EXIT:
                    System.out.println("выход");
                    isExit = false;
                    break;
            }
        }

    }

    public static void animalCreate(Animal animal, BufferedReader reader) throws IOException {
        System.out.println("Введите имя животного: ");
        animal.setName(reader.readLine());

        System.out.println("Введите возраст животного:");
        animal.setAge(Integer.parseInt(reader.readLine()));

        System.out.println("Введите цвет животного:");
        animal.setColor(reader.readLine());

        System.out.println("Введите вес животного:");
        animal.setWeight(Integer.parseInt(reader.readLine()));

    }

}
