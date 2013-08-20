/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gov.informatica.firmadigital.applet;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import com.sun.pdfview.PDFFile;
import com.sun.pdfview.PDFPage;

import ec.gov.informatica.firmadigital.DatosUsuario;
import ec.gov.informatica.firmadigital.FirmaDigital;
import ec.gov.informatica.firmadigital.JerseyClient;
import ec.gov.informatica.firmadigital.PdfRow;
import ec.gov.informatica.firmadigital.ResumenRow;
import ec.gov.informatica.firmadigital.signature.SignatureVerificationException;

/**
 * 
 * @author hp1
 */
public class Login extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private javax.swing.JLabel claveLabel;
	private javax.swing.JPasswordField claveTextField;
	private javax.swing.JTabbedPane dataGridTab;
	private javax.swing.JButton firmarButton;
	private javax.swing.JPanel headerPanel;
	private javax.swing.JPanel datosInformativosPanel;
	private javax.swing.JPanel firmantesPanel;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JButton loginButton;
	private javax.swing.JScrollPane pdfViewerTab;
	private javax.swing.JButton sincronizarButton;
	private javax.swing.JPanel tabPanel;
	private javax.swing.JLabel nombreTextField;
	private javax.swing.JLabel apellidoTextField;
	private javax.swing.JLabel cedulaTextField;
	private javax.swing.JLabel institucionTextField;
	private javax.swing.JLabel datosInformativosLabel;
	private javax.swing.JLabel nombreLabel;
	private javax.swing.JLabel apellidoLabel;
	private javax.swing.JLabel cedulaLabel;
	private javax.swing.JLabel institucionLabel;
	FirmaDigital firmaDigital = new FirmaDigital();
	DatosUsuario datosUsuario;
	JerseyClient jerseyClient = new JerseyClient();

	/**
	 * Creates new form Login
	 */
	public Login() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		tabPanel = new javax.swing.JPanel();
		firmantesPanel = new javax.swing.JPanel();
		dataGridTab = new javax.swing.JTabbedPane();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		pdfViewerTab = new javax.swing.JScrollPane();
		firmarButton = new javax.swing.JButton();
		sincronizarButton = new javax.swing.JButton();
		headerPanel = new javax.swing.JPanel();
		claveLabel = new javax.swing.JLabel();
		claveTextField = new javax.swing.JPasswordField(20);
		loginButton = new javax.swing.JButton();

		/*
		 * datosInformativosLabel=new JLabel(); nombreLabel=new JLabel();
		 * apellidoLabel=new JLabel(); cedulaLabel=new JLabel();
		 * institucionLabel=new JLabel(); nombreTextField=new JTextField();
		 * apellidoTextField=new JTextField(); cedulaTextField=new JTextField();
		 * institucionTextField=new JTextField();
		 */

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTable1 = obtenerTablaResumne();

		jScrollPane1.setViewportView(jTable1);
		agregarVisualizador(pdfViewerTab,
				"C:\\Users\\hp1\\Dropbox\\Profesional\\aprendizaje\\1932394850JavaFirmado.pdf");
		dataGridTab.addTab("Documentos a Firmar", jScrollPane1);
		dataGridTab.addTab("Visor PDF", pdfViewerTab);

		/*
		 * javax.swing.GroupLayout tabPanelLayout = new
		 * javax.swing.GroupLayout(tabPanel);
		 * tabPanel.setLayout(tabPanelLayout);
		 * tabPanelLayout.setHorizontalGroup(
		 * tabPanelLayout.createParallelGroup(
		 * javax.swing.GroupLayout.Alignment.LEADING)
		 * .addGroup(tabPanelLayout.createSequentialGroup() .addContainerGap()
		 * .addComponent(dataGridTab, javax.swing.GroupLayout.PREFERRED_SIZE,
		 * 769, javax.swing.GroupLayout.PREFERRED_SIZE)
		 * .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
		 * Short.MAX_VALUE)) ); tabPanelLayout.setVerticalGroup(
		 * tabPanelLayout.createParallelGroup
		 * (javax.swing.GroupLayout.Alignment.LEADING)
		 * .addGroup(tabPanelLayout.createSequentialGroup() .addContainerGap()
		 * .addComponent(dataGridTab, javax.swing.GroupLayout.DEFAULT_SIZE, 374,
		 * Short.MAX_VALUE) .addContainerGap()) );
		 */

		/*
		 * firmarButton.setText("Firmar");
		 * 
		 * sincronizarButton.setText("Sincronizar"); sincronizarButton
		 * .addActionListener(new java.awt.event.ActionListener() { public void
		 * actionPerformed(java.awt.event.ActionEvent evt) {
		 * sincronizarButtonActionPerformed(evt); } });
		 */

		/*
		 * Layout de datos informaticos
		 */
		/*
		 * datosInformativosLabel.setText("Datos Informativos");
		 * nombreLabel.setText("Nombre:"); apellidoLabel.setText("Apellido");
		 * cedulaLabel.setText("C�dula:");
		 * institucionLabel.setText("Instituci�n"); nombreTextField.setText("");
		 * apellidoTextField.setText(""); cedulaTextField.setText("");
		 * institucionTextField.setText("");
		 */

		initializarLogin();
		/*
		 * /Layout de datos informaticos
		 */

		/*
		 * claveLabel.setText("Clave de Firma Digital");
		 * 
		 * claveTextField.setText(""); claveTextField.addActionListener(new
		 * java.awt.event.ActionListener() { public void
		 * actionPerformed(java.awt.event.ActionEvent evt) {
		 * claveTextFieldActionPerformed(evt); } });
		 * 
		 * loginButton.setText("Autenticar"); loginButton.addActionListener(new
		 * java.awt.event.ActionListener() { public void
		 * actionPerformed(java.awt.event.ActionEvent evt) {
		 * loginButtonActionPerformed(evt); } });
		 * 
		 * javax.swing.GroupLayout headerPanelLayout = new
		 * javax.swing.GroupLayout(headerPanel);
		 * headerPanel.setLayout(headerPanelLayout);
		 * headerPanelLayout.setHorizontalGroup(
		 * headerPanelLayout.createParallelGroup
		 * (javax.swing.GroupLayout.Alignment.LEADING)
		 * .addGroup(headerPanelLayout.createSequentialGroup() .addGap(162, 162,
		 * 162) .addComponent(claveLabel) .addGap(18, 18, 18)
		 * .addComponent(claveTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
		 * 187, javax.swing.GroupLayout.PREFERRED_SIZE) .addGap(18, 18, 18)
		 * .addComponent(loginButton)
		 * .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
		 * Short.MAX_VALUE)) ); headerPanelLayout.setVerticalGroup(
		 * headerPanelLayout
		 * .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		 * .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
		 * headerPanelLayout.createSequentialGroup() .addContainerGap(25,
		 * Short.MAX_VALUE)
		 * .addGroup(headerPanelLayout.createParallelGroup(javax
		 * .swing.GroupLayout.Alignment.BASELINE) .addComponent(claveLabel)
		 * .addComponent(claveTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
		 * javax.swing.GroupLayout.DEFAULT_SIZE,
		 * javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(loginButton))
		 * .addGap(23, 23, 23)) );
		 */

		/*
		 * javax.swing.GroupLayout layout = new
		 * javax.swing.GroupLayout(getContentPane());
		 * getContentPane().setLayout(layout); layout.setHorizontalGroup(
		 * layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		 * .addGroup(layout.createSequentialGroup() .addContainerGap()
		 * .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
		 * javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		 * .addContainerGap())
		 * .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
		 * layout.createSequentialGroup() .addGap(0, 0, Short.MAX_VALUE)
		 * .addGroup
		 * (layout.createParallelGroup(javax.swing.GroupLayout.Alignment
		 * .LEADING) .addComponent(tabPanel,
		 * javax.swing.GroupLayout.Alignment.TRAILING,
		 * javax.swing.GroupLayout.PREFERRED_SIZE,
		 * javax.swing.GroupLayout.DEFAULT_SIZE,
		 * javax.swing.GroupLayout.PREFERRED_SIZE)
		 * .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
		 * layout.createSequentialGroup() .addComponent(sincronizarButton)
		 * .addGap(18, 18, 18) .addComponent(firmarButton) .addGap(18, 18,
		 * 18)))) ); layout.setVerticalGroup(
		 * layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		 * .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
		 * layout.createSequentialGroup() .addContainerGap()
		 * .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
		 * javax.swing.GroupLayout.DEFAULT_SIZE,
		 * javax.swing.GroupLayout.PREFERRED_SIZE)
		 * .addPreferredGap(javax.swing.LayoutStyle
		 * .ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE,
		 * Short.MAX_VALUE) .addComponent(tabPanel,
		 * javax.swing.GroupLayout.PREFERRED_SIZE,
		 * javax.swing.GroupLayout.DEFAULT_SIZE,
		 * javax.swing.GroupLayout.PREFERRED_SIZE)
		 * .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		 * .
		 * addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
		 * .BASELINE) .addComponent(firmarButton)
		 * .addComponent(sincronizarButton)) .addContainerGap()) );
		 * 
		 * pack();
		 */
		// agregarVisualizador(this);
	}// </editor-fold>

	private void sincronizarButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	public void initializarLogin() {

		// inicia la imagen
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO
					.read(new File(
							"dimensiones-firmadigital.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));

		// agrega el panel de contenido con la imagen
		javax.swing.GroupLayout tabPanelLayout = new javax.swing.GroupLayout(
				tabPanel);
		tabPanel.setLayout(tabPanelLayout);
		tabPanelLayout.setHorizontalGroup(tabPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				tabPanelLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(picLabel,
								javax.swing.GroupLayout.PREFERRED_SIZE, 769,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		tabPanelLayout.setVerticalGroup(tabPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				tabPanelLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(picLabel,
								javax.swing.GroupLayout.DEFAULT_SIZE, 374,
								Short.MAX_VALUE).addContainerGap()));

		// Agrega el bloque de autenticacion
		claveLabel.setText("Clave de Firma Digital");

		claveTextField.setText("");
		claveTextField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				claveTextFieldActionPerformed(evt);
			}
		});

		loginButton.setText("Autenticar");
		loginButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				loginButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(
				headerPanel);
		headerPanel.setLayout(headerPanelLayout);
		headerPanelLayout.setHorizontalGroup(headerPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						headerPanelLayout
								.createSequentialGroup()
								.addGap(162, 162, 162)
								.addComponent(claveLabel)
								.addGap(18, 18, 18)
								.addComponent(claveTextField,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										187,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(loginButton)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		headerPanelLayout
				.setVerticalGroup(headerPanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								headerPanelLayout
										.createSequentialGroup()
										.addContainerGap(25, Short.MAX_VALUE)
										.addGroup(
												headerPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																claveLabel)
														.addComponent(
																claveTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																loginButton))
										.addGap(23, 23, 23)));
		// Agrega los bloques
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(headerPanel,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addContainerGap())
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														tabPanel,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(headerPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(tabPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addContainerGap()));

		pack();
	}

	public void llenarDatosDeUsuario(DatosUsuario datosUsuario){
		
		if(datosUsuario.getNombre()!=null && !datosUsuario.getNombre().isEmpty()){
			nombreTextField.setText(datosUsuario.getNombre());
		}else{
			nombreTextField.setText("N/A");
		}
		if(datosUsuario.getApellido()!=null && !datosUsuario.getApellido().isEmpty()){
			apellidoTextField.setText(datosUsuario.getApellido());
		}else{
			apellidoTextField.setText("N/A");
		}
		if(datosUsuario.getCedula()!=null && !datosUsuario.getCedula().isEmpty()){
			cedulaTextField.setText(datosUsuario.getCedula());
		}else{
			cedulaTextField.setText("N/A");
		}
		if(datosUsuario.getInstitucion()!=null && !datosUsuario.getInstitucion().isEmpty()){
			institucionTextField.setText(datosUsuario.getInstitucion());
		}else{
			institucionTextField.setText("N/A");
		}
		
	}
	
	public void initializarLogueado() {
		// elimina todos los componentes anteriores del JPanel
		
		DatosUsuario datosUsuario = firmaDigital
		.login(claveTextField.getText());
		if (datosUsuario == null) {
			JOptionPane.showMessageDialog(null, "Datos incorrectos");
			return;
		}
		
		getContentPane().removeAll();
		getContentPane().revalidate();
		// inicializa datos del usario logueado
		datosInformativosLabel = new JLabel();
		nombreLabel = new JLabel();
		apellidoLabel = new JLabel();
		cedulaLabel = new JLabel();
		institucionLabel = new JLabel();
		nombreTextField = new JLabel();
		apellidoTextField = new JLabel();
		cedulaTextField = new JLabel();
		institucionTextField = new JLabel();
		datosInformativosLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		datosInformativosLabel.setText("Datos Informativos");
		nombreLabel.setText("Nombres:");
		apellidoLabel.setText("Apellidos:");
		cedulaLabel.setText("C�dula:");
		institucionLabel.setText("Instituci�n:");
		nombreTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		apellidoTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		cedulaTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		institucionTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		
		llenarDatosDeUsuario(datosUsuario);

		// agrega el bloque de datos informativos
		datosInformativosPanel = new javax.swing.JPanel();
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				datosInformativosPanel);
		datosInformativosPanel.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				datosInformativosLabel)
																		.addContainerGap(
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												apellidoLabel)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												apellidoTextField))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												nombreLabel)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												nombreTextField)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				180,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												institucionLabel)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												institucionTextField))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												cedulaLabel)
																										.addGap(27,
																												27,
																												27)
																										.addComponent(
																												cedulaTextField)))
																		))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(datosInformativosLabel)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																nombreLabel)
														.addComponent(
																cedulaLabel)
														.addComponent(
																nombreTextField)
														.addComponent(
																cedulaTextField))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																apellidoLabel)
														.addComponent(
																institucionLabel)
														.addComponent(
																apellidoTextField)
														.addComponent(
																institucionTextField))
										));

		headerPanel = new javax.swing.JPanel();
		javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(
				headerPanel);
		headerPanel.setLayout(headerPanelLayout);
		headerPanelLayout.setHorizontalGroup(headerPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						headerPanelLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(datosInformativosPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		headerPanelLayout.setVerticalGroup(headerPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						headerPanelLayout
								.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(datosInformativosPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		// Inicializa datos de la tabla
		jTable1 = obtenerTablaResumne();

		jScrollPane1.setViewportView(jTable1);
		agregarVisualizador(pdfViewerTab,
				"C:\\Users\\hp1\\Dropbox\\Profesional\\aprendizaje\\1932394850JavaFirmado.pdf");
		dataGridTab.addTab("Documentos a Firmar", jScrollPane1);
		dataGridTab.addTab("Visor PDF", pdfViewerTab);
		// agrega la tabla al panel
		tabPanel = new javax.swing.JPanel();
		javax.swing.GroupLayout tabPanelLayout = new javax.swing.GroupLayout(
				tabPanel);
		tabPanel.setLayout(tabPanelLayout);
		tabPanelLayout.setHorizontalGroup(tabPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				tabPanelLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(dataGridTab,
								javax.swing.GroupLayout.PREFERRED_SIZE, 769,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		tabPanelLayout.setVerticalGroup(tabPanelLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				tabPanelLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(dataGridTab,
								javax.swing.GroupLayout.DEFAULT_SIZE, 374,
								Short.MAX_VALUE).addContainerGap()));

		// botones
		firmarButton.setText("Firmar");

		sincronizarButton.setText("Sincronizar");
		sincronizarButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						sincronizarButtonActionPerformed(evt);
					}
				});

		//Genera el panel contenedor
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(headerPanel,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addContainerGap())
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(0, 0, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														tabPanel,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		sincronizarButton)
																.addGap(18, 18,
																		18)
																.addComponent(
																		firmarButton)
																.addGap(18, 18,
																		18)))));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(headerPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(tabPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(firmarButton)
												.addComponent(sincronizarButton))
								.addContainerGap()));

		pack();
		getContentPane().revalidate();
		getContentPane().repaint();
		try {
			firmaDigital.verificar("C:\\Users\\hp1\\Dropbox\\Profesional\\aprendizaje\\1932394850JavaFirmado.pdf");
		} catch (SignatureVerificationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void claveTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
//		DatosUsuario datosUsuario = firmaDigital
//				.login(claveTextField.getText());
		initializarLogueado();
		
		
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			UIManager.setLookAndFeel(
		            UIManager.getSystemLookAndFeelClassName());
//			UIManager
//					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			// for (javax.swing.UIManager.LookAndFeelInfo info :
			// javax.swing.UIManager.getInstalledLookAndFeels()) {
			// if ("Nimbus".equals(info.getName())) {
			//
			// javax.swing.UIManager.setLookAndFeel(info.getClassName());
			// break;
			// }
			// }
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);

			}
		});
	}

	public JTable obtenerTablaResumne() {
		JTable jTable = new JTable();
		List<ResumenRow> resumenRows = new ArrayList<>();
		resumenRows = jerseyClient.getResumenRows("1718263153");
		Object[][] tableData = new Object[resumenRows.size()][4];
		int i = 0;
		for (ResumenRow resumenRow : resumenRows) {
			tableData[i][0] = resumenRow.getIdProceso();
			tableData[i][1] = resumenRow.getNombreProceso();

			tableData[i][2] = resumenRow.getSumaProcesos();
			tableData[i][3] = "Seleccionar Proceso";
			i++;
		}
		String[] titulosTabla = new String[] { "C�digo del Proceso", "Nombre", "Cantidad",
				"Seleccionar" };
		jTable1.setModel(new javax.swing.table.DefaultTableModel(tableData,
				titulosTabla));
		Action delete = new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				 JTable table = (JTable)e.getSource();
				int modelRow = Integer.valueOf(e.getActionCommand());
				e.setSource(obtenerTablaPdf((Integer)((DefaultTableModel)table.getModel()).getValueAt(modelRow, 0)));
				
				// ((DefaultTableModel)table.getModel()).removeRow(modelRow);
			}
		};
		ButtonColumn buttonColumn = new ButtonColumn(jTable1, delete, 3);
		buttonColumn.setMnemonic(KeyEvent.VK_D);
		return jTable1;
	}

	public JScrollPane agregarVisualizador(JScrollPane jScrollPane,
			String direccionPDF) {
		try {
			long heapSize = Runtime.getRuntime().totalMemory();
			System.out.println("Heap Size = " + heapSize);

			// JFrame frame = new JFrame("PDF Prueba");
			// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// load a pdf from a byte buffer}
			// String
			// direccionPDF="C:\\Users\\hp1\\Dropbox\\Profesional\\aprendizaje\\1932394850JavaFirmado.pdf";
			File file = new File(direccionPDF);
			RandomAccessFile raf = new RandomAccessFile(file, "r");
			FileChannel channel = raf.getChannel();
			ByteBuffer buf = channel.map(FileChannel.MapMode.READ_ONLY, 0,
					channel.size());
			final PDFFile pdffile = new PDFFile(buf);
			PdfViewer pdfViewer = new PdfViewer(direccionPDF);
			pdfViewer.setPDFFile(pdffile);
			pdfViewer.setDireccionPDF(direccionPDF);
			// FirmaDigital firmaDigital = new FirmaDigital();
			// firmaDigital.verificar(pdfViewer.getDireccionPDF());
			// pdfViewer.obtenerFirmas();
//			JerseyClient webServiceLink = new JerseyClient();
			// System.out.println(webServiceLink.getToken());
			// webServiceLink.getPdfRows();
			jScrollPane.setViewportView(pdfViewer);
			// jScrollPane.pack();
			// jScrollPane.setVisible(true);

			PDFPage page = pdffile.getPage(0);
			pdfViewer.getPagePanel().showPage(page);
			System.out.println("acabando");
			return jScrollPane;
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("NO hay los archivos");
			return null;
		}
	}

	public JTable obtenerTablaPdf(Integer idProceso) {
		JTable jTable = new JTable();
		List<PdfRow> pdfRows = new ArrayList<>();
		pdfRows = jerseyClient.getPdfRows("1718263153",idProceso);
		Object[][] tableData = new Object[pdfRows.size()][7];
		int i = 0;
		for (PdfRow pdfRow : pdfRows) {

			tableData[i][0] = pdfRow.getNombreProceso();
			tableData[i][1] = pdfRow.getNombrePaso();
			tableData[i][2] = pdfRow.getApellidosDemandado()+" "+pdfRow.getNombresDemandado();
			tableData[i][3] = pdfRow.getNombrePdf();
			tableData[i][4] = pdfRow.getIdPdf();
			tableData[i][5] = false;
			tableData[i][6] = "Visualizar";
			i++;
		}
		String[] titulosTabla = new String[] { "Proceso", "Paso", "Demandado",
				"Nombre PDF", "", "Seleccionar para Firmar" ,"Visualizar"};
		jTable1.setModel(new javax.swing.table.DefaultTableModel(tableData,
				titulosTabla));
		Action delete = new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				
				JerseyClient jerseyClient= new JerseyClient();
				
				
				JTable table = (JTable) e.getSource();
				int modelRow = Integer.valueOf(e.getActionCommand());
				((DefaultTableModel) table.getModel()).getValueAt(modelRow, 4);

				String nomProceso = (String) ((DefaultTableModel) table
						.getModel()).getValueAt(modelRow, 0);
				String paso = (String) ((DefaultTableModel) table.getModel())
						.getValueAt(modelRow, 1);
				String nomDemandado = (String) ((DefaultTableModel) table
						.getModel()).getValueAt(modelRow, 2);
				String idPdf = String.valueOf(((DefaultTableModel) table.getModel())
						.getValueAt(modelRow, 4));
				String nomPdf = (String) ((DefaultTableModel) table.getModel())
						.getValueAt(modelRow, 3);
				String path=jerseyClient.getObtenerPath(idPdf);

//				agregarVisualizador(pdfViewerTab, nomProceso + "-" + paso + "-"
//						+ nomDemandado + "-" + idPdf + "-" + nomPdf);
//				dataGridTab.setSelectedIndex(1);
			}
		};
		// ButtonColumn buttonColumnVisualizar = new ButtonColumn(jTable1,
		// delete, 4);
		ButtonColumn buttonColumnSeleccionar = new ButtonColumn(jTable1,
				delete, 6);
		// buttonColumnVisualizar.setMnemonic(KeyEvent.VK_D);
		buttonColumnSeleccionar.setMnemonic(KeyEvent.VK_D);
		jTable1.getColumnModel().getColumn(5)
				.setCellEditor(new CeldaCheckBox());
		// para pintar la columna con el CheckBox en la tabla, en este caso, la
		// primera columna
		jTable1.getColumnModel().getColumn(5)
				.setCellRenderer(new RenderCheckBox());
		
		//quitar columna con el codigo
		jTable1.getColumnModel().getColumn(4).setMinWidth(0);
		jTable1.getColumnModel().getColumn(4).setMaxWidth(0);
		jTable1.getColumnModel().getColumn(4).setWidth(0);

		return jTable1;
	}

}
