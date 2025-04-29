package 재귀;

import java.util.ArrayList;
import java.util.List;

public class vertex {
    public static void main(String[] args) {
        int[][] edges = {
            {0, 1}, {0, 3}, {0, 6},
            {1, 3}, {2, 3}, {3, 7},
            {4, 5}, {5, 6}, {5, 7}
        };
        int n = 8;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];

            // 양 방향
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        System.out.println(graph);
    }
}
