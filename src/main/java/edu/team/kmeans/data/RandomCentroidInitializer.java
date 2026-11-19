package edu.team.kmeans.data;

import edu.team.kmeans.api.CentroidInitializer;
import edu.team.kmeans.model.Point;

import java.util.*;

public class RandomCentroidInitializer implements CentroidInitializer {
    public List<Point> initialize(List<Point> points, int k, long seed) {
        List<Point> distinctOrdered = validateAndDeduplicate(points, k);

        // Shuffle a copy using the explicit seed so the same ordered input + k + seed
        // always yields the exact same ordered starting centers
        Collections.shuffle(distinctOrdered, new Random(seed));

        return List.copyOf(distinctOrdered.subList(0, k));
    }
    public static List<Point> validateAndDeduplicate(List<Point> points, int k) {
        Objects.requireNonNull(points, "points must not be null");
        if (points.isEmpty()) {
            throw new IllegalArgumentException("points must not be empty");
        }
        if (k <= 0) {
            throw new IllegalArgumentException("k must be positive, got: " + k);
        }
        Set<Point> seen = new HashSet<>(points.size());
        List<Point> distinctOrdered = new ArrayList<>(points.size());

        for (Point p : points) {
            Objects.requireNonNull(p, "points must not contain null elements");
            if (seen.add(p)) {
                distinctOrdered.add(p);
            }
        }

        if (k > distinctOrdered.size()) {
            throw new IllegalArgumentException(
                "k (" + k + ") cannot exceed distinct point count (" + distinctOrdered.size() + ")"
            );
        }

        return distinctOrdered;
    }
}
