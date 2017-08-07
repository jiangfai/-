import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

// Ä£°åÒýÇæ
//		- Velocity
//		- Freemarker
//		- Thymeleaf

public class Main {

	public static void main(String[] args) throws Exception{
		Version version = new Version(2, 3, 23);
		Configuration cfg = new Configuration(version);
		cfg.setDirectoryForTemplateLoading(new File("c:/Java/"));
		// cfg.setObjectWrapper(new DefaultObjectWrapper());
		Map<String, Object> map = new HashMap<>();
		map.put("name", "Âæê»");
		map.put("url", "http://www.baidu.com");
		Template template = cfg.getTemplate("template.ftl", "utf-8");
		Writer out = new FileWriter("c:/Java/index.html");
		template.process(map, out);
	}
}
