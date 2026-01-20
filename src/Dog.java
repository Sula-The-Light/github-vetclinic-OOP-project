public class Dog extends Pet {
    public Dog(String nickname, int age) {
        super(nickname, age);
    }
    @Override
    public String getType() {
        return "Dog";
    }
}
