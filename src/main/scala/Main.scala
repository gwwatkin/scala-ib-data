package org.watkins.trading

import com.ib.client.Contract
import com.ib.client.Types.{BarSize, DurationUnit, FundamentalType, SecType, WhatToShow}
import com.ib.contracts.StkContract
import com.larroy.ibclient.IBClient

import java.util.{Calendar, Date}
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
import scala.io.StdIn._
import scala.language.postfixOps



object Main {
  def block[A](f: Future[A]): A = {
    Await.result(f, Duration.Inf)
  }

  def main(args : Array[String]): Unit =
  {
    println("Connecting to IB Gateway")
    val ibc = new IBClient("localhost", 4002, 1)
    try {
      block(ibc.connect())
      if (!ibc.isConnected) {
        println("Could not connect")
        return
      }

      // TODO find a contract for which I have a data subscription
      println("Requesting data")
      val symbol = new Contract()
      symbol.symbol("AC")
      symbol.exchange("TSE")
      symbol.secType(SecType.STK.name)
      symbol.currency("CAD")
      import java.text.SimpleDateFormat
      val ft = new SimpleDateFormat("yyyy-MM-dd")

      // val data = block(ibc.fundamentals(sAMD, FundamentalType.ReportSnapshot))
      val data = block(ibc.historicalData(
        symbol,
        ft.parse("2021-09-07"),
        1,
        DurationUnit.DAY,
        BarSize._1_min,
        WhatToShow.TRADES));
      println(data)

      while (true) {
        print("--> ")
        val input: String = readLine()
        if (input == "q" || input == "quit")
          return
        else
          println("Unknown command")
      }

    }
    finally {
      ibc.disconnect();
    }
  }
}
