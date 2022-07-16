package hello.servlet.basic;

import org.springframework.boot.web.servlet.ServletComponentScan;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelloData {

	private String username;
	private int age;

}
