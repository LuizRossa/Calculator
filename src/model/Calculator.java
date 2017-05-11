/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luiz Rossa
 */
public class Calculator 
{
    private float firstNumber, secondNumber, result;
    private String operation;
    
    public Calculator()
    {
        
    }

    public Calculator(float firstNumber, float secondNumber, String operation)
    {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }
    
    public String getOperation() 
    {
        return operation;
    }

    public void setOperation(String operation) 
    {
        this.operation = operation;
    }
    
    public float getFirstNumber()
    {
        return firstNumber;
    }

    public void setFirstNumber(float firstNumber) 
    {
        this.firstNumber = firstNumber;
    }

    public float getSecondNumber() 
    {
        return secondNumber;
    }

    public void setSecondNumber(float secondNumber)
    {
        this.secondNumber = secondNumber;
    }

    public float getResult()
    {
        return result;
    }

    public void setResult(float result) 
    {
        this.result = result;
    }
    
    
    
}
