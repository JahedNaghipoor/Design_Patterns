package PrototypeCopyable;

import java.io.Serializable;

public class Foo implements Serializable {

	public int stuff;
	public String whatever;

	public Foo(int stuff, String whatever) {
		super();
		this.stuff = stuff;
		this.whatever = whatever;
	}

	@Override
	public String toString() {
		return "Foo [stuff=" + stuff + ", whatever=" + whatever + "]";
	}

}
