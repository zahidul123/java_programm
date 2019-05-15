/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management.library_management;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import school_management.DBConn;

/**
 *
 * @zahidul islam
 */
public class BookModel {

    private String bid;
    private String bname;
    private String bauthor;
    private String bcategory;
    private String bqty;
    //private String txtsearch;

    public BookModel(String bid, String bname, String bauthor, String bcategory, String bqty) {
        this.bid = bid;
        this.bname = bname;
        this.bauthor = bauthor;
        this.bcategory = bcategory;
        this.bqty = bqty;
    }

    public BookModel(String pbid) {
        this.bid = pbid;
    }

    public BookModel(String bname, String bauthor, String bcategory, String bqty) {
        this.bname = bname;
        this.bauthor = bauthor;
        this.bcategory = bcategory;
        this.bqty = bqty;
    }


    public boolean insertBook() {
        try {
            String s = "insert into books (bname,bauthor,bcategory,bqty) values (?,?,?,?)";
            PreparedStatement pst = DBConn.myConn().prepareStatement(s);

            pst.setString(1, this.bname);
            pst.setString(2, this.bauthor);
            pst.setString(3, this.bcategory);
            pst.setString(4, this.bqty);
            pst.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean deleteBook() {

        try {
            //String bid = this.bid.getText();
            String qr = "delete from books where bid= ?";
            PreparedStatement pst = DBConn.myConn().prepareStatement(qr);
            pst.setString(1, this.bid);

            pst.execute();

            return true;

        } catch (Exception e) {
            return false;
        }

    }

    public boolean updateBook() {

        try {
            
            String q = "update books "
                    + "set bname=?,bauthor=?,bcategory=? , bqty=?  "
                    + "where bid=?";

            PreparedStatement pst = DBConn.myConn().prepareStatement(q);

           
            pst.setString(1, this.bname);
            pst.setString(2, this.bauthor);
            pst.setString(3, this.bcategory);
            pst.setString(4, this.bqty);
            pst.setString(5, this.bid);

            pst.execute();

            return true;

        } catch (Exception e) {
            return false;
        }

    }


    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public String getBcategory() {
        return bcategory;
    }

    public void setBcategory(String bcategory) {
        this.bcategory = bcategory;
    }

    public String getBqty() {
        return bqty;
    }

    public void setBqty(String bqty) {
        this.bqty = bqty;
    }

}
