package controller;

import java.util.List;
import model.dao.LivrosDAO;
import model.pojo.Livros;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class VendaController {

    @RequestMapping(value = "/*")
    public ModelAndView mainPage() {
        ModelAndView mv = new ModelAndView("venda");
        
        try {
            Livros livro = LivrosDAO.get("1");
            mv.addObject("livro", livro);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return mv;
    }
    
}