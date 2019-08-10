package vasant.nama;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import vasant.nama.service.DummyService;

@Controller
public class MainController {

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j)
    {
        DummyService ds = new DummyService();

        int k = ds.add(i,j);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("result",k);
        return mv;
    }

}
