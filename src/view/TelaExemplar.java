/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import banco.ExemplarBanco;
import banco.Conexao;
import interfaces.Dependente;
import interfaces.Parente;
import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ItemBuscaExemplar;
import model.Livro;

/**
 *
 * @author Marcelo Moreira
 */
public class TelaExemplar extends javax.swing.JFrame implements Dependente, Parente{
    private Parente parent;
    private ExemplarBanco ceb;
    private Livro livro;
    private String modo;
    private ItemBuscaExemplar exemplar;
        
    /**
     * Creates new form CadExemplar
     */
    public TelaExemplar() {
        initComponents();
        URL url = this.getClass().getResource("images/lupa.png");
        Icon icon = new ImageIcon(url);
        btnBuscarLivro.setIcon(icon);
        ceb = new ExemplarBanco(Conexao.getConexao());
    }
    
    public TelaExemplar(Parente parent){
        this();
        this.parent = parent;
        this.setIconImage(parent.getIcone());
        restaurarTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdLivro = new javax.swing.JTextField();
        txtCodBarras = new javax.swing.JTextField();
        btnBuscarLivro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtIDExemplar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDataCadastro = new javax.swing.JTextField();
        btnConfirmar = new java.awt.Button();
        btnCancelar = new java.awt.Button();
        btnBuscar = new java.awt.Button();
        btnNovo = new java.awt.Button();
        btnAtualizar = new java.awt.Button();
        btnExcluir = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exemplar");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("ID Livro:*");

        jLabel2.setText("Codigo de Barras:");

        txtIdLivro.setEnabled(false);
        txtIdLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdLivroKeyPressed(evt);
            }
        });

        txtCodBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodBarrasKeyPressed(evt);
            }
        });

        btnBuscarLivro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarLivro.setEnabled(false);
        btnBuscarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLivroActionPerformed(evt);
            }
        });

        jLabel3.setText("ID Exemplar:");

        txtIDExemplar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtIDExemplar.setEnabled(false);

        jLabel4.setText("Data de Cadastro:");

        txtDataCadastro.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtIdLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(txtIDExemplar))
                                    .addComponent(jLabel3))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataCadastro))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCodBarras))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBuscarLivro, txtIdLivro});

        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.setLabel("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setLabel("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscar.setLabel("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNovo.setLabel("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAtualizar.setLabel("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setLabel("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAtualizar, btnBuscar, btnCancelar, btnConfirmar, btnExcluir, btnNovo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAtualizar, btnBuscar, btnCancelar, btnConfirmar, btnExcluir, btnNovo});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        parent.setEstadoAtivacao(true);
        restaurarTela();
    }//GEN-LAST:event_formWindowClosing

    private void btnBuscarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLivroActionPerformed
        BuscaLivro b = new BuscaLivro(this);
        setEnabled(false);
        b.setVisible(true);
    }//GEN-LAST:event_btnBuscarLivroActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        realizarAcao();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtCodBarrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodBarrasKeyPressed
        if(evt.getKeyCode() == 10){
            realizarAcao();
        }
    }//GEN-LAST:event_txtCodBarrasKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Realmente deseja cancelar?", "Cancelar Operação", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            restaurarTela();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIdLivroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdLivroKeyPressed
        if(evt.getKeyCode() == 10){
            if(txtIdLivro.getText().equals("")){
                //chama tela buscar Livro
            }else{
                txtCodBarras.requestFocus();
            }
        }
    }//GEN-LAST:event_txtIdLivroKeyPressed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        camposNovo();
        modo = "novo";
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscaExemplar b = new BuscaExemplar(this);
        setEnabled(false);
        b.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        modo = "atualizar";
        camposAtualizar();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o exemplar?", "Excluir Exemplar", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            if(!exemplar.getSituacaoExemplar().equals("Emprestado")){
                excluir();
            }else{
                JOptionPane.showMessageDialog(null, "O exemplar está emprestado, aguarde a devolução do mesmo para efetuar a exclusão!", "Exemplar está emprestado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void excluir(){
        int id = Integer.parseInt(txtIDExemplar.getText());
        boolean resul = ceb.excluirExemplar(id);
        if(resul){
            JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!", "Exclusão efetuada", JOptionPane.INFORMATION_MESSAGE);
            restaurarTela();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir o livro!", "Erro na exclusão", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void camposAtualizar(){
        txtCodBarras.setEditable(true);
        btnAtualizar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnConfirmar.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnNovo.setEnabled(false);
        txtCodBarras.requestFocus();
    }
    
    private void camposBuscado(){
        txtIDExemplar.setEnabled(false);
        txtDataCadastro.setEnabled(false);
        txtIdLivro.setEnabled(false);
        txtCodBarras.setEditable(false);
        btnBuscarLivro.setEnabled(false);
        btnAtualizar.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnConfirmar.setEnabled(false);
        btnExcluir.setEnabled(true);
        btnNovo.setEnabled(true);
    }
    
    private void camposNovo(){
        limparCampos();
        txtCodBarras.setEditable(true);
        btnBuscarLivro.setEnabled(true);
        btnConfirmar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnAtualizar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnNovo.setEnabled(false);
    }
    
    private void realizarAcao(){
        if(modo.equals("novo")){
            cadastrar();
        }else if(modo.equals("atualizar")){
            atualizar();
        }
    }
    
    private void atualizar(){
        boolean resu = ceb.atualizarExemplar(Integer.parseInt(txtIDExemplar.getText()), txtCodBarras.getText());
        if(resu){
            JOptionPane.showMessageDialog(null, "Atualização de dados realizada com sucesso!", "Atualização efetuada", JOptionPane.INFORMATION_MESSAGE);
            restaurarTela();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar a atualização dos dados!\nO código de barras requisitado pode ja está cadastrado no sistema", "Atualização não efetuada", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    private void cadastrar(){
        if(!txtIdLivro.getText().equals("")){
            boolean resu = ceb.cadastrarExemplar(Integer.parseInt(txtIdLivro.getText()), txtCodBarras.getText());
            if (resu) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);
                restaurarTela();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao tentar realizar o cadastro!\nO código de barras requisitado pode ja está cadastrado no sistema", "Cadastro não efetuado", JOptionPane.ERROR_MESSAGE);
            }
            limparCampos();
        }else{
            JOptionPane.showMessageDialog(null, "O campo id do livro é obrigatório!", "Campos vazios", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void restaurarTela(){
        limparCampos();
        txtIDExemplar.setEnabled(false);
        txtDataCadastro.setEnabled(false);
        txtIdLivro.setEnabled(false);
        btnBuscarLivro.setEnabled(false);
        txtCodBarras.setEditable(false);
        btnAtualizar.setEnabled(false);
        btnBuscar.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnConfirmar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnNovo.setEnabled(true);
        modo = null;
    }
    
    private void limparCampos(){
        txtIdLivro.setText("");
        txtCodBarras.setText("");
        txtIDExemplar.setText("");
        txtDataCadastro.setText("");
        txtIDExemplar.requestFocus();
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
            java.util.logging.Logger.getLogger(TelaExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExemplar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAtualizar;
    private java.awt.Button btnBuscar;
    private javax.swing.JButton btnBuscarLivro;
    private java.awt.Button btnCancelar;
    private java.awt.Button btnConfirmar;
    private java.awt.Button btnExcluir;
    private java.awt.Button btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtDataCadastro;
    private javax.swing.JTextField txtIDExemplar;
    private javax.swing.JTextField txtIdLivro;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setInformacaoDependente(Object o) {
        if(o instanceof ItemBuscaExemplar){
            this.exemplar = (ItemBuscaExemplar) o;
            txtCodBarras.setText(this.exemplar.getCodBarras());
            txtDataCadastro.setText(this.exemplar.getDataCadastro());
            txtIDExemplar.setText(String.valueOf(this.exemplar.getIdExemplar()));
            txtIdLivro.setText(String.valueOf(this.exemplar.getIdLivro()));
            camposBuscado();
        }else if(o instanceof Livro){
            this.livro = (Livro) o;
            txtIdLivro.setText(String.valueOf(this.livro.getId()));
        }
    }

    @Override
    public Object getInformacaoDependente() {
        return null;
    }

    @Override
    public Image getIcone() {
        return getIconImage();
    }

    @Override
    public void setEstadoAtivacao(boolean enable) {
        setEnabled(enable);
    }

    @Override
    public void setParente(Parente p) {
        
    }
}
