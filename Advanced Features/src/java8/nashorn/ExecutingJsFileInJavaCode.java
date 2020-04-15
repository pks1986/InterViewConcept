package java8.nashorn;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExecutingJsFileInJavaCode {

	public static void main(String[] args) {
		ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");
		
		//Reading from file
		try {
			se.eval(new FileReader("F:/java_programs/Advanced Features/src/java8/nashorn/hello.js"));
			//se.eval(new FileReader("F:/java_programs/Advanced Features/src/java8/nashorn/simplealert.js"));
		} catch (FileNotFoundException | ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
