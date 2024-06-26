import lombok.Builder;
import lombok.Singular;
public @Builder class BuilderDefaultsWarnings {
  public static @java.lang.SuppressWarnings("all") @lombok.Generated class BuilderDefaultsWarningsBuilder {
    private @java.lang.SuppressWarnings("all") @lombok.Generated long x;
    private @java.lang.SuppressWarnings("all") @lombok.Generated int z;
    private @java.lang.SuppressWarnings("all") @lombok.Generated java.util.ArrayList<String> items;
    @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsWarningsBuilder() {
      super();
    }
    /**
     * @return {@code this}.
     */
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsWarnings.BuilderDefaultsWarningsBuilder x(final long x) {
      this.x = x;
      return this;
    }
    /**
     * @return {@code this}.
     */
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsWarnings.BuilderDefaultsWarningsBuilder z(final int z) {
      this.z = z;
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsWarnings.BuilderDefaultsWarningsBuilder item(final String item) {
      if ((this.items == null))
          this.items = new java.util.ArrayList<String>();
      this.items.add(item);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsWarnings.BuilderDefaultsWarningsBuilder items(final java.util.Collection<? extends String> items) {
      if ((items == null))
          {
            throw new java.lang.NullPointerException("items cannot be null");
          }
      if ((this.items == null))
          this.items = new java.util.ArrayList<String>();
      this.items.addAll(items);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsWarnings.BuilderDefaultsWarningsBuilder clearItems() {
      if ((this.items != null))
          this.items.clear();
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsWarnings build() {
      java.util.List<String> items;
      switch (((this.items == null) ? 0 : this.items.size())) {
      case 0 :
          items = java.util.Collections.emptyList();
          break;
      case 1 :
          items = java.util.Collections.singletonList(this.items.get(0));
          break;
      default :
          items = java.util.Collections.unmodifiableList(new java.util.ArrayList<String>(this.items));
      }
      return new BuilderDefaultsWarnings(this.x, this.z, items);
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
      return (((((("BuilderDefaultsWarnings.BuilderDefaultsWarningsBuilder(x=" + this.x) + ", z=") + this.z) + ", items=") + this.items) + ")");
    }
  }
  long x = System.currentTimeMillis();
  final int y = 5;
  @Builder.Default int z;
  @Builder.Default @Singular java.util.List<String> items;
  @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsWarnings(final long x, final int z, final java.util.List<String> items) {
    super();
    this.x = x;
    this.z = z;
    this.items = items;
  }
  public static @java.lang.SuppressWarnings("all") @lombok.Generated BuilderDefaultsWarnings.BuilderDefaultsWarningsBuilder builder() {
    return new BuilderDefaultsWarnings.BuilderDefaultsWarningsBuilder();
  }
}
class NoBuilderButHasDefaults {
  public static @java.lang.SuppressWarnings("all") @lombok.Generated class NoBuilderButHasDefaultsBuilder {
    @java.lang.SuppressWarnings("all") @lombok.Generated NoBuilderButHasDefaultsBuilder() {
      super();
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated NoBuilderButHasDefaults build() {
      return new NoBuilderButHasDefaults();
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
      return "NoBuilderButHasDefaults.NoBuilderButHasDefaultsBuilder()";
    }
  }
  private final @Builder.Default long z = 5;
  public @Builder NoBuilderButHasDefaults() {
    super();
  }
  public static @java.lang.SuppressWarnings("all") @lombok.Generated NoBuilderButHasDefaults.NoBuilderButHasDefaultsBuilder builder() {
    return new NoBuilderButHasDefaults.NoBuilderButHasDefaultsBuilder();
  }
}
