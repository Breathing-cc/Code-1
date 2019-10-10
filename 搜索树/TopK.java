import java.util.*;

public class TopK {
        public static Map<String,Integer> calcCount(String[]words){
            for(String w :words){
                int count = map.getOrDefault(w,0);
                map.put(w,count + 1);
            }
            return map;
        }
        public static Map<Integer,List<String>> calcCountOfWords(Map<String,Integer>map) {
            Map<Integer, List<String>> ret = new HashMap<>();
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                String word = e.getKey();
                int count = e.getValue();
                if (!ret.containsKey(count)) {
                    ret.put(count, new ArrayList<>());
                }
                ret.get(count).add(word);
            }
            return ret;
        }
    private static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    public static void main(String[] args) {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        Map<String,Integer> wordCount = calcCount(words);
        System.out.println(wordCount);
        Map<Integer,List<String>> countToWorldList = calcCountOfWords(wordCount);
        System.out.println(countToWorldList);

        Set<Integer> counts = countToWorldList.keySet();
        System.out.println(counts);
        List<Integer> countsList = new ArrayList<>(counts);
        Collections.sort(countsList,new IntegerComparator());
        System.out.println(countsList);

    }
}
