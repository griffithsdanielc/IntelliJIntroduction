package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float cels = (value - 32)/1.8f;
        return new Celsius(cels);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }


    public String toString()
    {
        return value + " F";
    }
}

