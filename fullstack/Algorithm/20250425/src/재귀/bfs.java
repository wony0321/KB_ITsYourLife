package 재귀;

import java.util.*;

public class bfs {
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(List.of(1, 3, 6));
        graph.add(List.of(0, 3));
        graph.add(List.of(3));
        graph.add(List.of(0, 1, 2, 7));
        graph.add(List.of(5));
        graph.add(List.of(4, 6, 7));
        graph.add(List.of(0, 5));
        graph.add(List.of(3, 5));

        BFS(graph, 0);

    }

    public static void BFS(List<List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            System.out.println(queue);
            int cur = queue.remove();

            for (int next : graph.get(cur)) {
                if (!visited.contains(next)) {
                    queue.add(next);
                    visited.add(next);
                }
            }
        }
    }
}
