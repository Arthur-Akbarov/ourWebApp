package web.servlet;

import java.io.IOException;
import javax.servlet.http.*;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import com.slak.shop.dao.impl.hsqldb.HsqldbDAOFactory;
import com.slak.shop.dao.interfaces.DAOFactory;
import com.slak.shop.dao.interfaces.DAOGood;
import com.slak.shop.model.Good;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse) throws IOException {

        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(DAOFactory.class).to(HsqldbDAOFactory.class);
            }
        });

        Processor p = injector.getInstance(Processor.class);
        String s = p.process();
        httpServletResponse.getWriter().print("" +
                "<html>" +
                "<head>" +
                "<meta content='text/html; charset=UTF-8' http-equiv='Content-Type'/>" +
                "<title>First good</title>" +
                "</head>" +
                "<body>" +
                "<h2>" +
                "Good #0" +
                "</h2>" +
                "title : price<hr>" +
                s +
                "</body>" +
                "</html>");
    }
}

class Processor {

    private final DAOGood dao;

    @Inject
    public Processor(DAOFactory factory) {
        this.dao = factory.getDaoGood();
    }

    public String process() {
        Good good = dao.getById(0);
        return good.toString();
    }
}

