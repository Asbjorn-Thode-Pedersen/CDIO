package graph;

public class GrafTest extends Graf {

    public static void main(String args[]) {   
        GrafTest graph = new GrafTest();
        double[][] coordins = { { 1.21, 2.2, 3, 4, 5, 6, 7, 8, 9, 10, 8.7, 4.1, 4.3, 3.7, 5.9, 6.8 },
                { 1, 3, 5, 2, 4, 5.3, 6, 8, 6.8, 5.1, 1.9, 4.2, 4.8, 3.8, 5.5, 5.2 }, };

        graph.loadCoordinates(coordins);
        graph.createGraph();
        graph.findClosestAll();

        for (int i = 0; i < 11; i++) {
            // java.util.print.out
            System.out.print("\n" + graph.coordinates[graph.path[i]][0]);
        }
    }
}