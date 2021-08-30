// JOÃO PAULO DE CARVALHO ARAÚJO - 202065564C

package ufjf.dcc025.sistema.biblioteca.layouts;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ufjf.dcc025.sistema.biblioteca.entities.Livro;
import ufjf.dcc025.sistema.biblioteca.services.BibliotecaService;

public class ListaLivros extends javax.swing.JFrame {

    private List <Livro> list;
    public ListaLivros() {
        initComponents();

        
        setLocationRelativeTo(null);
        this.list = BibliotecaService.getLivros();

        this.addRowToJtable();
        

    }
    List <Livro> getLista (){
        return this.list;
    }
    
    

    public void addRowToJtable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Object rowData[] = new Object[11];
        for(int i = 0; i<list.size();i++){
            rowData[0] = list.get(i).getId();
            rowData[1] = list.get(i).getTitulo();
            rowData[2] = list.get(i).getAutor();
            rowData[3] = list.get(i).getEditora();
            rowData[4] = list.get(i).getAno();
            rowData[5] = list.get(i).getEdicao();
            rowData[6] = list.get(i).getNumPaginas();
            rowData[7] = list.get(i).getIsbn();
            rowData[8] = list.get(i).getIdioma();
            rowData[9] = list.get(i).getQuantDispNaoCircula();
            rowData[10] = list.get(i).getQuantDispEmprestimo();
            model.addRow(rowData);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Cadastro = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Editar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titulo", "Autor", "Editora", "Ano", "Edição", "Nº Pág.", "ISBN", "Idioma", "Qtd. Disp. Acervo", "Qtd. Disp. Empr."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Cadastro.setText("Cadastro");
        Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroActionPerformed(evt);
            }
        });

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Editar1.setText("Ver exemplares");
        Editar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Editar1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastro)
                    .addComponent(Voltar)
                    .addComponent(Editar)
                    .addComponent(Editar1))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroActionPerformed
        NovoLivro telaLivro = new NovoLivro();
        telaLivro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        telaLivro.setVisible(true);
        dispose();
    }//GEN-LAST:event_CadastroActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        MenuFuncionario menu = new MenuFuncionario();
        menu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        menu.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
          
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();    

        EditarLivro telaLivro = new EditarLivro(this.getLista(),Integer.parseInt(tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString())-1);
        telaLivro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        telaLivro.setVisible(true);
        dispose();
    }//GEN-LAST:event_EditarActionPerformed

    private void Editar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editar1ActionPerformed
        Integer id = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        
        if (jTable1.getSelectedRow() >= 0) {
            ListaExemplares telaEmprestimos = new ListaExemplares(BibliotecaService.getLivro(id));
            telaEmprestimos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            telaEmprestimos.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum livro escolhido.");
        }
    }//GEN-LAST:event_Editar1ActionPerformed

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
            java.util.logging.Logger.getLogger(ListaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastro;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Editar1;
    private javax.swing.JButton Voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
