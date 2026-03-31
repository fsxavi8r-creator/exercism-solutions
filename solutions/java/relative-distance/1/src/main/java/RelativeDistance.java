import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class RelativeDistance {

  private final Map<String, Set<String>> graph = new HashMap<>();

  RelativeDistance(Map<String, List<String>> familyTree) {
    for (var entry : familyTree.entrySet()) {
      String parent = entry.getKey();
      for (String child : entry.getValue()) {
        graph.computeIfAbsent(parent, k -> new HashSet<>()).add(child);
        graph.computeIfAbsent(child, k -> new HashSet<>()).add(parent);
        // Connect siblings
        for (String sibling : entry.getValue()) {
          if (!child.equals(sibling)) graph.get(child).add(sibling);
        }
      }
    }
  }

  int degreeOfSeparation(String personA, String personB) {
    if (personA.equals(personB)) return 0;
    if (!graph.containsKey(personA) || !graph.containsKey(personB)) return -1;

    Queue<String> queue = new LinkedList<>(List.of(personA));
    Map<String, Integer> distance = new HashMap<>(Map.of(personA, 0));

    while (!queue.isEmpty()) {
      String current = queue.poll();
      int dist = distance.get(current);

      for (String neighbor : graph.getOrDefault(current, Set.of())) {
        if (neighbor.equals(personB)) return dist + 1;
        if (!distance.containsKey(neighbor)) {
          distance.put(neighbor, dist + 1);
          queue.offer(neighbor);
        }
      }
    }
    return -1; // No path found
  }
}