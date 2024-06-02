/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;
import CONTROL.Memory;
import CONTROL.Calculadora;

public class Frame_Calculadora extends javax.swing.JFrame {

    //Instância de Memory
    Memory my = new Memory();
    
    //Instância de Calculadora
    Calculadora cal = new Calculadora();
    
    public Frame_Calculadora() {
        //COMPONENTES DO FRAME
        initComponents();
        
        //DECLARANDO MÉTODOS DOS BOTÕES (EVENTO)
        //Há alguns botões não vigentes aqui, isso pois já estão declarados
        //no init gerado pelo próprio JFRAME
        //estes declarados abaixo não foram gerados por ele
        //habilitar a edição do cógido gerado pode trazer bugs
        Botao_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_0ActionPerformed(evt);
            }
        });
        
        Botao_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_2ActionPerformed(evt);
            }
        });
  
        Botao_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_3ActionPerformed(evt);
            }
        });
        
        Botao_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_4ActionPerformed(evt);
            }
        });
        
        Botao_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_5ActionPerformed(evt);
            }
        });
        
        Botao_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_6ActionPerformed(evt);
            }
        });
        
        Botao_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_7ActionPerformed(evt);
            }
        });
        
        Botao_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_8ActionPerformed(evt);
            }
        });
        
        Botao_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_9ActionPerformed(evt);
            }
        });
        
        Botao_Soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_SomaActionPerformed(evt);
            }
        });
        
        Botao_Subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_SubtracaoActionPerformed(evt);
            }
        });
        
        Botao_Multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_MultiplicacaoActionPerformed(evt);
            }
        });
        
        Botao_Divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_DivisaoActionPerformed(evt);
            }
        });
        
        Botao_Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_RaizActionPerformed(evt);
            }
        });
        
        Botao_Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_PotenciaActionPerformed(evt);
            }
        });
        
        Botao_History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_HistoryActionPerformed(evt);
            }
        });
        
        Botao_MemoryMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_MemoryMenosActionPerformed(evt);
            }
        });
        
        Botao_MemoryMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_MemoryMaisActionPerformed(evt);
            }
        });
        
        Botao_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_IgualActionPerformed(evt);
            }
        });      
        
        Botao_Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_ApagarActionPerformed(evt);
            }
        });
        
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
        Painel_Body = new javax.swing.JPanel();
        Painel_BotoesMemory = new javax.swing.JPanel();
        Botao_History = new javax.swing.JButton();
        Botao_MemoryMais = new javax.swing.JButton();
        Botao_MemoryMenos = new javax.swing.JButton();
        Painel_BotoesCorpo = new javax.swing.JPanel();
        Botao_Percentual = new javax.swing.JButton();
        Botao_1 = new javax.swing.JButton();
        Botao_4 = new javax.swing.JButton();
        Botao_7 = new javax.swing.JButton();
        Botao_Fracao = new javax.swing.JButton();
        Botao_0 = new javax.swing.JButton();
        Botao_2 = new javax.swing.JButton();
        Botao_5 = new javax.swing.JButton();
        Botao_8 = new javax.swing.JButton();
        Botao_Raiz = new javax.swing.JButton();
        Botao_Potencia = new javax.swing.JButton();
        Botao_3 = new javax.swing.JButton();
        Botao_6 = new javax.swing.JButton();
        Botao_Virgula = new javax.swing.JButton();
        Botao_9 = new javax.swing.JButton();
        Botao_Divisao = new javax.swing.JButton();
        Botao_Soma = new javax.swing.JButton();
        Botao_Igual = new javax.swing.JButton();
        Botao_Subtracao = new javax.swing.JButton();
        Botao_Multiplicacao = new javax.swing.JButton();
        Painel_BotoesFaixaSuperior = new javax.swing.JPanel();
        Botao_CE = new javax.swing.JButton();
        Botao_Apagar = new javax.swing.JButton();
        Painel_Visor = new javax.swing.JPanel();
        Campo_TextoPrincipal = new javax.swing.JTextField();
        Campo_TextoSecundario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 15, 15));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 232, 248)));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 550));
        jPanel1.setRequestFocusEnabled(false);

        Painel_Body.setBackground(new java.awt.Color(255, 203, 219));
        Painel_Body.setPreferredSize(new java.awt.Dimension(260, 300));

        Painel_BotoesMemory.setOpaque(false);

        Botao_History.setBackground(new java.awt.Color(15, 15, 15));
        Botao_History.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_History.setForeground(new java.awt.Color(200, 200, 200));
        Botao_History.setText("M");
        Botao_History.setPreferredSize(new java.awt.Dimension(85, 30));

        Botao_MemoryMais.setBackground(new java.awt.Color(15, 15, 15));
        Botao_MemoryMais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_MemoryMais.setForeground(new java.awt.Color(200, 200, 200));
        Botao_MemoryMais.setText("M+");
        Botao_MemoryMais.setPreferredSize(new java.awt.Dimension(85, 30));

        Botao_MemoryMenos.setBackground(new java.awt.Color(15, 15, 15));
        Botao_MemoryMenos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_MemoryMenos.setForeground(new java.awt.Color(200, 200, 200));
        Botao_MemoryMenos.setText("M-");
        Botao_MemoryMenos.setPreferredSize(new java.awt.Dimension(85, 30));

        javax.swing.GroupLayout Painel_BotoesMemoryLayout = new javax.swing.GroupLayout(Painel_BotoesMemory);
        Painel_BotoesMemory.setLayout(Painel_BotoesMemoryLayout);
        Painel_BotoesMemoryLayout.setHorizontalGroup(
            Painel_BotoesMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_BotoesMemoryLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Botao_History, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Botao_MemoryMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Botao_MemoryMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Painel_BotoesMemoryLayout.setVerticalGroup(
            Painel_BotoesMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_BotoesMemoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Painel_BotoesMemoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_History, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_MemoryMais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_MemoryMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Painel_BotoesCorpo.setForeground(new java.awt.Color(200, 200, 200));
        Painel_BotoesCorpo.setOpaque(false);

        Botao_Percentual.setBackground(new java.awt.Color(15, 15, 15));
        Botao_Percentual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_Percentual.setForeground(new java.awt.Color(200, 200, 200));
        Botao_Percentual.setText("%");
        Botao_Percentual.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_1.setBackground(new java.awt.Color(15, 15, 15));
        Botao_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_1.setForeground(new java.awt.Color(200, 200, 200));
        Botao_1.setText("1");
        Botao_1.setPreferredSize(new java.awt.Dimension(65, 55));
        Botao_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_1ActionPerformed(evt);
            }
        });

        Botao_4.setBackground(new java.awt.Color(15, 15, 15));
        Botao_4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_4.setForeground(new java.awt.Color(200, 200, 200));
        Botao_4.setText("4");
        Botao_4.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_7.setBackground(new java.awt.Color(15, 15, 15));
        Botao_7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_7.setForeground(new java.awt.Color(200, 200, 200));
        Botao_7.setText("7");
        Botao_7.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_Fracao.setBackground(new java.awt.Color(15, 15, 15));
        Botao_Fracao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_Fracao.setForeground(new java.awt.Color(200, 200, 200));
        Botao_Fracao.setText("1/x");
        Botao_Fracao.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_0.setBackground(new java.awt.Color(15, 15, 15));
        Botao_0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_0.setForeground(new java.awt.Color(200, 200, 200));
        Botao_0.setText("0");
        Botao_0.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_2.setBackground(new java.awt.Color(15, 15, 15));
        Botao_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_2.setForeground(new java.awt.Color(200, 200, 200));
        Botao_2.setText("2");
        Botao_2.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_5.setBackground(new java.awt.Color(15, 15, 15));
        Botao_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_5.setForeground(new java.awt.Color(200, 200, 200));
        Botao_5.setText("5");
        Botao_5.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_8.setBackground(new java.awt.Color(15, 15, 15));
        Botao_8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_8.setForeground(new java.awt.Color(200, 200, 200));
        Botao_8.setText("8");
        Botao_8.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_Raiz.setBackground(new java.awt.Color(15, 15, 15));
        Botao_Raiz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_Raiz.setForeground(new java.awt.Color(200, 200, 200));
        Botao_Raiz.setText("/x");
        Botao_Raiz.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_Potencia.setBackground(new java.awt.Color(15, 15, 15));
        Botao_Potencia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_Potencia.setForeground(new java.awt.Color(200, 200, 200));
        Botao_Potencia.setText("^2");
        Botao_Potencia.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_3.setBackground(new java.awt.Color(15, 15, 15));
        Botao_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_3.setForeground(new java.awt.Color(200, 200, 200));
        Botao_3.setText("3");
        Botao_3.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_6.setBackground(new java.awt.Color(15, 15, 15));
        Botao_6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_6.setForeground(new java.awt.Color(200, 200, 200));
        Botao_6.setText("6");
        Botao_6.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_Virgula.setBackground(new java.awt.Color(15, 15, 15));
        Botao_Virgula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_Virgula.setForeground(new java.awt.Color(200, 200, 200));
        Botao_Virgula.setText(",");
        Botao_Virgula.setPreferredSize(new java.awt.Dimension(65, 55));
        Botao_Virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_VirgulaActionPerformed(evt);
            }
        });

        Botao_9.setBackground(new java.awt.Color(15, 15, 15));
        Botao_9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_9.setForeground(new java.awt.Color(200, 200, 200));
        Botao_9.setText("9");
        Botao_9.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_Divisao.setBackground(new java.awt.Color(15, 15, 15));
        Botao_Divisao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_Divisao.setForeground(new java.awt.Color(200, 200, 200));
        Botao_Divisao.setText("/");
        Botao_Divisao.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_Soma.setBackground(new java.awt.Color(15, 15, 15));
        Botao_Soma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_Soma.setForeground(new java.awt.Color(200, 200, 200));
        Botao_Soma.setText("+");
        Botao_Soma.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_Igual.setBackground(new java.awt.Color(15, 15, 15));
        Botao_Igual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_Igual.setForeground(new java.awt.Color(200, 200, 200));
        Botao_Igual.setText("=");
        Botao_Igual.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_Subtracao.setBackground(new java.awt.Color(15, 15, 15));
        Botao_Subtracao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_Subtracao.setForeground(new java.awt.Color(200, 200, 200));
        Botao_Subtracao.setText("-");
        Botao_Subtracao.setPreferredSize(new java.awt.Dimension(65, 55));

        Botao_Multiplicacao.setBackground(new java.awt.Color(15, 15, 15));
        Botao_Multiplicacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_Multiplicacao.setForeground(new java.awt.Color(200, 200, 200));
        Botao_Multiplicacao.setText("x");
        Botao_Multiplicacao.setPreferredSize(new java.awt.Dimension(65, 55));

        javax.swing.GroupLayout Painel_BotoesCorpoLayout = new javax.swing.GroupLayout(Painel_BotoesCorpo);
        Painel_BotoesCorpo.setLayout(Painel_BotoesCorpoLayout);
        Painel_BotoesCorpoLayout.setHorizontalGroup(
            Painel_BotoesCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_BotoesCorpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Painel_BotoesCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao_Percentual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Fracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_BotoesCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_BotoesCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao_Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_BotoesCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Soma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Divisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        Painel_BotoesCorpoLayout.setVerticalGroup(
            Painel_BotoesCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_BotoesCorpoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Painel_BotoesCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao_Fracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Raiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Potencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Divisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Painel_BotoesCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_BotoesCorpoLayout.createSequentialGroup()
                        .addComponent(Botao_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_Percentual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel_BotoesCorpoLayout.createSequentialGroup()
                        .addComponent(Botao_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel_BotoesCorpoLayout.createSequentialGroup()
                        .addComponent(Botao_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_Virgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel_BotoesCorpoLayout.createSequentialGroup()
                        .addComponent(Botao_Multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_Subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_Soma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botao_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        Painel_BotoesFaixaSuperior.setOpaque(false);
        Painel_BotoesFaixaSuperior.setPreferredSize(new java.awt.Dimension(297, 42));

        Botao_CE.setBackground(new java.awt.Color(15, 15, 15));
        Botao_CE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_CE.setForeground(new java.awt.Color(200, 200, 200));
        Botao_CE.setText("CE");
        Botao_CE.setPreferredSize(new java.awt.Dimension(100, 40));
        Botao_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_CEActionPerformed(evt);
            }
        });

        Botao_Apagar.setBackground(new java.awt.Color(15, 15, 15));
        Botao_Apagar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Botao_Apagar.setForeground(new java.awt.Color(200, 200, 200));
        Botao_Apagar.setText("<");
        Botao_Apagar.setPreferredSize(new java.awt.Dimension(100, 40));

        javax.swing.GroupLayout Painel_BotoesFaixaSuperiorLayout = new javax.swing.GroupLayout(Painel_BotoesFaixaSuperior);
        Painel_BotoesFaixaSuperior.setLayout(Painel_BotoesFaixaSuperiorLayout);
        Painel_BotoesFaixaSuperiorLayout.setHorizontalGroup(
            Painel_BotoesFaixaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_BotoesFaixaSuperiorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Botao_CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Botao_Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        Painel_BotoesFaixaSuperiorLayout.setVerticalGroup(
            Painel_BotoesFaixaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_BotoesFaixaSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Painel_BotoesFaixaSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao_CE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao_Apagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout Painel_BodyLayout = new javax.swing.GroupLayout(Painel_Body);
        Painel_Body.setLayout(Painel_BodyLayout);
        Painel_BodyLayout.setHorizontalGroup(
            Painel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel_BotoesFaixaSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
            .addComponent(Painel_BotoesMemory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Painel_BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_BotoesCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        Painel_BodyLayout.setVerticalGroup(
            Painel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_BotoesFaixaSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel_BotoesMemory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel_BotoesCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        Painel_Visor.setBackground(new java.awt.Color(255, 203, 219));
        Painel_Visor.setPreferredSize(new java.awt.Dimension(360, 100));

        Campo_TextoPrincipal.setEditable(false);
        Campo_TextoPrincipal.setBackground(new java.awt.Color(15, 15, 15));
        Campo_TextoPrincipal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Campo_TextoPrincipal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Campo_TextoPrincipal.setCaretColor(new java.awt.Color(255, 255, 255));
        Campo_TextoPrincipal.setDisabledTextColor(new java.awt.Color(15, 15, 15));
        Campo_TextoPrincipal.setEnabled(false);
        Campo_TextoPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_TextoPrincipalActionPerformed(evt);
            }
        });

        Campo_TextoSecundario.setBackground(new java.awt.Color(15, 15, 15));
        Campo_TextoSecundario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Campo_TextoSecundario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Campo_TextoSecundario.setEnabled(false);
        Campo_TextoSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_TextoSecundarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel_VisorLayout = new javax.swing.GroupLayout(Painel_Visor);
        Painel_Visor.setLayout(Painel_VisorLayout);
        Painel_VisorLayout.setHorizontalGroup(
            Painel_VisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_VisorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Painel_VisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Campo_TextoPrincipal)
                    .addComponent(Campo_TextoSecundario))
                .addContainerGap())
        );
        Painel_VisorLayout.setVerticalGroup(
            Painel_VisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel_VisorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Campo_TextoSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo_TextoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Painel_Visor, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(Painel_Body, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Painel_Visor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Painel_Body, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //EVENTO DOS BOTÕES DE NÚMEROS E BOTÃO VIRGULA
    private void Botao_0ActionPerformed(java.awt.event.ActionEvent evt) {
        
        //caso o campo esteja com Syntax Error, limpa e add o número
        if(Campo_TextoPrincipal.getText().equals("Syntax Error")){
            Campo_TextoPrincipal.setText("" + "0");
        }else{
            Campo_TextoPrincipal.setText(Campo_TextoPrincipal.getText() + "0");          
        }       
    }  
        
    private void Botao_9ActionPerformed(java.awt.event.ActionEvent evt) { 
        if(Campo_TextoPrincipal.getText().equals("Syntax Error")){
            Campo_TextoPrincipal.setText("" + "9");
        }else{
            Campo_TextoPrincipal.setText(Campo_TextoPrincipal.getText() + "9");         
        }
    }  
    
    private void Botao_8ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(Campo_TextoPrincipal.getText().equals("Syntax Error")){
            Campo_TextoPrincipal.setText("" + "8");
        }else{
            Campo_TextoPrincipal.setText(Campo_TextoPrincipal.getText() + "8");
        }
    }  
    
    private void Botao_7ActionPerformed(java.awt.event.ActionEvent evt) {   
        if(Campo_TextoPrincipal.getText().equals("Syntax Error")){
            Campo_TextoPrincipal.setText("" + "7");
        }else{
        Campo_TextoPrincipal.setText(Campo_TextoPrincipal.getText() + "7");         
        }
    }  
    
    private void Botao_6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(Campo_TextoPrincipal.getText().equals("Syntax Error")){
            Campo_TextoPrincipal.setText("" + "6");
        }else{
            Campo_TextoPrincipal.setText(Campo_TextoPrincipal.getText() + "6");         
        }
    }    
    
    private void Botao_5ActionPerformed(java.awt.event.ActionEvent evt) { 
        if(Campo_TextoPrincipal.getText().equals("Syntax Error")){
            Campo_TextoPrincipal.setText("" + "5");
        }else{
            Campo_TextoPrincipal.setText(Campo_TextoPrincipal.getText() + "5");         
        }
    }
    
    private void Botao_4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(Campo_TextoPrincipal.getText().equals("Syntax Error")){
            Campo_TextoPrincipal.setText("" + "4");
        }else{
            Campo_TextoPrincipal.setText(Campo_TextoPrincipal.getText() + "4");         
        }
    }

    private void Botao_3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(Campo_TextoPrincipal.getText().equals("Syntax Error")){
            Campo_TextoPrincipal.setText("" + "3");
        }else{
        Campo_TextoPrincipal.setText(Campo_TextoPrincipal.getText() + "3");         
        }
    }  
    
    private void Botao_2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(Campo_TextoPrincipal.getText().equals("Syntax Error")){
            Campo_TextoPrincipal.setText("" + "2");
        }else{
            Campo_TextoPrincipal.setText(Campo_TextoPrincipal.getText() + "2");   
        }
    }  
    
    private void Botao_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_1ActionPerformed
        if(Campo_TextoPrincipal.getText().equals("Syntax Error")){
            Campo_TextoPrincipal.setText("" + "1");
        }else{
            Campo_TextoPrincipal.setText(Campo_TextoPrincipal.getText() + "1");             
        }
    }//GEN-LAST:event_Botao_1ActionPerformed

    private void Botao_VirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_VirgulaActionPerformed
        Campo_TextoPrincipal.setText(Campo_TextoPrincipal.getText() + ".");
    }//GEN-LAST:event_Botao_VirgulaActionPerformed

    
    //CAMPOS DE TEXTO
    private void Campo_TextoSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_TextoSecundarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_TextoSecundarioActionPerformed

    private void Campo_TextoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_TextoPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_TextoPrincipalActionPerformed

    
    //EVENTO DOS BOTÕES DA FAIXA SUPERIOR
    private void Botao_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_CEActionPerformed
        Campo_TextoPrincipal.setText("");
    }//GEN-LAST:event_Botao_CEActionPerformed

    private void Botao_ApagarActionPerformed(java.awt.event.ActionEvent evt){
        if(Campo_TextoPrincipal.getText().equals("Syntax Error")){
            
        }else{
            int quantidade_caracteres = Campo_TextoPrincipal.getText().length();
            String novo_texto = Campo_TextoPrincipal.getText().substring(0, quantidade_caracteres - 1);

            Campo_TextoPrincipal.setText(novo_texto);         
        }
        
    }
    
    //EVENTO DOS BOTÕES DE OPERAÇÕES
    
    //Variável operacao é um validador
    //Com base na operação desejada, ela validará o evento do Botao_Igual
    String operacao;
            
    private void Botao_SomaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cal.set_valor(Campo_TextoPrincipal.getText());
        Campo_TextoPrincipal.setText("");
        
        operacao = "+";
        
        //VISOR SECUNDARIO
        Campo_TextoSecundario.setText(cal.get_valor() + " " + operacao);
    } 

    private void Botao_SubtracaoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cal.set_valor(Campo_TextoPrincipal.getText());
        Campo_TextoPrincipal.setText("");
        
        operacao = "-";
        
        //VISOR SECUNDARIO
        Campo_TextoSecundario.setText(cal.get_valor() + " " + operacao);
    }  

    private void Botao_DivisaoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cal.set_valor(Campo_TextoPrincipal.getText());
        Campo_TextoPrincipal.setText("");
        
        operacao = "/";
        
        //VISOR SECUNDARIO
        Campo_TextoSecundario.setText(cal.get_valor() + " " + operacao);
    }  

    private void Botao_MultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cal.set_valor(Campo_TextoPrincipal.getText());
        Campo_TextoPrincipal.setText("");
        
        operacao = "*";
        
        //VISOR SECUNDARIO
        Campo_TextoSecundario.setText(cal.get_valor() + " " + operacao);
    }  

    private void Botao_RaizActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        operacao = "|";
    }  

    private void Botao_PotenciaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        operacao = "^";
    }       
    
    
    //EVENTO DOS BOTÕES DE MEMORY
    private void Botao_HistoryActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }   
    
    private void Botao_MemoryMenosActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }   
    
    private void Botao_MemoryMaisActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }   
    
    
    //EVENTO BOTÃO IGUAL
    private void Botao_IgualActionPerformed(java.awt.event.ActionEvent evt) {                                             

        switch(operacao){
            case "+":
                String soma;
                
                soma = cal.soma(Campo_TextoPrincipal.getText());
                Campo_TextoPrincipal.setText(soma);
                
                //VISOR SECUNDARIO
                Campo_TextoSecundario.setText("");
                
                break;
            case "-":
                String subtracao;
                
                subtracao = cal.subtracao(Campo_TextoPrincipal.getText());
                Campo_TextoPrincipal.setText(subtracao);

                //VISOR SECUNDARIO
                Campo_TextoSecundario.setText("");
                
                break;
            case "*":
               String multiplicacao;
                
                multiplicacao = cal.multiplicacao(Campo_TextoPrincipal.getText());
                Campo_TextoPrincipal.setText(multiplicacao);
                
                //VISOR SECUNDARIO
                Campo_TextoSecundario.setText("");
                
                break;
            case "/":
                String divisao;
                
                divisao = cal.divisao(Campo_TextoPrincipal.getText());
                Campo_TextoPrincipal.setText(divisao);             
                
                //VISOR SECUNDARIO
                Campo_TextoSecundario.setText("");
                
                break;
            case "|":
                
                break;
            case "^":
                
                break;
        }
        
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
            java.util.logging.Logger.getLogger(Frame_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //JFrame da calculadora instanciado e chamando alguns métodos
                Frame_Calculadora myFrame = new Frame_Calculadora();                
                myFrame.setVisible(true);         
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_0;
    private javax.swing.JButton Botao_1;
    private javax.swing.JButton Botao_2;
    private javax.swing.JButton Botao_3;
    private javax.swing.JButton Botao_4;
    private javax.swing.JButton Botao_5;
    private javax.swing.JButton Botao_6;
    private javax.swing.JButton Botao_7;
    private javax.swing.JButton Botao_8;
    private javax.swing.JButton Botao_9;
    private javax.swing.JButton Botao_Apagar;
    private javax.swing.JButton Botao_CE;
    private javax.swing.JButton Botao_Divisao;
    private javax.swing.JButton Botao_Fracao;
    private javax.swing.JButton Botao_History;
    private javax.swing.JButton Botao_Igual;
    private javax.swing.JButton Botao_MemoryMais;
    private javax.swing.JButton Botao_MemoryMenos;
    private javax.swing.JButton Botao_Multiplicacao;
    private javax.swing.JButton Botao_Percentual;
    private javax.swing.JButton Botao_Potencia;
    private javax.swing.JButton Botao_Raiz;
    private javax.swing.JButton Botao_Soma;
    private javax.swing.JButton Botao_Subtracao;
    private javax.swing.JButton Botao_Virgula;
    private javax.swing.JTextField Campo_TextoPrincipal;
    private javax.swing.JTextField Campo_TextoSecundario;
    private javax.swing.JPanel Painel_Body;
    private javax.swing.JPanel Painel_BotoesCorpo;
    private javax.swing.JPanel Painel_BotoesFaixaSuperior;
    private javax.swing.JPanel Painel_BotoesMemory;
    private javax.swing.JPanel Painel_Visor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
