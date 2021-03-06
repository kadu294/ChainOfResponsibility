/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chainofresponsibility;

/**
 *
 * @author alunopb
 */
public class ChainofResponsibility {

 private static AbstractLogger getChainOfLogger(){
    
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);    
    
    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);
    
    return errorLogger;
   }

 public static void main(String[] args){
 AbstractLogger loggerChain = getChainOfLogger();
 
 loggerChain.logMessage(AbstractLogger.INFO,
       "This is an information.");
 
 loggerChain.logMessage(AbstractLogger.DEBUG,
         "This is an debug level information.");
 
 loggerChain.logMessage(AbstractLogger.ERROR,
         "This is an error information");
 
 
 
 
 
 }

    
    
  
   
}
