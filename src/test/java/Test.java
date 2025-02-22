import pl.simNG.map.Node;

import java.util.*;

import static pl.simNG.map.SimMap.aStarSearch;


public class Test {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 1},
                {1, 0, 0, 5},
                {1, 1, 10, 1},
                {1, 9, 9, 1}
        };

        int[] start = {0, 0};
        int[] end = {3, 2};

        List<Node> path = aStarSearch(grid, start, end);

        if (path.isEmpty()) {
            System.out.println("No path found.");
        } else {
            System.out.println("Path found:");
            for (Node node : path) {
                System.out.println("(" + node.row + ", " + node.col + ")");
            }
        }
    }
}

