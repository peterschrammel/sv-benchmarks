# Java benchmarks

## Benchmarks

There are benchmarks from different origins in their respective
directories BenchmarksDir. BenchmarksDir contains a Makefile for
compiling the individual benchmarks into JAR files.

Each individual benchmark is in a separate directory BenchmarkDir
suffixed with the property verdicts (e.g. `_false-assert`).  Each
BenchmarkDir contains a java source tree with the restriction that
there must always be a BenchmarkDir`/Main.java` file containing a
`Main` class with a `public static void main(String[] args)`
method, which is the entry point of the benchmark. The Makefile
creates a single JAR file named BenchmarksDir`/`BenchmarkDir`.jar`
for each BenchmarkDir.

Class files corresponding to java files must not be committed into
the repository. Jar files of non-JDK library dependencies
must be committed as part of the benchmark; the Makefile must merge
the dependencies with the other class into the benchmark JAR file.

## Properties

ReachSafety.prp:
  * `true` if the conditions in `assert` statements evaluate
    to true on all paths
  * `false` if a condition in an `assert` statement evaluates
    to false on a path

