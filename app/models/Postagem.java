package models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import play.db.jpa.Model;

@Entity
public class Postagem extends Model{
	
	public String titulo;
	public String conteudo;
	public String autor;
	public Date data;
	
}
