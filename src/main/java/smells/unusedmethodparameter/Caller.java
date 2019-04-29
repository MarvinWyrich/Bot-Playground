package smells.unusedmethodparameter;

/**
 * Unused method parameters confuse developers and should therefore be removed.
 */
public class Caller {

	protected int callSth() {
		return new UnusedMethodParameter().calculateSomething(1, 3);
	}

}
