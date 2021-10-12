package probability;

import java.util.List;
import java.util.Objects;

public class Probability {

    private final double CERTAIN_VALUE_CONSTANT = 1;
    private final double eventCertainity;

    public Probability(double eventCertainity) {
        this.eventCertainity = eventCertainity;
    }

    public Probability not(){
        return new Probability (CERTAIN_VALUE_CONSTANT - eventCertainity);
    }

    public Probability and(Probability coincidentEvent){
        return new Probability (coincidentEvent.eventCertainity * eventCertainity);
    }

    public int compareTo(Probability comparableEvent){
        if(eventCertainity == comparableEvent.eventCertainity)return 0;
        else if(eventCertainity > comparableEvent.eventCertainity) return 1;
        else return -1;
    }

    public static Probability max(List<Probability> candidateEvents){
        return candidateEvents.stream().max(Probability::compareTo).get();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(that.eventCertainity, eventCertainity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventCertainity);
    }
}