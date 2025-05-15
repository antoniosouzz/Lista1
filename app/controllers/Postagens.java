package controllers;

import java.util.List;

import models.Postagem;
import play.mvc.Controller;

public class Postagens extends Controller{
	
	public static void listar() {
		List<Postagem> listagem = Postagem.findAll();
		render(listagem);
	}
	
	public static void salvar(Postagem p) {
		if (p != null) {
	        p.save();
	    }
		listar();
	}

}
