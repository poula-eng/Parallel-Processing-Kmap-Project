/*
 * BEGIN TEMPORARY TEAM GUIDANCE - M5 / issue #5
 * Remove this entire comment block later; keep the package declaration/Javadoc.
 * This is a work checklist, not an implementation or evidence of completion.
 *
 * YOUR JOB: Synthetic 2D generation, validation, and initial-center selection.
 * START WITH: model/Point.java, KMeansConfig, and api/CentroidInitializer.java.
 * 1. Generate a requested number of points reproducibly from an explicit seed.
 * 2. Implement CentroidInitializer: choose exactly K distinct input coordinates.
 * 3. The same ordered input/K/seed must produce the same ordered starts.
 * 4. Validate empty/null data and invalid K; reject K above distinct point count,
 *    even when the total array/list length is larger because of duplicates.
 * 5. Point already rejects NaN/infinity. Do not bypass that model validation.
 * 6. Return explicit starting centers that M1/M6 can pass to BOTH engines.
 * 7. Document your generator's inputs and agree its concrete helper names with callers.
 * FIRST TESTS: Same seed repeats output; K=1, duplicates, K above unique count,
 * empty data, invalid K, and no mutation of caller input.
 * PROVIDE TO: M2/M3 fit callers, M1 app wiring, and M6 experiments.
 * DO NOT update centers during iterations; that is M4's job.
 * OPTIONAL LATER: CSV, K-Means++, or restarts only after required synthetic work works.
 * DONE: Tested generation/initialization plus reusable validation and clear usage.
 *
 * EVERY MEMBER: Run Maven verify, submit a small reviewed PR, write your own
 * unit tests, and prepare your report contribution and individual oral explanation.
 * Reference: docs/ownership.md, docs/architecture.md, and AGENTS.md.
 * END TEMPORARY TEAM GUIDANCE
 */

/** M5 future synthetic data, validation, and initialization. See docs/ownership.md and docs/architecture.md. */
package edu.team.kmeans.data;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



import edu.team.kmeans.model.Point;
import java.util.List;

public class QuickManualCheck {
    public static void main(String[] args) {
        SyntheticDataGenerator generator = new SyntheticDataGenerator();
        RandomCentroidInitializer initializer = new RandomCentroidInitializer();

        long seed = 42;
        List<Point> points = generator.GeneratePoints(100, 5, 8.0,seed);
        List<Point> centroids = initializer.initialize(points, 3, seed);

        System.out.println("Generated Points (" + points.size() + "):");
        points.forEach(System.out::println);

        System.out.println("\nChosen Initial Centroids (" + centroids.size() + "):");
        centroids.forEach(System.out::println);
    }
}
