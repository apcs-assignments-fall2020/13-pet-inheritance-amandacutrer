public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public Dog(){
        super("Max", 1);
        this.breed = "Terrier";
    }

    // makeNoise() method
    public void makeNoise() {
        System.out.println("Bark!");
    }

    // toString method
    public String toString(){
        return ("Name: " + this.getName() + ", Age: " + this.getAge() + ", Breed: " + breed);
    }

    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Setter
    public void setBreed(String breed){
        if (breed.trim().length() != 0) {
            this.breed = breed;
        }
    }

}