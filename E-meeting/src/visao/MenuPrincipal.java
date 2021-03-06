/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;
import modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class MenuPrincipal extends javax.swing.JFrame {
    public Usuario usuario;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(Usuario u) {
        this.usuario = u;
        initComponents();
    }
    
    public MenuPrincipal() {
        initComponents();
    }
    
    
    //TeladeLogin.get(uLogin).getFunçao();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBagendarReuniao = new javax.swing.JButton();
        jBreunioesAnteriores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLProximasreunioes = new javax.swing.JLabel();
        jBConfirmarPres = new javax.swing.JButton();
        jBeditarAta = new javax.swing.JButton();
        jBeditarPartici = new javax.swing.JButton();
        jBeditarLocais = new javax.swing.JButton();
        jBconfirmarLocais = new javax.swing.JButton();
        jBcadastrarLocais = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBagendarReuniao.setText("Agendar Reunião");

        jBreunioesAnteriores.setText("Reuniões anteriores");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLProximasreunioes.setText("Proximas reuniões: ");

        jBConfirmarPres.setText("Confirmar Presença");

        jBeditarAta.setText("Editar Ata");

        jBeditarPartici.setText("Editar Participantes");

        jBeditarLocais.setText("Editar Locais");

        jBconfirmarLocais.setText("Confirmar Locais");

        jBcadastrarLocais.setText("Cadastrar Locais");

        jbSair.setBackground(new java.awt.Color(204, 0, 0));
        jbSair.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBeditarPartici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBeditarAta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBreunioesAnteriores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBagendarReuniao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBConfirmarPres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBeditarLocais)
                                .addGap(18, 18, 18)
                                .addComponent(jBconfirmarLocais)
                                .addGap(18, 18, 18)
                                .addComponent(jBcadastrarLocais)))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLProximasreunioes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSair)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLProximasreunioes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbSair)
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBagendarReuniao)
                        .addGap(18, 18, 18)
                        .addComponent(jBreunioesAnteriores)
                        .addGap(18, 18, 18)
                        .addComponent(jBConfirmarPres)
                        .addGap(18, 18, 18)
                        .addComponent(jBeditarAta)
                        .addGap(18, 18, 18)
                        .addComponent(jBeditarPartici))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeditarLocais)
                    .addComponent(jBconfirmarLocais)
                    .addComponent(jBcadastrarLocais))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuPrincipal().setVisible(true);
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirmarPres;
    private javax.swing.JButton jBagendarReuniao;
    private javax.swing.JButton jBcadastrarLocais;
    private javax.swing.JButton jBconfirmarLocais;
    private javax.swing.JButton jBeditarAta;
    private javax.swing.JButton jBeditarLocais;
    private javax.swing.JButton jBeditarPartici;
    private javax.swing.JButton jBreunioesAnteriores;
    private javax.swing.JLabel jLProximasreunioes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbSair;
    // End of variables declaration//GEN-END:variables
}
