package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

  @java.lang.Override
  public Temperature toCelsius() {
    return this;
  }

  @java.lang.Override
  public Temperature toFahrenheit() {
    float fahr = 1.8f*value + 32;
    return new Fahrenheit(fahr);
  }


  public String toString()
        {
            return value + " C";
        }
}
