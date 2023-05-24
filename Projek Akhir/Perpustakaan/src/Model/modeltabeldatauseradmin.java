/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author HP
 */
public class modeltabeldatauseradmin extends modeltabeldatauser {
    
    public modeltabeldatauseradmin(List<datauser> du) {
        super(du);
    }
    
    @Override
    public int getColumnCount() {
        return super.getColumnCount() + 2;
    }
    
}
