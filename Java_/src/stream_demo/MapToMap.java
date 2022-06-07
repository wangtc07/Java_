package stream_demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapToMap {

  public static void main(String[] args) {
    Map<String, List<Integer>> map = new HashMap<>();

    map.put("1", List.of(1, 2, 3, 4));
    map.put("2", List.of(1, 2, 3, 4));
    map.put("3", List.of(1, 2, 3, 4));

    Map<String, List<String>> stringListMap = map.keySet().stream()
        .collect(Collectors.toMap(Function.identity(),
            key -> {
              System.out.println(key);
              List<Integer> list = map.get(key);
              return list.stream().map(Object::toString)
                  .collect(Collectors.toList());

            }));

    System.out.println(stringListMap);
  }
}
