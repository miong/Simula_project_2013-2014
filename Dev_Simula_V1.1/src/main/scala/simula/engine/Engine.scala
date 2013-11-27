/**
 * *******************************************************
 * Simula
 * Engine
 * Engine.scala
 * (c) Simula. on 30 oct. 2013 11:30:30
 * By ken
 * Update 30 oct. 2013 11:30:30
 * *******************************************************
 */
package main.scala.simula.engine

import main.scala.simula.common._

class Engine(_model: AbstractModel, _view: AbstractView) extends EngineInterface with MonthListener{

  var modelControler: ModelControler = new ModelControler()
  var viewControler: ViewControler = new ViewControler()
  var gameControler: GameControler = new GameControler()
  var model: AbstractModel = _model
  var view: AbstractView = _view
  var persisri: RetrievedInformationInterface = _

  def newEvent(e: EventInterface): RetrievedInformationInterface = {
    //    match e {
    //      case 
    //    }
    getInformationsFromModel() // Autre methode apres traitement de l'evenement
  }

  def permiteOperations(): List[Pair[String, Unit => Unit]] = {
    null
  }

  def getInformationsFromModel(): RetrievedInformationInterface = {
    return modelControler.getInformationsFromModel(model)
  }
  
  def getDataFromModel():MapScreenShotInterface = {
    return modelControler.getDataFromModel(model)
  }

  def sendDataToView(data: RetrievedInformationInterface): Boolean = {
    return viewControler.sendDataToView(data, view)
  }

  def getFromModelToView(): Boolean = {
    return sendDataToView(getInformationsFromModel())
  }

  def treatDataFromModel(data:MapScreenShotInterface): Unit = {
    gameControler.treatDataFromModel(data)
  }

  def sendDataToModel(data: RetrievedInformationInterface): Boolean = {
    return modelControler.sendDataToModel(data, model)
  }

  def evenOnMonth(): Unit = {
    var mss:MapScreenShotInterface = getDataFromModel();
    var ri:RetrievedInformationInterface = getInformationsFromModel();
    sendDataToView(ri)
    treatDataFromModel(mss)
  }
  
  def loadRules():Unit = {
    gameControler.setModel(model)
    gameControler.loadRulesFromModel
  }
  
}