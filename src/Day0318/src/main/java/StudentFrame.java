package Day0318.src.main.java;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentFrame extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;

    public StudentFrame(){
        setTitle("학생 관리 시스템");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        String[] columnNames = {"ID","이름","나이","성별","이메일","전화번호"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        loadStudent();
        cp.add(new JScrollPane(table),BorderLayout.CENTER);


        setSize(600,600);
        setVisible(true);
    }

    private void loadStudent(){
      tableModel.setRowCount(0);
      try(Connection conn = DatabaseConnection.getConnection();
          Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(" select * from HAKSANG")
      ){
       while(rs.next()){
           tableModel.addRow(new Object[]{
                   rs.getInt("student_id"),
                   rs.getString("name"),
                   rs.getInt("age"),
                   rs.getString("gender"),
                   rs.getString("email"),
                   rs.getString("phone")
           });
       }
      }catch(SQLException e){
          e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       SwingUtilities.invokeLater(StudentFrame::new);
    }
}
