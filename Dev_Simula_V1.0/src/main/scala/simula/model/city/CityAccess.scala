/**
 * *******************************************************
 * Simula
 *
 * test2.scala
 * (c)Simula on 30 oct. 2013 11:19:05
 * By Scarpe
 * Update 30 oct. 2013 11:19:05
 * *******************************************************
 */
/**
 * @author Scarpe
 *
 */
package main.scala.simula.model.city

import main.scala.simula.common._

trait CityAccess {
  /*
  	def getNumberOfCitizens():Int;
  	*/
  def constructAnArea(l: Location);
  def getMapAccess(): Map;
}