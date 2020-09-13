package VisualTemplates;

import Arbol.Nodo;
import Arbol.Post;
import Arbol.User;
import Prinicipal.Ventana;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author alexz
 */
public final class UserProfile extends javax.swing.JFrame{

    private User username;
    private Font font;
    public JList posts;
    DefaultListModel modelList;
    private int posX,posY;

    public final synchronized void addMouseListener() {
        super.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });
    }

    public final synchronized void addMouseMotionListener() {
        super.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                //Coloca el frame donde se encuentro el mouse mientras lo arrastras
                setLocation(e.getXOnScreen() - posX, e.getYOnScreen() - posY);
            }
        });
    }

    public UserProfile() {
        initComponents();
        modelList = new DefaultListModel();
        dispose();
        setUndecorated(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setGUI();
        addMouseListener();
        addMouseMotionListener();
    }

    public void loadComponents() {
        listPost.setModel(modelList);
        int cont = 1;
        for (Nodo nodo : username.getPosts()) {
            Post p = (Post) nodo;
            modelList.addElement(cont + " - " + p.getTitle());
            cont++;
        }
    }

    public void setGUI() {
        font = Ventana.principalFont;
        setTitle("SMALL Solutions");
        infoUserPanel.setBackground(Ventana.mediumPostColor);
        profilePanel.setBackground(Ventana.post3);
        postPanel.setBackground(Ventana.post2);
        JLabel texto = new JLabel("Hola");
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setLayout(new FlowLayout());
        panel.add(texto);
        panel.setBackground(Color.red);
        panel.setVisible(true);
        setImages();

    }

    public void setImages() {
        ImageIcon icon = new ImageIcon("Resources/icons/user.png");
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
        profilePic.setIcon(new ImageIcon(newimg));
    }

    public void setUsuario(User user) {
        this.username = user;
        nameText.setText(user.getPersona().getName());
        usernameText.setText(user.getUsername());
        usernamePic.setText(user.getUsername());
        emailText.setText(user.getEmail());
        phoneText.setText(user.getPersona().getPhone());
        websiteText.setText(user.getPersona().getWebsite());
        cityText.setText(user.getPersona().getAdress().getCity());
        nameCompanyText.setText(user.getPersona().getCompany().getName());
        bsText.setText(user.getPersona().getCompany().getBs());
        sloganText.setText(user.getPersona().getCompany().getCatchPhrase());
        numberPost.setText(("Post by " + user.getUsername() + " - " + user.getPosts().size()));
        loadComponents();
    }

    /**
     * Creates new form UserProfile
     */
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoUserPanel = new javax.swing.JPanel();
        nameText = new javax.swing.JLabel();
        emailText = new javax.swing.JLabel();
        usernameText = new javax.swing.JLabel();
        phoneText = new javax.swing.JLabel();
        websiteText = new javax.swing.JLabel();
        cityText = new javax.swing.JLabel();
        email5 = new javax.swing.JLabel();
        email6 = new javax.swing.JLabel();
        email7 = new javax.swing.JLabel();
        email8 = new javax.swing.JLabel();
        email9 = new javax.swing.JLabel();
        email10 = new javax.swing.JLabel();
        email11 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        nameCompanyText = new javax.swing.JLabel();
        email12 = new javax.swing.JLabel();
        sloganText = new javax.swing.JLabel();
        email14 = new javax.swing.JLabel();
        bsText = new javax.swing.JLabel();
        postPanel = new javax.swing.JPanel();
        numberPost = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPost = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        profilePanel = new javax.swing.JPanel();
        profilePic = new javax.swing.JLabel();
        usernamePic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        infoUserPanel.setFont(getFont());

        nameText.setText("jLabel1");

        emailText.setText("jLabel1");

        usernameText.setText("jLabel1");

        phoneText.setText("jLabel1");

        websiteText.setText("jLabel1");

        cityText.setText("jLabel1");

        email5.setText("Basic Information");

        email6.setText("Company");

        email7.setText("City");

        email8.setText("Website");

        email9.setText("Phone");

        email10.setText("E-mail");

        email11.setText("Username");

        nameLabel.setText("Name:");

        nombre2.setText("Name:");

        nameCompanyText.setText("jLabel1");

        email12.setText("Slogan");

        sloganText.setText("jLabel1");

        email14.setText("B.S");

        bsText.setText("jLabel1");

        javax.swing.GroupLayout infoUserPanelLayout = new javax.swing.GroupLayout(infoUserPanel);
        infoUserPanel.setLayout(infoUserPanelLayout);
        infoUserPanelLayout.setHorizontalGroup(
            infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoUserPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email5)
                    .addGroup(infoUserPanelLayout.createSequentialGroup()
                        .addGroup(infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoUserPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email9)
                                    .addComponent(email10)
                                    .addComponent(email11)
                                    .addComponent(nameLabel)
                                    .addComponent(email8)
                                    .addComponent(email7)))
                            .addGroup(infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email14)
                                    .addComponent(email12)
                                    .addComponent(nombre2))
                                .addComponent(email6)))
                        .addGap(66, 66, 66)
                        .addGroup(infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bsText)
                            .addComponent(sloganText)
                            .addComponent(nameCompanyText)
                            .addComponent(phoneText)
                            .addComponent(nameText)
                            .addComponent(websiteText)
                            .addComponent(cityText)
                            .addComponent(usernameText)
                            .addComponent(emailText))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoUserPanelLayout.setVerticalGroup(
            infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoUserPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(email5)
                .addGap(13, 13, 13)
                .addGroup(infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, infoUserPanelLayout.createSequentialGroup()
                        .addComponent(nameText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailText)
                        .addGap(11, 11, 11)
                        .addComponent(phoneText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(websiteText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cityText))
                    .addGroup(infoUserPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email7)))
                .addGap(18, 18, 18)
                .addComponent(email6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, infoUserPanelLayout.createSequentialGroup()
                        .addComponent(nameCompanyText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sloganText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bsText))
                    .addGroup(infoUserPanelLayout.createSequentialGroup()
                        .addComponent(nombre2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email14)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        numberPost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numberPost.setText("jLabel1");

        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(null);

        listPost.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        listPost.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listPost);

        jButton1.setText("Ver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout postPanelLayout = new javax.swing.GroupLayout(postPanel);
        postPanel.setLayout(postPanelLayout);
        postPanelLayout.setHorizontalGroup(
            postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(postPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numberPost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(postPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(postPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(181, 181, 181))
        );
        postPanelLayout.setVerticalGroup(
            postPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, postPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(numberPost)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        usernamePic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernamePic.setText("jLabel1");

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernamePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(profilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profilePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernamePic)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(postPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String title = listPost.getSelectedValue();
        int separation = title.indexOf("-");
        title = title.substring(separation+2);
        for (Nodo nodo : username.getPosts()) {
            Post p = (Post) nodo;
            if (p.getTitle().equals(title)) {
                PostProfile postProfile = new PostProfile();
                postProfile.setVisible(true);
                postProfile.setPost(p, username);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bsText;
    private javax.swing.JLabel cityText;
    private javax.swing.JLabel email10;
    private javax.swing.JLabel email11;
    private javax.swing.JLabel email12;
    private javax.swing.JLabel email14;
    private javax.swing.JLabel email5;
    private javax.swing.JLabel email6;
    private javax.swing.JLabel email7;
    private javax.swing.JLabel email8;
    private javax.swing.JLabel email9;
    private javax.swing.JLabel emailText;
    private javax.swing.JPanel infoUserPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listPost;
    private javax.swing.JLabel nameCompanyText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameText;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel numberPost;
    private javax.swing.JLabel phoneText;
    private javax.swing.JPanel postPanel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JLabel profilePic;
    private javax.swing.JLabel sloganText;
    private javax.swing.JLabel usernamePic;
    private javax.swing.JLabel usernameText;
    private javax.swing.JLabel websiteText;
    // End of variables declaration//GEN-END:variables
}
