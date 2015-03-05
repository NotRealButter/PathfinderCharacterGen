/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfindercharactergenerator;

/**
 *
 * @author Stephen Hite
 */
public class AbilityScoreUI extends MyJPanel {

    /**
     * Creates new form AbilityScoreUI
     */
    public AbilityScoreUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        strLabel = new javax.swing.JLabel();
        conLabel = new javax.swing.JLabel();
        dexLabel = new javax.swing.JLabel();
        intLabel = new javax.swing.JLabel();
        wisLabel = new javax.swing.JLabel();
        chaLabel = new javax.swing.JLabel();
        strBox = new javax.swing.JTextField();
        conBox = new javax.swing.JTextField();
        dexBox = new javax.swing.JTextField();
        intBox = new javax.swing.JTextField();
        wisBox = new javax.swing.JTextField();
        chaBox = new javax.swing.JTextField();
        strRoll = new javax.swing.JButton();
        conRoll = new javax.swing.JButton();
        dexRoll = new javax.swing.JButton();
        intRoll = new javax.swing.JButton();
        wisRoll = new javax.swing.JButton();
        chaRoll = new javax.swing.JButton();
        next = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 720));

        strLabel.setText("STRENGTH");

        conLabel.setText("CONSTITUTION");

        dexLabel.setText("DEXTERITY");

        intLabel.setText("INTELLIGENCE");

        wisLabel.setText("WISDOM");

        chaLabel.setText("CHARISMA");

        strBox.setText("Strength Score");
        strBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strBoxActionPerformed(evt);
            }
        });

        conBox.setText("Constitution Score");
        conBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conBoxActionPerformed(evt);
            }
        });

        dexBox.setText("Dexterity Score");

        intBox.setText("Intelligence Score");

        wisBox.setText("Wisdom Score");

        chaBox.setText("Charisma Score");

        strRoll.setText("Roll Str");
        strRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strRollActionPerformed(evt);
            }
        });

        conRoll.setText("Roll Con");
        conRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conRollActionPerformed(evt);
            }
        });

        dexRoll.setText("Roll Dex");
        dexRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexRollActionPerformed(evt);
            }
        });

        intRoll.setText("Roll Int");

        wisRoll.setText("Roll Wis");

        chaRoll.setText("Roll Cha");
        chaRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaRollActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.setMaximumSize(new java.awt.Dimension(100, 100));
        next.setMinimumSize(new java.awt.Dimension(100, 100));
        next.setPreferredSize(new java.awt.Dimension(100, 100));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.setMaximumSize(new java.awt.Dimension(100, 100));
        back.setMinimumSize(new java.awt.Dimension(100, 100));
        back.setPreferredSize(new java.awt.Dimension(100, 100));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chaLabel)
                            .addComponent(wisLabel)
                            .addComponent(intLabel)
                            .addComponent(dexLabel)
                            .addComponent(conLabel)
                            .addComponent(strLabel)
                            .addComponent(dexBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wisBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(strBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strRoll)
                            .addComponent(conRoll)
                            .addComponent(dexRoll)
                            .addComponent(intRoll)
                            .addComponent(wisRoll))
                        .addContainerGap(913, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chaRoll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 730, Short.MAX_VALUE)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)))
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(strLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(strRoll))
                .addGap(46, 46, 46)
                .addComponent(conLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conRoll))
                .addGap(33, 33, 33)
                .addComponent(dexLabel)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dexBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dexRoll))
                .addGap(39, 39, 39)
                .addComponent(intLabel)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(intBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intRoll))
                .addGap(26, 26, 26)
                .addComponent(wisLabel)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wisBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wisRoll))
                .addGap(26, 26, 26)
                .addComponent(chaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chaRoll))
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void strBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_strBoxActionPerformed

    private void conBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conBoxActionPerformed

    private void strRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_strRollActionPerformed

    private void conRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conRollActionPerformed

    private void dexRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dexRollActionPerformed

    private void chaRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaRollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chaRollActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton back;
    public javax.swing.JTextField chaBox;
    private javax.swing.JLabel chaLabel;
    public javax.swing.JButton chaRoll;
    public javax.swing.JTextField conBox;
    private javax.swing.JLabel conLabel;
    public javax.swing.JButton conRoll;
    public javax.swing.JTextField dexBox;
    private javax.swing.JLabel dexLabel;
    public javax.swing.JButton dexRoll;
    public javax.swing.JTextField intBox;
    private javax.swing.JLabel intLabel;
    public javax.swing.JButton intRoll;
    public javax.swing.JButton next;
    public javax.swing.JTextField strBox;
    private javax.swing.JLabel strLabel;
    public javax.swing.JButton strRoll;
    public javax.swing.JTextField wisBox;
    private javax.swing.JLabel wisLabel;
    public javax.swing.JButton wisRoll;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the back
     */
    public javax.swing.JButton getBack() {
        return back;
    }

    /**
     * @param back the back to set
     */
    public void setBack(javax.swing.JButton back) 
    {
        this.back = back;
    }
        public javax.swing.JButton getNext() 
        {
        return next;
    }

    /**
     * @param back the back to set
     */
    public void setNext(javax.swing.JButton back) {
        this.next = next;
    }

    /**
     * @return the chaBox
     */
    public javax.swing.JTextField getChaBox() {
        return chaBox;
    }

    /**
     * @param chaBox the chaBox to set
     */
    public void setChaBox(javax.swing.JTextField chaBox) {
        this.chaBox = chaBox;
    }

    /**
     * @return the chaRoll
     */
    public javax.swing.JButton getChaRoll() {
        return chaRoll;
    }

    /**
     * @param chaRoll the chaRoll to set
     */
    public void setChaRoll(javax.swing.JButton chaRoll) {
        this.chaRoll = chaRoll;
    }

    /**
     * @return the conBox
     */
    public javax.swing.JTextField getConBox() {
        return conBox;
    }

    /**
     * @param conBox the conBox to set
     */
    public void setConBox(javax.swing.JTextField conBox) {
        this.conBox = conBox;
    }

    /**
     * @return the conRoll
     */
    public javax.swing.JButton getConRoll() {
        return conRoll;
    }

    /**
     * @param conRoll the conRoll to set
     */
    public void setConRoll(javax.swing.JButton conRoll) {
        this.conRoll = conRoll;
    }

    /**
     * @return the dexBox
     */
    public javax.swing.JTextField getDexBox() {
        return dexBox;
    }

    /**
     * @param dexBox the dexBox to set
     */
    public void setDexBox(javax.swing.JTextField dexBox) {
        this.dexBox = dexBox;
    }

    /**
     * @return the dexRoll
     */
    public javax.swing.JButton getDexRoll() {
        return dexRoll;
    }

    /**
     * @param dexRoll the dexRoll to set
     */
    public void setDexRoll(javax.swing.JButton dexRoll) {
        this.dexRoll = dexRoll;
    }

    /**
     * @return the intBox
     */
    public javax.swing.JTextField getIntBox() {
        return intBox;
    }

    /**
     * @param intBox the intBox to set
     */
    public void setIntBox(javax.swing.JTextField intBox) {
        this.intBox = intBox;
    }

    /**
     * @return the intRoll
     */
    public javax.swing.JButton getIntRoll() {
        return intRoll;
    }

    /**
     * @param intRoll the intRoll to set
     */
    public void setIntRoll(javax.swing.JButton intRoll) {
        this.intRoll = intRoll;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return strLabel;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.strLabel = jLabel1;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return conLabel;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.conLabel = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return dexLabel;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.dexLabel = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return intLabel;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.intLabel = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return wisLabel;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.wisLabel = jLabel5;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return chaLabel;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.chaLabel = jLabel6;
    }

    /**
     * @return the strBox
     */
    public javax.swing.JTextField getStrBox() {
        return strBox;
    }

    /**
     * @param strBox the strBox to set
     */
    public void setStrBox(javax.swing.JTextField strBox) {
        this.strBox = strBox;
    }

    /**
     * @return the strRoll
     */
    public javax.swing.JButton getStrRoll() {
        return strRoll;
    }

    /**
     * @param strRoll the strRoll to set
     */
    public void setStrRoll(javax.swing.JButton strRoll) {
        this.strRoll = strRoll;
    }

    /**
     * @return the wisBox
     */
    public javax.swing.JTextField getWisBox() {
        return wisBox;
    }

    /**
     * @param wisBox the wisBox to set
     */
    public void setWisBox(javax.swing.JTextField wisBox) {
        this.wisBox = wisBox;
    }

    /**
     * @return the wisRoll
     */
    public javax.swing.JButton getWisRoll() {
        return wisRoll;
    }

    /**
     * @param wisRoll the wisRoll to set
     */
    public void setWisRoll(javax.swing.JButton wisRoll) {
        this.wisRoll = wisRoll;
    }
}
