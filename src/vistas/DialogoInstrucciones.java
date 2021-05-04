package vistas;

import java.awt.Dimension;

import javax.swing.*;
import java.awt.Image;

import java.awt.Font;
import java.awt.Component;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogoInstrucciones extends JDialog {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public DialogoInstrucciones(JFrame parent, boolean modal) {
		super(parent, modal);
		setResizable(false);
		setSize(556, 516);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		contentPane = new JPanel(null);
		contentPane.setBackground(Color.BLACK);
        contentPane.setPreferredSize(new Dimension(500, 400));
        setContentPane(contentPane);
        
        JLabel lblTitulo = new JLabel();
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(18, 11, 512, 56);
		ImageIcon imgenOrigin = new ImageIcon(DialogoDificultad.class.getResource("/img/logo1.png"));
		ImageIcon imagenReEscalada = new ImageIcon(
				imgenOrigin.getImage().getScaledInstance(434, 81, Image.SCALE_DEFAULT));
		lblTitulo.setIcon(imagenReEscalada);
		contentPane.add(lblTitulo);
		
		JLabel lblSeleccioneLaPartida = new JLabel("INSTRUCCIONES");
		lblSeleccioneLaPartida.setBounds(213, 84, 132, 17);
		lblSeleccioneLaPartida.setForeground(Color.WHITE);
		lblSeleccioneLaPartida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblSeleccioneLaPartida);
		
		JButton btnEmpezarNuevo = new JButton("Atras");
		btnEmpezarNuevo.setBounds(449, 78, 81, 23);
		btnEmpezarNuevo.setForeground(Color.BLUE);
		btnEmpezarNuevo.setBackground(Color.YELLOW);
		btnEmpezarNuevo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		contentPane.add(btnEmpezarNuevo);
        
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
        JScrollPane scrollPane = new JScrollPane(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JTextArea txtrelJuegoInicia = new JTextArea();
        txtrelJuegoInicia.setMargin(new Insets(20, 20, 20, 20));
        txtrelJuegoInicia.setForeground(Color.WHITE);
        txtrelJuegoInicia.setBackground(Color.BLACK);
        txtrelJuegoInicia.setEditable(false);
        txtrelJuegoInicia.setFont(new Font("SansSerif", Font.PLAIN, 17));
        txtrelJuegoInicia.setWrapStyleWord(true);
        txtrelJuegoInicia.setText(""
        		+ "1- El juego inicia en una ventana principal donde puede elegir\n"
        		+ "la opci\u00F3n de iniciar juego nuevo o cargar uno ya existente.\n"
        		+ "2- Cuando ingrese a la ventana del juego nuevo, el jugador se \n"
        		+ "podr\u00E1 registrar con un nickname.\n"
        		+ "3- Una vez registrado el jugador, se habilita una ventana para\n"
				+ "que pueda elegir un nivel de dificultad.\n"
        		+ "4- Cuando seleccione la dificultad, se inicia el juego.\n"
				+ "5- En la ventana de cargar partida, tiene la opci\u00F3n de iniciar \n"
				+ "de nuevo en otra dificultad o iniciar en el nivel que alla quedado \n"
				+ "anteriormente\n"
        		+ "6- las flechas de direcci\u00F3n del teclado nos permite maniobrar \n"
        		+ "el tanque protagonista.\n");

        panel.add(txtrelJuegoInicia);
        
        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon(DialogoInstrucciones.class.getResource("/img/FlechasDireccion.png")));
        panel.add(lblNewLabel);
        
        JTextArea textArea = new JTextArea();
        textArea.setMargin(new Insets(20, 20, 20, 20));
        textArea.setWrapStyleWord(true);
        textArea.setColumns(2);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        textArea.setEditable(false);
        textArea.setFont(new Font("SansSerif", Font.PLAIN, 17));
        textArea.setText( ""
        		+ "7- La barra espaciadora le da la opci\u00F3n al tanque de disparar en \n"
        		+ "la direcci\u00F3n en la que se encuentre.\n");
        panel.add(textArea);
        
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(DialogoInstrucciones.class.getResource("/img/tecladoespaciadora.jpg")));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label);
        
        JTextArea textArea_1 = new JTextArea();
        textArea_1.setMargin(new Insets(20, 20, 20, 20));
        textArea_1.setForeground(Color.WHITE);
        textArea_1.setBackground(Color.BLACK);
        textArea_1.setEditable(false);
        textArea_1.setFont(new Font("SansSerif", Font.PLAIN, 17));
        textArea_1.setWrapStyleWord(true);
        textArea_1.setText( "8- Existen 3 tipos de tanques enemigos\n");
        panel.add(textArea_1);
        
        JLabel label_1 = new JLabel("");
        label_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        label_1.setIcon(new ImageIcon(DialogoInstrucciones.class.getResource("/img/tanquetodos.PNG")));
        panel.add(label_1);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setMargin(new Insets(20, 20, 20, 20));
		textArea_2.setForeground(Color.WHITE);
		textArea_2.setBackground(Color.BLACK);
		textArea_2.setEditable(false);
		textArea_2.setFont(new Font("SansSerif", Font.PLAIN, 17));
		textArea_2.setWrapStyleWord(true);
		textArea_2.setText( "9- A lo largo del juego, se puede encontrar con habilidades \n" +
				"especiales, estas duran un determinado tiempo en el mapa\n");
		panel.add(textArea_2);

		JLabel label_2 = new JLabel("");
		label_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		label_2.setIcon(new ImageIcon(DialogoInstrucciones.class.getResource("/img/poderes.PNG")));
		panel.add(label_2);
        
        scrollPane.setBounds(10, 112, 520, 354);
        contentPane.add(scrollPane);
        
	}
}
