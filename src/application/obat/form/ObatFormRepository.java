/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.obat.form;

import application.base.BaseRepository;
import application.obat.Obat;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 */
public class ObatFormRepository extends BaseRepository{
    
    public boolean update(Obat obat) throws Exception{
        boolean success = false;
        
        String sql = "UPDATE obat SET nama_obat = ?, harga = ?, tanggal_kadaluarsa = ? where id_obat = ?";
        
        try {
            Connection con = db.getConnection();
            
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            preparedStatement.setString(1, obat.getNama());
            preparedStatement.setBigDecimal(2, new BigDecimal(obat.getHarga()));
            preparedStatement.setDate(3, obat.getTanggal_kadaluarsa());
            preparedStatement.setInt(4, obat.getId_obat());
            
            preparedStatement.execute();
            
            success = true;
            
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return success;
    }
    
    public boolean create(Obat obat) throws Exception {
        boolean success = false;
        
        String sql = "INSERT INTO obat (nama_obat, harga, tanggal_kadaluarsa) VALUES (?, ?, ?)";
        
        try {
            Connection con = db.getConnection();
            
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            preparedStatement.setString(1, obat.getNama());
            preparedStatement.setBigDecimal(2, new BigDecimal(obat.getHarga()));
            preparedStatement.setDate(3, obat.getTanggal_kadaluarsa());
            
            preparedStatement.execute();
            
            success = true;
            
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return success;
    }   
}
