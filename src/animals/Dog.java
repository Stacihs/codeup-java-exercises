package animals;

public class Dog {
    private String name;
    private String sound;

    public String makeNoise() {
        return name + " goes " + sound;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Dog() {
    };

    public Dog(String name, String sound) {
        this.name = name;
        this.sound = sound;
    };
}