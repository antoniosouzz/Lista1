package controllers;

import java.util.List;

import models.Postagem;
import play.mvc.Controller;

public class Postagens extends Controller{

	public static void listar() {
		List<Postagem> listpost = Postagem.findAll();
		render(listpost);
	}
	
	public static void salvar(Postagem p) {
		if (p.titulo != null) {
			p.titulo = p.titulo.toUpperCase();		
		}
		if (p.conteudo != null) {
			p.conteudo = p.conteudo.toUpperCase();
		}
		if (p.autor != null) {
			p.autor = p.autor.toUpperCase();		
		}
		if (p.data != null) {
					
		}
		
		p.save();
		listar();
	}
	 public static void post() {
		 render();
	 }
}
