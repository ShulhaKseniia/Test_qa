package Rules;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RetryRule implements TestRule {//перезапускаем тест в случае падения столько раз

    private static final int DEFAULT_MAX_TRIES_COUNT = 1;
    private final int maxRunsCount;

    public RetryRule(final int maxRunsCount)
    {
        this.maxRunsCount = maxRunsCount > 0 ? maxRunsCount : DEFAULT_MAX_TRIES_COUNT;
    }

    @Override
    public Statement apply(final Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                Throwable testError = null;
                int runsCounter = 0;
                while (runsCounter < maxRunsCount) {
                    try {
                        base.evaluate();
                        return;
                    } catch (Throwable e) {
                        System.out.println("Test  fail");
                        testError = e;
                        runsCounter++;
                    }
                }
                throw new AssertionError(String.format("Failed after %d attempts", maxRunsCount), testError);
            }
        };
    }
}
