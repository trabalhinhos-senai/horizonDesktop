package view;

import interfaces.ClientesInterface;
import interfaces.OrcamentoInterface;
import interfaces.ProdutoInterface;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.TabelaOrcamento;
import model.TabelaOrcamentoProduto;
import model.TbClientes;
import model.TbProdutos;
import repository.ClientesRep;
import repository.OrcamentoRep;
import repository.ProdutoRep;

public class TelaOrcamento extends javax.swing.JFrame {

    public TelaOrcamento() {
        initComponents();
        AddOrcamento.setLocationRelativeTo(null);
        ModifOrcamento.setLocationRelativeTo(null);
        PesquisaClienteOrcamentoADD.setLocationRelativeTo(null);
        PesquisarProdutosOrcamento.setLocationRelativeTo(null);
        refreshTable();
        AddOrcamento.setVisible(true);
        AddOrcamento.setVisible(false);
    }
    ClientesRep cRep = new ClientesRep();
    ProdutoRep pRep = new ProdutoRep();
    TabelaOrcamento orcamento = new TabelaOrcamento();
    TabelaOrcamentoProduto orcamentoProduto = new TabelaOrcamentoProduto();
    OrcamentoRep oRep = new OrcamentoRep();
    Locale locBrazil = new Locale("pt", "BR");
    NumberFormat nf = NumberFormat.getInstance(locBrazil);
    
    double valorQnt, valorQnt1, valorQnt2, valorQnt3, valorQnt4, valorQnt5, valorQnt6, valorQnt7, valorQnt8;
    double valorQnt9, valorQnt10, valorQnt11, valorQnt12, valorQnt13, valorQnt14, valorQnt15, valorQnt16, valorQnt17;
    double v1, v2, v3, v4, v5, v6, v7, v8, v9;
    double v10, v11, v12, v13, v14, v15, v16, v17, v18;
    double valorTotal, valorTotal1;
    double valorTotalOrcamento, valorTotalOrcamento1;
    private static final String vazio = "0";

    int numBotao;
    int statusOrcamento;
    int idOrcamento;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddOrcamento = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtNomeOrcamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefoneOrcamento = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCpfOuCnpjOrcamento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cxtDataOrcamento = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtDescricaoProd1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQtdProd1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtDValorTotalProd1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        txtDescricaoProd2 = new javax.swing.JTextField();
        txtQtdProd2 = new javax.swing.JTextField();
        txtDValorTotalProd2 = new javax.swing.JTextField();
        txtDescricaoProd3 = new javax.swing.JTextField();
        txtQtdProd3 = new javax.swing.JTextField();
        txtDValorTotalProd3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtDescricaoProd4 = new javax.swing.JTextField();
        txtQtdProd4 = new javax.swing.JTextField();
        txtDValorTotalProd4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txtDValorTotalProd5 = new javax.swing.JTextField();
        txtDescricaoProd5 = new javax.swing.JTextField();
        txtQtdProd5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txtDescricaoProd6 = new javax.swing.JTextField();
        txtDValorTotalProd6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        txtQtdProd6 = new javax.swing.JTextField();
        txtDValorTotalProd7 = new javax.swing.JTextField();
        txtQtdProd7 = new javax.swing.JTextField();
        txtDescricaoProd7 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        txtDValorTotalProd8 = new javax.swing.JTextField();
        txtQtdProd8 = new javax.swing.JTextField();
        txtDescricaoProd8 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        txtDValorTotalProd9 = new javax.swing.JTextField();
        txtDescricaoProd9 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        txtQtdProd9 = new javax.swing.JTextField();
        txtValorUnitProd1 = new javax.swing.JFormattedTextField();
        txtValorUnitProd2 = new javax.swing.JFormattedTextField();
        txtValorUnitProd3 = new javax.swing.JFormattedTextField();
        txtValorUnitProd4 = new javax.swing.JFormattedTextField();
        txtValorUnitProd6 = new javax.swing.JFormattedTextField();
        txtValorUnitProd5 = new javax.swing.JFormattedTextField();
        txtValorUnitProd7 = new javax.swing.JFormattedTextField();
        txtValorUnitProd8 = new javax.swing.JFormattedTextField();
        txtValorUnitProd9 = new javax.swing.JFormattedTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtValorTotalProdutos = new javax.swing.JTextField();
        txtValorAdicional = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtValorTotalOrcamento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservacaoGeral = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        rbtnAguardandoAprovacao = new javax.swing.JRadioButton();
        rbtnAprovado = new javax.swing.JRadioButton();
        rbtnNaoAprovado = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        GrupoSituação = new javax.swing.ButtonGroup();
        ModifOrcamento = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtNomeOrcamento1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTelefoneOrcamento1 = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCpfOuCnpjOrcamento1 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        cxtDataOrcamento1 = new com.toedter.calendar.JDateChooser();
        jPanel12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtDescricaoProd10 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtQtdProd10 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtDValorTotalProd10 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        txtDescricaoProd11 = new javax.swing.JTextField();
        txtQtdProd11 = new javax.swing.JTextField();
        txtDValorTotalProd11 = new javax.swing.JTextField();
        txtDescricaoProd12 = new javax.swing.JTextField();
        txtQtdProd12 = new javax.swing.JTextField();
        txtDValorTotalProd12 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        txtDescricaoProd13 = new javax.swing.JTextField();
        txtQtdProd13 = new javax.swing.JTextField();
        txtDValorTotalProd13 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        txtDValorTotalProd14 = new javax.swing.JTextField();
        txtDescricaoProd14 = new javax.swing.JTextField();
        txtQtdProd14 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        txtDescricaoProd15 = new javax.swing.JTextField();
        txtDValorTotalProd15 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        txtQtdProd15 = new javax.swing.JTextField();
        txtDValorTotalProd16 = new javax.swing.JTextField();
        txtQtdProd16 = new javax.swing.JTextField();
        txtDescricaoProd16 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        txtDValorTotalProd17 = new javax.swing.JTextField();
        txtQtdProd17 = new javax.swing.JTextField();
        txtDescricaoProd17 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        txtDValorTotalProd18 = new javax.swing.JTextField();
        txtDescricaoProd18 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        txtQtdProd18 = new javax.swing.JTextField();
        txtValorUnitProd10 = new javax.swing.JFormattedTextField();
        txtValorUnitProd11 = new javax.swing.JFormattedTextField();
        txtValorUnitProd12 = new javax.swing.JFormattedTextField();
        txtValorUnitProd13 = new javax.swing.JFormattedTextField();
        txtValorUnitProd15 = new javax.swing.JFormattedTextField();
        txtValorUnitProd14 = new javax.swing.JFormattedTextField();
        txtValorUnitProd16 = new javax.swing.JFormattedTextField();
        txtValorUnitProd17 = new javax.swing.JFormattedTextField();
        txtValorUnitProd18 = new javax.swing.JFormattedTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtValorTotalProdutos1 = new javax.swing.JTextField();
        txtValorAdicional1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txtValorTotalOrcamento1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtObservacaoGeral1 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btnSalvar1 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        rbtnAguardandoAprovacao1 = new javax.swing.JRadioButton();
        rbtnAprovado1 = new javax.swing.JRadioButton();
        rbtnNaoAprovado1 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        PesquisaClienteOrcamentoADD = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        txtClientes6 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPesquisaClienteOrcamentoAdd = new javax.swing.JTable();
        PesquisarProdutosOrcamento = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        txtClientes7 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblProdutosOrcamento = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtOrcamento = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrcamentosGerais = new javax.swing.JTable();
        cxtPesquisarOrcamento = new javax.swing.JTextField();
        cbxFiltroOrcamento = new javax.swing.JComboBox<>();
        btnPesquisarOrcamento = new javax.swing.JButton();
        btnAdicionarOrcamento = new javax.swing.JButton();
        btnModificarOrcamento = new javax.swing.JButton();
        btnExcluirOrcamento = new javax.swing.JButton();
        btnFecharJanelaOrcamento = new javax.swing.JButton();
        txtPesquisarOrcamento = new javax.swing.JLabel();
        cbxFiltroOrcamento1 = new javax.swing.JComboBox<>();

        AddOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddOrcamento.setMinimumSize(new java.awt.Dimension(926, 705));
        AddOrcamento.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastrar Orçamento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nome:");

        jLabel3.setText("Telefone:");

        try {
            txtTelefoneOrcamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("CPF/CNPJ:");

        jLabel8.setText("Data:");

        cxtDataOrcamento.setEnabled(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton1.setToolTipText("Pesquisar Cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtNomeOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefoneOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtCpfOuCnpjOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cxtDataOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpfOuCnpjOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefoneOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(7, 7, 7)
                        .addComponent(cxtDataOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Descição");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Quantidade");

        txtQtdProd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd1FocusLost(evt);
            }
        });
        txtQtdProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Valor Unit");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton2.setToolTipText("Pesquisar Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Valor Total");

        txtDValorTotalProd1.setEnabled(false);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton3.setToolTipText("Pesquisar Cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtQtdProd2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd2FocusLost(evt);
            }
        });
        txtQtdProd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd2ActionPerformed(evt);
            }
        });

        txtDValorTotalProd2.setEnabled(false);

        txtQtdProd3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd3FocusLost(evt);
            }
        });
        txtQtdProd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd3ActionPerformed(evt);
            }
        });

        txtDValorTotalProd3.setEnabled(false);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton4.setToolTipText("Pesquisar Cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtQtdProd4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd4FocusLost(evt);
            }
        });
        txtQtdProd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd4ActionPerformed(evt);
            }
        });

        txtDValorTotalProd4.setEnabled(false);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton5.setToolTipText("Pesquisar Cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtDValorTotalProd5.setEnabled(false);

        txtQtdProd5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd5FocusLost(evt);
            }
        });
        txtQtdProd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton6.setToolTipText("Pesquisar Cliente");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtDValorTotalProd6.setEnabled(false);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton7.setToolTipText("Pesquisar Cliente");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        txtQtdProd6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd6FocusLost(evt);
            }
        });
        txtQtdProd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd6ActionPerformed(evt);
            }
        });

        txtDValorTotalProd7.setEnabled(false);

        txtQtdProd7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd7FocusLost(evt);
            }
        });
        txtQtdProd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton8.setToolTipText("Pesquisar Cliente");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        txtDValorTotalProd8.setEnabled(false);

        txtQtdProd8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd8FocusLost(evt);
            }
        });
        txtQtdProd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton9.setToolTipText("Pesquisar Cliente");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        txtDValorTotalProd9.setEnabled(false);

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton10.setToolTipText("Pesquisar Cliente");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        txtQtdProd9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd9FocusLost(evt);
            }
        });
        txtQtdProd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd9ActionPerformed(evt);
            }
        });

        txtValorUnitProd1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd1FocusLost(evt);
            }
        });
        txtValorUnitProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitProd1ActionPerformed(evt);
            }
        });

        txtValorUnitProd2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd2FocusLost(evt);
            }
        });

        txtValorUnitProd3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd3FocusLost(evt);
            }
        });

        txtValorUnitProd4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd4FocusLost(evt);
            }
        });

        txtValorUnitProd6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd6FocusLost(evt);
            }
        });

        txtValorUnitProd5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd5FocusLost(evt);
            }
        });

        txtValorUnitProd7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd7FocusLost(evt);
            }
        });

        txtValorUnitProd8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd8FocusLost(evt);
            }
        });

        txtValorUnitProd9.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd9FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel5)
                                .addGap(124, 124, 124)
                                .addComponent(jLabel6)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel7))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtDescricaoProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorUnitProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(txtDValorTotalProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorUnitProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorUnitProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorUnitProd4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorUnitProd5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorUnitProd6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorUnitProd7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd8, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorUnitProd8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd9, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorUnitProd9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricaoProd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQtdProd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDValorTotalProd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorUnitProd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricaoProd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQtdProd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDValorTotalProd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorUnitProd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricaoProd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQtdProd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDValorTotalProd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorUnitProd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricaoProd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQtdProd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDValorTotalProd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorUnitProd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricaoProd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQtdProd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDValorTotalProd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorUnitProd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricaoProd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQtdProd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDValorTotalProd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorUnitProd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricaoProd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQtdProd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDValorTotalProd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorUnitProd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricaoProd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQtdProd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDValorTotalProd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorUnitProd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricaoProd9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQtdProd9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDValorTotalProd9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtValorUnitProd9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Valor Total Produtos");

        txtValorTotalProdutos.setEnabled(false);

        txtValorAdicional.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorAdicionalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorAdicionalFocusLost(evt);
            }
        });
        txtValorAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorAdicionalActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Valor Adicional");

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(190, 2));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Valor Total Orçamento");

        txtValorTotalOrcamento.setEnabled(false);

        txtObservacaoGeral.setColumns(20);
        txtObservacaoGeral.setRows(5);
        jScrollPane2.setViewportView(txtObservacaoGeral);

        jLabel13.setText("Observações Gerais");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValorAdicional)
                    .addComponent(txtValorTotalProdutos)
                    .addComponent(txtValorTotalOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtValorAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txtValorTotalProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorTotalOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar Orçamento");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jButton11.setText("Cancelar");
        jButton11.setToolTipText("Cancelar Orçamento");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        rbtnAguardandoAprovacao.setBackground(new java.awt.Color(255, 255, 255));
        GrupoSituação.add(rbtnAguardandoAprovacao);
        rbtnAguardandoAprovacao.setText("Aguardando Aprovação");
        rbtnAguardandoAprovacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAguardandoAprovacaoActionPerformed(evt);
            }
        });

        rbtnAprovado.setBackground(new java.awt.Color(255, 255, 255));
        GrupoSituação.add(rbtnAprovado);
        rbtnAprovado.setText("Aprovado");
        rbtnAprovado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAprovadoActionPerformed(evt);
            }
        });

        rbtnNaoAprovado.setBackground(new java.awt.Color(255, 255, 255));
        GrupoSituação.add(rbtnNaoAprovado);
        rbtnNaoAprovado.setText("Não Aprovado");
        rbtnNaoAprovado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNaoAprovadoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Situação");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(jLabel14)
                        .addGap(165, 165, 165))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtnAguardandoAprovacao)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnAprovado)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnNaoAprovado)
                        .addGap(38, 38, 38))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(jButton11))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnAprovado)
                            .addComponent(rbtnNaoAprovado)
                            .addComponent(rbtnAguardandoAprovacao))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AddOrcamentoLayout = new javax.swing.GroupLayout(AddOrcamento.getContentPane());
        AddOrcamento.getContentPane().setLayout(AddOrcamentoLayout);
        AddOrcamentoLayout.setHorizontalGroup(
            AddOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        AddOrcamentoLayout.setVerticalGroup(
            AddOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ModifOrcamento.setMinimumSize(new java.awt.Dimension(926, 703));
        ModifOrcamento.setResizable(false);
        ModifOrcamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ModifOrcamentoFocusLost(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Alterar Orçamento");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        txtNomeOrcamento1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeOrcamento1FocusGained(evt);
            }
        });

        jLabel16.setText("Nome:");

        jLabel17.setText("Telefone:");

        try {
            txtTelefoneOrcamento1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel18.setText("CPF/CNPJ:");

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton12.setToolTipText("Pesquisar Cliente");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel19.setText("Data:");

        cxtDataOrcamento1.setEnabled(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtNomeOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(txtTelefoneOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtCpfOuCnpjOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(cxtDataOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel16))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCpfOuCnpjOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefoneOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNomeOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(7, 7, 7)
                        .addComponent(cxtDataOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Descição");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Quantidade");

        txtQtdProd10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd10FocusLost(evt);
            }
        });
        txtQtdProd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd10ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Valor Unit");

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton13.setToolTipText("Pesquisar Cliente");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Valor Total");

        txtDValorTotalProd10.setEnabled(false);

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton14.setToolTipText("Pesquisar Cliente");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        txtQtdProd11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd11FocusLost(evt);
            }
        });
        txtQtdProd11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd11ActionPerformed(evt);
            }
        });

        txtDValorTotalProd11.setEnabled(false);

        txtQtdProd12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd12FocusLost(evt);
            }
        });
        txtQtdProd12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd12ActionPerformed(evt);
            }
        });

        txtDValorTotalProd12.setEnabled(false);

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton15.setToolTipText("Pesquisar Cliente");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        txtQtdProd13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd13FocusLost(evt);
            }
        });
        txtQtdProd13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd13ActionPerformed(evt);
            }
        });

        txtDValorTotalProd13.setEnabled(false);

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton16.setToolTipText("Pesquisar Cliente");
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        txtDValorTotalProd14.setEnabled(false);

        txtQtdProd14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd14FocusLost(evt);
            }
        });
        txtQtdProd14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd14ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton17.setToolTipText("Pesquisar Cliente");
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        txtDValorTotalProd15.setEnabled(false);

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton18.setToolTipText("Pesquisar Cliente");
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        txtQtdProd15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd15FocusLost(evt);
            }
        });
        txtQtdProd15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd15ActionPerformed(evt);
            }
        });

        txtDValorTotalProd16.setEnabled(false);

        txtQtdProd16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd16FocusLost(evt);
            }
        });
        txtQtdProd16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd16ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton19.setToolTipText("Pesquisar Cliente");
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        txtDValorTotalProd17.setEnabled(false);

        txtQtdProd17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd17FocusLost(evt);
            }
        });
        txtQtdProd17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd17ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton20.setToolTipText("Pesquisar Cliente");
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        txtDValorTotalProd18.setEnabled(false);

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa.png"))); // NOI18N
        jButton21.setToolTipText("Pesquisar Cliente");
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        txtQtdProd18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdProd18FocusLost(evt);
            }
        });
        txtQtdProd18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdProd18ActionPerformed(evt);
            }
        });

        txtValorUnitProd10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd10FocusLost(evt);
            }
        });
        txtValorUnitProd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitProd10ActionPerformed(evt);
            }
        });

        txtValorUnitProd11.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd11FocusLost(evt);
            }
        });

        txtValorUnitProd12.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd12FocusLost(evt);
            }
        });

        txtValorUnitProd13.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd13FocusLost(evt);
            }
        });

        txtValorUnitProd15.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd15FocusLost(evt);
            }
        });

        txtValorUnitProd14.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd14FocusLost(evt);
            }
        });

        txtValorUnitProd16.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd16FocusLost(evt);
            }
        });

        txtValorUnitProd17.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd17FocusLost(evt);
            }
        });

        txtValorUnitProd18.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtValorUnitProd18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorUnitProd18FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel20)
                                .addGap(124, 124, 124)
                                .addComponent(jLabel21)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel22))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(txtDescricaoProd10, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorUnitProd10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnitProd12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnitProd11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnitProd13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnitProd14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnitProd15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnitProd16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnitProd17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorUnitProd18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(txtDValorTotalProd10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd12, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd11, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd13, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd13, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd14, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd15, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd15, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd15, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd16, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd16, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd17, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd17, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd17, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(txtDescricaoProd18, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQtdProd18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDValorTotalProd18, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescricaoProd10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQtdProd10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDValorTotalProd10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescricaoProd11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQtdProd11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDValorTotalProd11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescricaoProd12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQtdProd12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDValorTotalProd12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescricaoProd13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQtdProd13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDValorTotalProd13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescricaoProd14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQtdProd14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDValorTotalProd14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescricaoProd15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQtdProd15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDValorTotalProd15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescricaoProd16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQtdProd16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDValorTotalProd16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescricaoProd17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQtdProd17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDValorTotalProd17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescricaoProd18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQtdProd18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDValorTotalProd18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(txtValorUnitProd10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnitProd11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnitProd12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnitProd13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnitProd14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnitProd15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnitProd16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnitProd17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnitProd18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel24.setText("Valor Total Produtos");

        txtValorTotalProdutos1.setEnabled(false);

        txtValorAdicional1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorAdicional1FocusLost(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel25.setText("Valor Adicional");

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.setPreferredSize(new java.awt.Dimension(190, 2));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel26.setText("Valor Total Orçamento");

        txtValorTotalOrcamento1.setEnabled(false);

        txtObservacaoGeral1.setColumns(20);
        txtObservacaoGeral1.setRows(5);
        jScrollPane3.setViewportView(txtObservacaoGeral1);

        jLabel27.setText("Observações Gerais");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValorAdicional1)
                    .addComponent(txtValorTotalProdutos1)
                    .addComponent(txtValorTotalOrcamento1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(txtValorAdicional1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel24)
                                .addComponent(txtValorTotalProdutos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorTotalOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        btnSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnSalvar1.setText("Salvar");
        btnSalvar1.setToolTipText("Salvar Orçamento");
        btnSalvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jButton22.setText("Cancelar");
        jButton22.setToolTipText("Cancelar Orçamento");
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        rbtnAguardandoAprovacao1.setBackground(new java.awt.Color(255, 255, 255));
        GrupoSituação.add(rbtnAguardandoAprovacao1);
        rbtnAguardandoAprovacao1.setText("Aguardando Aprovação");
        rbtnAguardandoAprovacao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnAguardandoAprovacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAguardandoAprovacao1ActionPerformed(evt);
            }
        });

        rbtnAprovado1.setBackground(new java.awt.Color(255, 255, 255));
        GrupoSituação.add(rbtnAprovado1);
        rbtnAprovado1.setText("Aprovado");
        rbtnAprovado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnAprovado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAprovado1ActionPerformed(evt);
            }
        });

        rbtnNaoAprovado1.setBackground(new java.awt.Color(255, 255, 255));
        GrupoSituação.add(rbtnNaoAprovado1);
        rbtnNaoAprovado1.setText("Não Aprovado");
        rbtnNaoAprovado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnNaoAprovado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNaoAprovado1ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Situação");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(rbtnAguardandoAprovacao1)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnAprovado1)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnNaoAprovado1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28)
                        .addGap(128, 128, 128)))
                .addGap(37, 37, 37))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar1)
                        .addComponent(jButton22))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnAprovado1)
                            .addComponent(rbtnNaoAprovado1)
                            .addComponent(rbtnAguardandoAprovacao1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ModifOrcamentoLayout = new javax.swing.GroupLayout(ModifOrcamento.getContentPane());
        ModifOrcamento.getContentPane().setLayout(ModifOrcamentoLayout);
        ModifOrcamentoLayout.setHorizontalGroup(
            ModifOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModifOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ModifOrcamentoLayout.setVerticalGroup(
            ModifOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        PesquisaClienteOrcamentoADD.setBackground(new java.awt.Color(255, 255, 255));
        PesquisaClienteOrcamentoADD.setMinimumSize(new java.awt.Dimension(826, 523));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/certo.png"))); // NOI18N
        jButton23.setText("Selecionar");
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jButton24.setText("Cancelar");
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23)
                    .addComponent(jButton24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        txtClientes6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtClientes6.setText("Selecione um Cliente");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(txtClientes6)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtClientes6, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        tblPesquisaClienteOrcamentoAdd.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblPesquisaClienteOrcamentoAdd);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PesquisaClienteOrcamentoADDLayout = new javax.swing.GroupLayout(PesquisaClienteOrcamentoADD.getContentPane());
        PesquisaClienteOrcamentoADD.getContentPane().setLayout(PesquisaClienteOrcamentoADDLayout);
        PesquisaClienteOrcamentoADDLayout.setHorizontalGroup(
            PesquisaClienteOrcamentoADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PesquisaClienteOrcamentoADDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PesquisaClienteOrcamentoADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PesquisaClienteOrcamentoADDLayout.setVerticalGroup(
            PesquisaClienteOrcamentoADDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PesquisaClienteOrcamentoADDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PesquisarProdutosOrcamento.setMinimumSize(new java.awt.Dimension(826, 523));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/certo.png"))); // NOI18N
        jButton25.setText("Selecionar");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jButton26.setText("Cancelar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton25)
                    .addComponent(jButton26))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        txtClientes7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtClientes7.setText("Selecione um produto");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(txtClientes7)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtClientes7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        tblProdutosOrcamento.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tblProdutosOrcamento);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PesquisarProdutosOrcamentoLayout = new javax.swing.GroupLayout(PesquisarProdutosOrcamento.getContentPane());
        PesquisarProdutosOrcamento.getContentPane().setLayout(PesquisarProdutosOrcamentoLayout);
        PesquisarProdutosOrcamentoLayout.setHorizontalGroup(
            PesquisarProdutosOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PesquisarProdutosOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PesquisarProdutosOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PesquisarProdutosOrcamentoLayout.setVerticalGroup(
            PesquisarProdutosOrcamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PesquisarProdutosOrcamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HORIZON ORÇAMENTOS - ORÇAMENTOS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMinimumSize(new java.awt.Dimension(926, 623));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(834, 60));

        txtOrcamento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtOrcamento.setText("ORÇAMENTOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(txtOrcamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(926, 623));

        tblOrcamentosGerais.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblOrcamentosGerais);

        cxtPesquisarOrcamento.setToolTipText("Digite para pesquisar");

        cbxFiltroOrcamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "ID" }));
        cbxFiltroOrcamento.setToolTipText("Selecionar campos");

        btnPesquisarOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarOrcamento.setToolTipText("Pesquisar / Atualizar");
        btnPesquisarOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisarOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarOrcamentoActionPerformed(evt);
            }
        });

        btnAdicionarOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar.png"))); // NOI18N
        btnAdicionarOrcamento.setText("Adicionar");
        btnAdicionarOrcamento.setToolTipText("Adicionar orçamento");
        btnAdicionarOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdicionarOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarOrcamentoActionPerformed(evt);
            }
        });

        btnModificarOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        btnModificarOrcamento.setText("Modificar");
        btnModificarOrcamento.setToolTipText("Modificar orçamento");
        btnModificarOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarOrcamentoActionPerformed(evt);
            }
        });

        btnExcluirOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exluir.png"))); // NOI18N
        btnExcluirOrcamento.setText("Excluir");
        btnExcluirOrcamento.setToolTipText("Excluir orçamento");
        btnExcluirOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirOrcamentoActionPerformed(evt);
            }
        });

        btnFecharJanelaOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar.png"))); // NOI18N
        btnFecharJanelaOrcamento.setText("Fechar Orçamento");
        btnFecharJanelaOrcamento.setToolTipText("Fechar janela atual");
        btnFecharJanelaOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharJanelaOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharJanelaOrcamentoActionPerformed(evt);
            }
        });

        txtPesquisarOrcamento.setText("Pesquisar empresas");

        cbxFiltroOrcamento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Aguardando Aprovação", "Aprovado", "Não Aprovado" }));
        cbxFiltroOrcamento1.setToolTipText("Selecionar campos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAdicionarOrcamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirOrcamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFecharJanelaOrcamento))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(txtPesquisarOrcamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxtPesquisarOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxFiltroOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxFiltroOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 229, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cxtPesquisarOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPesquisarOrcamento))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxFiltroOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxFiltroOrcamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPesquisarOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarOrcamento)
                    .addComponent(btnExcluirOrcamento)
                    .addComponent(btnFecharJanelaOrcamento)
                    .addComponent(btnModificarOrcamento))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirOrcamentoActionPerformed
        try {
            OrcamentoRep oRep = new OrcamentoRep();
            List<TabelaOrcamento> orcamento = oRep.listarOrcamento();
            List<TabelaOrcamentoProduto> orcamentoProd = oRep.listarOrcamentoProduto();
            if (orcamentoProd.get(tblOrcamentosGerais.getSelectedRow()) != null) {
                TabelaOrcamentoProduto prodSel = orcamentoProd.get(tblOrcamentosGerais.getSelectedRow());
                oRep.excluirOrcamentoProduto(prodSel);
            }

            if (orcamento.get(tblOrcamentosGerais.getSelectedRow()) != null) {
                TabelaOrcamento produtoSelecionado = orcamento.get(tblOrcamentosGerais.getSelectedRow());
                oRep.excluir(produtoSelecionado);
                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
                refreshTable();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não há nada para excluir.");
        }
    }//GEN-LAST:event_btnExcluirOrcamentoActionPerformed

    public void refreshTable(String query) {
        OrcamentoInterface oInterface = new OrcamentoInterface(query);
        tblOrcamentosGerais.setModel(oInterface);
    }


    private void btnPesquisarOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarOrcamentoActionPerformed

        refreshTable(oRep.pesquisar(cbxFiltroOrcamento.getSelectedItem().toString(), cxtPesquisarOrcamento.getText(), cbxFiltroOrcamento1.getSelectedItem().toString()));

    }//GEN-LAST:event_btnPesquisarOrcamentoActionPerformed

    private void btnFecharJanelaOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharJanelaOrcamentoActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharJanelaOrcamentoActionPerformed
    public void refreshTable() {
        OrcamentoInterface oInterface = new OrcamentoInterface();
        tblOrcamentosGerais.setModel(oInterface);
    }
    private void btnAdicionarOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarOrcamentoActionPerformed
        rbtnAguardandoAprovacao.setSelected(true);
        cxtDataOrcamento.setDate(Date.from(Instant.now()));
        statusOrcamento = 1;
        setarValoresInt();
        AddOrcamento.setVisible(true);
        somatoriaAdd();
        formatarMoedaAdd();
    }//GEN-LAST:event_btnAdicionarOrcamentoActionPerformed
    
    public void setarValoresInt() {
        txtValorAdicional.setText(vazio);
        txtQtdProd1.setText(vazio);
        txtQtdProd2.setText(vazio);
        txtQtdProd3.setText(vazio);
        txtQtdProd4.setText(vazio);
        txtQtdProd5.setText(vazio);
        txtQtdProd6.setText(vazio);
        txtQtdProd7.setText(vazio);
        txtQtdProd8.setText(vazio);
        txtQtdProd9.setText(vazio);
        //------------------------------------
        txtValorUnitProd1.setText(vazio);
        txtValorUnitProd2.setText(vazio);
        txtValorUnitProd3.setText(vazio);
        txtValorUnitProd4.setText(vazio);
        txtValorUnitProd5.setText(vazio);
        txtValorUnitProd6.setText(vazio);
        txtValorUnitProd7.setText(vazio);
        txtValorUnitProd8.setText(vazio);
        txtValorUnitProd9.setText(vazio);
        //------------------------------------
        txtDValorTotalProd1.setText(vazio);
        txtDValorTotalProd2.setText(vazio);
        txtDValorTotalProd3.setText(vazio);
        txtDValorTotalProd4.setText(vazio);
        txtDValorTotalProd5.setText(vazio);
        txtDValorTotalProd6.setText(vazio);
        txtDValorTotalProd7.setText(vazio);
        txtDValorTotalProd8.setText(vazio);
        txtDValorTotalProd9.setText(vazio);
        txtDValorTotalProd10.setText(vazio);
        txtDValorTotalProd11.setText(vazio);
        txtDValorTotalProd12.setText(vazio);
        txtDValorTotalProd13.setText(vazio);
        txtDValorTotalProd14.setText(vazio);
        txtDValorTotalProd15.setText(vazio);
        txtDValorTotalProd16.setText(vazio);
        txtDValorTotalProd17.setText(vazio);
        txtDValorTotalProd18.setText(vazio);
        
        
    }

    private void txtQtdProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd1ActionPerformed

    private void txtQtdProd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd2ActionPerformed

    private void txtQtdProd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd3ActionPerformed

    private void txtQtdProd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd4ActionPerformed

    private void txtQtdProd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd5ActionPerformed

    private void txtQtdProd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd6ActionPerformed

    private void txtQtdProd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd7ActionPerformed

    private void txtQtdProd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd8ActionPerformed

    private void txtQtdProd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd9ActionPerformed

    private void rbtnAguardandoAprovacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAguardandoAprovacaoActionPerformed
        statusOrcamento = 1;
    }//GEN-LAST:event_rbtnAguardandoAprovacaoActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        AddOrcamento.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void txtQtdProd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd10ActionPerformed

    private void txtQtdProd11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd11ActionPerformed

    private void txtQtdProd12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd12ActionPerformed

    private void txtQtdProd13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd13ActionPerformed

    private void txtQtdProd14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd14ActionPerformed

    private void txtQtdProd15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd15ActionPerformed

    private void txtQtdProd16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd16ActionPerformed

    private void txtQtdProd17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd17ActionPerformed

    private void txtQtdProd18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdProd18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdProd18ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        ModifOrcamento.setVisible(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void rbtnAguardandoAprovacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAguardandoAprovacao1ActionPerformed
        statusOrcamento = 1;
    }//GEN-LAST:event_rbtnAguardandoAprovacao1ActionPerformed

    private void btnModificarOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarOrcamentoActionPerformed

        try {
            //Reconhecer a linha selecionada para pegar o id do cliente e carregar as informações do orcamento
            List<TabelaOrcamento> orcamento = oRep.listarOrcamento();
            TabelaOrcamento orcamentoSel = orcamento.get(tblOrcamentosGerais.getSelectedRow());
            //----------------------------------------------------------------------------------------------------
            //Reconhecer a linha selecionada para pegar o id do cliente e carregar as informações do orcamento
            List<TabelaOrcamentoProduto> orcamentoProduto = oRep.listarOrcamentoProduto();
            TabelaOrcamentoProduto prodSel = orcamentoProduto.get(tblOrcamentosGerais.getSelectedRow());
            //Seta as informações na tela de alteração conforme está o cadastro no BD
            txtNomeOrcamento1.setText(orcamentoSel.getNomeClienteOrcamento());
            txtObservacaoGeral1.setText(orcamentoSel.getObsGeralOrcamento());
            txtTelefoneOrcamento1.setText(orcamentoSel.getTelefoneOrcamento());
            txtCpfOuCnpjOrcamento1.setText(orcamentoSel.getCpfOuCnpjOrcamento());
            switch (orcamentoSel.getStatusOrcamento()) {
                case 1:
                    statusOrcamento = 1;
                    rbtnAguardandoAprovacao1.setSelected(true);
                    break;
                case 2:
                    statusOrcamento = 2;
                    rbtnAprovado1.setSelected(true);
                    break;
                case 3:
                    statusOrcamento = 3;
                    rbtnNaoAprovado1.setSelected(true);
                    break;
            }
            
            txtValorAdicional1.setText(orcamentoSel.getValorAdicional().toString().replace(".", ","));
            idOrcamento = orcamentoSel.getIdOrcamento();
            cxtDataOrcamento1.setDate(orcamentoSel.getDataOrcamento());
            //-----------------------------------------------------------------------------------
            txtDescricaoProd10.setText(prodSel.getDProd1());
            txtQtdProd10.setText(Integer.toString(prodSel.getQItem1()));
            txtValorUnitProd10.setText(prodSel.getPUnit1().toString().replace(".", ","));

            txtDescricaoProd11.setText(prodSel.getDProd2());
            txtQtdProd11.setText(Integer.toString(prodSel.getQItem2()));
            txtValorUnitProd11.setText(prodSel.getPUnit2().toString().replace(".", ","));

            txtDescricaoProd12.setText(prodSel.getDProd3());
            txtQtdProd12.setText(Integer.toString(prodSel.getQItem3()));
            txtValorUnitProd12.setText(prodSel.getPUnit3().toString().replace(".", ","));

            txtDescricaoProd13.setText(prodSel.getDProd4());
            txtQtdProd13.setText(Integer.toString(prodSel.getQItem4()));
            txtValorUnitProd13.setText(prodSel.getPUnit4().toString().replace(".", ","));

            txtDescricaoProd14.setText(prodSel.getDProd5());
            txtQtdProd14.setText(Integer.toString(prodSel.getQItem5()));
            txtValorUnitProd14.setText(prodSel.getPUnit5().toString().replace(".", ","));

            txtDescricaoProd15.setText(prodSel.getDProd6());
            txtQtdProd15.setText(Integer.toString(prodSel.getQItem6()));
            txtValorUnitProd15.setText(prodSel.getPUnit6().toString().replace(".", ","));

            txtDescricaoProd16.setText(prodSel.getDProd7());
            txtQtdProd16.setText(Integer.toString(prodSel.getQItem7()));
            txtValorUnitProd16.setText(prodSel.getPUnit7().toString().replace(".", ","));

            txtDescricaoProd17.setText(prodSel.getDProd8());
            txtQtdProd17.setText(Integer.toString(prodSel.getQItem8()));
            txtValorUnitProd17.setText(prodSel.getPUnit8().toString().replace(".", ","));

            txtDescricaoProd18.setText(prodSel.getDProd9());
            txtQtdProd18.setText(Integer.toString(prodSel.getQItem9()));
            txtValorUnitProd18.setText(prodSel.getPUnit9().toString().replace(".", ","));

            ModifOrcamento.setVisible(true);
            
            somatoriaModif();
            formatarMoedaModif();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Você precisa selecionar um orcamento para poder alterar.");
        }
        
        

    }//GEN-LAST:event_btnModificarOrcamentoActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        PesquisaClienteOrcamentoADD.setVisible(false);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refreshTableCliente();
        PesquisaClienteOrcamentoADD.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void limparCamposTela() {
        txtNomeOrcamento.setText("");
        txtNomeOrcamento1.setText("");
        txtTelefoneOrcamento.setText("");
        txtTelefoneOrcamento1.setText("");
        txtCpfOuCnpjOrcamento.setText("");
        txtCpfOuCnpjOrcamento1.setText("");

    }

    public void refreshTableCliente() {
        ClientesInterface cInterface = new ClientesInterface();
        tblPesquisaClienteOrcamentoAdd.setModel(cInterface);
    }

    public void refreshTableProdutos() {
        ProdutoInterface pInterface = new ProdutoInterface();
        tblProdutosOrcamento.setModel(pInterface);
    }
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        try {
            limparCamposTela();
            //Reconhecer a linha selecionada para pegar o id do forneceodr e carregar as informações do fornecedor
            List<TbClientes> cliente = cRep.listar();
            TbClientes clientesSel = cliente.get(tblPesquisaClienteOrcamentoAdd.getSelectedRow());
            //----------------------------------------------------------------------------------------------------
            //Seta as informações na tela de alteração conforme está o cadastro no BD
            txtNomeOrcamento.setText(clientesSel.getNomeCliente());
            txtNomeOrcamento1.setText(clientesSel.getNomeCliente());
            txtTelefoneOrcamento.setText(clientesSel.getTelefoneCliente());
            txtTelefoneOrcamento1.setText(clientesSel.getTelefoneCliente());
            txtCpfOuCnpjOrcamento.setText(clientesSel.getCpfCnpjCliente());
            txtCpfOuCnpjOrcamento1.setText(clientesSel.getCpfCnpjCliente());
            PesquisaClienteOrcamentoADD.setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Você precisa selecionar um cliente ");
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        numBotao = 1;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        PesquisarProdutosOrcamento.setVisible(false);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        //Reconhecer a linha selecionada para pegar o id do forneceodr e carregar as informações do fornecedor

        try {
            List<TbProdutos> produtos = pRep.listar();
            TbProdutos produtosSel = produtos.get(tblProdutosOrcamento.getSelectedRow());
            //----------------------------------------------------------------------------------------------------
            //Seta as informações na tela de alteração conforme está o cadastro no BD

            switch (numBotao) {
                case 1:
                    txtDescricaoProd1.setText(produtosSel.getNomeProd());
                    txtValorUnitProd1.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaAdd();
                    break;
                case 2:
                    txtDescricaoProd2.setText(produtosSel.getNomeProd());
                    txtValorUnitProd2.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaAdd();
                    break;
                case 3:
                    txtDescricaoProd3.setText(produtosSel.getNomeProd());
                    txtValorUnitProd3.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaAdd();
                    break;
                case 4:
                    txtDescricaoProd4.setText(produtosSel.getNomeProd());
                    txtValorUnitProd4.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaAdd();
                    break;
                case 5:
                    txtDescricaoProd5.setText(produtosSel.getNomeProd());
                    txtValorUnitProd5.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaAdd();
                    break;
                case 6:
                    txtDescricaoProd6.setText(produtosSel.getNomeProd());
                    txtValorUnitProd6.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaAdd();
                    break;
                case 7:
                    txtDescricaoProd7.setText(produtosSel.getNomeProd());
                    txtValorUnitProd7.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaAdd();
                    break;
                case 8:
                    txtDescricaoProd8.setText(produtosSel.getNomeProd());
                    txtValorUnitProd8.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaAdd();
                    break;
                case 9:
                    txtDescricaoProd9.setText(produtosSel.getNomeProd());
                    txtValorUnitProd9.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaAdd();
                    break;
                    
                case 10:
                    txtDescricaoProd10.setText(produtosSel.getNomeProd());
                    txtValorUnitProd10.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaModif();
                    break;
                    
                case 11:
                    txtDescricaoProd11.setText(produtosSel.getNomeProd());
                    txtValorUnitProd11.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaModif();
                    break;
                    
                case 12:
                    txtDescricaoProd12.setText(produtosSel.getNomeProd());
                    txtValorUnitProd12.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaModif();
                    break;
                    
                case 13:
                    txtDescricaoProd13.setText(produtosSel.getNomeProd());
                    txtValorUnitProd13.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaModif();
                    break;
                    
                case 14:
                    txtDescricaoProd14.setText(produtosSel.getNomeProd());
                    txtValorUnitProd14.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaModif();
                    break;
                    
                case 15:
                    txtDescricaoProd15.setText(produtosSel.getNomeProd());
                    txtValorUnitProd15.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaModif();
                    break;
                    
                case 16:
                    txtDescricaoProd16.setText(produtosSel.getNomeProd());
                    txtValorUnitProd16.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaModif();
                    break;
                    
                case 17:
                    txtDescricaoProd17.setText(produtosSel.getNomeProd());
                    txtValorUnitProd17.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaModif();
                    break;
                    
                case 18:
                    txtDescricaoProd18.setText(produtosSel.getNomeProd());
                    txtValorUnitProd18.setText(produtosSel.getPrecoVendaProd().toString().replace(".", ","));
                    formatarMoedaModif();
                    break;
                    
            }

            PesquisarProdutosOrcamento.setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Você precisa selecionar um cliente ");
        }

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        numBotao = 2;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        numBotao = 3;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        numBotao = 4;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        numBotao = 5;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        numBotao = 6;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        numBotao = 7;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        numBotao = 8;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        numBotao = 9;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void rbtnAprovadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAprovadoActionPerformed
        statusOrcamento = 2;
    }//GEN-LAST:event_rbtnAprovadoActionPerformed

    private void rbtnNaoAprovadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNaoAprovadoActionPerformed
        statusOrcamento = 3;
    }//GEN-LAST:event_rbtnNaoAprovadoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed



        //try {
        if (txtNomeOrcamento.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "O nome não pode estar em branco!");
        } else {
            orcamento.setNomeClienteOrcamento(txtNomeOrcamento.getText());
            orcamento.setObsGeralOrcamento(txtObservacaoGeral.getText());
            
            switch (statusOrcamento) {
                case 1:
                    orcamento.setStatusOrcamento(1);
                    break;
                case 2:
                    orcamento.setStatusOrcamento(2);
                    break;
                case 3:
                    orcamento.setStatusOrcamento(3);
                    break;
            }
            orcamento.setTelefoneOrcamento(txtTelefoneOrcamento.getText());
            orcamento.setCpfOuCnpjOrcamento(txtCpfOuCnpjOrcamento.getText());
            orcamento.setValorAdicional(BigDecimal.valueOf(Double.parseDouble(txtValorAdicional.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
            orcamento.setDataOrcamento(Date.from(Instant.now()));
            //Salvar Orçamentos Produtos daqui pra Baixo, favor não mexer em nada no código, nem tentar identar!
            orcamentoProduto.setDProd1(txtDescricaoProd1.getText());
            orcamentoProduto.setPUnit1(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd1.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
            orcamentoProduto.setQItem1(Integer.parseInt(txtQtdProd1.getText()));

            orcamentoProduto.setDProd2(txtDescricaoProd2.getText());
            orcamentoProduto.setPUnit2(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd2.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
            orcamentoProduto.setQItem2(Integer.parseInt(txtQtdProd2.getText()));

            orcamentoProduto.setDProd3(txtDescricaoProd3.getText());
            orcamentoProduto.setPUnit3(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd3.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
            orcamentoProduto.setQItem3(Integer.parseInt(txtQtdProd3.getText()));

            orcamentoProduto.setDProd4(txtDescricaoProd4.getText());
            orcamentoProduto.setPUnit4(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd4.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
            orcamentoProduto.setQItem4(Integer.parseInt(txtQtdProd4.getText()));

            orcamentoProduto.setDProd5(txtDescricaoProd5.getText());
            orcamentoProduto.setPUnit5(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd5.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
            orcamentoProduto.setQItem5(Integer.parseInt(txtQtdProd5.getText()));

            orcamentoProduto.setDProd6(txtDescricaoProd6.getText());
            orcamentoProduto.setPUnit6(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd6.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
            orcamentoProduto.setQItem6(Integer.parseInt(txtQtdProd6.getText()));

            orcamentoProduto.setDProd7(txtDescricaoProd7.getText());
            orcamentoProduto.setPUnit7(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd7.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
            orcamentoProduto.setQItem7(Integer.parseInt(txtQtdProd7.getText()));

            orcamentoProduto.setDProd8(txtDescricaoProd8.getText());
            orcamentoProduto.setPUnit8(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd8.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
            orcamentoProduto.setQItem8(Integer.parseInt(txtQtdProd8.getText()));

            orcamentoProduto.setDProd9(txtDescricaoProd9.getText());
            orcamentoProduto.setPUnit9(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd9.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
            orcamentoProduto.setQItem9(Integer.parseInt(txtQtdProd9.getText()));

            oRep.salvarAddOrcamento(orcamento);
            oRep.salvarAddOrcamentoProduto(orcamentoProduto);
            JOptionPane.showMessageDialog(rootPane, "Orçamento cadastrado com sucesso!");
            //fecha JDaialog
            AddOrcamento.setVisible(false);
            refreshTable();
            limparCamposTela();
        }

        //} catch (Exception e) {
        //}
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed

        formatarMoedaModif();

        try {

            if (txtNomeOrcamento1.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "O nome não pode estar em branco!");
            } else {
                orcamento.setNomeClienteOrcamento(txtNomeOrcamento1.getText());
                orcamento.setObsGeralOrcamento(txtObservacaoGeral1.getText());
                switch (statusOrcamento) {
                    case 1:
                        orcamento.setStatusOrcamento(1);
                        break;
                    case 2:
                        orcamento.setStatusOrcamento(2);
                        break;
                    case 3:
                        orcamento.setStatusOrcamento(3);
                        break;
                }
                orcamento.setTelefoneOrcamento(txtTelefoneOrcamento1.getText());
                orcamento.setCpfOuCnpjOrcamento(txtCpfOuCnpjOrcamento1.getText());
                orcamento.setIdOrcamento(idOrcamento);
                orcamento.setValorAdicional(BigDecimal.valueOf(Double.parseDouble(txtValorAdicional1.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
                orcamento.setDataOrcamento(Date.from(Instant.now()));
                //Salvar Orçamentos Produtos daqui pra Baixo, favor não mexer em nada no código, nem tentar identar!
                orcamentoProduto.setDProd1(txtDescricaoProd10.getText());
                orcamentoProduto.setPUnit1(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd10.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
                orcamentoProduto.setQItem1(Integer.parseInt(txtQtdProd10.getText()));

                orcamentoProduto.setDProd2(txtDescricaoProd11.getText());
                orcamentoProduto.setPUnit2(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd11.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
                orcamentoProduto.setQItem2(Integer.parseInt(txtQtdProd11.getText()));

                orcamentoProduto.setDProd3(txtDescricaoProd12.getText());
                orcamentoProduto.setPUnit3(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd12.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
                orcamentoProduto.setQItem3(Integer.parseInt(txtQtdProd12.getText()));

                orcamentoProduto.setDProd4(txtDescricaoProd13.getText());
                orcamentoProduto.setPUnit4(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd13.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
                orcamentoProduto.setQItem4(Integer.parseInt(txtQtdProd13.getText()));

                orcamentoProduto.setDProd5(txtDescricaoProd14.getText());
                orcamentoProduto.setPUnit5(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd14.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
                orcamentoProduto.setQItem5(Integer.parseInt(txtQtdProd14.getText()));

                orcamentoProduto.setDProd6(txtDescricaoProd15.getText());
                orcamentoProduto.setPUnit6(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd15.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
                orcamentoProduto.setQItem6(Integer.parseInt(txtQtdProd15.getText()));

                orcamentoProduto.setDProd7(txtDescricaoProd16.getText());
                orcamentoProduto.setPUnit7(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd16.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
                orcamentoProduto.setQItem7(Integer.parseInt(txtQtdProd16.getText()));

                orcamentoProduto.setDProd8(txtDescricaoProd17.getText());
                orcamentoProduto.setPUnit8(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd17.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
                orcamentoProduto.setQItem8(Integer.parseInt(txtQtdProd17.getText()));

                orcamentoProduto.setDProd9(txtDescricaoProd18.getText());
                orcamentoProduto.setPUnit9(BigDecimal.valueOf(Double.parseDouble(txtValorUnitProd18.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."))));
                orcamentoProduto.setQItem9(Integer.parseInt(txtQtdProd18.getText()));
                orcamentoProduto.setIdOrcamento(idOrcamento);

                oRep.salvarModifOrcamento(orcamento);
                oRep.salvarModifOrcamentoProduto(orcamentoProduto);
                JOptionPane.showMessageDialog(rootPane, "Orçamento Alterado com Sucesso!");
                ModifOrcamento.setVisible(false);
                refreshTable();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Verifique as informações inseridas!");
        }


    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void rbtnAprovado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAprovado1ActionPerformed
        statusOrcamento = 2;
    }//GEN-LAST:event_rbtnAprovado1ActionPerformed

    private void rbtnNaoAprovado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNaoAprovado1ActionPerformed
        statusOrcamento = 3;
    }//GEN-LAST:event_rbtnNaoAprovado1ActionPerformed

    public void formatarMoedaAdd() {
        String tx1 = txtValorUnitProd1.getText();
        String valorSemFormatacao1 = tx1.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor1 = new BigDecimal(valorSemFormatacao1);
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado1 = nf1.format(valor1);
        txtValorUnitProd1.setText(valorFormatado1);

        String tx2 = txtValorUnitProd2.getText();
        String valorSemFormatacao2 = tx2.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor2 = new BigDecimal(valorSemFormatacao2);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado2 = nf2.format(valor2);
        txtValorUnitProd2.setText(valorFormatado2);

        String tx3 = txtValorUnitProd3.getText();
        String valorSemFormatacao3 = tx3.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor3 = new BigDecimal(valorSemFormatacao3);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado3 = nf3.format(valor3);
        txtValorUnitProd3.setText(valorFormatado3);

        String tx4 = txtValorUnitProd4.getText();
        String valorSemFormatacao4 = tx4.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor4 = new BigDecimal(valorSemFormatacao4);
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado4 = nf4.format(valor4);
        txtValorUnitProd4.setText(valorFormatado4);

        String tx6 = txtValorUnitProd6.getText();
        String valorSemFormatacao6 = tx6.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor6 = new BigDecimal(valorSemFormatacao6);
        NumberFormat nf6 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado6 = nf6.format(valor6);
        txtValorUnitProd6.setText(valorFormatado6);

        String tx5 = txtValorUnitProd5.getText();
        String valorSemFormatacao5 = tx5.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor5 = new BigDecimal(valorSemFormatacao5);
        NumberFormat nf5 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado5 = nf5.format(valor5);
        txtValorUnitProd5.setText(valorFormatado5);

        String tx7 = txtValorUnitProd7.getText();
        String valorSemFormatacao7 = tx7.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor7 = new BigDecimal(valorSemFormatacao7);
        NumberFormat nf7 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado7 = nf7.format(valor7);
        txtValorUnitProd7.setText(valorFormatado7);

        String tx8 = txtValorUnitProd8.getText();
        String valorSemFormatacao8 = tx8.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor8 = new BigDecimal(valorSemFormatacao8);
        NumberFormat nf8 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado8 = nf8.format(valor8);
        txtValorUnitProd8.setText(valorFormatado8);

        String tx9 = txtValorUnitProd9.getText();
        String valorSemFormatacao9 = tx9.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor9 = new BigDecimal(valorSemFormatacao9);
        NumberFormat nf9 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado9 = nf9.format(valor9);
        txtValorUnitProd9.setText(valorFormatado9);
        
        String adc = txtValorAdicional.getText();
        String valorSemFormatacaoAdc = adc.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valorAdc = new BigDecimal(valorSemFormatacaoAdc);
        NumberFormat nfAdc = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatadoAdc = nfAdc.format(valorAdc);
        txtValorAdicional.setText(valorFormatadoAdc);
    }
    
    private void formatarMoedaModif() {
                
        String tx10 = txtValorUnitProd10.getText();
        String valorSemFormatacao10 = tx10.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor10 = new BigDecimal(valorSemFormatacao10);
        NumberFormat nf10 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado10 = nf10.format(valor10);
        txtValorUnitProd10.setText(valorFormatado10);

        String tx11 = txtValorUnitProd11.getText();
        String valorSemFormatacao11 = tx11.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor11 = new BigDecimal(valorSemFormatacao11);
        NumberFormat nf11 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado11 = nf11.format(valor11);
        txtValorUnitProd11.setText(valorFormatado11);

        String tx12 = txtValorUnitProd12.getText();
        String valorSemFormatacao12 = tx12.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor12 = new BigDecimal(valorSemFormatacao12);
        NumberFormat nf12 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado12 = nf12.format(valor12);
        txtValorUnitProd12.setText(valorFormatado12);

        String tx13 = txtValorUnitProd13.getText();
        String valorSemFormatacao13 = tx13.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor13 = new BigDecimal(valorSemFormatacao13);
        NumberFormat nf13 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado13 = nf13.format(valor13);
        txtValorUnitProd13.setText(valorFormatado13);

        String tx15 = txtValorUnitProd15.getText();
        String valorSemFormatacao15 = tx15.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor15 = new BigDecimal(valorSemFormatacao15);
        NumberFormat nf15 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado15 = nf15.format(valor15);
        txtValorUnitProd15.setText(valorFormatado15);

        String tx14 = txtValorUnitProd14.getText();
        String valorSemFormatacao14 = tx14.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor14 = new BigDecimal(valorSemFormatacao14);
        NumberFormat nf14 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado14 = nf14.format(valor14);
        txtValorUnitProd14.setText(valorFormatado14);

        String tx16 = txtValorUnitProd16.getText();
        String valorSemFormatacao16 = tx16.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor16 = new BigDecimal(valorSemFormatacao16);
        NumberFormat nf16 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado16 = nf16.format(valor16);
        txtValorUnitProd16.setText(valorFormatado16);

        String tx17 = txtValorUnitProd17.getText();
        String valorSemFormatacao17 = tx17.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor17 = new BigDecimal(valorSemFormatacao17);
        NumberFormat nf17 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado17 = nf17.format(valor17);
        txtValorUnitProd17.setText(valorFormatado17);

        String tx18 = txtValorUnitProd18.getText();
        String valorSemFormatacao18 = tx18.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valor18 = new BigDecimal(valorSemFormatacao18);
        NumberFormat nf18 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatado18 = nf18.format(valor18);
        txtValorUnitProd18.setText(valorFormatado18);
           
        String adc1 = txtValorAdicional1.getText();
        String valorSemFormatacaoAdc1 = adc1.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal valorAdc1 = new BigDecimal(valorSemFormatacaoAdc1);
        NumberFormat nfAdc1 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorFormatadoAdc1 = nfAdc1.format(valorAdc1);
        txtValorAdicional1.setText(valorFormatadoAdc1);
    }
    
    private void txtValorUnitProd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd1FocusLost
        formatarMoedaAdd();
        somatoriaAdd();
    }//GEN-LAST:event_txtValorUnitProd1FocusLost

    private void txtValorUnitProd2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd2FocusLost
        formatarMoedaAdd();
        somatoriaAdd();
    }//GEN-LAST:event_txtValorUnitProd2FocusLost

    private void txtValorUnitProd3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd3FocusLost
        formatarMoedaAdd();
        somatoriaAdd();
    }//GEN-LAST:event_txtValorUnitProd3FocusLost

    private void txtValorUnitProd4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd4FocusLost
        formatarMoedaAdd();
        somatoriaAdd();
    }//GEN-LAST:event_txtValorUnitProd4FocusLost

    private void txtValorUnitProd6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd6FocusLost
        formatarMoedaAdd();
        somatoriaAdd();
    }//GEN-LAST:event_txtValorUnitProd6FocusLost

    private void txtValorUnitProd5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd5FocusLost
        formatarMoedaAdd();
        somatoriaAdd();
    }//GEN-LAST:event_txtValorUnitProd5FocusLost

    private void txtValorUnitProd7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd7FocusLost
        formatarMoedaAdd();
        somatoriaAdd();
    }//GEN-LAST:event_txtValorUnitProd7FocusLost

    private void txtValorUnitProd8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd8FocusLost
        formatarMoedaAdd();
        somatoriaAdd();
    }//GEN-LAST:event_txtValorUnitProd8FocusLost

    private void txtValorUnitProd9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd9FocusLost
        formatarMoedaAdd();
        somatoriaAdd();
    }//GEN-LAST:event_txtValorUnitProd9FocusLost

    private void txtValorUnitProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitProd1ActionPerformed

    }//GEN-LAST:event_txtValorUnitProd1ActionPerformed

    private void txtValorUnitProd10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd10FocusLost
        formatarMoedaModif();
        somatoriaModif();
    }//GEN-LAST:event_txtValorUnitProd10FocusLost

    private void txtValorUnitProd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitProd10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnitProd10ActionPerformed

    private void txtValorUnitProd11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd11FocusLost
        formatarMoedaModif();
        somatoriaModif();
    }//GEN-LAST:event_txtValorUnitProd11FocusLost

    private void txtValorUnitProd12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd12FocusLost
        formatarMoedaModif();
        somatoriaModif();
    }//GEN-LAST:event_txtValorUnitProd12FocusLost

    private void txtValorUnitProd13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd13FocusLost
        formatarMoedaModif();
        somatoriaModif();
    }//GEN-LAST:event_txtValorUnitProd13FocusLost

    private void txtValorUnitProd15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd15FocusLost
        formatarMoedaModif();
        somatoriaModif();
    }//GEN-LAST:event_txtValorUnitProd15FocusLost

    private void txtValorUnitProd14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd14FocusLost
        formatarMoedaModif();
        somatoriaModif();
    }//GEN-LAST:event_txtValorUnitProd14FocusLost

    private void txtValorUnitProd16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd16FocusLost
        formatarMoedaModif();
        somatoriaModif();
    }//GEN-LAST:event_txtValorUnitProd16FocusLost

    private void txtValorUnitProd17FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd17FocusLost
        formatarMoedaModif();
        somatoriaModif();
    }//GEN-LAST:event_txtValorUnitProd17FocusLost

    private void txtValorUnitProd18FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitProd18FocusLost
        formatarMoedaModif();
        somatoriaModif();
    }//GEN-LAST:event_txtValorUnitProd18FocusLost

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        numBotao = 10;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        numBotao = 11;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        numBotao = 12;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        numBotao = 13;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        numBotao = 14;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        numBotao = 15;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        numBotao = 16;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        numBotao = 17;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        numBotao = 18;
        refreshTableProdutos();
        PesquisarProdutosOrcamento.setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        refreshTableCliente();
        PesquisaClienteOrcamentoADD.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed
        
    private void somatoriaAdd() {

        valorQnt = Double.parseDouble(txtQtdProd1.getText())  * Double.parseDouble(txtValorUnitProd1.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd1.setText("R$ " + valorQnt);
        
        valorQnt1 = Double.parseDouble(txtQtdProd2.getText())  * Double.parseDouble(txtValorUnitProd2.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd2.setText("R$ " + valorQnt1);
        
        valorQnt2 = Double.parseDouble(txtQtdProd3.getText())  * Double.parseDouble(txtValorUnitProd3.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd3.setText("R$ " + valorQnt2);
        
        valorQnt3 = Double.parseDouble(txtQtdProd4.getText())  * Double.parseDouble(txtValorUnitProd4.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd4.setText("R$ " + valorQnt3);
        
        valorQnt4 = Double.parseDouble(txtQtdProd5.getText())  * Double.parseDouble(txtValorUnitProd5.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd5.setText("R$ " + valorQnt4);
        
        valorQnt5 = Double.parseDouble(txtQtdProd6.getText())  * Double.parseDouble(txtValorUnitProd6.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd6.setText("R$ " + valorQnt5);
        
        valorQnt6 = Double.parseDouble(txtQtdProd7.getText())  * Double.parseDouble(txtValorUnitProd7.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd7.setText("R$ " + valorQnt6);
        
        valorQnt7 = Double.parseDouble(txtQtdProd8.getText())  * Double.parseDouble(txtValorUnitProd8.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd8.setText("R$ " + valorQnt7);
        
        valorQnt8 = Double.parseDouble(txtQtdProd9.getText())  * Double.parseDouble(txtValorUnitProd9.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd9.setText("R$ " + valorQnt8);
        
        
        v1 = Double.parseDouble(txtDValorTotalProd1.getText().replace("R$", "").replace(",", "."));
        v2 = Double.parseDouble(txtDValorTotalProd2.getText().replace("R$", "").replace(",", "."));
        v3 = Double.parseDouble(txtDValorTotalProd3.getText().replace("R$", "").replace(",", "."));
        v4 = Double.parseDouble(txtDValorTotalProd4.getText().replace("R$", "").replace(",", "."));
        v5 = Double.parseDouble(txtDValorTotalProd5.getText().replace("R$", "").replace(",", "."));
        v6 = Double.parseDouble(txtDValorTotalProd6.getText().replace("R$", "").replace(",", "."));
        v7 = Double.parseDouble(txtDValorTotalProd7.getText().replace("R$", "").replace(",", "."));
        v8 = Double.parseDouble(txtDValorTotalProd8.getText().replace("R$", "").replace(",", "."));
        v9 = Double.parseDouble(txtDValorTotalProd9.getText().replace("R$", "").replace(",", "."));
        
        //valorTotal = Double.parseDouble(txtDValorTotalProd1.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd2.getText().replace("R$", "").replace(",", ".") + Double.parseDouble(txtDValorTotalProd3.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd4.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd5.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd6.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd7.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd8.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd9.getText().replace("R$", "").replace(",", ".")));
        valorTotal = v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8 + v9;
        txtValorTotalProdutos.setText("R$ " + valorTotal);
        
        valorTotalOrcamento = Double.parseDouble(txtValorTotalProdutos.getText().replace("R$", "").replace(" ", "").replace(",", ".")) + Double.parseDouble(txtValorAdicional.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtValorTotalOrcamento.setText("R$ " + valorTotalOrcamento);
 

    }
    
    private void somatoriaModif() {
        valorQnt9 = Double.parseDouble(txtQtdProd10.getText())  * Double.parseDouble(txtValorUnitProd10.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd10.setText("R$ " + valorQnt9);
        
        valorQnt10 = Double.parseDouble(txtQtdProd11.getText())  * Double.parseDouble(txtValorUnitProd11.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd11.setText("R$ " + valorQnt10);
        
        valorQnt11 = Double.parseDouble(txtQtdProd12.getText())  * Double.parseDouble(txtValorUnitProd12.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd12.setText("R$ " + valorQnt11);
        
        valorQnt12 = Double.parseDouble(txtQtdProd13.getText())  * Double.parseDouble(txtValorUnitProd13.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd13.setText("R$ " + valorQnt12);
        
        valorQnt13 = Double.parseDouble(txtQtdProd14.getText())  * Double.parseDouble(txtValorUnitProd14.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd14.setText("R$ " + valorQnt13);
        
        valorQnt14 = Double.parseDouble(txtQtdProd15.getText())  * Double.parseDouble(txtValorUnitProd15.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd15.setText("R$ " + valorQnt14);
        
        valorQnt15 = Double.parseDouble(txtQtdProd16.getText())  * Double.parseDouble(txtValorUnitProd16.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd16.setText("R$ " + valorQnt15);
        
        valorQnt16 = Double.parseDouble(txtQtdProd17.getText())  * Double.parseDouble(txtValorUnitProd17.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd17.setText("R$ " + valorQnt16);
        
        valorQnt17 = Double.parseDouble(txtQtdProd18.getText())  * Double.parseDouble(txtValorUnitProd18.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtDValorTotalProd18.setText("R$ " + valorQnt17);
        
        
        v10 = Double.parseDouble(txtDValorTotalProd10.getText().replace("R$", "").replace(",", "."));
        v11 = Double.parseDouble(txtDValorTotalProd11.getText().replace("R$", "").replace(",", "."));
        v12 = Double.parseDouble(txtDValorTotalProd12.getText().replace("R$", "").replace(",", "."));
        v13 = Double.parseDouble(txtDValorTotalProd13.getText().replace("R$", "").replace(",", "."));
        v14 = Double.parseDouble(txtDValorTotalProd14.getText().replace("R$", "").replace(",", "."));
        v15 = Double.parseDouble(txtDValorTotalProd15.getText().replace("R$", "").replace(",", "."));
        v16 = Double.parseDouble(txtDValorTotalProd16.getText().replace("R$", "").replace(",", "."));
        v17 = Double.parseDouble(txtDValorTotalProd17.getText().replace("R$", "").replace(",", "."));
        v18 = Double.parseDouble(txtDValorTotalProd18.getText().replace("R$", "").replace(",", "."));
        
        //valorTotal = Double.parseDouble(txtDValorTotalProd1.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd2.getText().replace("R$", "").replace(",", ".") + Double.parseDouble(txtDValorTotalProd3.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd4.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd5.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd6.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd7.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd8.getText().replace("R$", "").replace(",", ".")) + Double.parseDouble(txtDValorTotalProd9.getText().replace("R$", "").replace(",", ".")));
        valorTotal1 = v10 + v11 + v12 + v13 + v14 + v15 + v16 + v17 + v18;
        txtValorTotalProdutos1.setText("R$ " + valorTotal1);
        
        valorTotalOrcamento1 = Double.parseDouble(txtValorTotalProdutos1.getText().replace("R$", "").replace(" ", "").replace(",", ".")) + Double.parseDouble(txtValorAdicional1.getText().replace("R$", "").replace(" ", "").replace(".", "").replace(",", "."));
        txtValorTotalOrcamento1.setText("R$ " + valorTotalOrcamento1);
    }
    
    private void txtQtdProd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd1FocusLost
        somatoriaAdd();
    }//GEN-LAST:event_txtQtdProd1FocusLost

    private void txtQtdProd2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd2FocusLost
        somatoriaAdd();
    }//GEN-LAST:event_txtQtdProd2FocusLost

    private void txtValorAdicionalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorAdicionalFocusLost
        formatarMoedaAdd();
        somatoriaAdd();
    }//GEN-LAST:event_txtValorAdicionalFocusLost

    private void txtValorAdicionalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorAdicionalFocusGained
        formatarMoedaAdd();
        somatoriaAdd();
    }//GEN-LAST:event_txtValorAdicionalFocusGained

    private void txtQtdProd3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd3FocusLost
        somatoriaAdd();
    }//GEN-LAST:event_txtQtdProd3FocusLost

    private void txtQtdProd4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd4FocusLost
        somatoriaAdd();
    }//GEN-LAST:event_txtQtdProd4FocusLost

    private void txtQtdProd5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd5FocusLost
        somatoriaAdd();
    }//GEN-LAST:event_txtQtdProd5FocusLost

    private void txtQtdProd6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd6FocusLost
        somatoriaAdd();
    }//GEN-LAST:event_txtQtdProd6FocusLost

    private void txtQtdProd7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd7FocusLost
        somatoriaAdd();
    }//GEN-LAST:event_txtQtdProd7FocusLost

    private void txtQtdProd8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd8FocusLost
        somatoriaAdd();
    }//GEN-LAST:event_txtQtdProd8FocusLost

    private void txtQtdProd9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd9FocusLost
        somatoriaAdd();
    }//GEN-LAST:event_txtQtdProd9FocusLost

    private void txtQtdProd10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd10FocusLost
        somatoriaModif();
    }//GEN-LAST:event_txtQtdProd10FocusLost

    private void txtQtdProd11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd11FocusLost
        somatoriaModif();
    }//GEN-LAST:event_txtQtdProd11FocusLost

    private void txtQtdProd12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd12FocusLost
        somatoriaModif();
    }//GEN-LAST:event_txtQtdProd12FocusLost

    private void txtQtdProd13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd13FocusLost
        somatoriaModif();
    }//GEN-LAST:event_txtQtdProd13FocusLost

    private void txtQtdProd14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd14FocusLost
        somatoriaModif();
    }//GEN-LAST:event_txtQtdProd14FocusLost

    private void txtQtdProd15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd15FocusLost
        somatoriaModif();
    }//GEN-LAST:event_txtQtdProd15FocusLost

    private void txtQtdProd16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd16FocusLost
        somatoriaModif();
    }//GEN-LAST:event_txtQtdProd16FocusLost

    private void txtQtdProd17FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd17FocusLost
        somatoriaModif();
    }//GEN-LAST:event_txtQtdProd17FocusLost

    private void txtQtdProd18FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdProd18FocusLost
        somatoriaModif();
    }//GEN-LAST:event_txtQtdProd18FocusLost

    private void txtValorAdicional1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorAdicional1FocusLost
        formatarMoedaModif();
        somatoriaModif();
    }//GEN-LAST:event_txtValorAdicional1FocusLost

    private void txtValorAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorAdicionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorAdicionalActionPerformed

    private void txtNomeOrcamento1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeOrcamento1FocusGained

    }//GEN-LAST:event_txtNomeOrcamento1FocusGained

    private void ModifOrcamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ModifOrcamentoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifOrcamentoFocusLost

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
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TelaOrcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AddOrcamento;
    private javax.swing.ButtonGroup GrupoSituação;
    private javax.swing.JDialog ModifOrcamento;
    private javax.swing.JDialog PesquisaClienteOrcamentoADD;
    private javax.swing.JDialog PesquisarProdutosOrcamento;
    private javax.swing.JButton btnAdicionarOrcamento;
    private javax.swing.JButton btnExcluirOrcamento;
    private javax.swing.JButton btnFecharJanelaOrcamento;
    private javax.swing.JButton btnModificarOrcamento;
    private javax.swing.JButton btnPesquisarOrcamento;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> cbxFiltroOrcamento;
    private javax.swing.JComboBox<String> cbxFiltroOrcamento1;
    private com.toedter.calendar.JDateChooser cxtDataOrcamento;
    private com.toedter.calendar.JDateChooser cxtDataOrcamento1;
    private javax.swing.JTextField cxtPesquisarOrcamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton rbtnAguardandoAprovacao;
    private javax.swing.JRadioButton rbtnAguardandoAprovacao1;
    private javax.swing.JRadioButton rbtnAprovado;
    private javax.swing.JRadioButton rbtnAprovado1;
    private javax.swing.JRadioButton rbtnNaoAprovado;
    private javax.swing.JRadioButton rbtnNaoAprovado1;
    private javax.swing.JTable tblOrcamentosGerais;
    private javax.swing.JTable tblPesquisaClienteOrcamentoAdd;
    private javax.swing.JTable tblProdutosOrcamento;
    private javax.swing.JLabel txtClientes6;
    private javax.swing.JLabel txtClientes7;
    private javax.swing.JTextField txtCpfOuCnpjOrcamento;
    private javax.swing.JTextField txtCpfOuCnpjOrcamento1;
    private javax.swing.JTextField txtDValorTotalProd1;
    private javax.swing.JTextField txtDValorTotalProd10;
    private javax.swing.JTextField txtDValorTotalProd11;
    private javax.swing.JTextField txtDValorTotalProd12;
    private javax.swing.JTextField txtDValorTotalProd13;
    private javax.swing.JTextField txtDValorTotalProd14;
    private javax.swing.JTextField txtDValorTotalProd15;
    private javax.swing.JTextField txtDValorTotalProd16;
    private javax.swing.JTextField txtDValorTotalProd17;
    private javax.swing.JTextField txtDValorTotalProd18;
    private javax.swing.JTextField txtDValorTotalProd2;
    private javax.swing.JTextField txtDValorTotalProd3;
    private javax.swing.JTextField txtDValorTotalProd4;
    private javax.swing.JTextField txtDValorTotalProd5;
    private javax.swing.JTextField txtDValorTotalProd6;
    private javax.swing.JTextField txtDValorTotalProd7;
    private javax.swing.JTextField txtDValorTotalProd8;
    private javax.swing.JTextField txtDValorTotalProd9;
    private javax.swing.JTextField txtDescricaoProd1;
    private javax.swing.JTextField txtDescricaoProd10;
    private javax.swing.JTextField txtDescricaoProd11;
    private javax.swing.JTextField txtDescricaoProd12;
    private javax.swing.JTextField txtDescricaoProd13;
    private javax.swing.JTextField txtDescricaoProd14;
    private javax.swing.JTextField txtDescricaoProd15;
    private javax.swing.JTextField txtDescricaoProd16;
    private javax.swing.JTextField txtDescricaoProd17;
    private javax.swing.JTextField txtDescricaoProd18;
    private javax.swing.JTextField txtDescricaoProd2;
    private javax.swing.JTextField txtDescricaoProd3;
    private javax.swing.JTextField txtDescricaoProd4;
    private javax.swing.JTextField txtDescricaoProd5;
    private javax.swing.JTextField txtDescricaoProd6;
    private javax.swing.JTextField txtDescricaoProd7;
    private javax.swing.JTextField txtDescricaoProd8;
    private javax.swing.JTextField txtDescricaoProd9;
    private javax.swing.JTextField txtNomeOrcamento;
    private javax.swing.JTextField txtNomeOrcamento1;
    private javax.swing.JTextArea txtObservacaoGeral;
    private javax.swing.JTextArea txtObservacaoGeral1;
    private javax.swing.JLabel txtOrcamento;
    private javax.swing.JLabel txtPesquisarOrcamento;
    private javax.swing.JTextField txtQtdProd1;
    private javax.swing.JTextField txtQtdProd10;
    private javax.swing.JTextField txtQtdProd11;
    private javax.swing.JTextField txtQtdProd12;
    private javax.swing.JTextField txtQtdProd13;
    private javax.swing.JTextField txtQtdProd14;
    private javax.swing.JTextField txtQtdProd15;
    private javax.swing.JTextField txtQtdProd16;
    private javax.swing.JTextField txtQtdProd17;
    private javax.swing.JTextField txtQtdProd18;
    private javax.swing.JTextField txtQtdProd2;
    private javax.swing.JTextField txtQtdProd3;
    private javax.swing.JTextField txtQtdProd4;
    private javax.swing.JTextField txtQtdProd5;
    private javax.swing.JTextField txtQtdProd6;
    private javax.swing.JTextField txtQtdProd7;
    private javax.swing.JTextField txtQtdProd8;
    private javax.swing.JTextField txtQtdProd9;
    private javax.swing.JFormattedTextField txtTelefoneOrcamento;
    private javax.swing.JFormattedTextField txtTelefoneOrcamento1;
    private javax.swing.JTextField txtValorAdicional;
    private javax.swing.JTextField txtValorAdicional1;
    private javax.swing.JTextField txtValorTotalOrcamento;
    private javax.swing.JTextField txtValorTotalOrcamento1;
    private javax.swing.JTextField txtValorTotalProdutos;
    private javax.swing.JTextField txtValorTotalProdutos1;
    private javax.swing.JFormattedTextField txtValorUnitProd1;
    private javax.swing.JFormattedTextField txtValorUnitProd10;
    private javax.swing.JFormattedTextField txtValorUnitProd11;
    private javax.swing.JFormattedTextField txtValorUnitProd12;
    private javax.swing.JFormattedTextField txtValorUnitProd13;
    private javax.swing.JFormattedTextField txtValorUnitProd14;
    private javax.swing.JFormattedTextField txtValorUnitProd15;
    private javax.swing.JFormattedTextField txtValorUnitProd16;
    private javax.swing.JFormattedTextField txtValorUnitProd17;
    private javax.swing.JFormattedTextField txtValorUnitProd18;
    private javax.swing.JFormattedTextField txtValorUnitProd2;
    private javax.swing.JFormattedTextField txtValorUnitProd3;
    private javax.swing.JFormattedTextField txtValorUnitProd4;
    private javax.swing.JFormattedTextField txtValorUnitProd5;
    private javax.swing.JFormattedTextField txtValorUnitProd6;
    private javax.swing.JFormattedTextField txtValorUnitProd7;
    private javax.swing.JFormattedTextField txtValorUnitProd8;
    private javax.swing.JFormattedTextField txtValorUnitProd9;
    // End of variables declaration//GEN-END:variables
}
