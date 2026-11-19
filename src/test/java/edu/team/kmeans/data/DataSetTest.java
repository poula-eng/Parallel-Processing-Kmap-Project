package edu.team.kmeans.data;


import static org.junit.jupiter.api.Assertions.*;

import edu.team.kmeans.model.Point;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;



public class DataSetTest {

    public SyntheticDataGenerator generator = new SyntheticDataGenerator();
    public RandomCentroidInitializer initializer = new RandomCentroidInitializer();

    @Test
    void sameSeedProducesIdenticalPointsAndInitialCentroids() {
        List<Point> points1 = generator.GeneratePoints(20, 3, 1.5, 99);
        List<Point> points2 = generator.GeneratePoints(20, 3, 1.5, 99);
        assertEquals(points1, points2);

        List<Point> starts1 = initializer.initialize(points1, 3, 99);
        List<Point> starts2 = initializer.initialize(points2, 3, 99);
        assertEquals(starts1, starts2);
    }

    @Test
    void handlesKEqualsOneAndDuplicatesWithoutMutatingInput() {
        List<Point> original = new ArrayList<>(List.of(
            new Point(1.0, 1.0),
            new Point(1.0, 1.0),
            new Point(5.0, 5.0),
            new Point(9.0, 9.0)
        ));
        List<Point> copyBefore = List.copyOf(original);

        List<Point> singleCenter = initializer.initialize(original, 1, 7);
        assertEquals(1, singleCenter.size());
        assertEquals(copyBefore, original); // Caller input was not mutated
    }

    @Test
    void refusesKBiggerThanUniquePointCountEvenWithDuplicates() {
        // 4 total points, but only 2 distinct coordinates
        List<Point> duplicates = List.of(
            new Point(2.0, 2.0),
            new Point(2.0, 2.0),
            new Point(8.0, 8.0),
            new Point(8.0, 8.0)
        );

        assertThrows(IllegalArgumentException.class, () -> initializer.initialize(duplicates, 3, 1));
    }

    @Test
    void refusesNullEmptyAndWrongK() {
        List<Point> valid = List.of(new Point(1.0, 2.0));

        assertThrows(NullPointerException.class, () -> initializer.initialize(null, 1, 1));
        assertThrows(IllegalArgumentException.class, () -> initializer.initialize(List.of(), 1, 1));
        assertThrows(IllegalArgumentException.class, () -> initializer.initialize(valid, 0, 1));
        assertThrows(IllegalArgumentException.class, () -> initializer.initialize(valid, -2, 1));
    }
}
