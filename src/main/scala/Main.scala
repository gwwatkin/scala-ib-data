package org.watkins.trading

import com.ib.client.EClient

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.language.postfixOps
import scala.util._
import scala.io.StdIn._


object Main {
  def main(args : Array[String]): Int =
  {
    println("Connecting to IB Gateway");

    println("Requesting fundamental data");

    while (true){
      println("-->");
      val input: String = readLine();
      if (input == "q" || input == "quit")
        return 0
      else
        println("Unknown command");
    }

    0;
  }
}
