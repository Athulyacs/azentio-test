import java.util.*;

public class BFSExample {
    
    public void bfsTraversal(int startNode, Map<Integer, List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();


        queue.add(startNode);
        visited.add(startNode);

        System.out.println("BFS Traversal:");

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            
            List<Integer> neighbors = graph.getOrDefault(currentNode, new ArrayList<>());

            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSExample bfsExample = new BFSExample();

        
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4, 5));
        graph.put(3, Arrays.asList(6, 7));
        graph.put(4, Collections.emptyList());
        graph.put(5, Collections.emptyList());
        graph.put(6, Collections.emptyList());
        graph.put(7, Collections.emptyList());


        bfsExample.bfsTraversal(1, graph);
    }
}
