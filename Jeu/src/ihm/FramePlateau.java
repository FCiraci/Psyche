package Jeu.ihm;

import javax.swing.*;

import Jeu.Controleur;
import Jeu.ihm.PanelPlateau;

import java.awt.*;

public class FramePlateau extends JFrame
{
	private int lEcran, hEcran;
	private Controleur ctrl;
	private JMenuItem menuiPrecedent, menuiSuivant;
	private JMenuItem menuiAction;

	public FramePlateau(Controleur ctrl, Dimension tailleEcran, PanelPlateau panel)
	{
		this.lEcran = tailleEcran.width;
		this.hEcran = tailleEcran.height;
		this.ctrl = ctrl;

		this.setTitle("Plateau");
		this.setSize((int) (this.lEcran * 0.5), this.hEcran);
		this.setLocation((int) (this.lEcran * 0.5), 0);

		JMenuBar menuBar = new JMenuBar();
		JMenu menuAction = new JMenu("Action");
		JMenu menuLstAction = new JMenu("Liste Action");
		this.menuiPrecedent = new JMenuItem("Précédent");
		this.menuiSuivant = new JMenuItem("Suivant"); 

		for(int i = 0; i < 31; i++)
		{
			this.menuiAction = new JMenuItem(String.valueOf(i));
			menuLstAction.add(this.menuiAction);
		}

		menuAction.add(this.menuiSuivant); 
		menuAction.add(this.menuiPrecedent);
		menuBar.add(menuAction);
		menuBar.add(menuLstAction);
		this.setJMenuBar(menuBar);

		this.setTitle("Plateau");
		this.setSize((int) (this.lEcran * 0.5), this.hEcran);
		this.setLocation((int) (this.lEcran * 0.5), 0);

		this.add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
