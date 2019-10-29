/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author markus
 */
public class Counter {
    private int startingValue;
    private boolean check;
    //Constructors
    public Counter(int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check= check;
    }
    public Counter(int startingValue){
        this.startingValue = startingValue;
        this.check=false;
    }
    public Counter( boolean check){
        this.startingValue = 0;
        this.check=check;
    }
    public Counter(){
        this.startingValue = 0;
        this.check=false;
    }
    //Methods
    public int value(){
        return startingValue;
    } 
    public void increase(){
        this.startingValue++;
    }
    public void increase(int increaseAmount){
        if (increaseAmount >0){
        this.startingValue+=increaseAmount;
        }
    }
    public void decrease(){
        if (check){
            if (startingValue>0){
                startingValue--;
            }
        }
        else {startingValue--;}
    }
    public void decrease(int decreaseAmount){
        if (decreaseAmount > 0){
            if (check){
                if (startingValue>=decreaseAmount){
                    startingValue-=decreaseAmount;
                }
                else if (decreaseAmount > 0){
                    startingValue=0;
                }
            }
            else {startingValue-=decreaseAmount;}
        }
    }
}
