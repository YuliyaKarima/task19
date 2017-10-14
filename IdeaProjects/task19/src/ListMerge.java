import java.util.List;

public class ListMerge {
    /**
     * Add all elements from second sorted list to first one
     * so that the first list is also sorted
     *
     * @param from list-source of elements
     * @param to   list-receiver of elements
     */
    public void merge(List<Integer> from, List<Integer> to) {
        int num;
        int posTo = 0;
        int posFrom = 0;

        if (from.get(from.size() - 1) <= (to.get(0))) {
            to.addAll(0, from);
        } else {
            for (Integer i : from) {
                if (i >= to.get(to.size() - 1)) {
                    to.addAll(to.size(), from.subList(posFrom, from.size()));
                    break;
                } else if (to.contains(i)) {
                    posTo = to.lastIndexOf(i) + 1;
                    to.add(posTo, i);
                } else {
                    num = i;
                    while (num >= 0) {
                        if (to.contains(num - 1)) {
                            to.add(to.lastIndexOf(num - 1) + 1, i);
                            break;
                        }
                        num -= 1;
                    }
                }
                posFrom++;
            }
        }
    }

    /**
     * Add all elements from second sorted list to first one
     * so that the first list is also sorted
     *
     * @param from list-source of elements
     * @param to   list-receiver of elements
     */
    public void merge2(List<Integer> from, List<Integer> to) {
        int num;
        int posTo = 0;
        int posFrom = 0;

        if (from.get(from.size() - 1) <= (to.get(0))) {
            to.addAll(0, from);
        } else {
            while (posFrom < from.size()) {
                num = from.get(posFrom);
                if (num >= to.get(to.size() - 1)) {
                    to.addAll(to.size(), from.subList(posFrom, from.size()));
                    break;
                } else {
                    if (to.get(posTo) >= num) {
                        to.add(posTo, num);
                        posTo++;
                        posFrom++;
                    } else {
                        posTo++;
                    }
                }
            }
        }
    }
}
