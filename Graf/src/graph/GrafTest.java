package graph;

public class GrafTest extends Graf {

    public static void main(String args[]) {   
        GrafTest graph = new GrafTest();
        double[][] coordins = { { 1.21, 2.2, 3, 1.1, 5, 6, 7, 8, 1.3, 1.2, 8.7, 4.1, 4.3, 3.7, 5.9, 6.8 },
                { 1, 3, 5, 1.2, 4, 5.3, 6, 8, 6.8, 2.3, 1.9, 2.2, 4.8, 3.8, 5.5, 5.2 }, };

        graph.loadCoordinates(coordins);
        graph.createGraph();
        graph.findClosestAll(graph.path);

        for (int i = 0; i < 11; i++) {
            // java.util.print.out
        	System.out.print("\n" + graph.path[i]);
           // System.out.print("\n" + graph.coordinates[graph.path[i]][0]);
        }
    }
}