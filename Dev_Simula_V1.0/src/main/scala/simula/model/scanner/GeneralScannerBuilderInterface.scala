/**
 * *******************************************************
 * Simula
 * scanner
 * Test.scala
 * (c)Simula on 30 oct. 2013 11:17:58
 * By Bubul
 * Update 30 oct. 2013 11:17:58
 * *******************************************************
 */
package simula.model.scanner
import simula.model._ 

abstract class GeneralScannerBuilderInterface {
  
	def ScannerBuilder(m:ModelInterface):GeneralScannerInterface
	
}