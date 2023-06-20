/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author ASUS
 */import java.util.ArrayList;

public class ejemplo {

    static void tsp(int[][] graph, ArrayList<Integer> path, boolean[] visited, int current, int n, int cost, ArrayList<Integer> bestPath, int[] bestCost) {
        if (path.size() == n) {
            cost += graph[current][0];
            if (cost < bestCost[0]) {
                bestCost[0] = cost;
                bestPath.clear();
                bestPath.addAll(path);
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                path.add(i);
                tsp(graph, path, visited, i, n, cost + graph[current][i], bestPath, bestCost);
                path.remove(path.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{0, 10, 15, 20},
                         {10, 0, 35, 25},
                         {15, 35, 0, 30},
                         {20, 25, 30, 0}};

        int n = graph.length;
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<Integer> bestPath = new ArrayList<>();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        path.add(0);
        int[] bestCost = {Integer.MAX_VALUE};

        tsp(graph, path, visited, 0, n, 0, bestPath, bestCost);

        System.out.println("Minimum cost: " + bestCost[0]);
        System.out.print("Path: ");
        System.out.println("OJO A ESTE :"+bestPath.get(0));
        for (int i = 0; i < bestPath.size(); i++) {
            System.out.print(bestPath.get(i) + " ");
        }
    }
}