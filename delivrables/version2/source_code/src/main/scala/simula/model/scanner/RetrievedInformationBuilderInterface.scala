/**
 * *******************************************************
 * Simula
 * scanner
 * RetreivedInformationBuilderInterface.scala
 * (c)Simula on 1 nov. 2013 13:34:16
 * By Bubul
 * Update 1 nov. 2013 13:34:16
 * *******************************************************
 */
package main.scala.simula.model.scanner
import main.scala.simula.common._

/**
 * @author Bubul
 *
 */
abstract class RetrievedInformationBuilderInterface {

  def build(loc:Location,siz:Size): RetrievedInformationInterface

}