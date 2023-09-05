
/*
 Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below, determine the number of apples and oranges that land on Sam's house.

In the diagram below:

The red region denotes the house, where  is the start point, and  is the endpoint. The apple tree is to the left of the house, and the orange tree is to its right.
Assume the trees are located on a single point, where the apple tree is at point , and the orange tree is at point .
When a fruit falls from its tree, it lands  units of distance from its tree of origin along the -axis. *A negative value of  means the fruit fell  units to the tree's left, and a positive value of  means it falls  units to the tree's right. *

Sample Input 0

7 11
5 15
3 2
-2 2 1
5 -6
Sample Output 0

1
1

  for more clearification contact me on : nazim.nn459@gmail.com
 */
import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        List<Integer> apple = new ArrayList<Integer>();
        List<Integer> orange = new ArrayList<Integer>();

        apple.add(-2);
        apple.add(2);
        apple.add(1);
        // System.out.println(apple);
        orange.add(5);
        orange.add(-6);

        int ap = 0;
        int or = 0;
        for (int i = 0; i < apple.size(); i++) {
            int temp = a + apple.get(i);
            if (temp >= s && temp <= t) {
                ap++;
            }
        }

        for (int i = 0; i < orange.size(); i++) {
            int temp = b + orange.get(i);
            if (temp >= s && temp <= t) {
                or++;
            }
        }

        System.out.println(ap + " " + or);

    }
}
