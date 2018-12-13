package Socket;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public final class ClienteJframe extends javax.swing.JFrame {

    private PrintWriter escritor;
    private BufferedReader leitor;

    public ClienteJframe() {
        initComponents();
        taVisor.setEditable(false);
        String[] usuarios = new String[]{"teste", "teste"};
        preencherListaUsuarios(usuarios);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taVisor = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        liUsuarios = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taEditor = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        btnEnviarArquivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(18, 18, 18));

        jPanel3.setBackground(new java.awt.Color(18, 18, 18));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1286, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUÁRIOS ONLINE");

        taVisor.setColumns(20);
        taVisor.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        taVisor.setRows(5);
        jScrollPane2.setViewportView(taVisor);

        liUsuarios.setBackground(new java.awt.Color(102, 102, 102));
        liUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(0));
        liUsuarios.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        liUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        liUsuarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        liUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        liUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        liUsuarios.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(liUsuarios);

        taEditor.setColumns(20);
        taEditor.setRows(5);
        jScrollPane1.setViewportView(taEditor);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ABIN_IMAGE_400X350_black.jpg"))); // NOI18N

        label1.setAlignment(1);
        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("X");
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
        });

        btnEnviarArquivo.setText("Enviar Arquivo");
        btnEnviarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEnviarArquivo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEnviarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(521, 521, 521))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        this.dispose();
    }//GEN-LAST:event_label1MouseClicked

    private void btnEnviarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarArquivoActionPerformed
        JFileChooser seletorArquivo = new JFileChooser();
        seletorArquivo.setDialogTitle("Escolha um arquivo de texto a ser enviado");
        seletorArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("texto", "txt", "docx", "doc");
        seletorArquivo.setFileFilter(filtro);
            
        seletorArquivo.showOpenDialog(this);
        int retorno = seletorArquivo.showOpenDialog(this);
        
        if(retorno == JFileChooser.APPROVE_OPTION){
            File file = seletorArquivo.getSelectedFile();
            
/*            try {
                FileInputStream arquivo = new FileInputStream(file.getPath());
                byte[] buf = new byte[4096];
                
                while(true){
                    int len = arquivo.read(buf);
                    if(len == -1) break;
                    out.write(buf, 0, len);
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ClienteJframe.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ClienteJframe.class.getName()).log(Level.SEVERE, null, ex);
            }
*/
        }
    }//GEN-LAST:event_btnEnviarArquivoActionPerformed

    public void preencherListaUsuarios(String[] usuarios) {
        DefaultListModel modelo = new DefaultListModel();
        liUsuarios.setModel(modelo);
        for (String usuario : usuarios) {
            modelo.addElement(usuario);
        }
    }

    public void iniciarEscritor() {
        taEditor.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // escrevendo para o servidor
                    if (taVisor.getText().isEmpty()) {
                        return;
                    }
                    
                    Object usuario = liUsuarios.getSelectedValue();
                    if (usuario == null || usuario == "todos") {
                        int tamanhoLista = liUsuarios.getModel().getSize();
                        ArrayList lista_usuarios = new ArrayList();
                        for (int i = 0; i < tamanhoLista; i++) {
                            lista_usuarios.add(liUsuarios.getModel().getElementAt(i));
                        }
                        taVisor.append("Eu (todos): ");
                        taVisor.append(taEditor.getText());
                        taVisor.append("\n");
                        for (Object user : lista_usuarios) {
                            escritor.println(Comandos.MENSAGEM + user);
                            escritor.println(taEditor.getText());
                        }
                        //Apaga o Editor
                        taEditor.setText("");
                        e.consume();
                    }

                    if (usuario != null) {
                        //Escreve no Visor
                        taVisor.append("Eu: ");
                        taVisor.append(taEditor.getText());
                        taVisor.append("\n");

                        escritor.println(Comandos.MENSAGEM + usuario);
                        escritor.println(taEditor.getText());

                        //Apaga o Editor
                        taEditor.setText("");
                        e.consume();

                    } else {
                        if (taVisor.getText().equalsIgnoreCase(Comandos.SAIR)) {
                            System.exit(0);
                        }
                        //JOptionPane.showMessageDialog(ClienteJframe.this, "Selecione um Usuário!");
                       // return;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e
            ) {

            }
        });
    }

    public void IniciarChat() {
        try {
            final Socket cliente = new Socket("127.0.0.1", 9999);
            escritor = new PrintWriter(cliente.getOutputStream(), true);
            leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

        } catch (UnknownHostException e) {
            System.out.println("o endereço passado é inválido");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("o servidor pode estar fora ar");
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        ClienteJframe cliente = new ClienteJframe();
        cliente.IniciarChat();
        cliente.iniciarEscritor();
        cliente.setVisible(true);
        cliente.iniciarLeitor();
    }

    private void atualizarListaUsuarios() {
        escritor.println(Comandos.LISTA_USUARIOS);
    }

    private void iniciarLeitor() {
        // lendo mensagens do servidor
        try {
            while (true) {
                String mensagem = leitor.readLine();
                if (mensagem == null || mensagem.isEmpty()) {
                    continue;
                }

                // recebe o texto
                switch (mensagem) {
                    case Comandos.LISTA_USUARIOS:
                        String[] usuarios = leitor.readLine().split(",");
                        preencherListaUsuarios(usuarios);
                        break;
                    case Comandos.LOGIN:
                        String login = JOptionPane.showInputDialog("Qual o seu login?");
                        escritor.println(login);
                        //  LoginJframe login = new LoginJframe();
                        //   login.setVisible(true);
                        //   escritor.println(login.login);
                        break;
                    case Comandos.LOGIN_NEGADO:
                        JOptionPane.showMessageDialog(ClienteJframe.this, "o login é inválido");
                        break;
                    case Comandos.LOGIN_ACEITO:
                        atualizarListaUsuarios();
                        break;
                    default:
                        taVisor.append(mensagem);
                        taVisor.append("\n");
                        taVisor.setCaretPosition(taVisor.getDocument().getLength());
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("impossivel ler a mensagem do servidor");
        }

    }

    private DefaultListModel getListaUsuarios() {
        return (DefaultListModel) liUsuarios.getModel();
    }
    
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarArquivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private javax.swing.JList<String> liUsuarios;
    private javax.swing.JTextArea taEditor;
    private javax.swing.JTextArea taVisor;
    // End of variables declaration//GEN-END:variables

}
