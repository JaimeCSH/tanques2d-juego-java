package vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;

public class DialogoAcercaDe extends JDialog {

	private JPanel contentPane = new JPanel();

	/**
	 * Create the frame.
	 */
	public DialogoAcercaDe(JFrame parent, boolean modal) {
		super(parent, modal);

		setTitle("Acerca de");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);

		setSize(510, 509);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(new BorderLayout(0, 0));

		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(Color.BLACK);
			contentPane.add(panel, BorderLayout.CENTER);

			{
				JLabel lblTitulo = new JLabel();
				lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
				lblTitulo.setBounds(10, 11, 467, 83);
				ImageIcon imgenOrigin = new ImageIcon(DialogoDificultad.class.getResource("/img/logo1.png"));
				ImageIcon imagenReEscalada = new ImageIcon(
						imgenOrigin.getImage().getScaledInstance(434, 81, Image.SCALE_DEFAULT));
				lblTitulo.setIcon(imagenReEscalada);
				panel.add(lblTitulo);
				{
					JTextArea txtrEquipoDesarrolladorBattle = new JTextArea();
					txtrEquipoDesarrolladorBattle.setWrapStyleWord(true);

					txtrEquipoDesarrolladorBattle.setMargin(new Insets(20, 20, 20, 20));

					txtrEquipoDesarrolladorBattle.setColumns(2);
					txtrEquipoDesarrolladorBattle.setBackground(Color.BLACK);
					txtrEquipoDesarrolladorBattle.setForeground(Color.WHITE);
					txtrEquipoDesarrolladorBattle.setEditable(false);

					txtrEquipoDesarrolladorBattle.setFont(new Font("SansSerif", Font.PLAIN, 14));
					txtrEquipoDesarrolladorBattle.setLineWrap(true);
					txtrEquipoDesarrolladorBattle.setText(
							"Equipo Desarrollador simulador BATTLE CITY : " +
									"\r\n\r\nMargy Liseth Ospina Franco" +
									"\r\nTatiana Geraldine Gil toro" +
									"\r\nMilton Cesar Diaz Lerma" +
									"\r\nJaime Andres Paramo Echeverri" +
									"\r\n\r\nEste juego fue desarrollado por aprendices pertenecientes a la ficha 1365976 del Programa Tecnol\u00F3gico AN\u00C1LISIS Y DESARROLLO DE SISTEMAS DE INFORMACI\u00D3N del SENA Centro de Comercio y Turismo." +
									"\r\nEl contenido de este juego fue dise\u00F1ado, codificado y actualizado a Java 11 y usa motor de base de datos MySQL. Se desarrollo en base a los conocimientos adquiridos hasta el momento en la formaci\u00F3n mencionada anteriormente." +
									"\r\n\r\nEl juego se desarroll\u00F3 con el prop\u00F3sito de que el equipo desarrollador demostrara y aplicara todos los resultados de aprendizaje aprobados hasta el momento." +
									"\r\n\r\nLas tareas realizadas por el equipo desarrollador se dividieron de la siguiente manera:" +
									"\r\n\r\nJaime Andres Paramo: Aprendiz encargado de la codificaci\u00F3n de las clases encargadas de la jugabilidad (protagonista, enemigos, poderes, tablero del juego). Ademas de esto se encargo de el dise\u00F1o de los sprites y el dise\u00F1o del sistema de mapas por archivo. Lider del Equipo." +
									"\r\n\r\nMargy Liseth Ospina: Aprendiz encargado del dise\u00F1o del logo y de las ventanas que dan acceso al juego y la navegaci\u00F3n, asi como de la codificaci\u00F3n del mapa del primer nivel, ademas implemento la detecci\u00F3n de colisiones en los Sprites." +
									"\r\n\r\nTatiana Geraldine Gil: Aprendiz encargada de la implementaci\u00F3n del sistema de mapas por archivo, asi como el apoyo en el dise\u00F1o del protagonista y enemigos, ademas colaboro con la codificaci\u00F3n que crea diferentes tipos de enemigos y poderes." +
									"\r\n\r\nMilton Cesar Diaz: Aprendiz encargado del modelado de la dabe se datos asi como la codificaci\u00F3n de la conexi\u00F3n que permite guardar datos del juego, ademas apoyo la codificaci\u00F3n de los mapas existentes." +
									"\r\n\r\nConclusi\u00F3n: En el simulador BATTLE CITY fueron aplicados los temas vistos en la formaci\u00F3n y seg\u00FAn el equipo desarrollador se cumplieron los objetivos trazados, asi como las recomendaciones de la instructora DIANA MARIA VALENCIA, quien hizo parte importante en el control de desarrollo del juego.");

					JScrollPane scrollPane = new JScrollPane(txtrEquipoDesarrolladorBattle);
					scrollPane.setBounds(10, 127, 467, 322);
					panel.add(scrollPane);

				}

				JButton btnJugar = new JButton("ATRAS");
				btnJugar.setForeground(Color.BLUE);
				btnJugar.setBackground(Color.YELLOW);
				btnJugar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();

					}
				});
			}
		}
	}
}
