package groupAnagrams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class testGroupAnagrams {

    @Test
    public void sanityEmptyStringGroup() {
        String[] input = new String[]{""};
        ArrayList<String> groupEmptyString = new ArrayList<>(List.of(input));

        List<List<String>> expected = new ArrayList<>();
        expected.add(groupEmptyString);

        assertEquals(expected, Solution.groupAnagrams(input));
    }

    @Test
    public void sanitySingleStringGroup() {
        String[] input = new String[]{"cat"};
        ArrayList<String> groupOneString = new ArrayList<>(List.of(input));

        List<List<String>> expected = new ArrayList<>();
        expected.add(groupOneString);

        assertEquals(expected, Solution.groupAnagrams(input));
    }

    @Test
    public void sanityTwoStringsOneGroup() {
        String[] input = new String[]{"bat", "tab"};
        ArrayList<String> groupTwoString = new ArrayList<>(List.of(input));

        List<List<String>> expected = new ArrayList<>();
        expected.add(groupTwoString);

        assertEquals(expected, Solution.groupAnagrams(input));
    }

    @Test
    public void sanityTwoStringsTwoGroups() {
        String[] input = new String[]{"cat", "bat"};
        ArrayList<String> groupCat = new ArrayList<>(List.of(input[0]));
        ArrayList<String> groupBat = new ArrayList<>(List.of(input[1]));

        List<List<String>> expected = new ArrayList<>();
        expected.add(groupCat);
        expected.add(groupBat);

        assertEquals(expected, Solution.groupAnagrams(input));
        assertEquals(2, Solution.groupAnagrams(input).size());
    }

    @Test
    public void severalStringsThreeGroups() {
        String[] input = new String[]{"cat", "bat", "rat", "tar", "bar", "art", "tab"};

        ArrayList<String> groupCat = new ArrayList<>();
        groupCat.add(input[0]);

        ArrayList<String> groupBat = new ArrayList<>();
        groupBat.add(input[1]);
        groupBat.add(input[6]);

        ArrayList<String> groupRat = new ArrayList<>();
        groupRat.add(input[2]);
        groupRat.add(input[3]);
        groupRat.add(input[5]);

        ArrayList<String> groupBar = new ArrayList<>();
        groupBar.add(input[4]);

        List<List<String>> expected = new ArrayList<>();
        expected.add(groupCat);
        expected.add(groupBat);
        expected.add(groupRat);
        expected.add(groupBar);

        assertEquals(expected, Solution.groupAnagrams(input));
        assertEquals(4, Solution.groupAnagrams(input).size());
    }
}
