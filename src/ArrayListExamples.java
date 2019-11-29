import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args)
    {
        String[] friendsArray = new String[5];
        friendsArray[0]="Bruce";
        friendsArray[1]="Leslie";
        friendsArray[2]="Todd";
        friendsArray[3]="Gerry";
        friendsArray[4]="Ava";

        System.out.println(friendsArray);

        ArrayList<Integer> test = new ArrayList<>();
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Bruce");
        friends.add("Todd");
        friends.add("Gerry");
        friends.add("Ava");
        friends.add(2,"Leslie");
        System.out.println(friends);
        System.out.printf("Does list include 'Todd': %b%n",
                                            friends.contains("Todd"));
        System.out.printf("Does list include 'Late Man Skyler': %b%n",
                friends.contains("Late Man Skyler"));



    }
}
