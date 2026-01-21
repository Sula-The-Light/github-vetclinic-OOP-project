public abstract class Pet {
    private String nickname;
    private int age;
    public Pet(String nickname, int age) {
        if (nickname == null || nickname.isBlank()) {
            throw new IllegalArgumentException("Pet name cannot be empty");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.nickname = nickname;
        this.age = age;
    }
    public String getNickname() {
        return nickname;
    }
    public int getAge() {
        return age;
    }
    public abstract String getType();
    @Override
    public String toString() {
        return getType() + " | name = " +
                ", age = " + age;
    }
}
