/**
 * ********************************************************
 *                        Simula                          *
 * *********************************************************
 * simula.adapters
 * UIEngineAdapter.scala
 * (c) Simula. on 3 nov. 2013 02:57:52
 * By JC
 * Update 3 nov. 2013 02:57:52
 *
 * ******************************************************
 */
package main.scala.simula.adapters

import main.scala.simula.ui._
import main.scala.simula.common._
import main.scala.simula.engine._
/**
 * @author JC
 * ConcreteEngine should be EngineInterface
 */
class UIEngineAdapter extends UIEngineAdapterInterface {

  var ui: UIInterface = null
  var engine: EngineInterface = null

  def INIT(_ui: UIInterface, eng: EngineInterface) {
    ui = _ui
    engine = eng
  }

  def ack(d: RetrievedInformationInterface): Boolean = true //ui.ack(d)
  def updatedEvent(e: EventInterface) = { ; } //eng.updatedEvent(e)

}