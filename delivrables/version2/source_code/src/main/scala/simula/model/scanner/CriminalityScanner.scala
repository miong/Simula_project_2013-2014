/**
 * *******************************************************
 * Simula
 * scanner
 * CriminalityScanner.scala
 * (c)Simula on 30 oct. 2013 11:21:34
 * By Bubul
 * Update 30 oct. 2013 11:21:34
 * *******************************************************
 */
package main.scala.simula.model.scanner

/**
 * @author Bubul
 *
 */
import main.scala.simula.model._
import main.scala.simula.model.city._
import main.scala.simula.common._

trait CriminalityScanner extends InfrastructuresScanner {
  var model: ModelInterface

  def ScanGlobalCriminality(loc:Location,siz:Size): Integer = {
    var crim: Integer = 0;
    var infra = getInfrastructures(model,loc,siz)
    for (i: Infrastructure <- infra) {
      crim += i.criminality.getValue.toInt
    }
    return crim;
  }
}