package com.example;
import static spark.Spark.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
    public static void main( String[] args )
    {
        get("/hello", (req, res) -> "Hellooooooooooooooo World");
        
    }
}
