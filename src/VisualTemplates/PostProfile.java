/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisualTemplates;

import Arbol.Comment;
import Arbol.Nodo;
import Arbol.Post;
import Arbol.User;
import Prinicipal.Ventana;
import java.awt.Dimension;
import javax.swing.DefaultListModel;

/**
 *
 * @author alexz
 */
public class PostProfile extends TemplateVentana {

    private static UserProfile userProfile;

    /**
     * Creates new form PostProfile
     */
    private Post post;
    private User username;
    private final DefaultListModel model;

    public PostProfile() {
        super();
        initComponents();
        dispose();
        setUndecorated(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        model = new DefaultListModel();
    }

    @Override
    public void setGUI() {
        setTitle("SMALL Solutions");
        titlePost.setText(post.getTitle());
        titlePost.setFont(Ventana.principalFont);
        authorPost.setText(username.getUsername());
        authorPost.setFont(Ventana.principalFont);
        body.append(post.getBody());
        body.setLineWrap(true);
        CommentsText.setFont(Ventana.principalFont);
        commentPanel.setBackground(Ventana.mediumPostColor);
        postPart.setBackground(Ventana.post3);
        CommentsList.setModel(model);
        numberComments.setText("# Comments : " + post.getComments().size());
        fillModel();
    }

    public void fillModel() {
        int cont = 1;
        for (Nodo nodo : post.getComments()) {
            Comment c = (Comment) nodo;
            model.addElement(cont + " - By: " + c.getName() + " : " + c.getBody() + " \n | Contact Adress " + c.getEmail());
            cont++;
        }
    }

    public void setPost(Post p, User username) {
        this.post = p;
        this.username = username;
        setGUI();
    }

    @Override
    public void setFonts() {
    }

    @Override
    public void setImages() {
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CommentsView = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        postCreator = new javax.swing.JLabel();
        creator = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        body1 = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();
        commentPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CommentsList = new javax.swing.JList<>();
        CommentsText = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        numberComments = new javax.swing.JLabel();
        watchComment = new javax.swing.JButton();
        postPart = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        body = new javax.swing.JTextArea();
        titlePost = new javax.swing.JLabel();
        authorPost = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(46, 182, 125));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Post:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Title");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Body");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("By");

        postCreator.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        postCreator.setForeground(new java.awt.Color(255, 255, 255));
        postCreator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        postCreator.setText("jLabel11");

        creator.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        creator.setForeground(new java.awt.Color(255, 255, 255));
        creator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creator.setText("jLabel12");

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        body1.setEditable(false);
        body1.setColumns(20);
        body1.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        body1.setLineWrap(true);
        body1.setRows(5);
        jScrollPane4.setViewportView(body1);

        title.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("jLabel13");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(postCreator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(creator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(186, 186, 186)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(8, 8, 8))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addComponent(postCreator)
                .addGap(17, 17, 17)
                .addComponent(jLabel10)
                .addGap(11, 11, 11)
                .addComponent(creator)
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addGap(21, 21, 21)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CommentsViewLayout = new javax.swing.GroupLayout(CommentsView.getContentPane());
        CommentsView.getContentPane().setLayout(CommentsViewLayout);
        CommentsViewLayout.setHorizontalGroup(
            CommentsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CommentsViewLayout.setVerticalGroup(
            CommentsViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setBorder(null);

        CommentsList.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        CommentsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CommentsList.setToolTipText("");
        jScrollPane2.setViewportView(CommentsList);

        CommentsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CommentsText.setText("Comments");

        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        close1.setText("-");
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });

        numberComments.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        watchComment.setText("Watch Comment");
        watchComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchCommentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout commentPanelLayout = new javax.swing.GroupLayout(commentPanel);
        commentPanel.setLayout(commentPanelLayout);
        commentPanelLayout.setHorizontalGroup(
            commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close1)
                .addGap(18, 18, 18)
                .addComponent(close)
                .addGap(18, 18, 18))
            .addGroup(commentPanelLayout.createSequentialGroup()
                .addGroup(commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(commentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(CommentsText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numberComments, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(commentPanelLayout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(watchComment))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        commentPanelLayout.setVerticalGroup(
            commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, commentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(close1))
                .addGap(32, 32, 32)
                .addGroup(commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CommentsText)
                    .addComponent(numberComments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(watchComment)
                .addGap(24, 24, 24))
        );

        jScrollPane3.setBorder(null);

        body.setEditable(false);
        body.setColumns(20);
        body.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        body.setRows(5);
        body.setWrapStyleWord(true);
        jScrollPane3.setViewportView(body);

        titlePost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlePost.setText("jLabel1");

        authorPost.setText("jLabel1");
        authorPost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorPostMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout postPartLayout = new javax.swing.GroupLayout(postPart);
        postPart.setLayout(postPartLayout);
        postPartLayout.setHorizontalGroup(
            postPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(postPartLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, postPartLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(postPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(postPartLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(authorPost))
                    .addComponent(titlePost, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        postPartLayout.setVerticalGroup(
            postPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(postPartLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titlePost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authorPost)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(postPart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(commentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(commentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(postPart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void authorPostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorPostMouseClicked
        // TODO add your handling code here:
        userProfile = new UserProfile();
        userProfile.setUsuario(username);
        userProfile.setVisible(true);
    }//GEN-LAST:event_authorPostMouseClicked

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        // TODO add your handling code here:
        this.setState(PostProfile.ICONIFIED);
    }//GEN-LAST:event_close1MouseClicked

    private void watchCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchCommentActionPerformed
        // TODO add your handling code here:
        int index = CommentsList.getSelectedIndex();
        Comment c = getComment(index);
        if(c == null){
            System.out.println("KHE");
            return;
        }
        CommentsView.setTitle("SMALL SOLUTIONS");
        creator.setText(c.getEmail());
        title.setText(c.getName());
        body1.setText(c.getBody());
        postCreator.setText(post.getTitle());
        CommentsView.setSize(new Dimension(450, 400));
        CommentsView.setVisible(true);
        CommentsView.setResizable(false);
    }//GEN-LAST:event_watchCommentActionPerformed

    public Comment getComment(int index) {
        int cont = 0;
        for (Nodo nodo : post.getComments()) {
            if(cont == index){
                return (Comment) nodo;
            }
            cont++;
        }
        return null;
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
            java.util.logging.Logger.getLogger(PostProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PostProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> CommentsList;
    private javax.swing.JLabel CommentsText;
    private javax.swing.JDialog CommentsView;
    private javax.swing.JLabel authorPost;
    private javax.swing.JTextArea body;
    private javax.swing.JTextArea body1;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JPanel commentPanel;
    private javax.swing.JLabel creator;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel numberComments;
    private javax.swing.JLabel postCreator;
    private javax.swing.JPanel postPart;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titlePost;
    private javax.swing.JButton watchComment;
    // End of variables declaration//GEN-END:variables

}
