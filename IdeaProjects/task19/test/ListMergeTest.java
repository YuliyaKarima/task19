
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ListMergeTest {
    Comparator comparator = new IntComparator();
    private List<Integer> resultList;
    private List<Integer> listOne;
    private List<Integer> listTwo;
    private List<Integer> listThree;
    private List<Integer> listFour;
    private List<Integer> listFive;
    private List<Integer> listSix;
    ListMerge merge;

    @Before
    public void init() {
        merge = new ListMerge();
        listOne = new LinkedList<Integer>();
        listTwo = new LinkedList<Integer>();
        resultList = new LinkedList<Integer>();
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
    }

    @Test
    public void mustCombineTwoSortedList() throws Exception {
        //given
        resultList.addAll(listOne);
        resultList.addAll(listTwo);
        resultList.sort(comparator);
        //when
        merge.merge(listTwo, listOne);
        //then
        assertEquals("not equals ", resultList, listOne);
    }

    @Test
    public void mustCombineTwoSortedList2() throws Exception {
        //given
        resultList.addAll(listOne);
        resultList.addAll(listTwo);
        resultList.sort(comparator);
        //when
        merge.merge2(listTwo, listOne);
        //then
        assertEquals("not equals ", resultList, listOne);
    }
}