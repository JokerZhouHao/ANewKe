package thinkinginjava.ch19enum;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface DBTable {
	public String name() default "";
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Constraints {
	boolean primaryKey() default false;
	boolean allowNull() default true;
	boolean unique() default false;
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface SQLString {
	int value() default 0;
	String name() default "";
	Constraints constraints() default @Constraints;
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface SQLInteger {
	String name() default "";
	Constraints constraints() default @Constraints;
}


@DBTable(name = "MEMBER")
public class Member {
	@SQLString(30)
	String firstName;
	
	@SQLString(50)
	String lastName;
	
	@SQLInteger
	Integer age;
	
	@SQLString(value=30, constraints=@Constraints(
			primaryKey=true))
	String handle;
	
	static int memeberCount;
	public String getHandle() { return handle; }
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String toString() { return handle; }
	public Integer getAge() { return age; }
}





