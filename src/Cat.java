public class Cat extends Pet {
    public Cat(String nickname, int age) {
        super(nickname, age);
    }
    @Override
    public String getType() {
        return "Cat";
    }
}
