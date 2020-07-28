package experience;

public class Main {
    public static void main(String[] args) {
        int mas1 [] = { 1, 2, 3 };
        int mas2 [] = mas1.clone();
        System.out.println(mas1[0] + " " + mas1[1] + " " + mas1[2]);
        mas2[0] = 35;
        System.out.println(mas1[0] + " " + mas1[1] + " " + mas1[2]);
    }
}
