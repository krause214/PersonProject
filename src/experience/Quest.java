package experience;

public class Quest {
    public static void main (String [] args) {
        Item ar1 [] = {new Item (1), new Item (2), new Item (3)};
        Item ar2 [] = ar1.clone ();
        ar2 [0].item = 4;
        System.out.println (ar1 [0].item +" " + ar1 [1].item + " " + ar1 [2].item);
    }
}
