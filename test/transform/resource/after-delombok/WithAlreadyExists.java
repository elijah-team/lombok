class With1 {
	boolean foo;
	void withFoo(boolean foo) {
	}
	With1(boolean foo) {
	}
}
class With2 {
	boolean foo;
	void withFoo(String foo) {
	}
	With2(boolean foo) {
	}
}
class With3 {
	String foo;
	void withFoo(boolean foo) {
	}
	With3(String foo) {
	}
}
class With4 {
	String foo;
	void withFoo(String foo) {
	}
	With4(String foo) {
	}
}
class With5 {
	String foo;
	void withFoo() {
	}
	With5(String foo) {
	}
	/**
	 * @return a clone of this object, except with this updated property (returns {@code this} if an identical value is passed).
	 */
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public With5 withFoo(final String foo) {
		return this.foo == foo ? this : new With5(foo);
	}
}
class With6 {
	String foo;
	void withFoo(String foo, int x) {
	}
	With6(String foo) {
	}
	/**
	 * @return a clone of this object, except with this updated property (returns {@code this} if an identical value is passed).
	 */
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public With6 withFoo(final String foo) {
		return this.foo == foo ? this : new With6(foo);
	}
}
class With7 {
	String foo;
	void withFoo(String foo, Object... x) {
	}
	With7(String foo) {
	}
}
class With8 {
	boolean isFoo;
	void withIsFoo(boolean foo) {
	}
	With8(boolean foo) {
	}
}
class With9 {
	boolean isFoo;
	void withFoo(boolean foo) {
	}
	With9(boolean foo) {
	}
}
