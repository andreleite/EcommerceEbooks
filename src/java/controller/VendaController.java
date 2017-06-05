package controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.LivrosDAO;
import model.pojo.Livros;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@Controller
public class VendaController {

    @Override
    @RequestMapping("venda.htm")
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("livros");
        
        try {
            List<Livros> list = LivrosDAO.layDS();
            mv.addObject("livros", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return mv;
    }
    
}