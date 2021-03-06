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
package simula.model
import simula.model.city.CityAccess
import simula.model.player.PlayerAccess
import simula.model.time.TimeAccess

class ModelManager extends ModelInterface{
  
	var cityModelManager:CityModelManager=new CityModelManager();
	var playerModelManager:PlayerModelManager=new PlayerModelManager();
	var timeModelManager:TimeModelManager=new TimeModelManager();
	
	/*
	def retrievedGlobalCriminality():Int={
		return 0;
	}
	def retrievedGlobalPolution():Int={
		return 0;
	}
	def retrieveNumberOfCitizens():Int={
		return cityModelManager.retrievedNumberOfCitizens;
	}
	*/
	def giveCityAccess():CityAccess={
	  return cityModelManager.giveCityAccess();
	}
	def givePlayerAccess():PlayerAccess={
	  //return playerModelManager.givePlayerAccess();
	  return null
	}
	def giveTimeAccess():TimeAccess={
	  //return timeModelManager.giveTimeAccess();
	  return null
	}
}