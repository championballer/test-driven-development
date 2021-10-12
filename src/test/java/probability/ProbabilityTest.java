package probability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ProbabilityTest {

    Probability probability;

    @BeforeEach
    public void setUp() {
        probability = new Probability(0.5);
    }

    @Test
    public void testIfProbabiltiesAreEquivalent() {
        assertEquals(new Probability(0.5), probability);
    }

    @Test
    public void testIfProbabiltiesAreNotEquivalent() {
        assertNotEquals(new Probability(0.8), probability);
    }

    @Test
    public void testIfProbabilitiesUncertainityIsEqual(){
        assertEquals(new Probability(0.5), probability.not());
    }

    @Test
    public void testProbabilitiesOfTwoEventsHappeningTogether(){
        Probability testEventProbability = new Probability(0.1);
        assertEquals(new Probability(0.05), probability.and(testEventProbability));
    }

    @Test
    public void testIfEventWithMaximumCertainityCanBeRetrieved(){
        List<Probability> testProbabilities = new ArrayList<Probability>();
        testProbabilities.add(new Probability(0.1));
        testProbabilities.add(new Probability(0.76));
        testProbabilities.add(new Probability(0.2));
        testProbabilities.add(new Probability(0.34));

        assertEquals(new Probability(0.76), Probability.max(testProbabilities));
    }
}