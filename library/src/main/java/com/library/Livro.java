package com.library;

public class Livro {
	private int codigo;
	private String titulo;
	private String autor;
	private String ISBN;
	private int numPaginas;
	private float valorCompra;

	public Livro() {
	}

	public Livro(int codigo, String ISBN, String titulo, String autor, int numPaginas, float valorCompra) {
		setAutor(autor);
		setCodigo(codigo);
		setISBN(ISBN);
		setNumPaginas(numPaginas);
		setTitulo(titulo);
		setValorCompra(valorCompra);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

}
