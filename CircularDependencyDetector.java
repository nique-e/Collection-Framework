import java.util.*;

public class CircularDependencyDetector {

    // Detects if any cycle exists in the dependency graph
    public static boolean hasCircularDependency(Map<String, List<String>> graph) {
        Set<String> visited = new HashSet<>();
        Set<String> recursionStack = new HashSet<>();

        for (String node : graph.keySet()) {
            if (dfs(node, graph, visited, recursionStack)) {
                return true; // cycle found
            }
        }
        return false;
    }

    private static boolean dfs(String node, Map<String, List<String>> graph,
                               Set<String> visited, Set<String> stack) {

        if (stack.contains(node)) {
            return true; // cycle detected
        }

        if (visited.contains(node)) {
            return false; // already processed
        }

        visited.add(node);
        stack.add(node);

        for (String neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (dfs(neighbor, graph, visited, stack)) {
                return true;
            }
        }

        stack.remove(node);
        return false;
    }

    // Testing here
    public static void main(String[] args) {

        Map<String, List<String>> deps = new HashMap<>();

        deps.put("A", Arrays.asList("B"));
        deps.put("B", Arrays.asList("C"));
        deps.put("C", Arrays.asList("A")); // cycle here

        boolean result = hasCircularDependency(deps);

        if (result) {
            System.out.println("Circular dependency detected.");
        } else {
            System.out.println("No circular dependency.");
        }
    }
}
