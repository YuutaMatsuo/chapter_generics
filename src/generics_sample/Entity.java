package generics_sample;

public class Entity<E> {
	private int value1;
	private E values2;

	public void setValue(int value) {
		this.value1 = value;
	}

	public void setValues2(E values2) {
		this.values2 = values2;
	}
}
