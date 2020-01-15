package com.karvy.courier.test.annotations;



import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MethodContext implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5198199804879297553L;
	private String path;

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    private String encoding;
    private transient Method method;
    private transient Annotation annotation;

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Annotation getAnnotation() {
        return annotation;
    }

    public void setAnnotation(Annotation annotation) {
        this.annotation = annotation;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

	/*@Override
	public String toString() {
		return "MethodContext [path=" + path + ", encoding=" + encoding + ", method=" + method + ", annotation="
				+ annotation + "]";
	}
*/
    
}
