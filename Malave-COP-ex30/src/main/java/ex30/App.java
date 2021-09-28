package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 30 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{
    public static void main( String[] args )
    {

        for(int i = 1; i <= 12; i++)
        {
            for(int j = 1; j < 12; j++ )
            {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }
}
