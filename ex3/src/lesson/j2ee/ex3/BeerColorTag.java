package lesson.j2ee.ex3;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * 自定义标签 beerColorTag
 */
public class BeerColorTag extends SimpleTagSupport {
    /**
     * 实现 doTag()
     *
     * @throws JspException
     * @throws IOException
     */
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        int light = 0, amber = 0, brown = 0, dark = 0;
        String sessionList = (String) getJspContext().findAttribute("sessionList");
        String[] beerColors = sessionList.split(",");
        for (String beerColor : beerColors) {
            switch (beerColor) {
                case " light ":
                    light++;
                    break;
                case " amber ":
                    amber++;
                    break;
                case " brown ":
                    brown++;
                    break;
                case " dark ":
                    dark++;
                    break;
            }
        }
        JspWriter out = getJspContext().getOut();
        String outPrint = "";
        if (light != 0)
            outPrint += "light " + light + "<hr>";
        if (amber != 0)
            outPrint += "amber " + amber + "<hr>";
        if (brown != 0)
            outPrint += "brown " + brown + "<hr>";
        if (dark != 0)
            outPrint += "dark " + dark + "<hr>";
        out.print(outPrint);
    }
}
