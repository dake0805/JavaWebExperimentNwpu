package lesson.j2ee.ex3;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.IOException;

/**
 * 计数标签
 * 使用 SimpleTag重新开发
 *
 * @author zzzy
 */
public class CounterTag extends SimpleTagSupport {

    private static int counter = 1;

//	public int doStartTag() throws JspException {
//		try {
//			JspWriter out = pageContext.getOut();
//			out.print(counter);
//			setCounter();
//		} catch (java.io.IOException e) {
//			throw new JspTagException(e.getMessage());
//		}
//		return SKIP_BODY;
//	}

    /**
     * 实现 doTag()
     * @throws JspException
     * @throws IOException
     */
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        getJspContext().getOut().print(counter);
        setCounter();
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter() {
        counter++;
    }
}
