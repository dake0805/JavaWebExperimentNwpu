package lesson.j2ee.ex3;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.IOException;

/**
 * 自定义选择标签
 * 使用 SimpleTag重新开发
 *
 * @author zzzy
 */
public class CreateSelectTag extends SimpleTagSupport {

//    public int doStartTag() throws JspException {
//        try {
//            JspWriter out = pageContext.getOut();
//            String outPrint = "";
//            String[] color = {"light", "amber", "brown", "dark"};
//            outPrint += "<select name='color' size='1'>";
//            for (int i = 0; i < color.length; i++) {
//                outPrint += "<option>";
//                outPrint += color[i];
//                outPrint += "</option>";
//            }
//            outPrint += "</select>";
//            out.print(outPrint);
//        } catch (java.io.IOException e) {
//            throw new JspTagException(e.getMessage());
//        }
//        return SKIP_BODY;
//    }

    /**
     * @throws JspException
     * @throws IOException
     */
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter jspWriter = getJspContext().getOut();
        String outPrint = "";
        String[] color = {"light", "amber", "brown", "dark"};
        outPrint += "<select name='color' size='1'>";
        StringBuilder outPrintBuilder = new StringBuilder(outPrint);
        for (String s : color) {
            outPrintBuilder.append("<option>");
            outPrintBuilder.append(s);
            outPrintBuilder.append("</option>");
        }
        outPrint = outPrintBuilder.toString();
        outPrint += "</select>";
        jspWriter.print(outPrint);
    }
}
