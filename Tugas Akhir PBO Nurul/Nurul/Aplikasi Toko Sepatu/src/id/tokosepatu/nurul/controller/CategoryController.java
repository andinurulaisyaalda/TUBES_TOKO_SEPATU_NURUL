/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tokosepatu.nurul.controller;

import id.tokosepatu.nurul.dao.CategoryDAO;
import id.tokosepatu.nurul.dao.CategoryDAOMySQL;
import id.tokosepatu.nurul.model.Category;
import java.util.List;

/**
 *
 * @author AryaDharmaadi
 */
public class CategoryController {
    private CategoryDAO dao = new CategoryDAOMySQL();
    
    public List<Category> getAllData() {
        return dao.getAllCategory();
    }
}
