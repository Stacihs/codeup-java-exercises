public class ServerNameGenerator {
    private static String[] adjectives = {"small", "big", "hot", "cold", "nice", "mean", "pretty", "sane", "smart", "mundane"};
    private static String[] nouns = {"house", "bike", "table", "car", "dog", "racetrack", "lake", "boat", "cup", "San Antonio"};

    public static String randomElement(String[] arr) {
        int i = (int) (Math.random() * 10);
        return arr[i];
    }

    public static void main(String[] args) {
        String str1 = randomElement(nouns);
        String str2 = randomElement(adjectives);
        System.out.printf("Here is your server name: " + "\n%s-%s", str1, str2);
    }
}