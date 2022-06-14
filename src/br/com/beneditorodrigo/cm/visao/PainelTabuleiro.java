package br.com.beneditorodrigo.cm.visao;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.beneditorodrigo.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(
				tabuleiro.getQuantidadeDeLinhas(),
				tabuleiro.getQuantidadeDeColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(null)));
		
		tabuleiro.registrarObservador(e -> {
			//TODO mostrar resultado para o usuario
		});
	}
}
