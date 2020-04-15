package java8.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptCodeInJava {

	public static void main(String[] args) {
		ScriptEngine se = new ScriptEngineManager().getEngineByName("Nashorn");
		
		try {
			se.eval("print('Hello, whats up?');");
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
