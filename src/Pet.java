public class Pet {
    private String nickname;
    private int age;
    private String breed;
    private String sex;
    private String symptom;

    public Pet(String nickname, int age, String breed , String sex , String symptom) {
        setNickname(nickname);
        setAge(age);
        this.breed = breed;
        this.sex = sex;
        this.symptom = symptom;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname != null && !nickname.isBlank()) {
            this.nickname = nickname;
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    @Override
    public String toString() {
        return "Pet : " +
                "nickname = '" + nickname + '\'' +
                ", age = " + age +
                ", type = '" + breed + '\'' +
                ", sex = '" + sex + '\'' +
                ", symptom = '" + symptom + '\'' +
                '}';
    }
}