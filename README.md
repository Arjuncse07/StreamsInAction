
🔄 Functional Programming Methods Cheat Sheet

1. Stream Creation
---------------------------------------------------------------
Method               | Description
---------------------------------------------------------------
stream()             | Create from collections
Stream.of()          | Create from values
Arrays.stream()      | Create from arrays
Stream.iterate()     | Infinite sequential stream
Stream.generate()    | Infinite supplier stream

2. Intermediate Operations
---------------------------------------------------------------
Method               | FP Concept     | Description
---------------------------------------------------------------
filter(Predicate)    | Filtering      | Select elements matching condition
map(Function)        | Transformation | Convert elements 1:1
flatMap(Function)    | Flattening     | Convert 1:N and flatten results
distinct()           | Deduplication  | Remove duplicates
sorted()/sorted(Comparator) | Sorting  | Order elements
peek(Consumer)       | Debugging      | Inspect without modifying

3. Terminal Operations
---------------------------------------------------------------
Method               | FP Concept     | Description
---------------------------------------------------------------
collect(Collector)   | Reduction      | Convert to collections
reduce()             | Aggregation    | Combine elements
forEach(Consumer)    | Side-effect    | Iterate with action
count()              | Counting       | Count elements
min()/max()          | Comparison     | Find extremes
anyMatch()/allMatch()/noneMatch() | Predicate | Boolean checks

4. Collectors (Common)
---------------------------------------------------------------
Method               | Output               | FP Concept
---------------------------------------------------------------
toList()             | List<T>              | Immutable collection
toSet()              | Set<T>               | Unique elements
toMap()              | Map<K,V>             | Key-value pairs
groupingBy()         | Map<K,List<V>>       | Multi-map
partitioningBy()     | Map<Boolean,List<T>> | Binary split
joining()            | String               | Concatenation

5. Functional Interfaces
---------------------------------------------------------------
Interface            | Method               | Arity | Use Case
---------------------------------------------------------------
Predicate<T>         | test(T)              | 1     | Filter conditions
Function<T,R>        | apply(T)             | 1     | Transformations
Consumer<T>          | accept(T)            | 1     | Side-effects
Supplier<T>          | get()                | 0     | Lazy generation
BiFunction<T,U,R>    | apply(T,U)           | 2     | Dual-input operations
