package edu.team.kmeans.data;

import edu.team.kmeans.model.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SyntheticDataGenerator {
    public List<Point> GeneratePoints(int numPoints, int numClusters, double spread, long seed){

        if(numPoints < 1)
        {
            throw new IllegalArgumentException("Number of Points must be greater than 0");
        }
        if(numClusters < 1)
        {
            throw new IllegalArgumentException("Number of Clusters must be greater than 0");
        }
        if(spread < 0.0)
        {
            throw new IllegalArgumentException("Spread must be greater than 0");
        }



        Random rand = new Random(seed);
        double[][] centroids = new double[numPoints][2];
        for(int i = 0; i < numClusters; i++)
        {
            centroids[i][0] = rand.nextDouble() * 100.0;
            centroids[i][1] = rand.nextDouble() * 100.0;
        }
        List<Point> points = new ArrayList<Point>();

        for(int j  = 0; j < numPoints; j++)
        {
            double[] centroid = centroids[j % numClusters];
            double x = centroid[0] *  rand.nextGaussian() * spread;
            double y = centroid[1] * rand.nextGaussian() * spread;
            points.add(new Point(x, y));
        }

        return points;




    }

}
