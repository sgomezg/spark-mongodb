package com.stratio.deep.partitioner

import org.apache.spark.Partition

/**
 * Provides the way to compute and get spark partitions over
 * some Data Source.
 * @tparam T
 */
trait DeepPartitioner[T <: Partition] extends Serializable {

  /**
   * Retrieves some Data Source partitions
   * @return An array with computed partitions
   */
  def computePartitions(): Array[T]

}
