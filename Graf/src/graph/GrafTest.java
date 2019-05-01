package graph;

public class GrafTest extends Graf {

    public static void main(String args[]) {   
        GrafTest graph = new GrafTest();
        int[][] coordins = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 8, 4, 4, 3, 5 },
                { 1, 3, 5, 2, 4, 5, 6, 8, 6, 5, 1, 4, 4, 3, 5 }, };

        graph.loadCoordinates(coordins);
        graph.createGraph();
        graph.findClosestAll();

        for (int i = 0; i < 11; i++) {
            // java.util.print.out
            System.out.print("\n" + graph.coordinates[graph.path[i]][0]);
        }
    }
}

