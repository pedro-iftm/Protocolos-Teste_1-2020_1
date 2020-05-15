package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


CONTENT_TYPE = "text/html;charset=UTF-8";
EMPTY = "";
SEMICOLON = ";";


@WebServlet(name = "LoginHandler", urlPatterns = {"/login"})
public class LoginHandler extends HttpServlet {
    public LoginHandler() {
        this.user = ""
        this.invalidAuths = ""
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.user = request.getParameter("name");
        String password = request.getParameter("password");
        int accesses = 0;
        Cookie[] cookies = request.getCookies();
        
        if(this.isUserEqualTo("pedro")
            && password.equals("senha123")) {

            if(!this.isEmptyUsers()) {
                this.updateInvalidAuths()
            }

            request.setAttribute("name", this.user);
            request.getRequestDispatcher("Homescreen.jsp").forward(request, response);

        } else {  
            accesses++;

        	if(this.isEmptyUsers()) {
                this.invalidAuths = user

            } else {
                if(this.isUserEqualTo()) {
                	String invalidAuths[] = this.invalidAuths.split(SEMICOLON);

                    for(String invalidAuth : invalidAuths) {
                        if(this.isUserEqualTo(invalidAuth)) {
                        	accesses++;
                        	break;
                        }
                    }

                    this.invalidAuths += SEMICOLON + user;                    
                    response.setContentType(CONTENT_TYPE);
                         
                    Cookie cookie 
                    cookie, accesses = this.handleCookies(cookies, accesses)
                    cookie.setMaxAge(20);
                    response.addCookie(cookie);
                }
            }
            request.setAttribute("accesses", accesses);
            request.setAttribute("names", this.invalidAuths);
            request.getRequestDispatcher("Forbidden.jsp").forward(request, response);   
        }      
    }

    public boolean isEmptyUsers() {
        return this.invalidAuths.equals(EMPTY);
    }

    public boolean isUserEqualTo(String compare) {
        return user.equals(compare);
    }

    public Pair<Cookie[], Integer> handleCookies(Cookie[] cookies, int accesses) {
        if(cookies != null) {
            for (Cookie cookie : cookies) {
                if(cookie.getName().equals("list")) {
                    accesses = Integer.parseInt(c.getValue());          
                }
            }
        }

        accesses++
        Cookie cookie = new Cookie("list", (EMPTY + accesses));

        return new Pair<>(cookie, accesses);         
                         
    }

    public String updateInvalidAuths() {
        if(this.isUserEqualTo(this.invalidAuths)) {
            this.invalidAuths = "";

        } else {
            String invalidAuths[] = this.invalidAuths.split(SEMICOLON);
            this.invalidAuths = ""

            for(String invalidAuth : invalidAuth) {
                if(this.isUserEqualTo(invalidAuth)){                            
                    this.invalidAuths += invalidAuths[counter];
                }                           
            }

            this.invalidAuths = this.invalidAuths.substring(0, this.invalidAuths.length() - 1);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
