package br.com.alura.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.reflection.modelo.Produto;

public class BuscadorDeAtributos {

	public static List<String> getAtributosNulos(Object o) throws Exception {
		
		List<String> lista = new ArrayList<>();
		
		Class<?> c = o.getClass();
		
		for(Field f : c.getFields()) {
			Object value = f.get(o);
			if (value == null) {
				lista.add(f.getName());
			}
		}
		
		return lista;
		
	}


	public static List<String> getAtributosComAString(Object o, String string) throws Exception {
			
		List<String> lista = new ArrayList<>();
		
		Class<?> c = o.getClass();
		
		for(Field f : c.getFields()) {
			
			Object value = f.get(o);
			
			if (value != null && 
					value.toString().toLowerCase()
					.contains(string.toLowerCase())) {
				
				lista.add(f.getName());
				
			}
			
		}
		
		return lista;
	}
	
}
