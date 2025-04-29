package Silseup;

import java.util.*;

public class KeysAndRooms {
    public static void main(String[] args) {
        int[][] rooms = {{1}, {2}, {3}, {}};

        boolean answer = canVisitAllRooms(rooms);

        System.out.println(answer);
    }

    public static boolean canVisitAllRooms(int[][] rooms) {

        boolean[] visited = new boolean[rooms.length];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int key : rooms[cur]) {
                if (!visited[key]) {
                    visited[key] = true;
                    queue.add(key);
                }
            }
        }

        // 방문 여부 확인
        for (boolean b : visited) {
            if (!b) return false;
        }

        return true;
    }
}
