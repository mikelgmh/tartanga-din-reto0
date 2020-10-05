
package dinreto0.com.view;

/**
 * Contiene metodos para mostrar una vista en modo interfaz grafica.
 * @author Mikel/Imanol
 */
public class GUIViewImplementation extends javax.swing.JFrame implements View{

    public GUIViewImplementation() {
        initComponents();
    }

    /**
     * Se llama a este metodo desde el constructor para inicializar la forma.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Muestra el texto en un JFrame.
     * @param greeting Contiene el saludo
     */
    @Override
    public void showGreeting(String greeting) {
       initComponents();
       this.jLabel1.setText(greeting);
       this.setVisible(true);
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
