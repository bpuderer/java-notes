package javatutorial;

import java.lang.annotation.Documented;

@Documented
public @interface ClassPreamble {
	String author();
	int currentRevision() default 1;

}
