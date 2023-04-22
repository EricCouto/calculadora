package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel {

	private final Color COR_CINZA_ESCURO = new Color(68, 69, 69);
	private final Color COR_CINZA_CLARO = new Color(97, 100, 99);
	private final Color COR_LARANJA = new Color(242, 163, 60);

	public Teclado() {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		setLayout(layout);

		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;

		c.gridwidth = 3;
		// linha 1 do teclado de botões
		adicionarBotao("AC", COR_CINZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;
		adicionarBotao("/", COR_LARANJA, c, 3, 0);

		// linha 2 do teclado de botões
		adicionarBotao("9", COR_CINZA_CLARO, c, 0, 1);
		adicionarBotao("8", COR_CINZA_CLARO, c, 1, 1);
		adicionarBotao("7", COR_CINZA_CLARO, c, 2, 1);
		adicionarBotao("*", COR_LARANJA, c, 3, 1);

		// linha 3 do teclado de botões
		adicionarBotao("6", COR_CINZA_CLARO, c, 0, 2);
		adicionarBotao("5", COR_CINZA_CLARO, c, 1, 2);
		adicionarBotao("4", COR_CINZA_CLARO, c, 2, 2);
		adicionarBotao("-", COR_LARANJA, c, 3, 2);

		// linha 4 do teclado de botões
		adicionarBotao("3", COR_CINZA_CLARO, c, 0, 3);
		adicionarBotao("2", COR_CINZA_CLARO, c, 1, 3);
		adicionarBotao("1", COR_CINZA_CLARO, c, 2, 3);
		adicionarBotao("+", COR_LARANJA, c, 3, 3);

		c.gridwidth = 2;
		// linha 5 do teclado de botões
		adicionarBotao("0", COR_CINZA_CLARO, c, 0, 4);
		c.gridwidth = 1;
		adicionarBotao(",", COR_CINZA_CLARO, c, 2, 4);
		adicionarBotao("=", COR_LARANJA, c, 3, 4);

// adicionando de forma manualos botões
//		
//		c.gridy = 0;
//		c.gridx = 0;
//		add(new Botao("AC", COR_CINZA_ESCURO), c);
//		c.gridx = 1;
//		add(new Botao("+/-", COR_CINZA_ESCURO), c);
//		c.gridx = 2;
//		add(new Botao("%", COR_CINZA_ESCURO), c);
//		c.gridx = 3;
//		add(new Botao("/", COR_LARANJA), c);
//		c.gridx = 4;
//
//		add(new Botao("7", COR_CINZA_CLARO), c);
//		add(new Botao("8", COR_CINZA_CLARO), c);
//		add(new Botao("9", COR_CINZA_CLARO), c);
//		add(new Botao("*", COR_LARANJA), c);
//
//		add(new Botao("6", COR_CINZA_CLARO), c);
//		add(new Botao("5", COR_CINZA_CLARO), c);
//		add(new Botao("4", COR_CINZA_CLARO), c);
//		add(new Botao("-", COR_LARANJA), c);
//
//		add(new Botao("3", COR_CINZA_CLARO), c);
//		add(new Botao("2", COR_CINZA_CLARO), c);
//		add(new Botao("1", COR_CINZA_CLARO), c);
//		add(new Botao("+", COR_LARANJA), c);
//
//		add(new Botao("3", COR_CINZA_CLARO), c);
//		add(new Botao("2", COR_CINZA_CLARO), c);
//		add(new Botao("1", COR_CINZA_CLARO), c);
//		add(new Botao("+", COR_LARANJA), c);
//
	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		add(botao, c);

	}

}
