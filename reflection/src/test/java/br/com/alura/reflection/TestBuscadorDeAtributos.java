package br.com.alura.reflection;

import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;

import br.com.alura.reflection.modelo.Produto;
import org.junit.Assert;

import static org.hamcrest.Matchers.*;

public class TestBuscadorDeAtributos {

	@Test
	public void testaQueEncontraAtributosPublicosNulos() throws Exception {
		
		String nome = "gtx 1060";
		String marca = "NVIDIA";
		String modelo = null;
		String decricao = "placa de vídeo";
		Produto p = new Produto(nome, marca, modelo, decricao);
		
		List<String> camposNulos = BuscadorDeAtributos.getAtributosNulos(p);
		
		Assert.assertThat(camposNulos.indexOf("modelo"), greaterThanOrEqualTo(0));
		
	}
	
	@Test
	public void testaQueEncontraAtributosComAString() throws Exception {
		
		String nome = "gtx 1060";
		String marca = "NVIDIA";
		String modelo = null;
		String decricao = "placa de vídeo";
		
		String string = nome;
		Produto p = new Produto(nome, marca, modelo, decricao);
		List<String> camposComString = BuscadorDeAtributos.getAtributosComAString(p, string);
		Assert.assertThat(camposComString.indexOf("nome"), greaterThanOrEqualTo(0));
		
		string = marca;
		camposComString = BuscadorDeAtributos.getAtributosComAString(p, string);
		Assert.assertThat(camposComString.indexOf("marca"), greaterThanOrEqualTo(0));
		
		camposComString = BuscadorDeAtributos.getAtributosComAString(p, string+"foo:bar");
		Assert.assertThat(camposComString.size(), lessThanOrEqualTo(0));
		
	}
	
}
