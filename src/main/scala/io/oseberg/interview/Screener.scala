package io.oseberg.interview

import scala.io._

object Screener extends App {
  val src = Source.fromFile("./src/main/resources/DoI.txt")
  // TODO - Print stuff to stdout


}

class FileStats(source: BufferedSource) {
  type Word = String

  def lineCount: Int = ???
  def totalWordCount: Int = ???
  def wordCount(word: Word): Int = ???

  // this should be implemented recursively
  def wordFreq(src: Source, freq: Map[String, Int]): Map[String, Int] = ???
}
