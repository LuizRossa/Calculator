/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Calculator;
import view.CalculatorScreen;

/**
 *
 * @author Luiz Rossa
 */
public class MainController 
{
    private static MainController instance;
    private Calculator calculator;
    private CalculatorScreen calculatorScreen;
    private float result;
    private String operation;
    private float newResult;
    
 
    private MainController()
    {
        
    }
    
    public static MainController getInstance()
    {
        if(instance == null)
        {
            instance = new MainController();
        }
        return instance;
    }
    
    public void initialize()
    {
        calculator = new Calculator();
        calculatorScreen = new CalculatorScreen();
        
        
        calculatorScreen.setVisible(true);
    }
    
    public float sum(float firstNumber, float secondNumber, String operation)
    {
        this.operation = operation;
        setOperation(operation);
        result = firstNumber + secondNumber;
        setNewResult(result);
        
        return result;
    }
    
    public float subtraction(float firstNumber, float secondNumber, String operation)
    {
        this.operation = operation;
        setOperation(operation);
        result = firstNumber - secondNumber;
        setNewResult(result);
        
        return result;
    }
    
    public float multiplication(float firstNumber, float secondNumber, String operation)
    {
        this.operation = operation;
        setOperation(operation);
        result = firstNumber * secondNumber;
        setNewResult(result);
        
        return result;
    }
    
    public float division(float firstNumber, float secondNumber, String operation)
    {
        this.operation = operation;
        setOperation(operation);
        try
        {   
            if(secondNumber == 0)
            {
                JOptionPane.showMessageDialog(null, "Operação inválida, divisão por zero!");
            }
            else
            {
                result = firstNumber / secondNumber;          
                setNewResult(result);
            }
        }
        catch(ArithmeticException e)
        {
            
        }
        
        return result;
    }  
    
    /**
     * Este método recebe o tipo de operação que ele dever realizar, soma, subtração, multiplicação ou divisão
     * @param operation 
     */
    public void result(String operation)
    {
        if(operation.equals("sum"))
        {
            calculatorScreen.updateResult(String.valueOf(getNewResult()));
        }
        else if(operation.equals("subtraction"))
        {
            calculatorScreen.updateResult(String.valueOf(getNewResult()));
        }
        else if(operation.equals("multiplication"))
        {
            calculatorScreen.updateResult(String.valueOf(getNewResult()));
        }
        else if(operation.equals("division"))
        {
            calculatorScreen.updateResult(String.valueOf(getNewResult()));
        }
    }

    public String getOperation() 
    {
        return operation;
    }

    public void setOperation(String operation) 
    {
        this.operation = operation;
    }

    public float getNewResult() 
    {
        return newResult;
    }

    /**
     * Atualiza o valor do resultado para ser passado como parâmetro para o método updateResult,
     * que mestrará o resultado da operação na tela para o usuário.
     * @param newResult 
     */
    public void setNewResult(float newResult) 
    {
        this.newResult = newResult;
    }
    
    
}
