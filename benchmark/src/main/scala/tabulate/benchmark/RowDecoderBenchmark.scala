package tabulate.benchmark

import org.openjdk.jmh.annotations._

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.Throughput))
class RowDecoderBenchmark extends ExampleData {
  @Benchmark
  def decodeTuples = decodeRow[Tuple](tupleRows)
}