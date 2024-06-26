import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSortedMap;
import lombok.Singular;
@lombok.Builder class BuilderSingularGuavaMaps<K, V> {
  public static @java.lang.SuppressWarnings("all") @lombok.Generated class BuilderSingularGuavaMapsBuilder<K, V> {
    private @java.lang.SuppressWarnings("all") @lombok.Generated com.google.common.collect.ImmutableMap.Builder<K, V> battleaxes;
    private @java.lang.SuppressWarnings("all") @lombok.Generated com.google.common.collect.ImmutableSortedMap.Builder<Integer, V> vertices;
    private @java.lang.SuppressWarnings("all") @lombok.Generated com.google.common.collect.ImmutableBiMap.Builder<java.lang.Object, java.lang.Object> rawMap;
    @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMapsBuilder() {
      super();
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder<K, V> battleaxe(final K key, final V value) {
      if ((this.battleaxes == null))
          this.battleaxes = com.google.common.collect.ImmutableMap.builder();
      this.battleaxes.put(key, value);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder<K, V> battleaxes(final java.util.Map<? extends K, ? extends V> battleaxes) {
      if ((battleaxes == null))
          {
            throw new java.lang.NullPointerException("battleaxes cannot be null");
          }
      if ((this.battleaxes == null))
          this.battleaxes = com.google.common.collect.ImmutableMap.builder();
      this.battleaxes.putAll(battleaxes);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder<K, V> clearBattleaxes() {
      this.battleaxes = null;
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder<K, V> vertex(final Integer key, final V value) {
      if ((this.vertices == null))
          this.vertices = com.google.common.collect.ImmutableSortedMap.naturalOrder();
      this.vertices.put(key, value);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder<K, V> vertices(final java.util.Map<? extends Integer, ? extends V> vertices) {
      if ((vertices == null))
          {
            throw new java.lang.NullPointerException("vertices cannot be null");
          }
      if ((this.vertices == null))
          this.vertices = com.google.common.collect.ImmutableSortedMap.naturalOrder();
      this.vertices.putAll(vertices);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder<K, V> clearVertices() {
      this.vertices = null;
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder<K, V> rawMap(final java.lang.Object key, final java.lang.Object value) {
      if ((this.rawMap == null))
          this.rawMap = com.google.common.collect.ImmutableBiMap.builder();
      this.rawMap.put(key, value);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder<K, V> rawMap(final java.util.Map<?, ?> rawMap) {
      if ((rawMap == null))
          {
            throw new java.lang.NullPointerException("rawMap cannot be null");
          }
      if ((this.rawMap == null))
          this.rawMap = com.google.common.collect.ImmutableBiMap.builder();
      this.rawMap.putAll(rawMap);
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder<K, V> clearRawMap() {
      this.rawMap = null;
      return this;
    }
    public @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMaps<K, V> build() {
      com.google.common.collect.ImmutableMap<K, V> battleaxes = ((this.battleaxes == null) ? com.google.common.collect.ImmutableMap.<K, V>of() : this.battleaxes.build());
      com.google.common.collect.ImmutableSortedMap<Integer, V> vertices = ((this.vertices == null) ? com.google.common.collect.ImmutableSortedMap.<Integer, V>of() : this.vertices.build());
      com.google.common.collect.ImmutableBiMap<java.lang.Object, java.lang.Object> rawMap = ((this.rawMap == null) ? com.google.common.collect.ImmutableBiMap.<java.lang.Object, java.lang.Object>of() : this.rawMap.build());
      return new BuilderSingularGuavaMaps<K, V>(battleaxes, vertices, rawMap);
    }
    public @java.lang.Override @java.lang.SuppressWarnings("all") @lombok.Generated java.lang.String toString() {
      return (((((("BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder(battleaxes=" + this.battleaxes) + ", vertices=") + this.vertices) + ", rawMap=") + this.rawMap) + ")");
    }
  }
  private @Singular ImmutableMap<K, V> battleaxes;
  private @Singular ImmutableSortedMap<Integer, ? extends V> vertices;
  private @SuppressWarnings("all") @Singular("rawMap") ImmutableBiMap rawMap;
  @java.lang.SuppressWarnings("all") @lombok.Generated BuilderSingularGuavaMaps(final ImmutableMap<K, V> battleaxes, final ImmutableSortedMap<Integer, ? extends V> vertices, final ImmutableBiMap rawMap) {
    super();
    this.battleaxes = battleaxes;
    this.vertices = vertices;
    this.rawMap = rawMap;
  }
  public static @java.lang.SuppressWarnings("all") @lombok.Generated <K, V>BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder<K, V> builder() {
    return new BuilderSingularGuavaMaps.BuilderSingularGuavaMapsBuilder<K, V>();
  }
}
