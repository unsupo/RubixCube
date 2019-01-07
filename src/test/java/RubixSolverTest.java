import org.junit.Test;

public class RubixSolverTest {
    @Test
    public void solveForCross1Test() {
        new Rubix().shuffle(100).solveForCross1(0,6,true);
        //test for time and that top has 60 cross
    }
}
