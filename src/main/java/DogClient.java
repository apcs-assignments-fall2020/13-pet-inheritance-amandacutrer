public class DogClient {
    public static void main(String[] args) {
        Dog d1 = new Dog("Cooper", 6, "Miniature Pinscher");
        System.out.println(d1.getName()); // Cooper 
        System.out.println(d1.getAge()); // 6
        System.out.println(d1.getBreed()); // Miniature Pinscher
        System.out.println(d1); // Name: Cooper, Age: 6, Breed: Miniature Pinscher
        d1.makeNoise(); // Bark!
    }
}