import java.util.Arrays;
import lombok.Builder;
public @Builder class BuilderDefaultsTargetTyping {
  public static @java.lang.SuppressWarnings("all") @lombok.Generated class BuilderDefaultsTargetTypingBuilder {
    private @java.lang.SuppressWarnings("all") @lombok.Generated String foo$value;
    private @java.lang.SuppressWarnings("all") @lombok.Generated boolean foo$set;
    @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsTargetTypingBuilder() {
      super();
    }
    /**
     * @return {@code this}.
     */
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsTargetTyping.BuilderDefaultsTargetTypingBuilder foo(final String foo) {
      this.foo$value = foo;
      foo$set = true;
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsTargetTyping build() {
      String foo$value = this.foo$value;
      if ((! this.foo$set))
          foo$value = BuilderDefaultsTargetTyping.$default$foo();
      return new BuilderDefaultsTargetTyping(foo$value);
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
      return (("BuilderDefaultsTargetTyping.BuilderDefaultsTargetTypingBuilder(foo$value=" + this.foo$value) + ")");
    }
  }
  @Builder.Default String foo;
  static String doSth(java.util.List<Integer> i, java.util.List<Character> c) {
    return null;
  }
  private static @java.lang.SuppressWarnings("all") @lombok.Generated String $default$foo() {
    return doSth(Arrays.asList(1), Arrays.asList('a'));
  }
  @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsTargetTyping(final String foo) {
    super();
    this.foo = foo;
  }
  public static @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsTargetTyping.BuilderDefaultsTargetTypingBuilder builder() {
    return new BuilderDefaultsTargetTyping.BuilderDefaultsTargetTypingBuilder();
  }
}
