package Model;
public abstract class Pet {
    private String nickname;
    private int age;
    public Pet(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }
    public String getNickname() {
            return nickname;
        }
        public void setNickname () {
            if (nickname == null || nickname.isBlank()) {
                throw new IllegalArgumentException("Model.Pet name cannot be empty");
            }
            this.nickname = nickname;
        }
        public int getAge () {
            return age;
        }
        public void setAge () {
            if (age <= 0) {
                throw new IllegalArgumentException("Age must be positive");
            }
            this.age = age;
        }
        public abstract String getType ();
        @Override
        public String toString () {
            return getType() + " | name = " + nickname +
                    ", age = " + age;
        }
    }
