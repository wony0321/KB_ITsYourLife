package Silseup;

import java.util.*;

public class Node {
    public static void main(String[] args) {
        int n = 6;
        int[][] vertex = {
                {3, 6},
                {4, 3},
                {3, 2},
                {1, 3},
                {1, 2},
                {2, 4},
                {5, 2}
        };

        int result = solution(n, vertex);
        System.out.println(result);
    }

    public static int solution(int n, int[][] edge) {
         List<List<Integer>> graph = new ArrayList<>();

         for (int i = 0; i < n; i++) {
             graph.add(new ArrayList<>());
         }

        for (int[] ints : edge) {
            graph.get(ints[0]).add(ints[1]);
            graph.get(ints[1]).add(ints[0]);
        }

        int[] distance = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    distance[next] = distance[current] + 1;
                    queue.add(next);
                }
            }
        }

        // 가장 멀리 떨어진 거리 계산
        int max = 0;
        for (int d : distance) {
            if (d > max) max = d;
        }

        int count = 0;
        for (int d : distance) {
            if (d == max) count++;
        }

        return count;

    }
}
