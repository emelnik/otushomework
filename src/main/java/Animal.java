public abstract class Animal {

    private String name;
    private int age;
    private int weight;
    private String color;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say(){
        System.out.println("Я говорю");
    }

    public void go(){
        System.out.println("Я иду");
    }

    public void drink(){
        System.out.println("Я пью");
    }

    public void eat(){
        System.out.println("Я ем");
    }

    @Override
    public String toString() {

        String old = "";

        int lastAgeNumber = age % 10;

        boolean isExclusion = (age % 100 >= 11) && (age % 100 <= 14);

        if (lastAgeNumber == 1) {
            old = "год";
        } else if (lastAgeNumber == 0 || lastAgeNumber >= 5 && lastAgeNumber <= 9){
            old = "лет";
        }else if (lastAgeNumber >= 2 && lastAgeNumber <= 4){
            old = "года";
        }

        if(isExclusion){
            old = "лет";
        }

        return "Привет! Меня зовут " + name + ", мне "
                + age + " " + old + ", я вешу - "
                + weight + " кг" + ", мой цвет - " + color;
    }

//    public static void main(String[] args) {
//        Animal a = new Animal();
//        System.out.println(a.toString());
//    }

}
