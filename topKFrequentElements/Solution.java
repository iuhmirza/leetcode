package topKFrequentElements;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    private static class Element implements Comparable<Element> {
        int num;
        int count;

        public Element(int n, int c) {
            num = n;
            count = c;
        }

        public int compareTo(Element other) {
            return -Integer.compare(count, other.count);
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num)+1);
            } else {
                countMap.put(num, 1);
            }
        }
        PriorityQueue<Element> elements = new PriorityQueue<>();
        for (int num : countMap.keySet()) {
            elements.add(new Element(num, countMap.get(num)));
        }

        int[] mostFrequent = new int[k];
        for (int i = 0; i < k; i++) {
            mostFrequent[i] = elements.remove().num;
        }

        return mostFrequent;
    }
}
