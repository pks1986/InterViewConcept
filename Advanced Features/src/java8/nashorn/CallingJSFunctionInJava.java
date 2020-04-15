package java8.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CallingJSFunctionInJava {

	public static void main(String[] args) {
		// Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        try {
			ee.eval(new FileReader("F:/java_programs/Advanced Features/src/java8/nashorn/hello2.js"));
		} catch (FileNotFoundException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        Invocable invocable = (Invocable)ee;  
        // calling a function  
        try {
			invocable.invokeFunction("functionDemo1");
		} catch (NoSuchMethodException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        // calling a function and passing variable as well.  
        try {
			invocable.invokeFunction("functionDemo2","Nashorn");
		} catch (NoSuchMethodException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      

	}

}
