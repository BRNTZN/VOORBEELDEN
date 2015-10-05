package encryption;

public class Hash {

	private int a = 5;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}

}
