/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.pojo.Livros;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author andreleite
 */
public class LivrosDAO {
    public static List<Livros> layDS() {
        List<Livros> list = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "from Livros";
            Query query = session.createQuery(hql);
            list = query.list();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
