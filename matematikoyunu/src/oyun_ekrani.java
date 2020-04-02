public class oyun_ekrani extends javax.swing.JFrame {

    public oyun_ekrani() {
        initComponents();
        panel_oyunalani.setVisible(false);
        i=0;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_oyuncubilgi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtext_ad = new javax.swing.JTextField();
        basla_button = new javax.swing.JButton();
        panel_puan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlabel_dogru = new javax.swing.JLabel();
        jlabel_yanlis = new javax.swing.JLabel();
        jlabel_oyuncuad = new javax.swing.JLabel();
        panel_oyunalani = new javax.swing.JPanel();
        button1_sayi = new javax.swing.JButton();
        button2_sayi = new javax.swing.JButton();
        button_islem = new javax.swing.JButton();
        textfield_sonuc = new javax.swing.JTextField();
        button_kontrol = new javax.swing.JButton();
        button_islem1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panel_skor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlist_skor = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_oyuncubilgi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyuncu Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setText("Adınızı Giriniz: ");

        basla_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        basla_button.setText("Başla");
        basla_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basla_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyuncubilgiLayout = new javax.swing.GroupLayout(panel_oyuncubilgi);
        panel_oyuncubilgi.setLayout(panel_oyuncubilgiLayout);
        panel_oyuncubilgiLayout.setHorizontalGroup(
            panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncubilgiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(basla_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_oyuncubilgiLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtext_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_oyuncubilgiLayout.setVerticalGroup(
            panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyuncubilgiLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_oyuncubilgiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtext_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(basla_button)
                .addContainerGap())
        );

        panel_puan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Puan Bilgileri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel2.setText("Doğru Sayısı: ");

        jLabel3.setText("Yanlış Sayısı: ");

        jlabel_dogru.setText("0");

        jlabel_yanlis.setText("0");

        jlabel_oyuncuad.setText("Oyuncu: ");

        javax.swing.GroupLayout panel_puanLayout = new javax.swing.GroupLayout(panel_puan);
        panel_puan.setLayout(panel_puanLayout);
        panel_puanLayout.setHorizontalGroup(
            panel_puanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_puanLayout.createSequentialGroup()
                .addGroup(panel_puanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_puanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_puanLayout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(jlabel_yanlis))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_puanLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jlabel_dogru)))
                    .addGroup(panel_puanLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panel_puanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_puanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlabel_oyuncuad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        panel_puanLayout.setVerticalGroup(
            panel_puanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_puanLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jlabel_oyuncuad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_puanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlabel_dogru))
                .addGap(18, 18, 18)
                .addGroup(panel_puanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel_yanlis)
                    .addComponent(jLabel3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_oyunalani.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oyun Alanı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 0, 51))); // NOI18N

        button1_sayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/0.png"))); // NOI18N
        button1_sayi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        button2_sayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/0.png"))); // NOI18N
        button2_sayi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        button_islem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/i1.png"))); // NOI18N
        button_islem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        textfield_sonuc.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N

        button_kontrol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/soru1.png"))); // NOI18N
        button_kontrol.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_kontrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kontrolActionPerformed(evt);
            }
        });

        button_islem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/esittir.png"))); // NOI18N
        button_islem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Durum;");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("Bilgisayar Kazandı");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Yeni Soru -->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_oyunalaniLayout = new javax.swing.GroupLayout(panel_oyunalani);
        panel_oyunalani.setLayout(panel_oyunalaniLayout);
        panel_oyunalaniLayout.setHorizontalGroup(
            panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addComponent(button1_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_islem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button2_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_islem1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addComponent(textfield_sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_kontrol, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_oyunalaniLayout.setVerticalGroup(
            panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(button_islem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(button_islem1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_kontrol, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(button2_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button1_sayi, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textfield_sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panel_oyunalaniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_oyunalaniLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panel_skor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Skor Durumu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jScrollPane1.setViewportView(jlist_skor);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Yeni Oyun");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_skorLayout = new javax.swing.GroupLayout(panel_skor);
        panel_skor.setLayout(panel_skorLayout);
        panel_skorLayout.setHorizontalGroup(
            panel_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_skorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
        );
        panel_skorLayout.setVerticalGroup(
            panel_skorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_skorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_oyunalani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_oyuncubilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel_puan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_skor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_skor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_oyuncubilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_puan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_oyunalani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  String ad = "";
    int islem, a, b, yanlis = 0, dogru = 0;

    public void yenisoru() {
        islem = (int)(Math.random()*3+1);
        a = (int)(Math.random()*10);
        b = (int)(Math.random()*10);
        button1_sayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/"+String.valueOf(a)+".png")));
        button2_sayi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/"+String.valueOf(b)+".png")));
        button_islem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/i"+String.valueOf(islem)+".png")));
    }
    
    String[] listdata = new String[20];
    int i = 0;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jtext_ad.setEnabled(true);
        basla_button.setEnabled(true);
        listdata[i] = ad + "-" + String.valueOf(dogru) + "Doğru- " +"/"+ String.valueOf(yanlis) + "Yanlış- ";
        ad = "";
        jlist_skor.setListData(listdata);
        panel_oyunalani.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void button_kontrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kontrolActionPerformed
        int sonuc=0;
        switch(islem){
            case 1:{sonuc=a+b; break;} //toplama işlemi
            case 2:{sonuc=a-b; break;} //çıkarma işlemi
            case 3:{sonuc=a*b; break;} //çarpma işlemi
            case 4:{sonuc=a/b; break;} //bölme işlemi
        }
        int girilen_deger=Integer.valueOf(textfield_sonuc.getText());
        if (girilen_deger==sonuc) {
            jLabel6.setText("Tebrikler Doğru Tahmin");
            dogru++;
        }
        else{
             jLabel6.setText("Üzgünüm Yanlış Tahmin");
             textfield_sonuc.setText("");
             yanlis++;
             
        }
        jlabel_dogru.setText(String.valueOf(dogru));
        jlabel_yanlis.setText(String.valueOf(yanlis));
    }//GEN-LAST:event_button_kontrolActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       yenisoru();
       textfield_sonuc.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void basla_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basla_buttonActionPerformed
        ad=jtext_ad.getText();
        jtext_ad.setEnabled(false);
        basla_button.setEnabled(false);
        jlabel_oyuncuad.setText(ad);
        panel_oyunalani.setVisible(true);
        yenisoru();
        dogru=0;
        yanlis=0;
        jlabel_dogru.setText(String.valueOf(dogru));
        jlabel_yanlis.setText(String.valueOf(yanlis));
    }//GEN-LAST:event_basla_buttonActionPerformed


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
            java.util.logging.Logger.getLogger(oyun_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oyun_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oyun_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oyun_ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oyun_ekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basla_button;
    private javax.swing.JButton button1_sayi;
    private javax.swing.JButton button2_sayi;
    private javax.swing.JButton button_islem;
    private javax.swing.JButton button_islem1;
    private javax.swing.JButton button_kontrol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel_dogru;
    private javax.swing.JLabel jlabel_oyuncuad;
    private javax.swing.JLabel jlabel_yanlis;
    private javax.swing.JList<String> jlist_skor;
    private javax.swing.JTextField jtext_ad;
    private javax.swing.JPanel panel_oyunalani;
    private javax.swing.JPanel panel_oyuncubilgi;
    private javax.swing.JPanel panel_puan;
    private javax.swing.JPanel panel_skor;
    private javax.swing.JTextField textfield_sonuc;
    // End of variables declaration//GEN-END:variables
}
