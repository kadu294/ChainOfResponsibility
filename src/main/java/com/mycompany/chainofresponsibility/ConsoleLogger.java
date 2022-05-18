/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chainofresponsibility;

/**
 *
 * @author alunopb
 */
public class ConsoleLogger extends AbstractLogger {

  public ConsoleLogger(int level){
  this.level = level;
  }
    
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger:"+ message);
    }
   
}