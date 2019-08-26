package view;

import interfaces.LoginInterface;
import java.util.List;
import javax.swing.JOptionPane;
import model.TbClientes;
import model.TbConfigSistema;
import model.TbLogin;
import repository.ConfigRep;
import repository.LoginRep;

public class TelaCadastroUser extends javax.swing.JFrame {

    TbLogin logins = new TbLogin();
    LoginRep lRep = new LoginRep();
    int permissao = 0;
    int id;

    public TelaCadastroUser() {
        initComponents();
        refreshTable();
        AddLoginUsuario.setLocationRelativeTo(null);
        ModifLoginUsuario.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        AddLoginUsuario = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        btnCancelarCadastroUsuario = new javax.swing.JButton();
        txtNomeUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSalvarCadastroUsuario = new javax.swing.JButton();
        btnAdmLogin = new javax.swing.JRadioButton();
        btnUsuario = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnGrupoPermissao = new javax.swing.ButtonGroup();
        ModifLoginUsuario = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNomeUsuario1 = new javax.swing.JTextField();
        btnCancelarCadastroUsuario1 = new javax.swing.JButton();
        btnSalvarCadastroUsuario1 = new javax.swing.JButton();
        btnUsuario1 = new javax.swing.JRadioButton();
        btnAdmLogin1 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSenha1 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        btnFecharJanelaUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnAdicionarUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtClientes = new javax.swing.JLabel();

        jLabel3.setText("Nome da empresa");

        jLabel5.setText("Endereço da empresa");

        AddLoginUsuario.setTitle("HORIZON ORÇAMENTOS - CADASTRO USUÁRIO");
        AddLoginUsuario.setLocation(new java.awt.Point(0, 0));
        AddLoginUsuario.setMinimumSize(new java.awt.Dimension(448, 230));
        AddLoginUsuario.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(423, 201));
        jPanel2.setMinimumSize(new java.awt.Dimension(423, 201));
        jPanel2.setPreferredSize(new java.awt.Dimension(443, 211));

        btnCancelarCadastroUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarCadastroUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelarCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btnCancelarCadastroUsuario.setText("Cancelar");
        btnCancelarCadastroUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroUsuarioActionPerformed(evt);
            }
        });

        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Senha");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Usuário");

        btnSalvarCadastroUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvarCadastroUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvarCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/certo.png"))); // NOI18N
        btnSalvarCadastroUsuario.setText("Cadastrar");
        btnSalvarCadastroUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarCadastroUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSalvarCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroUsuarioActionPerformed(evt);
            }
        });

        btnAdmLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupoPermissao.add(btnAdmLogin);
        btnAdmLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdmLogin.setText("Administrador");
        btnAdmLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmLoginActionPerformed(evt);
            }
        });

        btnUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupoPermissao.add(btnUsuario);
        btnUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUsuario.setText("Usuário");
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Permissão");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lock.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCancelarCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenha))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnAdmLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUsuario))
                                    .addComponent(txtNomeUsuario))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAdmLogin)
                                .addComponent(btnUsuario))
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSenha)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AddLoginUsuarioLayout = new javax.swing.GroupLayout(AddLoginUsuario.getContentPane());
        AddLoginUsuario.getContentPane().setLayout(AddLoginUsuarioLayout);
        AddLoginUsuarioLayout.setHorizontalGroup(
            AddLoginUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLoginUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );
        AddLoginUsuarioLayout.setVerticalGroup(
            AddLoginUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddLoginUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ModifLoginUsuario.setTitle("HORIZON ORÇAMENTOS - EDITAR USUÁRIO");
        ModifLoginUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModifLoginUsuario.setLocation(new java.awt.Point(239, 196));
        ModifLoginUsuario.setMinimumSize(new java.awt.Dimension(452, 240));
        ModifLoginUsuario.setModal(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(423, 201));
        jPanel5.setMinimumSize(new java.awt.Dimension(423, 201));
        jPanel5.setPreferredSize(new java.awt.Dimension(443, 211));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Senha");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Usuário");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Permissão");

        btnCancelarCadastroUsuario1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelarCadastroUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btnCancelarCadastroUsuario1.setText("Cancelar");
        btnCancelarCadastroUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroUsuario1ActionPerformed(evt);
            }
        });

        btnSalvarCadastroUsuario1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvarCadastroUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/certo.png"))); // NOI18N
        btnSalvarCadastroUsuario1.setText("Editar");
        btnSalvarCadastroUsuario1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSalvarCadastroUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroUsuario1ActionPerformed(evt);
            }
        });

        btnUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupoPermissao.add(btnUsuario1);
        btnUsuario1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUsuario1.setText("Usuário");
        btnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario1ActionPerformed(evt);
            }
        });

        btnAdmLogin1.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupoPermissao.add(btnAdmLogin1);
        btnAdmLogin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdmLogin1.setText("Administrador");
        btnAdmLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmLogin1ActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lock.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnCancelarCadastroUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarCadastroUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeUsuario1)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnAdmLogin1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUsuario1))
                            .addComponent(txtSenha1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdmLogin1)
                        .addComponent(btnUsuario1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeUsuario1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSenha1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCadastroUsuario1)
                    .addComponent(btnSalvarCadastroUsuario1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ModifLoginUsuarioLayout = new javax.swing.GroupLayout(ModifLoginUsuario.getContentPane());
        ModifLoginUsuario.getContentPane().setLayout(ModifLoginUsuarioLayout);
        ModifLoginUsuarioLayout.setHorizontalGroup(
            ModifLoginUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifLoginUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );
        ModifLoginUsuarioLayout.setVerticalGroup(
            ModifLoginUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifLoginUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HORIZON ORÇAMENTOS - USUARIO");
        setMinimumSize(new java.awt.Dimension(926, 623));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(926, 623));

        btnFecharJanelaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar.png"))); // NOI18N
        btnFecharJanelaUsuario.setText("Fechar Usuário");
        btnFecharJanelaUsuario.setToolTipText("Fechar janela atual");
        btnFecharJanelaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharJanelaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharJanelaUsuarioActionPerformed(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        btnAdicionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adduser.png"))); // NOI18N
        btnAdicionarUsuario.setText("Adicionar");
        btnAdicionarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btnModificarUsuario.setText("Modificar");
        btnModificarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        btnExcluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exluir.png"))); // NOI18N
        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAdicionarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecharJanelaUsuario))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecharJanelaUsuario)
                    .addComponent(btnAdicionarUsuario)
                    .addComponent(btnModificarUsuario)
                    .addComponent(btnExcluirUsuario))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(834, 60));

        txtClientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtClientes.setText("CADASTRO DE USUÁRIO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(txtClientes)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharJanelaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharJanelaUsuarioActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharJanelaUsuarioActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        try {
            LoginRep lRep = new LoginRep();
            List<TbLogin> login = lRep.listar();
            if (login.get(tblUsuarios.getSelectedRow()) != null) {
                TbLogin clienteSelecionado = login.get(tblUsuarios.getSelectedRow());
                lRep.excluir(clienteSelecionado);
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
                refreshTable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não há nada para excluir.");
        }
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void btnAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarUsuarioActionPerformed
        btnAdmLogin.setSelected(true);
        permissao = 1;
        AddLoginUsuario.setVisible(true);
    }//GEN-LAST:event_btnAdicionarUsuarioActionPerformed

    private void btnAdmLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmLogin1ActionPerformed
        permissao=1;
    }//GEN-LAST:event_btnAdmLogin1ActionPerformed

    private void btnUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario1ActionPerformed
        permissao=2;
    }//GEN-LAST:event_btnUsuario1ActionPerformed

    private void btnSalvarCadastroUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroUsuario1ActionPerformed
        try {
            if (txtNomeUsuario1.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "O nome não pode estar em branco!");
            } else {
                if (txtSenha1.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(rootPane, "A senha não pode estar em branco!");
                } else {
                    logins.setNomeLogin(txtNomeUsuario1.getText());
                    logins.setSenhaLogin(txtSenha1.getText());
                    logins.setIdLogin(id);
                    
                    switch (permissao) {
                        case 1:
                            logins.setPermissaoLogin(1);
                            System.out.println("aki 1");
                            break;
                        case 2:
                            logins.setPermissaoLogin(2);
                            System.out.println("aki 2");
                            break;
                        default:
                    }
                    
                    lRep.salvarModif(logins);
                    JOptionPane.showMessageDialog(rootPane, "Usuário alterado com sucesso!");
                    ModifLoginUsuario.setVisible(false);
                    refreshTable();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSalvarCadastroUsuario1ActionPerformed

    private void btnCancelarCadastroUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroUsuario1ActionPerformed
        ModifLoginUsuario.setVisible(false);
    }//GEN-LAST:event_btnCancelarCadastroUsuario1ActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        try {
            //Reconhecer a linha selecionada para pegar o id do cliente e carregar as informações do cliente
            List<TbLogin> logins = lRep.listar();
            TbLogin usuarioSel = logins.get(tblUsuarios.getSelectedRow());
            //----------------------------------------------------------------------------------------------------
            //Seta as informações na tela de alteração conforme está o cadastro no BD
            txtNomeUsuario1.setText(usuarioSel.getNomeLogin());
            txtSenha1.setText(usuarioSel.getSenhaLogin());
            id = usuarioSel.getIdLogin();
            switch (usuarioSel.getPermissaoLogin()) {
                case 1:
                    permissao = 1;
                    btnAdmLogin1.setSelected(true);
                    break;
                case 2:
                    permissao = 2;
                    btnUsuario1.setSelected(true);
                    break;
            }
            ModifLoginUsuario.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Você precisa selecionar um usuário para poder continuar!");
        }
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnAdmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmLoginActionPerformed
        permissao = 1;
    }//GEN-LAST:event_btnAdmLoginActionPerformed

    private void btnSalvarCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroUsuarioActionPerformed
        try {
            if (txtNomeUsuario.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "O nome não pode estar em branco!");
            } else {
                if (txtSenha.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(rootPane, "A senha não pode estar em branco!");
                } else {
                    logins.setNomeLogin(txtNomeUsuario.getText());
                    logins.setSenhaLogin(txtSenha.getText());
                    switch (permissao) {
                        case 1:
                            logins.setPermissaoLogin(1);
                            System.out.println("aki 1");
                            break;
                        case 2:
                            logins.setPermissaoLogin(2);
                            System.out.println("aki 2");
                            break;
                        default:
                    }
                    lRep.salvarAdd(logins);
                    JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado com sucesso!");

                    AddLoginUsuario.setVisible(false);
                    limparVariaveis();
                    refreshTable();
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSalvarCadastroUsuarioActionPerformed

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void btnCancelarCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroUsuarioActionPerformed
        AddLoginUsuario.dispose();
    }//GEN-LAST:event_btnCancelarCadastroUsuarioActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        permissao = 2;
    }//GEN-LAST:event_btnUsuarioActionPerformed
    public void limparVariaveis() {
        txtNomeUsuario.setText("");
        txtSenha.setText("");
        btnGrupoPermissao.clearSelection();

    }

    public void refreshTable() {
        LoginInterface lInterface = new LoginInterface();
        tblUsuarios.setModel(lInterface);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddLoginUsuario;
    private javax.swing.JDialog ModifLoginUsuario;
    private javax.swing.JButton btnAdicionarUsuario;
    private javax.swing.JRadioButton btnAdmLogin;
    private javax.swing.JRadioButton btnAdmLogin1;
    private javax.swing.JButton btnCancelarCadastroUsuario;
    private javax.swing.JButton btnCancelarCadastroUsuario1;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnFecharJanelaUsuario;
    private javax.swing.ButtonGroup btnGrupoPermissao;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnSalvarCadastroUsuario;
    private javax.swing.JButton btnSalvarCadastroUsuario1;
    private javax.swing.JRadioButton btnUsuario;
    private javax.swing.JRadioButton btnUsuario1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JLabel txtClientes;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtNomeUsuario1;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenha1;
    // End of variables declaration//GEN-END:variables
}
