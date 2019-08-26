package view;

import interfaces.ClientesInterface;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import model.TbClientes;
import repository.ClientesRep;

public class TelaClientes extends javax.swing.JFrame {

    TbClientes cliente = new TbClientes();
    ClientesRep cRep = new ClientesRep();
    int tipoSexo;
    int idClienteSelecionado;
    int botaoCNPJ = 0;

    public TelaClientes() {
        initComponents();
        refreshTable();
        AddClienteDialog.setLocationRelativeTo(null);
        ModifClienteDialog.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        AddClienteDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        txtCadastroClientes = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cxtNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cxtEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cxtNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cxtComplemento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cxtCidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cxtEstado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cxtBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cxtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cxtRgouIe = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cxtInscricaoMunicipal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFeminino = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaObservacaoClienteAdd = new javax.swing.JTextArea();
        cxtDataAniversario = new com.toedter.calendar.JDateChooser();
        cxtDataCadasCliente = new com.toedter.calendar.JDateChooser();
        cxtDataAlteracaoCadast = new com.toedter.calendar.JDateChooser();
        cxtCelular = new javax.swing.JFormattedTextField();
        cxtTelefone = new javax.swing.JFormattedTextField();
        cxtCep = new javax.swing.JFormattedTextField();
        cxtCpfOuCnpj = new javax.swing.JFormattedTextField();
        btncpf = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        btnSalvarCadastroClientes = new javax.swing.JButton();
        btnCancelarCadastroClientes = new javax.swing.JButton();
        btnGrupoSexo = new javax.swing.ButtonGroup();
        ModifClienteDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        txtModifClientes = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        cxtNomeCliente1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cxtEndereco1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cxtNumero1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cxtComplemento1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cxtCidade1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cxtEstado1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        cxtBairro1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cxtEmail1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cxtRgouIe1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        cxtInscricaoMunicipal1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        rbtnMasculino1 = new javax.swing.JRadioButton();
        rbtnFeminino1 = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cxtAreaObservacaoClienteModif = new javax.swing.JTextArea();
        cxtDataAniversario2 = new com.toedter.calendar.JDateChooser();
        cxtDataCadasCliente2 = new com.toedter.calendar.JDateChooser();
        cxtDataAlteracaoCadast2 = new com.toedter.calendar.JDateChooser();
        cxtTelefone1 = new javax.swing.JFormattedTextField();
        cxtCelular1 = new javax.swing.JFormattedTextField();
        cxtCep1 = new javax.swing.JFormattedTextField();
        btncpf1 = new javax.swing.JRadioButton();
        cxtCpfOuCnpj1 = new javax.swing.JFormattedTextField();
        jPanel8 = new javax.swing.JPanel();
        btnModifCadastroClientes = new javax.swing.JButton();
        btnCancelarModifClientes = new javax.swing.JButton();
        HorizonOrcamentosPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("HorizonOrcamentosPU").createEntityManager();
        tbClientesQuery = java.beans.Beans.isDesignTime() ? null : HorizonOrcamentosPUEntityManager.createQuery("SELECT t FROM TbClientes t");
        tbClientesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tbClientesQuery.getResultList();
        tbClientesQuery1 = java.beans.Beans.isDesignTime() ? null : HorizonOrcamentosPUEntityManager.createQuery("SELECT t FROM TbClientes t");
        tbClientesList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tbClientesQuery1.getResultList();
        jPanel3 = new javax.swing.JPanel();
        txtClientes = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cxtPesquisarCliente = new javax.swing.JTextField();
        cbxFiltroCliente = new javax.swing.JComboBox<>();
        btnPesquisarCliente = new javax.swing.JButton();
        btnAdicionarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnExcluirClientes = new javax.swing.JButton();
        btnFecharJanelaCliente = new javax.swing.JButton();
        txtPesquisarCliente = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblClientesAdd = new javax.swing.JTable();

        AddClienteDialog.setTitle("HORIZON ORÇAMENTOS - CLIENTES - CADASTRO");
        AddClienteDialog.setBackground(new java.awt.Color(255, 255, 255));
        AddClienteDialog.setMinimumSize(new java.awt.Dimension(926, 650));
        AddClienteDialog.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(834, 60));
        jPanel1.setPreferredSize(new java.awt.Dimension(834, 60));

        txtCadastroClientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtCadastroClientes.setText("Cadastrar Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(txtCadastroClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCadastroClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("* Nome do Cliente / Razão Social");

        jLabel3.setText("Endereço");

        cxtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtEnderecoActionPerformed(evt);
            }
        });

        jLabel4.setText("Número");

        cxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtNumeroActionPerformed(evt);
            }
        });

        jLabel5.setText("Complemento");

        jLabel6.setText("Cidade");

        cxtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtCidadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado");

        jLabel8.setText("Bairro");

        jLabel9.setText("CEP");

        jLabel10.setText("Data de Cadastro Cliente");

        jLabel11.setText("Data de Alteração de Cadastro");

        jLabel12.setText("E-Mail");

        jLabel13.setText("CPF / CNPJ");

        jLabel14.setText("RG / Inscrição Estadual");

        cxtRgouIe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtRgouIeActionPerformed(evt);
            }
        });

        jLabel15.setText("Inscrição Municipal");

        jLabel16.setText("Telefone");

        jLabel17.setText("Celular");

        jLabel18.setText("Data de Aniversário");

        jLabel19.setText("Sexo");

        rbtnMasculino.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupoSexo.add(rbtnMasculino);
        rbtnMasculino.setText("Masculino");
        rbtnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMasculinoActionPerformed(evt);
            }
        });

        rbtnFeminino.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupoSexo.add(rbtnFeminino);
        rbtnFeminino.setText("Feminino");
        rbtnFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemininoActionPerformed(evt);
            }
        });

        jLabel20.setText("Observação");

        txtAreaObservacaoClienteAdd.setColumns(20);
        txtAreaObservacaoClienteAdd.setLineWrap(true);
        txtAreaObservacaoClienteAdd.setRows(5);
        jScrollPane2.setViewportView(txtAreaObservacaoClienteAdd);

        cxtDataCadasCliente.setEnabled(false);

        cxtDataAlteracaoCadast.setEnabled(false);

        try {
            cxtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cxtCpfOuCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cxtCpfOuCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtCpfOuCnpjActionPerformed(evt);
            }
        });

        btncpf.setBackground(new java.awt.Color(255, 255, 255));
        btncpf.setText("CNPJ");
        btncpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(cxtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(cxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(cxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(cxtComplemento)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(cxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(cxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(cxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(cxtDataCadasCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel16)
                                                .addComponent(cxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17)
                                                .addComponent(cxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cxtDataAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel18))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addComponent(cxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(15, 15, 15)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cxtDataAlteracaoCadast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(rbtnMasculino)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                    .addGap(45, 45, 45)
                                                    .addComponent(jLabel19)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rbtnFeminino)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(cxtRgouIe, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxtInscricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cxtCpfOuCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btncpf))
                                    .addComponent(jLabel13))))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxtDataAlteracaoCadast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxtDataCadasCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxtDataAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbtnMasculino)
                                .addComponent(rbtnFeminino))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxtRgouIe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxtInscricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btncpf))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(cxtCpfOuCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btnSalvarCadastroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnSalvarCadastroClientes.setText("Salvar");
        btnSalvarCadastroClientes.setToolTipText("Cadastrar Cliente");
        btnSalvarCadastroClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroClientesActionPerformed(evt);
            }
        });

        btnCancelarCadastroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btnCancelarCadastroClientes.setText("Cancelar");
        btnCancelarCadastroClientes.setToolTipText("Cancelar Cadastro");
        btnCancelarCadastroClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCadastroClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvarCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarCadastroClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCadastroClientes)
                    .addComponent(btnCancelarCadastroClientes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AddClienteDialogLayout = new javax.swing.GroupLayout(AddClienteDialog.getContentPane());
        AddClienteDialog.getContentPane().setLayout(AddClienteDialogLayout);
        AddClienteDialogLayout.setHorizontalGroup(
            AddClienteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddClienteDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddClienteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE))
                .addContainerGap())
        );
        AddClienteDialogLayout.setVerticalGroup(
            AddClienteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddClienteDialogLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ModifClienteDialog.setTitle("HORIZON ORÇAMENTOS - CLIENTES - ALTERAR");
        ModifClienteDialog.setBackground(new java.awt.Color(255, 255, 255));
        ModifClienteDialog.setMinimumSize(new java.awt.Dimension(926, 650));
        ModifClienteDialog.setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(834, 60));
        jPanel5.setPreferredSize(new java.awt.Dimension(834, 60));

        txtModifClientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtModifClientes.setText("Modificar Clientes");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addComponent(txtModifClientes)
                .addGap(346, 346, 346))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModifClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setText("Nome do Cliente / Razão Social");

        jLabel22.setText("Endereço");

        cxtEndereco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtEndereco1ActionPerformed(evt);
            }
        });

        jLabel23.setText("Numero");

        cxtNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtNumero1ActionPerformed(evt);
            }
        });

        jLabel24.setText("Complemento");

        jLabel25.setText("Cidade");

        cxtCidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtCidade1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Estado");

        jLabel27.setText("Bairro");

        jLabel28.setText("CEP");

        jLabel29.setText("Data de Cadastro Cliente");

        jLabel30.setText("Data de Alteração de Cadastro");

        jLabel31.setText("E-Mail");

        jLabel32.setText("CPF / CNPJ");

        jLabel33.setText("RG / Inscrição Estadual");

        cxtRgouIe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtRgouIe1ActionPerformed(evt);
            }
        });

        jLabel34.setText("Inscrição Municipal");

        jLabel35.setText("Telefone");

        jLabel36.setText("Celular");

        jLabel37.setText("Data de Aniversário");

        jLabel38.setText("Sexo");

        rbtnMasculino1.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupoSexo.add(rbtnMasculino1);
        rbtnMasculino1.setText("Masculino");
        rbtnMasculino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMasculino1ActionPerformed(evt);
            }
        });

        rbtnFeminino1.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupoSexo.add(rbtnFeminino1);
        rbtnFeminino1.setText("Feminino");
        rbtnFeminino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFeminino1ActionPerformed(evt);
            }
        });

        jLabel39.setText("Observação");

        cxtAreaObservacaoClienteModif.setColumns(20);
        cxtAreaObservacaoClienteModif.setLineWrap(true);
        cxtAreaObservacaoClienteModif.setRows(5);
        jScrollPane3.setViewportView(cxtAreaObservacaoClienteModif);

        cxtDataCadasCliente2.setEnabled(false);

        cxtDataAlteracaoCadast2.setEnabled(false);

        try {
            cxtTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cxtCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cxtCep1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cxtCep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtCep1ActionPerformed(evt);
            }
        });

        btncpf1.setBackground(new java.awt.Color(255, 255, 255));
        btncpf1.setText("CNPJ");
        btncpf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncpf1ActionPerformed(evt);
            }
        });

        try {
            cxtCpfOuCnpj1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cxtCpfOuCnpj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxtCpfOuCnpj1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(cxtNomeCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(cxtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(cxtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(cxtComplemento1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(cxtCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxtEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(cxtBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(cxtCep1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cxtDataCadasCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(cxtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(cxtCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(cxtDataAniversario2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(cxtEmail1)))
                            .addComponent(jLabel39)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(cxtRgouIe1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(cxtInscricaoMunicipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(cxtCpfOuCnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btncpf1)))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel38))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(rbtnMasculino1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbtnFeminino1))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cxtDataAlteracaoCadast2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(5, 5, 5)))
                .addGap(70, 70, 70))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cxtNomeCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxtComplemento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cxtCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxtEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxtBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cxtCep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cxtDataCadasCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxtDataAlteracaoCadast2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel35)
                                                .addComponent(jLabel36))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cxtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cxtCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jLabel37)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cxtDataAniversario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbtnMasculino1)
                                    .addComponent(rbtnFeminino1))
                                .addGap(5, 5, 5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxtRgouIe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cxtInscricaoMunicipal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel32)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cxtCpfOuCnpj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btncpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        btnModifCadastroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnModifCadastroClientes.setText("Salvar");
        btnModifCadastroClientes.setToolTipText("Salvar Alteração do Cliente");
        btnModifCadastroClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModifCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifCadastroClientesActionPerformed(evt);
            }
        });

        btnCancelarModifClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btnCancelarModifClientes.setText("Cancelar");
        btnCancelarModifClientes.setToolTipText("Cancelar Alteração");
        btnCancelarModifClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarModifClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModifClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModifCadastroClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarModifClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifCadastroClientes)
                    .addComponent(btnCancelarModifClientes))
                .addContainerGap())
        );

        javax.swing.GroupLayout ModifClienteDialogLayout = new javax.swing.GroupLayout(ModifClienteDialog.getContentPane());
        ModifClienteDialog.getContentPane().setLayout(ModifClienteDialogLayout);
        ModifClienteDialogLayout.setHorizontalGroup(
            ModifClienteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifClienteDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModifClienteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ModifClienteDialogLayout.setVerticalGroup(
            ModifClienteDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifClienteDialogLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HORIZON ORÇAMENTOS - CLIENTES");
        setMinimumSize(new java.awt.Dimension(926, 623));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(834, 60));

        txtClientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtClientes.setText("CLIENTES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(txtClientes)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(926, 623));

        cxtPesquisarCliente.setToolTipText("Digite para pesquisar");

        cbxFiltroCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Endereço", "Bairro", "Cidade" }));
        cbxFiltroCliente.setToolTipText("Selecionar campos");
        cbxFiltroCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarCliente.setToolTipText("Pesquisar / Atualizar");
        btnPesquisarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        btnAdicionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        btnAdicionarCliente.setText("Adicionar");
        btnAdicionarCliente.setToolTipText("Adicionar cliente");
        btnAdicionarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarClienteActionPerformed(evt);
            }
        });

        btnModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btnModificarCliente.setText("Modificar");
        btnModificarCliente.setToolTipText("Modificar cliente");
        btnModificarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        btnExcluirClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exluir.png"))); // NOI18N
        btnExcluirClientes.setText("Excluir");
        btnExcluirClientes.setToolTipText("Excluir cliente");
        btnExcluirClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClientesActionPerformed(evt);
            }
        });

        btnFecharJanelaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar.png"))); // NOI18N
        btnFecharJanelaCliente.setText("Fechar Clientes");
        btnFecharJanelaCliente.setToolTipText("Fechar janela atual");
        btnFecharJanelaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharJanelaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharJanelaClienteActionPerformed(evt);
            }
        });

        txtPesquisarCliente.setText("Pesquisar cliente");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ObjectProperty.create(), tblClientesAdd, org.jdesktop.beansbinding.BeanProperty.create("elements"));
        bindingGroup.addBinding(binding);
        binding.bind();
        jScrollPane4.setViewportView(tblClientesAdd);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAdicionarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirClientes)
                        .addGap(0, 394, Short.MAX_VALUE)
                        .addComponent(btnFecharJanelaCliente))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtPesquisarCliente)
                        .addGap(8, 8, 8)
                        .addComponent(cxtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxFiltroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisarCliente)
                            .addComponent(cxtPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxFiltroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnPesquisarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarCliente)
                    .addComponent(btnModificarCliente)
                    .addComponent(btnExcluirClientes)
                    .addComponent(btnFecharJanelaCliente))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClientesActionPerformed

        try {
            ClientesRep cRep = new ClientesRep();
            List<TbClientes> clientes = cRep.listar();
            if (clientes.get(tblClientesAdd.getSelectedRow()) != null) {
                TbClientes clienteSelecionado = clientes.get(tblClientesAdd.getSelectedRow());
                cRep.excluir(clienteSelecionado);
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
                refreshTable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não há nada para excluir.");
        }


    }//GEN-LAST:event_btnExcluirClientesActionPerformed
    public void refreshTable() {
        ClientesInterface cInterface = new ClientesInterface();
        tblClientesAdd.setModel(cInterface);
    }

    public void refreshTable(String query) {
        ClientesInterface cInterface = new ClientesInterface(query);
        tblClientesAdd.setModel(cInterface);
    }

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        refreshTable(cRep.pesquisar(cbxFiltroCliente.getSelectedItem().toString(), cxtPesquisarCliente.getText()));

    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnFecharJanelaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharJanelaClienteActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharJanelaClienteActionPerformed

    private void btnAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarClienteActionPerformed
        AddClienteDialog.setVisible(true);
        cxtNumero.setText("0");
        botaoCNPJ = 0;
        btncpf.setSelected(false);
        cxtDataCadasCliente.setDate(Date.from(Instant.now()));
        cxtDataAniversario.setDate(Date.from(Instant.now()));

    }//GEN-LAST:event_btnAdicionarClienteActionPerformed

    private void btnCancelarCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCadastroClientesActionPerformed
        AddClienteDialog.setVisible(false);
    }//GEN-LAST:event_btnCancelarCadastroClientesActionPerformed

    private void cxtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtEnderecoActionPerformed

    private void cxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtNumeroActionPerformed

    private void cxtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtCidadeActionPerformed

    private void cxtRgouIeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtRgouIeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtRgouIeActionPerformed

    private void rbtnMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMasculinoActionPerformed
        tipoSexo = 1;
    }//GEN-LAST:event_rbtnMasculinoActionPerformed

    private void rbtnFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemininoActionPerformed
        tipoSexo = 2;
    }//GEN-LAST:event_rbtnFemininoActionPerformed

    private void btnCancelarModifClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModifClientesActionPerformed
        ModifClienteDialog.setVisible(false);

    }//GEN-LAST:event_btnCancelarModifClientesActionPerformed


    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed

        try {
            //Reconhecer a linha selecionada para pegar o id do cliente e carregar as informações do cliente
            List<TbClientes> clientes = cRep.listar();
            TbClientes clienteSel = clientes.get(tblClientesAdd.getSelectedRow());
            //----------------------------------------------------------------------------------------------------
            //Seta as informações na tela de alteração conforme está o cadastro no BD
            cxtNomeCliente1.setText(clienteSel.getNomeCliente());
            cxtEndereco1.setText(clienteSel.getEnderecoCliente());
            cxtBairro1.setText(clienteSel.getBairroCliente());
            cxtEstado1.setText(clienteSel.getEstadoCliente());
            cxtNumero1.setText(clienteSel.getNumEnderecoCliente().toString());
            cxtComplemento1.setText(clienteSel.getComplementoEnderecoCliente());
            cxtEmail1.setText(clienteSel.getEmailCliente());
            cxtCep1.setText(clienteSel.getCepCliente());
            cxtCidade1.setText(clienteSel.getCidadeCliente());
            cxtCelular1.setText(clienteSel.getCelularCliente());
            cxtTelefone1.setText(clienteSel.getTelefoneCliente());
            switch (clienteSel.getVerificaCnpj()) {
                case 1:
                    btncpf1.setSelected(true);
                    verificaCpfOuCnpj();
                    cxtCpfOuCnpj1.setText(clienteSel.getCpfCnpjCliente());
                    break;
                case 0:
                    btncpf1.setSelected(false);
                    verificaCpfOuCnpj();
                    cxtCpfOuCnpj1.setText(clienteSel.getCpfCnpjCliente());
                    break;
            }

            cxtRgouIe1.setText(clienteSel.getRgIeCliente());
            cxtInscricaoMunicipal1.setText(clienteSel.getImCliente());
            cxtAreaObservacaoClienteModif.setText(clienteSel.getObservacaoCliente());
            idClienteSelecionado = clienteSel.getIdCliente();
            cxtDataAniversario2.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(clienteSel.getDataAniversarioCliente().toString()));
            cxtDataAlteracaoCadast2.setDate(clienteSel.getDataAlteracaoCliente());
            cxtDataCadasCliente2.setDate(clienteSel.getDataCadastroCliente());

            //1 para sexo Masculino e 2 para sexo feminino
            switch (clienteSel.getSexoCliente()) {
                case 1:
                    tipoSexo = 1;
                    rbtnMasculino1.setSelected(true);
                    break;
                case 2:
                    tipoSexo = 2;
                    rbtnFeminino1.setSelected(true);
                    break;
                default:
                    tipoSexo = 3;
                    btnGrupoSexo.clearSelection();
                    break;
            }

            ModifClienteDialog.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Você precisa selecionar um cliente para poder alterar");
        }


    }//GEN-LAST:event_btnModificarClienteActionPerformed
    private void btnSalvarCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroClientesActionPerformed
        try {
            //verifica o nome se é diferente de vazio
            if (cxtNomeCliente.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O nome não pode estar em branco!");
            } else {
                //passa todas as variaveis para o BD
                cliente.setCelularCliente(cxtCelular.getText());

                cliente.setNomeCliente(cxtNomeCliente.getText());
                cliente.setEnderecoCliente(cxtEndereco.getText());
                cliente.setBairroCliente(cxtBairro.getText());
                cliente.setEstadoCliente(cxtEstado.getText());
                cliente.setNumEnderecoCliente(Integer.parseInt(cxtNumero.getText()));
                cliente.setComplementoEnderecoCliente(cxtComplemento.getText());
                cliente.setEmailCliente(cxtEmail.getText());
                cliente.setCepCliente(cxtCep.getText());
                cliente.setCidadeCliente(cxtCidade.getText());

                cliente.setTelefoneCliente(cxtTelefone.getText());
                cliente.setCpfCnpjCliente(cxtCpfOuCnpj.getText());
                cliente.setRgIeCliente(cxtRgouIe.getText());
                cliente.setImCliente(cxtInscricaoMunicipal.getText());
                cliente.setObservacaoCliente(txtAreaObservacaoClienteAdd.getText());
                cliente.setDataAniversarioCliente(cxtDataAniversario.getDate());
                cliente.setDataCadastroCliente(Date.from(Instant.now()));
                cliente.setDataAlteracaoCliente(Date.from(Instant.now()));
                cliente.setVerificaCnpj(botaoCNPJ);

                switch (tipoSexo) {
                    //1 para sexo Masculino e 2 para sexo feminino
                    case 1:
                        cliente.setSexoCliente(1);
                        break;
                    case 2:
                        cliente.setSexoCliente(2);
                        break;
                    default:
                        cliente.setSexoCliente(0);
                        break;
                }

                cRep.salvarAdd(cliente);
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                //fecha JDaialog
                AddClienteDialog.setVisible(false);
                refreshTable();

                //Limpa campos das variaveis para o proximo cadastro
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dados incompletos ou incorretos, \n'*' Verifique as informações necessárias para continuar!");
        }


    }//GEN-LAST:event_btnSalvarCadastroClientesActionPerformed

    private void btnModifCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifCadastroClientesActionPerformed
        try {
            //verifica o nome se é diferente de vazio
            if (cxtNomeCliente1.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O nome não pode estar em branco!");
            } else {
                //passa todas as variaveis para o BD
                cliente.setDataAniversarioCliente(cxtDataAniversario2.getDate());
                cliente.setNomeCliente(cxtNomeCliente1.getText());
                cliente.setEnderecoCliente(cxtEndereco1.getText());
                cliente.setBairroCliente(cxtBairro1.getText());
                cliente.setEstadoCliente(cxtEstado1.getText());
                cliente.setNumEnderecoCliente(Integer.parseInt(cxtNumero1.getText()));
                cliente.setComplementoEnderecoCliente(cxtComplemento1.getText());
                cliente.setEmailCliente(cxtEmail1.getText());
                cliente.setCepCliente(cxtCep1.getText());
                cliente.setCidadeCliente(cxtCidade1.getText());
                cliente.setCelularCliente(cxtCelular1.getText());
                cliente.setTelefoneCliente(cxtTelefone1.getText());
                cliente.setCpfCnpjCliente(cxtCpfOuCnpj1.getText());
                cliente.setRgIeCliente(cxtRgouIe1.getText());
                cliente.setImCliente(cxtInscricaoMunicipal1.getText());
                cliente.setObservacaoCliente(cxtAreaObservacaoClienteModif.getText());
                cliente.setIdCliente(idClienteSelecionado);
                cliente.setDataAlteracaoCliente(Date.from(Instant.now()));
                cliente.setDataCadastroCliente(cxtDataCadasCliente2.getDate());
                cliente.setVerificaCnpj(botaoCNPJ);
                switch (tipoSexo) {
                    //1 para sexo Masculino e 2 para sexo feminino
                    case 1:
                        cliente.setSexoCliente(1);
                        break;
                    case 2:
                        cliente.setSexoCliente(2);
                        break;
                    default:
                        cliente.setSexoCliente(0);
                        break;
                }

                cRep.salvarModif(cliente);
                JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");
                //fecha JDaialog
                ModifClienteDialog.setVisible(false);
                refreshTable();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dados incompletos ou incorretos, \n'*' Verifique as informações necessárias para continuar!");
        }
    }//GEN-LAST:event_btnModifCadastroClientesActionPerformed

    private void cxtCep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtCep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtCep1ActionPerformed

    private void rbtnFeminino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFeminino1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnFeminino1ActionPerformed

    private void rbtnMasculino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMasculino1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMasculino1ActionPerformed

    private void cxtRgouIe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtRgouIe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtRgouIe1ActionPerformed

    private void cxtCidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtCidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtCidade1ActionPerformed

    private void cxtNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtNumero1ActionPerformed

    private void cxtEndereco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtEndereco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtEndereco1ActionPerformed

    private void btncpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncpfActionPerformed
        if (btncpf.isSelected()) {
            botaoCNPJ = 1;
            try {
                cxtCpfOuCnpj.setValue("");
                MaskFormatter mascaraCNPJ = new MaskFormatter("##.###.###/####-##");
                cxtCpfOuCnpj.setFormatterFactory(new DefaultFormatterFactory(mascaraCNPJ));
            } catch (Exception e) {
            }
        } else {
            botaoCNPJ = 0;
            try {
                cxtCpfOuCnpj.setValue("");
                MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
                cxtCpfOuCnpj.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
                System.out.println("aki");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btncpfActionPerformed

    private void cxtCpfOuCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtCpfOuCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtCpfOuCnpjActionPerformed
    public void verificaCpfOuCnpj() {
        if (btncpf1.isSelected()) {
            botaoCNPJ = 1;
            try {
                cxtCpfOuCnpj1.setValue("");
                MaskFormatter mascaraCNPJ = new MaskFormatter("##.###.###/####-##");
                cxtCpfOuCnpj1.setFormatterFactory(new DefaultFormatterFactory(mascaraCNPJ));
            } catch (Exception e) {
            }
        } else {
            botaoCNPJ = 0;
            try {
                cxtCpfOuCnpj1.setValue("");
                MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
                cxtCpfOuCnpj1.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
                System.out.println("aki");
            } catch (Exception e) {
            }
        }
    }
    private void btncpf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncpf1ActionPerformed
        verificaCpfOuCnpj();
    }//GEN-LAST:event_btncpf1ActionPerformed

    private void cxtCpfOuCnpj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxtCpfOuCnpj1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxtCpfOuCnpj1ActionPerformed
    public void limparCampos() {
        cxtNomeCliente.setText("");
        cxtEndereco.setText("");
        cxtCidade.setText("");
        cxtEstado.setText("");
        cxtBairro.setText("");
        cxtCep.setText("");
        cxtEmail.setText("");
        cxtCelular.setText("");
        cxtTelefone.setText("");
        cxtCpfOuCnpj.setText("");
        cxtRgouIe.setText("");
        cxtInscricaoMunicipal.setText("");
        txtAreaObservacaoClienteAdd.setText("");
        cxtNumero.setText("");
        cxtComplemento.setText("");
        tipoSexo = 0;
        btnGrupoSexo.clearSelection();
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
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddClienteDialog;
    private javax.persistence.EntityManager HorizonOrcamentosPUEntityManager;
    private javax.swing.JDialog ModifClienteDialog;
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnCancelarCadastroClientes;
    private javax.swing.JButton btnCancelarModifClientes;
    private javax.swing.JButton btnExcluirClientes;
    private javax.swing.JButton btnFecharJanelaCliente;
    private javax.swing.ButtonGroup btnGrupoSexo;
    private javax.swing.JButton btnModifCadastroClientes;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnSalvarCadastroClientes;
    private javax.swing.JRadioButton btncpf;
    private javax.swing.JRadioButton btncpf1;
    private javax.swing.JComboBox<String> cbxFiltroCliente;
    private javax.swing.JTextArea cxtAreaObservacaoClienteModif;
    private javax.swing.JTextField cxtBairro;
    private javax.swing.JTextField cxtBairro1;
    private javax.swing.JFormattedTextField cxtCelular;
    private javax.swing.JFormattedTextField cxtCelular1;
    private javax.swing.JFormattedTextField cxtCep;
    private javax.swing.JFormattedTextField cxtCep1;
    private javax.swing.JTextField cxtCidade;
    private javax.swing.JTextField cxtCidade1;
    private javax.swing.JTextField cxtComplemento;
    private javax.swing.JTextField cxtComplemento1;
    private javax.swing.JFormattedTextField cxtCpfOuCnpj;
    private javax.swing.JFormattedTextField cxtCpfOuCnpj1;
    private com.toedter.calendar.JDateChooser cxtDataAlteracaoCadast;
    private com.toedter.calendar.JDateChooser cxtDataAlteracaoCadast2;
    private com.toedter.calendar.JDateChooser cxtDataAniversario;
    private com.toedter.calendar.JDateChooser cxtDataAniversario2;
    private com.toedter.calendar.JDateChooser cxtDataCadasCliente;
    private com.toedter.calendar.JDateChooser cxtDataCadasCliente2;
    private javax.swing.JTextField cxtEmail;
    private javax.swing.JTextField cxtEmail1;
    private javax.swing.JTextField cxtEndereco;
    private javax.swing.JTextField cxtEndereco1;
    private javax.swing.JTextField cxtEstado;
    private javax.swing.JTextField cxtEstado1;
    private javax.swing.JTextField cxtInscricaoMunicipal;
    private javax.swing.JTextField cxtInscricaoMunicipal1;
    private javax.swing.JTextField cxtNomeCliente;
    private javax.swing.JTextField cxtNomeCliente1;
    private javax.swing.JTextField cxtNumero;
    private javax.swing.JTextField cxtNumero1;
    private javax.swing.JTextField cxtPesquisarCliente;
    private javax.swing.JTextField cxtRgouIe;
    private javax.swing.JTextField cxtRgouIe1;
    private javax.swing.JFormattedTextField cxtTelefone;
    private javax.swing.JFormattedTextField cxtTelefone1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton rbtnFeminino;
    private javax.swing.JRadioButton rbtnFeminino1;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JRadioButton rbtnMasculino1;
    private java.util.List<model.TbClientes> tbClientesList;
    private java.util.List<model.TbClientes> tbClientesList1;
    private javax.persistence.Query tbClientesQuery;
    private javax.persistence.Query tbClientesQuery1;
    private javax.swing.JTable tblClientesAdd;
    private javax.swing.JTextArea txtAreaObservacaoClienteAdd;
    private javax.swing.JLabel txtCadastroClientes;
    private javax.swing.JLabel txtClientes;
    private javax.swing.JLabel txtModifClientes;
    private javax.swing.JLabel txtPesquisarCliente;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
