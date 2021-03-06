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
import main.scala.simula.common.SocialClassType._
import main.scala.simula.model.Mesure

class Population extends Mesure {
  var satisfaction: Integer = 0
  var rank: SocialClassType = POOR
  var maxCapacity: Integer = 100 
  
  def setMaxCapacity(i:Integer) = {
    maxCapacity = i
  }
  
  def getMaxCapacity():Integer = {
    return maxCapacity
  }
  def getSatisfaction():Integer = {
    return satisfaction
  }
  
  def setSatisfaction(sat:Integer) = {
    satisfaction = sat
  }
  
  def getRank():SocialClassType = {
    return rank
  }
  
  def setRank(r:SocialClassType) = {
    rank = r
  }
}