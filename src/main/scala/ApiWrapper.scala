package org.watkins.trading

import com.ib.client.{Bar, CommissionReport, Contract, ContractDescription, ContractDetails, DeltaNeutralContract, DepthMktDataDescription, EWrapper, Execution, FamilyCode, HistogramEntry, HistoricalTick, HistoricalTickBidAsk, HistoricalTickLast, NewsProvider, Order, OrderState, PriceIncrement, SoftDollarTier, TickAttrib, TickAttribBidAsk, TickAttribLast}

import java.{lang, util}
import java.util.Map

class ApiWrapper extends EWrapper {
  override def tickPrice(i: Int, i1: Int, v: Double, tickAttrib: TickAttrib): Unit = ???

  override def tickSize(i: Int, i1: Int, l: Long): Unit = ???

  override def tickOptionComputation(i: Int, i1: Int, i2: Int, v: Double, v1: Double, v2: Double, v3: Double, v4: Double, v5: Double, v6: Double, v7: Double): Unit = ???

  override def tickGeneric(i: Int, i1: Int, v: Double): Unit = ???

  override def tickString(i: Int, i1: Int, s: String): Unit = ???

  override def tickEFP(i: Int, i1: Int, v: Double, s: String, v1: Double, i2: Int, s1: String, v2: Double, v3: Double): Unit = ???

  override def orderStatus(i: Int, s: String, v: Double, v1: Double, v2: Double, i1: Int, i2: Int, v3: Double, i3: Int, s1: String, v4: Double): Unit = ???

  override def openOrder(i: Int, contract: Contract, order: Order, orderState: OrderState): Unit = ???

  override def openOrderEnd(): Unit = ???

  override def updateAccountValue(s: String, s1: String, s2: String, s3: String): Unit = ???

  override def updatePortfolio(contract: Contract, v: Double, v1: Double, v2: Double, v3: Double, v4: Double, v5: Double, s: String): Unit = ???

  override def updateAccountTime(s: String): Unit = ???

  override def accountDownloadEnd(s: String): Unit = ???

  override def nextValidId(i: Int): Unit = ???

  override def contractDetails(i: Int, contractDetails: ContractDetails): Unit = ???

  override def bondContractDetails(i: Int, contractDetails: ContractDetails): Unit = ???

  override def contractDetailsEnd(i: Int): Unit = ???

  override def execDetails(i: Int, contract: Contract, execution: Execution): Unit = ???

  override def execDetailsEnd(i: Int): Unit = ???

  override def updateMktDepth(i: Int, i1: Int, i2: Int, i3: Int, v: Double, l: Long): Unit = ???

  override def updateMktDepthL2(i: Int, i1: Int, s: String, i2: Int, i3: Int, v: Double, l: Long, b: Boolean): Unit = ???

  override def updateNewsBulletin(i: Int, i1: Int, s: String, s1: String): Unit = ???

  override def managedAccounts(s: String): Unit = ???

  override def receiveFA(i: Int, s: String): Unit = ???

  override def historicalData(i: Int, bar: Bar): Unit = ???

  override def scannerParameters(s: String): Unit = ???

  override def scannerData(i: Int, i1: Int, contractDetails: ContractDetails, s: String, s1: String, s2: String, s3: String): Unit = ???

  override def scannerDataEnd(i: Int): Unit = ???

  override def realtimeBar(i: Int, l: Long, v: Double, v1: Double, v2: Double, v3: Double, l1: Long, v4: Double, i1: Int): Unit = ???

  override def currentTime(l: Long): Unit = ???

  override def fundamentalData(i: Int, s: String): Unit = ???

  override def deltaNeutralValidation(i: Int, deltaNeutralContract: DeltaNeutralContract): Unit = ???

  override def tickSnapshotEnd(i: Int): Unit = ???

  override def marketDataType(i: Int, i1: Int): Unit = ???

  override def commissionReport(commissionReport: CommissionReport): Unit = ???

  override def position(s: String, contract: Contract, v: Double, v1: Double): Unit = ???

  override def positionEnd(): Unit = ???

  override def accountSummary(i: Int, s: String, s1: String, s2: String, s3: String): Unit = ???

  override def accountSummaryEnd(i: Int): Unit = ???

  override def verifyMessageAPI(s: String): Unit = ???

  override def verifyCompleted(b: Boolean, s: String): Unit = ???

  override def verifyAndAuthMessageAPI(s: String, s1: String): Unit = ???

  override def verifyAndAuthCompleted(b: Boolean, s: String): Unit = ???

  override def displayGroupList(i: Int, s: String): Unit = ???

  override def displayGroupUpdated(i: Int, s: String): Unit = ???

  override def error(e: Exception): Unit = ???

  override def error(s: String): Unit = ???

  override def error(i: Int, i1: Int, s: String): Unit = ???

  override def connectionClosed(): Unit = ???

  override def connectAck(): Unit = ???

  override def positionMulti(i: Int, s: String, s1: String, contract: Contract, v: Double, v1: Double): Unit = ???

  override def positionMultiEnd(i: Int): Unit = ???

  override def accountUpdateMulti(i: Int, s: String, s1: String, s2: String, s3: String, s4: String): Unit = ???

  override def accountUpdateMultiEnd(i: Int): Unit = ???

  override def securityDefinitionOptionalParameter(i: Int, s: String, i1: Int, s1: String, s2: String, set: util.Set[String], set1: util.Set[lang.Double]): Unit = ???

  override def securityDefinitionOptionalParameterEnd(i: Int): Unit = ???

  override def softDollarTiers(i: Int, softDollarTiers: Array[SoftDollarTier]): Unit = ???

  override def familyCodes(familyCodes: Array[FamilyCode]): Unit = ???

  override def symbolSamples(i: Int, contractDescriptions: Array[ContractDescription]): Unit = ???

  override def historicalDataEnd(i: Int, s: String, s1: String): Unit = ???

  override def mktDepthExchanges(depthMktDataDescriptions: Array[DepthMktDataDescription]): Unit = ???

  override def tickNews(i: Int, l: Long, s: String, s1: String, s2: String, s3: String): Unit = ???

  override def smartComponents(i: Int, map: util.Map[Integer, Map.Entry[String, Character]]): Unit = ???

  override def tickReqParams(i: Int, v: Double, s: String, i1: Int): Unit = ???

  override def newsProviders(newsProviders: Array[NewsProvider]): Unit = ???

  override def newsArticle(i: Int, i1: Int, s: String): Unit = ???

  override def historicalNews(i: Int, s: String, s1: String, s2: String, s3: String): Unit = ???

  override def historicalNewsEnd(i: Int, b: Boolean): Unit = ???

  override def headTimestamp(i: Int, s: String): Unit = ???

  override def histogramData(i: Int, list: util.List[HistogramEntry]): Unit = ???

  override def historicalDataUpdate(i: Int, bar: Bar): Unit = ???

  override def rerouteMktDataReq(i: Int, i1: Int, s: String): Unit = ???

  override def rerouteMktDepthReq(i: Int, i1: Int, s: String): Unit = ???

  override def marketRule(i: Int, priceIncrements: Array[PriceIncrement]): Unit = ???

  override def pnl(i: Int, v: Double, v1: Double, v2: Double): Unit = ???

  override def pnlSingle(i: Int, i1: Int, v: Double, v1: Double, v2: Double, v3: Double): Unit = ???

  override def historicalTicks(i: Int, list: util.List[HistoricalTick], b: Boolean): Unit = ???

  override def historicalTicksBidAsk(i: Int, list: util.List[HistoricalTickBidAsk], b: Boolean): Unit = ???

  override def historicalTicksLast(i: Int, list: util.List[HistoricalTickLast], b: Boolean): Unit = ???

  override def tickByTickAllLast(i: Int, i1: Int, l: Long, v: Double, l1: Long, tickAttribLast: TickAttribLast, s: String, s1: String): Unit = ???

  override def tickByTickBidAsk(i: Int, l: Long, v: Double, v1: Double, l1: Long, l2: Long, tickAttribBidAsk: TickAttribBidAsk): Unit = ???

  override def tickByTickMidPoint(i: Int, l: Long, v: Double): Unit = ???

  override def orderBound(l: Long, i: Int, i1: Int): Unit = ???

  override def completedOrder(contract: Contract, order: Order, orderState: OrderState): Unit = ???

  override def completedOrdersEnd(): Unit = ???

  override def replaceFAEnd(i: Int, s: String): Unit = ???

  override def wshMetaData(i: Int, s: String): Unit = ???

  override def wshEventData(i: Int, s: String): Unit = ???
}
