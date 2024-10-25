
package Calculaodra;


public class Ejecutor extends javax.swing.JFrame {
    
    public float segundonumero;
    public float primernumero;
    public String operador;        

    
    public Ejecutor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("calculadora");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton0 = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        division = new javax.swing.JButton();
        botonigual = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 51, 153));
        jPanel1.setLayout(null);

        boton0.setBackground(new java.awt.Color(255, 255, 255));
        boton0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton0.setForeground(new java.awt.Color(102, 0, 102));
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        jPanel1.add(boton0);
        boton0.setBounds(10, 280, 50, 40);

        suma.setBackground(new java.awt.Color(255, 255, 255));
        suma.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        suma.setForeground(new java.awt.Color(0, 0, 0));
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        jPanel1.add(suma);
        suma.setBounds(170, 280, 90, 40);

        resta.setBackground(new java.awt.Color(255, 255, 255));
        resta.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        resta.setForeground(new java.awt.Color(0, 0, 0));
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        jPanel1.add(resta);
        resta.setBounds(210, 230, 50, 40);

        multiplicacion.setBackground(new java.awt.Color(255, 255, 255));
        multiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        multiplicacion.setForeground(new java.awt.Color(0, 0, 0));
        multiplicacion.setText("x");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(multiplicacion);
        multiplicacion.setBounds(210, 180, 50, 40);

        division.setBackground(new java.awt.Color(255, 255, 255));
        division.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        division.setForeground(new java.awt.Color(0, 0, 0));
        division.setText("÷");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        jPanel1.add(division);
        division.setBounds(210, 130, 50, 40);

        botonigual.setBackground(new java.awt.Color(153, 153, 255));
        botonigual.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        botonigual.setForeground(new java.awt.Color(255, 255, 255));
        botonigual.setText("=");
        botonigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonigualActionPerformed(evt);
            }
        });
        jPanel1.add(botonigual);
        botonigual.setBounds(80, 280, 70, 40);

        boton1.setBackground(new java.awt.Color(255, 255, 255));
        boton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton1.setForeground(new java.awt.Color(102, 0, 102));
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel1.add(boton1);
        boton1.setBounds(10, 230, 50, 40);

        boton2.setBackground(new java.awt.Color(255, 255, 255));
        boton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton2.setForeground(new java.awt.Color(102, 0, 102));
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        jPanel1.add(boton2);
        boton2.setBounds(70, 230, 50, 40);

        boton3.setBackground(new java.awt.Color(255, 255, 255));
        boton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton3.setForeground(new java.awt.Color(102, 0, 102));
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        jPanel1.add(boton3);
        boton3.setBounds(130, 230, 50, 40);

        boton4.setBackground(new java.awt.Color(255, 255, 255));
        boton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton4.setForeground(new java.awt.Color(102, 0, 102));
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        jPanel1.add(boton4);
        boton4.setBounds(10, 180, 50, 40);

        boton5.setBackground(new java.awt.Color(255, 255, 255));
        boton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton5.setForeground(new java.awt.Color(102, 0, 102));
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        jPanel1.add(boton5);
        boton5.setBounds(70, 180, 50, 40);

        boton6.setBackground(new java.awt.Color(255, 255, 255));
        boton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton6.setForeground(new java.awt.Color(102, 0, 102));
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        jPanel1.add(boton6);
        boton6.setBounds(130, 180, 50, 40);

        boton7.setBackground(new java.awt.Color(255, 255, 255));
        boton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton7.setForeground(new java.awt.Color(102, 0, 102));
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        jPanel1.add(boton7);
        boton7.setBounds(10, 130, 50, 40);

        boton8.setBackground(new java.awt.Color(255, 255, 255));
        boton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton8.setForeground(new java.awt.Color(102, 0, 102));
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        jPanel1.add(boton8);
        boton8.setBounds(70, 130, 50, 40);

        boton9.setBackground(new java.awt.Color(255, 255, 255));
        boton9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boton9.setForeground(new java.awt.Color(102, 0, 102));
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        jPanel1.add(boton9);
        boton9.setBounds(130, 130, 50, 40);

        borrar.setBackground(new java.awt.Color(255, 255, 255));
        borrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        borrar.setForeground(new java.awt.Color(102, 0, 0));
        borrar.setText("C");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel1.add(borrar);
        borrar.setBounds(170, 90, 90, 30);

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setForeground(new java.awt.Color(0, 0, 0));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resultado.setOpaque(true);
        jPanel1.add(resultado);
        resultado.setBounds(10, 10, 250, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 270, 325);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        this.resultado.setText(this.resultado.getText()+"0");
    }//GEN-LAST:event_boton0ActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        this.primernumero=Float.parseFloat(this.resultado.getText());
        this.operador="-";
        this.resultado.setText("");
        
      
    }//GEN-LAST:event_restaActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
 
        this.primernumero=Float.parseFloat(this.resultado.getText());
        this.operador="+";
        this.resultado.setText("");
       
        
      
        
    }//GEN-LAST:event_sumaActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        this.primernumero=Float.parseFloat(this.resultado.getText());
        this.operador="x";
        this.resultado.setText("");
     
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
         this.resultado.setText(this.resultado.getText()+"2");
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
         this.resultado.setText(this.resultado.getText()+"1");
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        this.resultado.setText(this.resultado.getText()+"3");
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        this.resultado.setText(this.resultado.getText()+"4");
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        this.resultado.setText(this.resultado.getText()+"5");
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        this.resultado.setText(this.resultado.getText()+"6");
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        this.resultado.setText(this.resultado.getText()+"7");
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        this.resultado.setText(this.resultado.getText()+"8");
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        this.resultado.setText(this.resultado.getText()+"9");
    }//GEN-LAST:event_boton9ActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
       this.resultado.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void botonigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonigualActionPerformed
        this.segundonumero=Float.parseFloat(this.resultado.getText());
        
        switch(this.operador){
            case "+":this.resultado.setText(cero(this.primernumero+this.segundonumero));break;
            case "-":this.resultado.setText(cero(this.primernumero-this.segundonumero));break;
            case "x":this.resultado.setText(cero(this.primernumero*this.segundonumero));break;
            case "÷":this.resultado.setText(cero(this.primernumero/this.segundonumero));break;
        }
    }//GEN-LAST:event_botonigualActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        this.primernumero=Float.parseFloat(this.resultado.getText());
        this.operador="÷";
        this.resultado.setText("");
       
    }//GEN-LAST:event_divisionActionPerformed

    
    public String cero(float resultante){
        String retorno="";
        retorno=Float.toString(resultante);
        
        if (resultante%1==0){
            retorno=retorno.substring(0, retorno.length()-2);
        }
        
        return retorno;
    }
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Ejecutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejecutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejecutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejecutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejecutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonigual;
    private javax.swing.JButton division;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton resta;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
