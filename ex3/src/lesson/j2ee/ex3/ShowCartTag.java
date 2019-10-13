package lesson.j2ee.ex3;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;


public class ShowCartTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        PageContext pageContext = (PageContext) getJspContext();
        HttpSession httpSession = pageContext.getSession();
        Integer itemCount = (Integer) httpSession.getAttribute("itemCount");
        // 如果session是新的
        if (itemCount == null)
            itemCount = 0;


        // 接收传来的参数
        String[] itemsSelected;
        String itemName;
        itemsSelected = pageContext.getRequest().getParameterValues("item");

        JspWriter jspWriter = getJspContext().getOut();
        if (itemsSelected != null) {
            for (String s : itemsSelected) {
                itemName = s;
                System.out.println(itemName);
                itemCount = itemCount + 1;
                // 购买的条目
                httpSession.setAttribute("item" + itemCount, itemName);
                // 总条目
                httpSession.setAttribute("itemCount", itemCount);
            }
        }

        for (int i = 1; i <= itemCount; i++) {
            jspWriter.println((String) httpSession.getAttribute("item" + i) + "<hr>");
        }
        jspWriter.close();
    }
}
