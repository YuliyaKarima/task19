import java.util.*;

public class MergeTest {
    public static void main(String[] args) {
        List<Integer> listOne = new LinkedList<Integer>();
        List<Integer> listTwo = new LinkedList<Integer>();
        List<Integer> listThree = new LinkedList<Integer>();
        List<Integer> listFour = new LinkedList<Integer>();
        List<Integer> listFive = new LinkedList<Integer>();
        List<Integer> listSix = new LinkedList<Integer>();
        listOne.add(1);
        listOne.add(1);
        listOne.add(2);
        listOne.add(2);
        listOne.add(4);
        listOne.add(5);
        listOne.add(5);
        listTwo.add(1);
        listTwo.add(3);
        listTwo.add(3);
        listTwo.add(6);
        listTwo.add(6);
        listThree.add(1);
        listThree.add(2);
        listThree.add(4);
        listThree.add(5);
        listFour.add(6);
        listFour.add(7);
        listFour.add(8);
        listFive.add(11);
        listFive.add(13);
        listFive.add(15);
        listSix.add(1);
        listSix.add(3);
        listSix.add(9);
        //case when  both lists contains different order of number
        System.out.println(listOne);
        System.out.println(listTwo);
        ListMerge merge = new ListMerge();
        merge.merge2(listTwo, listOne);
        System.out.println(listOne);
        //case when the second list's first number is more then the first list's last number
        System.out.println(listThree);
        System.out.println(listFour);
        merge.merge2(listFour, listThree);
        System.out.println(listThree);
        //case when the second list's last number is less then the first list's first number
        System.out.println(listFive);
        System.out.println(listSix);
        merge.merge2(listSix, listFive);
        System.out.println(listFive);
    }
}
