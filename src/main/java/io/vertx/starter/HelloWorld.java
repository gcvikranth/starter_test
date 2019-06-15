package io.vertx.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.starter.score.Vertx;

interface MyNumber{
	double getValue();
}
public class HelloWorld{
	
	public static void main(String[] arg) {
		System.out.println(" *** Hello World ***");
		
		MyNumber myNum=() -> 123.45;
		
		System.out.println(myNum.getValue());
		
	    myNum=() -> Math.random()*100;
		System.out.println(myNum.getValue());
		Vertx vertx=Vertx.vertx();
		HttpServer httpserver= (HttpServer) vertx.createHttpServer();
	    httpserver.listen(8091);
	}
}
