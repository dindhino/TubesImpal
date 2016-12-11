/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Dhino
 */
public class Aplikasi {

    private Database db;

    public Aplikasi() {
        this.db = new Database();
        db.connect();
    }

    public Database getDb() {
        return db;
    }
}
