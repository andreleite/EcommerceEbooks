package controller;

import java.util.List;
import model.dao.LivrosDAO;
import model.pojo.Livros;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class LivrosController {

    @RequestMapping(value = "/*")
    public ModelAndView mainPage() {
        ModelAndView mv = new ModelAndView("livros");
        
        try {
            List<Livros> list = LivrosDAO.getAll();
            mv.addObject("livros", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return mv;
    }
    
}
